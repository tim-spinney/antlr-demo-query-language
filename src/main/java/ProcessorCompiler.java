import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.lang.classfile.*;
import java.lang.constant.ClassDesc;
import java.lang.constant.ConstantDescs;
import java.lang.constant.MethodTypeDesc;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ProcessorCompiler {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.err.println("You must specify a filename for a processor script as the first argument to this program.");
            System.exit(1);
        }
        String filename = args[0];
        new ProcessorCompiler(filename).compile();
    }

    private final Path sourceFile;
    private final ProcessorSymbolTable symbolTable = new ProcessorSymbolTable();
    private final Path outputDirectory = Paths.get("out"); // TODO: make into optional command line arg

    public ProcessorCompiler(String sourceFilename) {
        this.sourceFile = Paths.get(sourceFilename);
        symbolTable.addTypes(TypeKt.getBuiltInTypes());
    }

    public void compile() throws IOException {
        outputDirectory.toFile().mkdir();
        ProcessorParser.ScriptContext root = parse();
        processIncludes(root);
        processScriptBody(root);
    }

    private void processScriptBody(ProcessorParser.ScriptContext script) throws IOException {
        Map<String, Type> localVariables = new HashMap<>();
        String className = "Processor"; // TODO: name after input file
        buildClass(className, classBuilder -> {
            for(ProcessorParser.ExecutableStatementContext executableStatement : script.executableStatement()) {
                if(executableStatement.loadStatement() != null) {
                    ProcessorParser.LoadStatementContext loadStatement = executableStatement.loadStatement();
                    String destinationName = loadStatement.VarName().getText();
                    String typeName = loadStatement.TypeName().getText();
                    Type type = symbolTable.getTypes().get(typeName);
                    if(type == null) {
                        throw new SemanticException("Unknown type: " + typeName);
                    }
                    classBuilder.withField(destinationName, ClassDesc.of(type.getName()), ClassFile.ACC_PRIVATE);
                    localVariables.put(destinationName, type);
                    // TODO: add call to file loading helper method
                } else if(executableStatement.runQueryStatement() != null) {
                    ProcessorParser.RunQueryStatementContext runQueryStatement = executableStatement.runQueryStatement();
                    String sourceName = runQueryStatement.sourceName.getText();
                    Type sourceType = localVariables.get(sourceName);
                    if(sourceType == null) {
                        throw new SemanticException("Unknown variable: " + sourceName);
                    }
                    String destinationName = runQueryStatement.destinationName.getText();
                    classBuilder.withField(destinationName, ClassDesc.of(sourceType.getName()), ClassFile.ACC_PRIVATE);
                    localVariables.put(destinationName, sourceType);
                }
            }
        });
    }

    private ProcessorParser.ScriptContext parse() throws IOException {
        // TODO: error listener
        CharStream charStream = CharStreams.fromPath(sourceFile);
        ProcessorLexer lexer = new ProcessorLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProcessorParser parser = new ProcessorParser(tokens);
        return parser.script();
    }

    private void processIncludes(ProcessorParser.ScriptContext script) {
        for(ProcessorParser.IncludeStatementContext include : script.includeStatement()) {
            String filename = include.StringLiteral().getText().replaceAll("\"", "");
            Path file = sourceFile.getParent().resolve(filename);
            try {
                switch (include.type.getType()) {
                    case ProcessorParser.Queries -> includeQueries(file);
                    case ProcessorParser.Types -> includeTypes(file);
                    default -> throw new IncludeException("Unknown include type: " + include.type.getType());
                }
            } catch (IOException e) {
                throw new IncludeException("Error reading include file: " + filename, e);
            }
        }
    }

    private void includeQueries(Path file) throws IOException {
        String filename = file.getFileName().toString();
        String className = filename.split("\\.")[0] + "Queries";
        QueriesParser.QueriesContext queries = parseQueries(file);
        buildClass(className, classBuilder -> {
            for(QueriesParser.NamedQueryContext namedQuery : queries.namedQuery()) {
                String queryName = namedQuery.VarName().getText();
                if(!symbolTable.addQuery(queryName, namedQuery.query())) {
                    throw new IncludeException("Duplicate query: " + queryName);
                }
                String typeName = namedQuery.TypeName().getText();
                Type type = symbolTable.getTypes().get(typeName);
                if(type == null) {
                    throw new IncludeException("Unknown type " + typeName + " in query " + queryName);
                }
                ClassDesc typeDesc = ClassDesc.of(type.getName());
                classBuilder.withMethod(
                    queryName,
                    MethodTypeDesc.of(typeDesc.arrayType(), typeDesc.arrayType()),
                    ClassFile.ACC_PUBLIC,
                    methodBuilder -> {
                        methodBuilder.withCode(codeBuilder -> {
                            JVMBytecodeGeneratingTreeListener bytecodeGenerator = new JVMBytecodeGeneratingTreeListener(codeBuilder, type);
                            new ParseTreeWalker().walk(bytecodeGenerator, namedQuery.query());
                        });
                    }
                );
            }
        });
    }

    private void buildClass(String className, Consumer<ClassBuilder> handler) throws IOException {
        ClassFile classFile = ClassFile.of();
        classFile.buildTo(outputDirectory.resolve(className + ".class"), ClassDesc.of(className), handler);
    }

    private QueriesParser.QueriesContext parseQueries(Path file) throws IOException {
        // TODO: error listener
        CharStream charStream = CharStreams.fromPath(file);
        QueriesLexer lexer = new QueriesLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        QueriesParser parser = new QueriesParser(tokens);
        return parser.queries();
    }

    private void includeTypes(Path file) throws IOException {
        UserDefinedTypesCollector collector = new UserDefinedTypesCollector(symbolTable.getTypes());
        TypeCollectionResult result = collector.collectTypes(parseTypes(file));
        if(!result.getErrors().isEmpty()) {
            throw new IncludeException("Inclusion of " + file.getFileName() + " failed due to conflicting type names or semantic errors within the file: " + result.getErrors());
        }
        symbolTable.addTypes(result.getTypeDefinitions());
        for(Type dataType : result.getTypeDefinitions().values()) {
            if(dataType instanceof UserDefinedType) {
                generateClassForDataType((UserDefinedType)dataType);
            }
        }
    }

    private TypeDefsParser.TypeDefsContext parseTypes(Path file) throws IOException {
        // TODO: error listener
        CharStream charStream = CharStreams.fromPath(file);
        TypeDefsLexer lexer = new TypeDefsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TypeDefsParser parser = new TypeDefsParser(tokens);
        return parser.typeDefs();
    }

    private void generateClassForDataType(UserDefinedType dataType) throws IOException {
        buildClass(dataType.getName(),classBuilder -> {
            for(Map.Entry<String, TypeReference> entry : dataType.getFields().entrySet()) {
                ClassDesc typeDesc = entry.getValue().getType() instanceof IntType ? ConstantDescs.CD_int : ClassDesc.of(entry.getValue().getType().getName());
                classBuilder.withField(entry.getKey(), typeDesc, ClassFile.ACC_FINAL | ClassFile.ACC_PUBLIC);
            }
            classBuilder.withMethod("<init>", MethodTypeDesc.of(ConstantDescs.CD_void), ClassFile.ACC_PUBLIC, _ -> {
                // TODO: fill in with field initialization if needed by data loader
            });
        });
    }

    public static class IncludeException extends RuntimeException {
        public IncludeException(String s) {
            super(s);
        }

        public IncludeException(String s, IOException e) {
            super(s, e);
        }
    }

    public static class SemanticException extends RuntimeException {
        public SemanticException(String s) {
            super(s);
        }
    }
}