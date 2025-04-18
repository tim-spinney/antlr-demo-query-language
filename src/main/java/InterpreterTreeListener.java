import java.util.Stack;

public class InterpreterTreeListener extends QueriesBaseListener {
    private final Stack<Object> evalStack = new Stack<>();

    private final int it;

    public InterpreterTreeListener(int it) {
        this.it = it;
    }

    public boolean getResult() { return (boolean)evalStack.peek(); }

    @Override
    public void exitQuery(QueriesParser.QueryContext ctx) {
        int rhs = (int) evalStack.pop();
        int lhs = (int) evalStack.pop();
        switch(ctx.Comparator().getSymbol().getText()) {
            case ">":
                evalStack.push(rhs > lhs);
                break;
            case ">=":
                evalStack.push(rhs >= lhs);
                break;
            case "<":
                evalStack.push(rhs < lhs);
                break;
            case "<=":
                evalStack.push(rhs <= lhs);
                break;
            case "<>":
                evalStack.push(rhs != lhs);
                break;
            case "==":
                evalStack.push(rhs == lhs);
                break;
        }
    }

    @Override
    public void exitNumericExpression(QueriesParser.NumericExpressionContext ctx) {
        if(ctx.Mult() != null) {
            evalStack.push((int)evalStack.pop() * (int)evalStack.pop());
        } else if(ctx.Add() != null) {
            evalStack.push((int)evalStack.pop() + (int)evalStack.pop());
        } else if(ctx.Mod() != null) {
            evalStack.push((int)evalStack.pop() % (int)evalStack.pop());
        } else if(ctx.Identifier() != null) {
            evalStack.push(it);
        } else if(ctx.IntLiteral() != null) {
            evalStack.push(Integer.parseInt(ctx.IntLiteral().getText()));
        }
        // System.out.println(evalStack);
    }

}
