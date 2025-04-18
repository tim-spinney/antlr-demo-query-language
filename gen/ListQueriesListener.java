// Generated from src/main/resources/ListQueries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ListQueriesParser}.
 */
public interface ListQueriesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ListQueriesParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ListQueriesParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListQueriesParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ListQueriesParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListQueriesParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void enterListLiteral(ListQueriesParser.ListLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListQueriesParser#listLiteral}.
	 * @param ctx the parse tree
	 */
	void exitListLiteral(ListQueriesParser.ListLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListQueriesParser#listMember}.
	 * @param ctx the parse tree
	 */
	void enterListMember(ListQueriesParser.ListMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListQueriesParser#listMember}.
	 * @param ctx the parse tree
	 */
	void exitListMember(ListQueriesParser.ListMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ListQueriesParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericExpression(ListQueriesParser.NumericExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ListQueriesParser#numericExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericExpression(ListQueriesParser.NumericExpressionContext ctx);
}