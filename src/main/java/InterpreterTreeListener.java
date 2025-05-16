import java.lang.reflect.Field;
import java.util.Map;
import java.util.Stack;

public class InterpreterTreeListener extends QueriesBaseListener {
    private final Stack<Object> evalStack = new Stack<>();

    private final Object it;

    public InterpreterTreeListener(Object it) {
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
        } else if(ctx.variableAccess() != null) {
            QueriesParser.VariableAccessContext variableAccessor = ctx.variableAccess();
            evalStack.push(it);
            variableAccessor = variableAccessor.variableAccess();
            while(variableAccessor != null) {
                processVariableAccessor(variableAccessor);
                variableAccessor = variableAccessor.variableAccess();
            }
        } else if(ctx.IntLiteral() != null) {
            evalStack.push(Integer.parseInt(ctx.IntLiteral().getText()));
        }
    }

    private void processVariableAccessor(QueriesParser.VariableAccessContext variableAccessor) {
        Object variable = evalStack.pop();
        String fieldName = variableAccessor.VarName().getText();
        if(variable instanceof Map) {
            Object value = ((Map<?, ?>)variable).get(fieldName);
            evalStack.push(value);
        } else {
            try {
                Field field = variable.getClass().getDeclaredField(fieldName);
                Object value = field.get(variable);
                evalStack.push(value);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
