import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main(true); //args.length > 0 && args[0].equals("-d"));
        main.testQueryInterpreter();


    }

    boolean isInDebugMode;

    private Main(boolean isInDebugMode) {
        this.isInDebugMode = isInDebugMode;
    }

    private void testQueryInterpreter() {
        String input = "WHERE it.a * 2 + 4 * 3 >= 16 + it.a AND it.a > 0 OR NOT NOT it.a < 0";
        System.out.println(input);

        CharStream inputStream = CharStreams.fromString(input);
        QueriesLexer lexer = new QueriesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        QueriesParser parser = new QueriesParser(tokenStream);
        QueriesParser.QueryContext queryContext = parser.query();

        ParseTreeWalker walker = new ParseTreeWalker();
        if(isInDebugMode) {
            walker.walk(new DebugTreeListener(parser), queryContext);
        }

        List<Map<String, Object>> inputData = new ArrayList<>();
        inputData.add(Map.of("a", 1));
        inputData.add(Map.of("a", 2));
        inputData.add(Map.of("a", 4));
        inputData.add(Map.of("a", 8));
        inputData.add(Map.of("a", 16));
        boolean[] matches = new boolean[inputData.size()];
        for(int i = 0; i < inputData.size(); i++) {
            InterpreterTreeListener interpreter = new InterpreterTreeListener(inputData.get(i));
            walker.walk(interpreter, queryContext);
            matches[i] = interpreter.getResult();
            System.out.println(i + ": " + (interpreter.getResult() ? "YES" : "NO"));
        }
    }

    private void testTableDefinitions() {
        String input = """
        TYPE Point {
          x: Int,
          y: Int
        }
        
        TYPE Rectangle {
          topLeft: Point,
          width: Int,
          height: Int
        }
        
        TYPE A {
          b: B&
        }
        
        TYPE B {
          a: A,
          b: B&?
        }
        
        TYPE Sprite {
          poly: Polygon,
          poly: PointList
        }
        
        """;
        System.out.println(input);

        CharStream inputStream = CharStreams.fromString(input);
        TypeDefsLexer lexer = new TypeDefsLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        TypeDefsParser parser = new TypeDefsParser(tokenStream);
        TypeDefsParser.TypeDefsContext tableDefsContext = parser.typeDefs();

        UserDefinedTypesCollector typesCollector = new UserDefinedTypesCollector();
        TypeCollectionResult result = typesCollector.collectTypes(tableDefsContext);
        result.getErrors().forEach(System.err::println);
        result.getTypeDefinitions().values().forEach(System.out::println);
    }
}