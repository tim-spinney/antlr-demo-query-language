// Generated from src/main/resources/Processor.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProcessorParser}.
 */
public interface ProcessorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(ProcessorParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(ProcessorParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void enterIncludeStatement(ProcessorParser.IncludeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#includeStatement}.
	 * @param ctx the parse tree
	 */
	void exitIncludeStatement(ProcessorParser.IncludeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#executableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecutableStatement(ProcessorParser.ExecutableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#executableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecutableStatement(ProcessorParser.ExecutableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadStatement(ProcessorParser.LoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadStatement(ProcessorParser.LoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#runQueryStatement}.
	 * @param ctx the parse tree
	 */
	void enterRunQueryStatement(ProcessorParser.RunQueryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#runQueryStatement}.
	 * @param ctx the parse tree
	 */
	void exitRunQueryStatement(ProcessorParser.RunQueryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProcessorParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void enterSaveStatement(ProcessorParser.SaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProcessorParser#saveStatement}.
	 * @param ctx the parse tree
	 */
	void exitSaveStatement(ProcessorParser.SaveStatementContext ctx);
}