// Generated from /Users/aimee/IdeaProjects/untitled/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ACSPParser}.
 */
public interface ACSPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ACSPParser#skipCmd}.
	 * @param ctx the parse tree
	 */
	void enterSkipCmd(ACSPParser.SkipCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#skipCmd}.
	 * @param ctx the parse tree
	 */
	void exitSkipCmd(ACSPParser.SkipCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#choiceCmd}.
	 * @param ctx the parse tree
	 */
	void enterChoiceCmd(ACSPParser.ChoiceCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#choiceCmd}.
	 * @param ctx the parse tree
	 */
	void exitChoiceCmd(ACSPParser.ChoiceCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#ifCmd}.
	 * @param ctx the parse tree
	 */
	void enterIfCmd(ACSPParser.IfCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#ifCmd}.
	 * @param ctx the parse tree
	 */
	void exitIfCmd(ACSPParser.IfCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#parallelCmd}.
	 * @param ctx the parse tree
	 */
	void enterParallelCmd(ACSPParser.ParallelCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#parallelCmd}.
	 * @param ctx the parse tree
	 */
	void exitParallelCmd(ACSPParser.ParallelCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#scopeCmd}.
	 * @param ctx the parse tree
	 */
	void enterScopeCmd(ACSPParser.ScopeCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#scopeCmd}.
	 * @param ctx the parse tree
	 */
	void exitScopeCmd(ACSPParser.ScopeCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#outputCmd}.
	 * @param ctx the parse tree
	 */
	void enterOutputCmd(ACSPParser.OutputCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#outputCmd}.
	 * @param ctx the parse tree
	 */
	void exitOutputCmd(ACSPParser.OutputCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#locCmd}.
	 * @param ctx the parse tree
	 */
	void enterLocCmd(ACSPParser.LocCmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#locCmd}.
	 * @param ctx the parse tree
	 */
	void exitLocCmd(ACSPParser.LocCmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(ACSPParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(ACSPParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#funcDefn}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefn(ACSPParser.FuncDefnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#funcDefn}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefn(ACSPParser.FuncDefnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ACSPParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ACSPParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ACSPParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ACSPParser.StatementContext ctx);
}