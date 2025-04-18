import org.antlr.v4.runtime.ParserRuleContext;

public class DebugTreeListener extends ListQueriesBaseListener {
    private final ListQueriesParser parser;

    public DebugTreeListener(ListQueriesParser parser) {
        this.parser = parser;
    }

    @Override
    public void enterQuery(ListQueriesParser.QueryContext ctx) {

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
