import java.util.Stack;

public class InterpreterTreeListener extends QueriesBaseListener {
    private final Stack<Object> evalStack = new Stack<>();

    private final int it;

    public InterpreterTreeListener(int it) {
        this.it = it;
    }

    public boolean getResult() { return (boolean)evalStack.peek(); }

    @Override
    public void exitLogicalExpression(QueriesParser.LogicalExpressionContext ctx) {
        if(ctx.logicalExpression().isEmpty()) {
            handleNumericComparison(ctx);
        } else if(ctx.logicalExpression().size() == 1) {
            boolean oldValue = (boolean)evalStack.pop();
            evalStack.push(!oldValue);
        } else if(ctx.logicalExpression().size() == 2) {
            handleBinaryLogicalExpression(ctx);
        }
    }

    private void handleNumericComparison(QueriesParser.LogicalExpressionContext ctx) {
        int rhs = (int) evalStack.pop();
        int lhs = (int) evalStack.pop();
        switch(ctx.Comparator().getSymbol().getText()) {
            case ">":
                evalStack.push(lhs > rhs);
                break;
            case ">=":
                evalStack.push(lhs >= rhs);
                break;
            case "<":
                evalStack.push(lhs < rhs);
                break;
            case "<=":
                evalStack.push(lhs <= rhs);
                break;
            case "<>":
                evalStack.push(lhs != rhs);
                break;
            case "==":
                evalStack.push(lhs == rhs);
                break;
        }
    }

    private void handleBinaryLogicalExpression(QueriesParser.LogicalExpressionContext ctx) {
        boolean lhs = (boolean)evalStack.pop();
        boolean rhs = (boolean)evalStack.pop();
        if(ctx.And() != null) {
            evalStack.push(lhs && rhs);
        } else if(ctx.Or() != null) {
            evalStack.push(lhs || rhs);
        }
    }

    @Override
    public void exitNumericExpression(QueriesParser.NumericExpressionContext ctx) {
        if(ctx.Mult() != null) {
            evalStack.push((int)evalStack.pop() * (int)evalStack.pop());
        } else if(ctx.Div() != null) {
            evalStack.push((int)evalStack.pop() / (int)evalStack.pop());
        } else if(ctx.Add() != null) {
            evalStack.push((int)evalStack.pop() + (int)evalStack.pop());
        } else if(ctx.Sub() != null) {
            evalStack.push((int)evalStack.pop() - (int)evalStack.pop());
        } else if(ctx.Mod() != null) {
            evalStack.push((int)evalStack.pop() % (int)evalStack.pop());
        } else if(ctx.Identifier() != null) {
            evalStack.push(it);
        } else if(ctx.IntLiteral() != null) {
            evalStack.push(Integer.parseInt(ctx.IntLiteral().getText()));
        }
    }

}
