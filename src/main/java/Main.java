import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "WHERE it * 2 + 4 * 3 >= 16 + it";
        System.out.println(input);

        CharStream inputStream = CharStreams.fromString(input);
        QueriesLexer lexer = new QueriesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        QueriesParser parser = new QueriesParser(tokenStream);
        QueriesParser.QueryContext queryContext = parser.query();

        ParseTreeWalker walker = new ParseTreeWalker();
        if(args.length > 0 && args[0].equals("-d")) {
            walker.walk(new DebugTreeListener(parser), queryContext);
        }

        int[] inputData = new int[]{1, 1, 2, 3, 5, 8, 13};
        for(int i : inputData) {
            InterpreterTreeListener interpreter = new InterpreterTreeListener(i);
            walker.walk(interpreter, queryContext);
            System.out.println(i + ": " + (interpreter.getResult() ? "YES" : "NO"));
        }
    }
}