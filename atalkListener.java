// Generated from atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link atalkParser}.
 */
public interface atalkListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link atalkParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(atalkParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(atalkParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#actor}.
	 * @param ctx the parse tree
	 */
	void enterActor(atalkParser.ActorContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#actor}.
	 * @param ctx the parse tree
	 */
	void exitActor(atalkParser.ActorContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#actorcontent}.
	 * @param ctx the parse tree
	 */
	void enterActorcontent(atalkParser.ActorcontentContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#actorcontent}.
	 * @param ctx the parse tree
	 */
	void exitActorcontent(atalkParser.ActorcontentContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(atalkParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(atalkParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#receiver}.
	 * @param ctx the parse tree
	 */
	void enterReceiver(atalkParser.ReceiverContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#receiver}.
	 * @param ctx the parse tree
	 */
	void exitReceiver(atalkParser.ReceiverContext ctx);
}