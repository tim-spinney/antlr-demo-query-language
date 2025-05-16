import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public ProcessorCompiler(String sourceFilename) {
        this.sourceFile = Paths.get(sourceFilename);
        symbolTable.addTypes(TypeKt.getBuiltInTypes());
    }

    public void compile() throws IOException {
        ProcessorParser.ScriptContext root = parse();
        processIncludes(root);
        System.out.println("TODO");
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
                    default -> throw new InvalidIncludeException("Unknown include type: " + include.type.getType());
                }
            } catch (IOException e) {
                throw new InvalidIncludeException("Error reading include file: " + filename, e);
            }
        }
    }

    private void includeQueries(Path file) throws IOException {
        QueriesParser.QueriesContext queries = parseQueries(file);
        for(QueriesParser.NamedQueryContext namedQuery : queries.namedQuery()) {
            if(!symbolTable.addQuery(namedQuery.VarName().getText())) {
                throw new InvalidIncludeException("Duplicate query: " + namedQuery.VarName().getText());
            }
            // TODO: compile query
        }
    }

    private QueriesParser.QueriesContext parseQueries(Path file) throws IOException {
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
            throw new InvalidIncludeException("Inclusion of " + file.getFileName() + " failed due to conflicting type names or semantic errors within the file: " + result.getErrors());
        }
        symbolTable.addTypes(result.getTypeDefinitions());
    }

    private TypeDefsParser.TypeDefsContext parseTypes(Path file) throws IOException {
        CharStream charStream = CharStreams.fromPath(file);
        TypeDefsLexer lexer = new TypeDefsLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TypeDefsParser parser = new TypeDefsParser(tokens);
        return parser.typeDefs();
    }

    public static class InvalidIncludeException extends RuntimeException {
        public InvalidIncludeException(String s) {
            super(s);
        }

        public InvalidIncludeException(String s, IOException e) {
            super(s, e);
        }
    }
}