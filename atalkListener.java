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
	 * Enter a parse tree produced by {@link atalkParser#actor_content}.
	 * @param ctx the parse tree
	 */
	void enterActor_content(atalkParser.Actor_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#actor_content}.
	 * @param ctx the parse tree
	 */
	void exitActor_content(atalkParser.Actor_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#actor_size}.
	 * @param ctx the parse tree
	 */
	void enterActor_size(atalkParser.Actor_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#actor_size}.
	 * @param ctx the parse tree
	 */
	void exitActor_size(atalkParser.Actor_sizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(atalkParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(atalkParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#global_vardef}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_vardef(atalkParser.Global_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#global_vardef}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_vardef(atalkParser.Global_vardefContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link atalkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(atalkParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(atalkParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#arg_var}.
	 * @param ctx the parse tree
	 */
	void enterArg_var(atalkParser.Arg_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#arg_var}.
	 * @param ctx the parse tree
	 */
	void exitArg_var(atalkParser.Arg_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#receiver_content}.
	 * @param ctx the parse tree
	 */
	void enterReceiver_content(atalkParser.Receiver_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#receiver_content}.
	 * @param ctx the parse tree
	 */
	void exitReceiver_content(atalkParser.Receiver_contentContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(atalkParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(atalkParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(atalkParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(atalkParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(atalkParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(atalkParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#exprp}.
	 * @param ctx the parse tree
	 */
	void enterExprp(atalkParser.ExprpContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#exprp}.
	 * @param ctx the parse tree
	 */
	void exitExprp(atalkParser.ExprpContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#texpr}.
	 * @param ctx the parse tree
	 */
	void enterTexpr(atalkParser.TexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#texpr}.
	 * @param ctx the parse tree
	 */
	void exitTexpr(atalkParser.TexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#texprp}.
	 * @param ctx the parse tree
	 */
	void enterTexprp(atalkParser.TexprpContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#texprp}.
	 * @param ctx the parse tree
	 */
	void exitTexprp(atalkParser.TexprpContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#fexpr}.
	 * @param ctx the parse tree
	 */
	void enterFexpr(atalkParser.FexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#fexpr}.
	 * @param ctx the parse tree
	 */
	void exitFexpr(atalkParser.FexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#def_value}.
	 * @param ctx the parse tree
	 */
	void enterDef_value(atalkParser.Def_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#def_value}.
	 * @param ctx the parse tree
	 */
	void exitDef_value(atalkParser.Def_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(atalkParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(atalkParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(atalkParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(atalkParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterArray_def(atalkParser.Array_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitArray_def(atalkParser.Array_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#array_access}.
	 * @param ctx the parse tree
	 */
	void enterArray_access(atalkParser.Array_accessContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#array_access}.
	 * @param ctx the parse tree
	 */
	void exitArray_access(atalkParser.Array_accessContext ctx);
}