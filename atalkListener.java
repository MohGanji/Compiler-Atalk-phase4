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
	 * Enter a parse tree produced by {@link atalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(atalkParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(atalkParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(atalkParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(atalkParser.StatementsContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#def_arguments}.
	 * @param ctx the parse tree
	 */
	void enterDef_arguments(atalkParser.Def_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#def_arguments}.
	 * @param ctx the parse tree
	 */
	void exitDef_arguments(atalkParser.Def_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(atalkParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(atalkParser.ArgumentContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#arg_var_def}.
	 * @param ctx the parse tree
	 */
	void enterArg_var_def(atalkParser.Arg_var_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#arg_var_def}.
	 * @param ctx the parse tree
	 */
	void exitArg_var_def(atalkParser.Arg_var_defContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#loop_statements}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statements(atalkParser.Loop_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#loop_statements}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statements(atalkParser.Loop_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#scope}.
	 * @param ctx the parse tree
	 */
	void enterScope(atalkParser.ScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#scope}.
	 * @param ctx the parse tree
	 */
	void exitScope(atalkParser.ScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(atalkParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(atalkParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#foreach}.
	 * @param ctx the parse tree
	 */
	void enterForeach(atalkParser.ForeachContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#foreach}.
	 * @param ctx the parse tree
	 */
	void exitForeach(atalkParser.ForeachContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#sender}.
	 * @param ctx the parse tree
	 */
	void enterSender(atalkParser.SenderContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#sender}.
	 * @param ctx the parse tree
	 */
	void exitSender(atalkParser.SenderContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(atalkParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(atalkParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(atalkParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(atalkParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(atalkParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(atalkParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(atalkParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(atalkParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#read_func}.
	 * @param ctx the parse tree
	 */
	void enterRead_func(atalkParser.Read_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#read_func}.
	 * @param ctx the parse tree
	 */
	void exitRead_func(atalkParser.Read_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#write_func}.
	 * @param ctx the parse tree
	 */
	void enterWrite_func(atalkParser.Write_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#write_func}.
	 * @param ctx the parse tree
	 */
	void exitWrite_func(atalkParser.Write_funcContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#a1}.
	 * @param ctx the parse tree
	 */
	void enterA1(atalkParser.A1Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a1}.
	 * @param ctx the parse tree
	 */
	void exitA1(atalkParser.A1Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a1p}.
	 * @param ctx the parse tree
	 */
	void enterA1p(atalkParser.A1pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a1p}.
	 * @param ctx the parse tree
	 */
	void exitA1p(atalkParser.A1pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a2}.
	 * @param ctx the parse tree
	 */
	void enterA2(atalkParser.A2Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a2}.
	 * @param ctx the parse tree
	 */
	void exitA2(atalkParser.A2Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a2p}.
	 * @param ctx the parse tree
	 */
	void enterA2p(atalkParser.A2pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a2p}.
	 * @param ctx the parse tree
	 */
	void exitA2p(atalkParser.A2pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a3}.
	 * @param ctx the parse tree
	 */
	void enterA3(atalkParser.A3Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a3}.
	 * @param ctx the parse tree
	 */
	void exitA3(atalkParser.A3Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a3p}.
	 * @param ctx the parse tree
	 */
	void enterA3p(atalkParser.A3pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a3p}.
	 * @param ctx the parse tree
	 */
	void exitA3p(atalkParser.A3pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a4}.
	 * @param ctx the parse tree
	 */
	void enterA4(atalkParser.A4Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a4}.
	 * @param ctx the parse tree
	 */
	void exitA4(atalkParser.A4Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a4p}.
	 * @param ctx the parse tree
	 */
	void enterA4p(atalkParser.A4pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a4p}.
	 * @param ctx the parse tree
	 */
	void exitA4p(atalkParser.A4pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a5}.
	 * @param ctx the parse tree
	 */
	void enterA5(atalkParser.A5Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a5}.
	 * @param ctx the parse tree
	 */
	void exitA5(atalkParser.A5Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a5p}.
	 * @param ctx the parse tree
	 */
	void enterA5p(atalkParser.A5pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a5p}.
	 * @param ctx the parse tree
	 */
	void exitA5p(atalkParser.A5pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a6}.
	 * @param ctx the parse tree
	 */
	void enterA6(atalkParser.A6Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a6}.
	 * @param ctx the parse tree
	 */
	void exitA6(atalkParser.A6Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a6p}.
	 * @param ctx the parse tree
	 */
	void enterA6p(atalkParser.A6pContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a6p}.
	 * @param ctx the parse tree
	 */
	void exitA6p(atalkParser.A6pContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a7}.
	 * @param ctx the parse tree
	 */
	void enterA7(atalkParser.A7Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a7}.
	 * @param ctx the parse tree
	 */
	void exitA7(atalkParser.A7Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#a8}.
	 * @param ctx the parse tree
	 */
	void enterA8(atalkParser.A8Context ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#a8}.
	 * @param ctx the parse tree
	 */
	void exitA8(atalkParser.A8Context ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(atalkParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(atalkParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(atalkParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(atalkParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link atalkParser#access_array}.
	 * @param ctx the parse tree
	 */
	void enterAccess_array(atalkParser.Access_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#access_array}.
	 * @param ctx the parse tree
	 */
	void exitAccess_array(atalkParser.Access_arrayContext ctx);
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
	 * Enter a parse tree produced by {@link atalkParser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(atalkParser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link atalkParser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(atalkParser.Array_indexContext ctx);
}