import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
    public static void main(String[] args) {
        String input = "WHERE";

        CharStream inputStream = CharStreams.fromString(input);
        ListQueriesLexer lexer = new ListQueriesLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ListQueriesParser parser = new ListQueriesParser(tokens);
    }
}