// Generated from src/main/resources/TypeDefs.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeDefsParser}.
 */
public interface TypeDefsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeDefsParser#typeDefs}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefs(TypeDefsParser.TypeDefsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeDefsParser#typeDefs}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefs(TypeDefsParser.TypeDefsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeDefsParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void enterTypeDef(TypeDefsParser.TypeDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeDefsParser#typeDef}.
	 * @param ctx the parse tree
	 */
	void exitTypeDef(TypeDefsParser.TypeDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeDefsParser#fieldDef}.
	 * @param ctx the parse tree
	 */
	void enterFieldDef(TypeDefsParser.FieldDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeDefsParser#fieldDef}.
	 * @param ctx the parse tree
	 */
	void exitFieldDef(TypeDefsParser.FieldDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeDefsParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void enterTypeReference(TypeDefsParser.TypeReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeDefsParser#typeReference}.
	 * @param ctx the parse tree
	 */
	void exitTypeReference(TypeDefsParser.TypeReferenceContext ctx);
}