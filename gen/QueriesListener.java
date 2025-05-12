// Generated from src/main/resources/Queries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueriesParser}.
 */
public interface QueriesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueriesParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QueriesParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueriesParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QueriesParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueriesParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(QueriesParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueriesParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(QueriesParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueriesParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(QueriesParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueriesParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(QueriesParser.NumericExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueriesParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void enterVariableAccess(QueriesParser.VariableAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueriesParser#variableAccess}.
	 * @param ctx the parse tree
	 */
	void exitVariableAccess(QueriesParser.VariableAccessContext ctx);
}