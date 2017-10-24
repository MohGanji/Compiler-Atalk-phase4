// Generated from test.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link testParser}.
 */
public interface testListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(testParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(testParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#cont}.
	 * @param ctx the parse tree
	 */
	void enterCont(testParser.ContContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#cont}.
	 * @param ctx the parse tree
	 */
	void exitCont(testParser.ContContext ctx);
	/**
	 * Enter a parse tree produced by {@link testParser#conti}.
	 * @param ctx the parse tree
	 */
	void enterConti(testParser.ContiContext ctx);
	/**
	 * Exit a parse tree produced by {@link testParser#conti}.
	 * @param ctx the parse tree
	 */
	void exitConti(testParser.ContiContext ctx);
}