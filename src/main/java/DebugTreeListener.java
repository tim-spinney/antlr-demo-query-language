import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;

public class DebugTreeListener extends QueriesBaseListener {
    private final Parser parser;

    public DebugTreeListener(Parser parser) {
        this.parser = parser;
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        System.out.println("entering " + ctx.toInfoString(parser));
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        System.out.println("exiting " + ctx.toInfoString(parser));
    }
}
