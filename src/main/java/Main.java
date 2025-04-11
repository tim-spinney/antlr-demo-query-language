import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String input = "WHERE it <= 2";

        CharStream inputStream = CharStreams.fromString(input);
        ListQueriesLexer lexer = new ListQueriesLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        System.out.println("test");
        /*List<Token> tokens = tokenStream.getTokens();
        System.out.println(tokens.size() + " tokens");
        tokens.forEach(System.out::println);*/
        ListQueriesParser parser = new ListQueriesParser(tokenStream);
        ListQueriesParser.QueryContext queryContext = parser.query();
        String comparatorText = queryContext.Comparator().getSymbol().getText();
        // System.out.println("Comparator: " + queryContext.Comparator().getSymbol().getText());

        int[] inputData = new int[] { 1, 1, 2, 3, 5, 8, 13 };

        List<Integer> outputData = new ArrayList<>();
        for(int i = 0; i < inputData.length; i++) {
            int value = inputData[i];
            int left;
            if(queryContext.numericExpression(0).Identifier() == null) {
                left = Integer.parseInt(
                        queryContext.numericExpression(0).IntLiteral().getText()
                );
            } else {
                // TODO: support more complex identifiers than just 'it'
                left = value;
            }
            int right;
            if(queryContext.numericExpression(1).Identifier() == null) {
                right = Integer.parseInt(
                        queryContext.numericExpression(1).IntLiteral().getText()
                );
            } else {
                // TODO: support more complex identifiers than just 'it'
                right = value;
            }
            switch(comparatorText) {
                case "==":
                    if(left == right) {
                        outputData.add(left);
                    }
                    break;
                case "<>":
                    if(left != right) {
                        outputData.add(left);
                    }
                    break;
                case "<=":
                    if(left <= right) {
                        outputData.add(left);
                    }
                    break;
                default:
            }
        }
        System.out.println(outputData);
    }
}