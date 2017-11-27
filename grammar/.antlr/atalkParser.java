// Generated from /home/vmoh/uni_projs/compiler/Compiler-Atalk-phase2/grammar/atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		SPACE=18, COMMENT=19, NEWLINE=20, ACTOR=21, RECEIVER=22, TYPE=23, QUIT=24, 
		IF=25, ELSEIF=26, ELSE=27, END=28, FOREACH=29, BREAK=30, IN=31, SENDER=32, 
		SELF=33, BEGIN=34, READ=35, WRITE=36, AND=37, OR=38, NOT=39, STRING=40, 
		CHAR=41, NUMBER=42, ID=43, CHARACTER=44, ANY_CHAR=45;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_actor_size = 3, 
		RULE_state = 4, RULE_statement = 5, RULE_statements = 6, RULE_receiver = 7, 
		RULE_def_arguments = 8, RULE_argument = 9, RULE_arguments = 10, RULE_arg_var = 11, 
		RULE_arg_var_def = 12, RULE_receiver_content = 13, RULE_vardef = 14, RULE_var = 15, 
		RULE_loop_statements = 16, RULE_scope = 17, RULE_condition = 18, RULE_foreach = 19, 
		RULE_sender = 20, RULE_assignment = 21, RULE_method_call = 22, RULE_function_def = 23, 
		RULE_function_call = 24, RULE_read_func = 25, RULE_write_func = 26, RULE_expr = 27, 
		RULE_a1 = 28, RULE_a1p = 29, RULE_a2 = 30, RULE_a2p = 31, RULE_a3 = 32, 
		RULE_a3p = 33, RULE_a4 = 34, RULE_a4p = 35, RULE_a5 = 36, RULE_a5p = 37, 
		RULE_a6 = 38, RULE_a6p = 39, RULE_a7 = 40, RULE_a8 = 41, RULE_rvalue = 42, 
		RULE_lvalue = 43, RULE_access_array = 44, RULE_array = 45, RULE_var_type = 46, 
		RULE_array_def = 47, RULE_array_index = 48;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "actor_size", "state", "statement", 
		"statements", "receiver", "def_arguments", "argument", "arguments", "arg_var", 
		"arg_var_def", "receiver_content", "vardef", "var", "loop_statements", 
		"scope", "condition", "foreach", "sender", "assignment", "method_call", 
		"function_def", "function_call", "read_func", "write_func", "expr", "a1", 
		"a1p", "a2", "a2p", "a3", "a3p", "a4", "a4p", "a5", "a5p", "a6", "a6p", 
		"a7", "a8", "rvalue", "lvalue", "access_array", "array", "var_type", "array_def", 
		"array_index"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'('", "')'", "'='", "'<<'", "'=='", "'<>'", 
		"'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'['", "']'", null, null, null, 
		"'actor'", "'receiver'", null, "'quit'", "'if'", "'elseif'", "'else'", 
		"'end'", "'foreach'", "'break'", "'in'", "'sender'", "'self'", "'begin'", 
		"'read'", "'write'", "'and'", "'or'", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "SPACE", "COMMENT", "NEWLINE", "ACTOR", 
		"RECEIVER", "TYPE", "QUIT", "IF", "ELSEIF", "ELSE", "END", "FOREACH", 
		"BREAK", "IN", "SENDER", "SELF", "BEGIN", "READ", "WRITE", "AND", "OR", 
		"NOT", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", "ANY_CHAR"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    void print(String str){
	        System.out.println(str);
	    }

	public atalkParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public String hasActor = "F";
		public List<ActorContext> actor() {
			return getRuleContexts(ActorContext.class);
		}
		public ActorContext actor(int i) {
			return getRuleContext(ActorContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(102);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(98);
					actor();
					((ProgramContext)_localctx).hasActor =  "T";
					}
					break;
				case NEWLINE:
					{
					setState(101);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print(_localctx.hasActor);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActorContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ACTOR() { return getToken(atalkParser.ACTOR, 0); }
		public Actor_sizeContext actor_size() {
			return getRuleContext(Actor_sizeContext.class,0);
		}
		public Actor_contentContext actor_content() {
			return getRuleContext(Actor_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public TerminalNode EOF() { return getToken(atalkParser.EOF, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ACTOR);
			setState(110);
			((ActorContext)_localctx).name = match(ID);
			print("actor : " + ((ActorContext)_localctx).name.getText());
			setState(112);
			actor_size();
			setState(113);
			actor_content();
			setState(114);
			match(END);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NEWLINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actor_contentContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public List<ReceiverContext> receiver() {
			return getRuleContexts(ReceiverContext.class);
		}
		public ReceiverContext receiver(int i) {
			return getRuleContext(ReceiverContext.class,i);
		}
		public Actor_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_content; }
	}

	public final Actor_contentContext actor_content() throws RecognitionException {
		Actor_contentContext _localctx = new Actor_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("actor content");
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(120);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(118);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(119);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECEIVER || _la==TYPE );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Actor_sizeContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public Actor_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_size; }
	}

	public final Actor_sizeContext actor_size() throws RecognitionException {
		Actor_sizeContext _localctx = new Actor_sizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actor_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("actor size");
			setState(125);
			match(T__0);
			setState(126);
			match(NUMBER);
			setState(127);
			match(T__1);
			setState(128);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StateContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("state");
			setState(131);
			var_type();
			setState(132);
			match(ID);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(133);
				match(T__2);
				setState(134);
				match(ID);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public TerminalNode QUIT() { return getToken(atalkParser.QUIT, 0); }
		public VardefContext vardef() {
			return getRuleContext(VardefContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ForeachContext foreach() {
			return getRuleContext(ForeachContext.class,0);
		}
		public SenderContext sender() {
			return getRuleContext(SenderContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Write_funcContext write_func() {
			return getRuleContext(Write_funcContext.class,0);
		}
		public ScopeContext scope() {
			return getRuleContext(ScopeContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Loop_statementsContext loop_statements() {
			return getRuleContext(Loop_statementsContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("statement");
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(143);
				match(QUIT);
				}
				break;
			case 2:
				{
				setState(144);
				vardef();
				}
				break;
			case 3:
				{
				setState(145);
				condition();
				}
				break;
			case 4:
				{
				setState(146);
				foreach();
				}
				break;
			case 5:
				{
				setState(147);
				sender();
				}
				break;
			case 6:
				{
				setState(148);
				function_call();
				}
				break;
			case 7:
				{
				setState(149);
				write_func();
				}
				break;
			case 8:
				{
				setState(150);
				scope();
				}
				break;
			case 9:
				{
				setState(151);
				assignment();
				}
				break;
			case 10:
				{
				setState(152);
				loop_statements();
				}
				break;
			}
			setState(155);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("statements");
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << QUIT) | (1L << IF) | (1L << FOREACH) | (1L << BREAK) | (1L << SENDER) | (1L << SELF) | (1L << BEGIN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(158);
				statement();
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReceiverContext extends ParserRuleContext {
		public Token name;
		public TerminalNode RECEIVER() { return getToken(atalkParser.RECEIVER, 0); }
		public Def_argumentsContext def_arguments() {
			return getRuleContext(Def_argumentsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public Receiver_contentContext receiver_content() {
			return getRuleContext(Receiver_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(RECEIVER);
			setState(165);
			((ReceiverContext)_localctx).name = match(ID);
			print("receiver : " + ((ReceiverContext)_localctx).name.getText());
			setState(167);
			def_arguments();
			setState(168);
			match(NEWLINE);
			setState(169);
			receiver_content();
			setState(170);
			match(END);
			setState(171);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Def_argumentsContext extends ParserRuleContext {
		public List<Arg_var_defContext> arg_var_def() {
			return getRuleContexts(Arg_var_defContext.class);
		}
		public Arg_var_defContext arg_var_def(int i) {
			return getRuleContext(Arg_var_defContext.class,i);
		}
		public Def_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_arguments; }
	}

	public final Def_argumentsContext def_arguments() throws RecognitionException {
		Def_argumentsContext _localctx = new Def_argumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("def arguments");
			setState(174);
			match(T__3);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(175);
				arg_var_def();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(176);
					match(T__2);
					setState(177);
					arg_var_def();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentContext extends ParserRuleContext {
		public Arg_varContext arg_var() {
			return getRuleContext(Arg_varContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("argument");
			setState(188);
			match(T__3);
			{
			setState(189);
			arg_var();
			}
			setState(190);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<Arg_varContext> arg_var() {
			return getRuleContexts(Arg_varContext.class);
		}
		public Arg_varContext arg_var(int i) {
			return getRuleContext(Arg_varContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("arguments");
			setState(193);
			match(T__3);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << READ) | (1L << NOT) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(194);
				arg_var();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(195);
					match(T__2);
					setState(196);
					arg_var();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(204);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_varContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Arg_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_var; }
	}

	public final Arg_varContext arg_var() throws RecognitionException {
		Arg_varContext _localctx = new Arg_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg_var);
		try {
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("arg var");
				setState(207);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arg_var_defContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Arg_var_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_var_def; }
	}

	public final Arg_var_defContext arg_var_def() throws RecognitionException {
		Arg_var_defContext _localctx = new Arg_var_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("arg var def");
			setState(212);
			var_type();
			setState(213);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Receiver_contentContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Receiver_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver_content; }
	}

	public final Receiver_contentContext receiver_content() throws RecognitionException {
		Receiver_contentContext _localctx = new Receiver_contentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_receiver_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("receiver content");
			setState(216);
			statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VardefContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("vardef");
			setState(219);
			var_type();
			setState(220);
			var();
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(221);
				match(T__2);
				setState(222);
				var();
				}
				}
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("var");
			setState(229);
			match(ID);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(230);
				match(T__5);
				setState(231);
				expr();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementsContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(atalkParser.BREAK, 0); }
		public Loop_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statements; }
	}

	public final Loop_statementsContext loop_statements() throws RecognitionException {
		Loop_statementsContext _localctx = new Loop_statementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("loop statements");
			setState(235);
			match(BREAK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(atalkParser.BEGIN, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("scope");
			setState(238);
			match(BEGIN);
			setState(239);
			match(NEWLINE);
			setState(240);
			statements();
			setState(241);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(atalkParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public List<TerminalNode> ELSEIF() { return getTokens(atalkParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(atalkParser.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(atalkParser.ELSE, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("condition");
			setState(244);
			match(IF);
			setState(245);
			expr();
			setState(246);
			match(NEWLINE);
			setState(247);
			statements();
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(248);
				match(ELSEIF);
				setState(249);
				expr();
				setState(250);
				match(NEWLINE);
				setState(251);
				statements();
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(258);
				match(ELSE);
				setState(259);
				match(NEWLINE);
				setState(260);
				statements();
				}
			}

			setState(263);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForeachContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(atalkParser.FOREACH, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode IN() { return getToken(atalkParser.IN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public ForeachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreach; }
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("foreach");
			setState(266);
			match(FOREACH);
			setState(267);
			match(ID);
			setState(268);
			match(IN);
			setState(269);
			rvalue();
			setState(270);
			match(NEWLINE);
			setState(271);
			statements();
			setState(272);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenderContext extends ParserRuleContext {
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public TerminalNode SENDER() { return getToken(atalkParser.SENDER, 0); }
		public TerminalNode SELF() { return getToken(atalkParser.SELF, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public SenderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sender; }
	}

	public final SenderContext sender() throws RecognitionException {
		SenderContext _localctx = new SenderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("sender");
			setState(275);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SENDER) | (1L << SELF) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(276);
			match(T__6);
			setState(277);
			method_call();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("assignment");
			setState(280);
			lvalue();
			setState(281);
			match(T__5);
			setState(282);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("method call");
			setState(285);
			match(ID);
			setState(286);
			arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_defContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Def_argumentsContext def_arguments() {
			return getRuleContext(Def_argumentsContext.class,0);
		}
		public Function_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_def; }
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function def");
			setState(289);
			match(ID);
			setState(290);
			def_arguments();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_callContext extends ParserRuleContext {
		public Read_funcContext read_func() {
			return getRuleContext(Read_funcContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(293);
			read_func();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Read_funcContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(atalkParser.READ, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public Read_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_func; }
	}

	public final Read_funcContext read_func() throws RecognitionException {
		Read_funcContext _localctx = new Read_funcContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_read_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(296);
			match(READ);
			setState(297);
			match(T__3);
			setState(298);
			match(NUMBER);
			setState(299);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Write_funcContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(atalkParser.WRITE, 0); }
		public TerminalNode STRING() { return getToken(atalkParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode CHARACTER() { return getToken(atalkParser.CHARACTER, 0); }
		public Write_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_func; }
	}

	public final Write_funcContext write_func() throws RecognitionException {
		Write_funcContext _localctx = new Write_funcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_write_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(302);
			match(WRITE);
			setState(303);
			match(T__3);
			setState(304);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << CHARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(305);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("expr");
			setState(308);
			a1();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A1Context extends ParserRuleContext {
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public A1pContext a1p() {
			return getRuleContext(A1pContext.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public A1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a1; }
	}

	public final A1Context a1() throws RecognitionException {
		A1Context _localctx = new A1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_a1);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				a2();
				setState(311);
				a1p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				rvalue();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A1pContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(atalkParser.OR, 0); }
		public A2Context a2() {
			return getRuleContext(A2Context.class,0);
		}
		public A1pContext a1p() {
			return getRuleContext(A1pContext.class,0);
		}
		public A1pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a1p; }
	}

	public final A1pContext a1p() throws RecognitionException {
		A1pContext _localctx = new A1pContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_a1p);
		try {
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				{
				print("a1p : or");
				setState(317);
				match(OR);
				setState(318);
				a2();
				setState(319);
				a1p();
				}
				}
				break;
			case T__2:
			case T__4:
			case T__14:
			case T__16:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A2Context extends ParserRuleContext {
		public A3Context a3() {
			return getRuleContext(A3Context.class,0);
		}
		public A2pContext a2p() {
			return getRuleContext(A2pContext.class,0);
		}
		public A2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2; }
	}

	public final A2Context a2() throws RecognitionException {
		A2Context _localctx = new A2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_a2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			a3();
			setState(325);
			a2p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A2pContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(atalkParser.AND, 0); }
		public A3Context a3() {
			return getRuleContext(A3Context.class,0);
		}
		public A2pContext a2p() {
			return getRuleContext(A2pContext.class,0);
		}
		public A2pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a2p; }
	}

	public final A2pContext a2p() throws RecognitionException {
		A2pContext _localctx = new A2pContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_a2p);
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				{
				print("a1p : and");
				setState(328);
				match(AND);
				setState(329);
				a3();
				setState(330);
				a2p();
				}
				}
				break;
			case T__2:
			case T__4:
			case T__14:
			case T__16:
			case NEWLINE:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A3Context extends ParserRuleContext {
		public A4Context a4() {
			return getRuleContext(A4Context.class,0);
		}
		public A3pContext a3p() {
			return getRuleContext(A3pContext.class,0);
		}
		public A3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3; }
	}

	public final A3Context a3() throws RecognitionException {
		A3Context _localctx = new A3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_a3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			a4();
			setState(336);
			a3p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A3pContext extends ParserRuleContext {
		public Token op;
		public A4Context a4() {
			return getRuleContext(A4Context.class,0);
		}
		public A3pContext a3p() {
			return getRuleContext(A3pContext.class,0);
		}
		public A3pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3p; }
	}

	public final A3pContext a3p() throws RecognitionException {
		A3pContext _localctx = new A3pContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_a3p);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(338);
				((A3pContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((A3pContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				print("a1p : " + ((A3pContext)_localctx).op.getText());
				setState(340);
				a4();
				setState(341);
				a3p();
				}
				}
				break;
			case T__2:
			case T__4:
			case T__14:
			case T__16:
			case NEWLINE:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A4Context extends ParserRuleContext {
		public A5Context a5() {
			return getRuleContext(A5Context.class,0);
		}
		public A4pContext a4p() {
			return getRuleContext(A4pContext.class,0);
		}
		public A4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a4; }
	}

	public final A4Context a4() throws RecognitionException {
		A4Context _localctx = new A4Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_a4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			a5();
			setState(347);
			a4p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A4pContext extends ParserRuleContext {
		public Token op;
		public A5Context a5() {
			return getRuleContext(A5Context.class,0);
		}
		public A4pContext a4p() {
			return getRuleContext(A4pContext.class,0);
		}
		public A4pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a4p; }
	}

	public final A4pContext a4p() throws RecognitionException {
		A4pContext _localctx = new A4pContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_a4p);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(349);
				((A4pContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__1) ) {
					((A4pContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				print("a1p : " + ((A4pContext)_localctx).op.getText());
				setState(351);
				a5();
				setState(352);
				a4p();
				}
				}
				break;
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__14:
			case T__16:
			case NEWLINE:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A5Context extends ParserRuleContext {
		public A6Context a6() {
			return getRuleContext(A6Context.class,0);
		}
		public A5pContext a5p() {
			return getRuleContext(A5pContext.class,0);
		}
		public A5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a5; }
	}

	public final A5Context a5() throws RecognitionException {
		A5Context _localctx = new A5Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_a5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			a6();
			setState(358);
			a5p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A5pContext extends ParserRuleContext {
		public Token op;
		public A6Context a6() {
			return getRuleContext(A6Context.class,0);
		}
		public A5pContext a5p() {
			return getRuleContext(A5pContext.class,0);
		}
		public A5pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a5p; }
	}

	public final A5pContext a5p() throws RecognitionException {
		A5pContext _localctx = new A5pContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_a5p);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(360);
				((A5pContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__9 || _la==T__10) ) {
					((A5pContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				print("a1p : " + ((A5pContext)_localctx).op.getText());
				setState(362);
				a6();
				setState(363);
				a5p();
				}
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__14:
			case T__16:
			case NEWLINE:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A6Context extends ParserRuleContext {
		public A7Context a7() {
			return getRuleContext(A7Context.class,0);
		}
		public A6pContext a6p() {
			return getRuleContext(A6pContext.class,0);
		}
		public A6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a6; }
	}

	public final A6Context a6() throws RecognitionException {
		A6Context _localctx = new A6Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_a6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			a7();
			setState(369);
			a6p();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A6pContext extends ParserRuleContext {
		public Token op;
		public A7Context a7() {
			return getRuleContext(A7Context.class,0);
		}
		public A6pContext a6p() {
			return getRuleContext(A6pContext.class,0);
		}
		public A6pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a6p; }
	}

	public final A6pContext a6p() throws RecognitionException {
		A6pContext _localctx = new A6pContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_a6p);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(371);
				((A6pContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__11 || _la==T__12) ) {
					((A6pContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				print("a1p : " + ((A6pContext)_localctx).op.getText());
				setState(373);
				a7();
				setState(374);
				a6p();
				}
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__14:
			case T__16:
			case NEWLINE:
			case AND:
			case OR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A7Context extends ParserRuleContext {
		public A8Context a8() {
			return getRuleContext(A8Context.class,0);
		}
		public List<TerminalNode> NOT() { return getTokens(atalkParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(atalkParser.NOT, i);
		}
		public A7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a7; }
	}

	public final A7Context a7() throws RecognitionException {
		A7Context _localctx = new A7Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_a7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==NOT) {
				{
				{
				setState(379);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("a1p : -");
			setState(386);
			a8();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class A8Context extends ParserRuleContext {
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public A8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a8; }
	}

	public final A8Context a8() throws RecognitionException {
		A8Context _localctx = new A8Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_a8);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(388);
				match(T__3);
				print("a1p : ()");
				setState(390);
				a1();
				setState(391);
				match(T__4);
				}
				}
				break;
			case T__13:
			case READ:
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
				rvalue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(atalkParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(atalkParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Access_arrayContext access_array() {
			return getRuleContext(Access_arrayContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rvalue);
		try {
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("rvalue");
				setState(397);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(398);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(400);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(401);
				access_array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(402);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(403);
				array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Access_arrayContext access_array() {
			return getRuleContext(Access_arrayContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lvalue);
		try {
			setState(409);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("lvalue");
				setState(407);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(408);
				access_array();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Access_arrayContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public List<Array_indexContext> array_index() {
			return getRuleContexts(Array_indexContext.class);
		}
		public Array_indexContext array_index(int i) {
			return getRuleContext(Array_indexContext.class,i);
		}
		public Access_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_access_array; }
	}

	public final Access_arrayContext access_array() throws RecognitionException {
		Access_arrayContext _localctx = new Access_arrayContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_access_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("access array");
			setState(412);
			match(ID);
			setState(414); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(413);
				array_index();
				}
				}
				setState(416); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__15 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array");
			setState(419);
			match(T__13);
			setState(420);
			expr();
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(421);
				match(T__2);
				setState(422);
				expr();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(atalkParser.TYPE, 0); }
		public List<Array_defContext> array_def() {
			return getRuleContexts(Array_defContext.class);
		}
		public Array_defContext array_def(int i) {
			return getRuleContext(Array_defContext.class,i);
		}
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("var type");
			setState(431);
			match(TYPE);
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(432);
				array_def();
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_defContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array def");
			{
			setState(439);
			match(T__15);
			setState(440);
			match(NUMBER);
			setState(441);
			match(T__16);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_indexContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array access");
			{
			setState(444);
			match(T__15);
			setState(445);
			expr();
			setState(446);
			match(T__16);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u01c3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\7"+
		"\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\6\4{\n\4\r\4\16\4|\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7"+
		"\6\u008a\n\6\f\6\16\6\u008d\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u009c\n\7\3\7\3\7\3\b\3\b\7\b\u00a2\n\b\f\b\16\b\u00a5"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00b5"+
		"\n\n\f\n\16\n\u00b8\13\n\5\n\u00ba\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\7\f\u00c8\n\f\f\f\16\f\u00cb\13\f\5\f\u00cd\n\f\3"+
		"\f\3\f\3\r\3\r\3\r\5\r\u00d4\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\3\21\3"+
		"\21\3\21\3\21\5\21\u00eb\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0100\n\24"+
		"\f\24\16\24\u0103\13\24\3\24\3\24\3\24\5\24\u0108\n\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u013d\n\36\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0145\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u0150\n!\3\"\3\"\3"+
		"\"\3#\3#\3#\3#\3#\3#\5#\u015b\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0166\n"+
		"%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0171\n\'\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\5)\u017c\n)\3*\7*\u017f\n*\f*\16*\u0182\13*\3*\3*\3*\3+\3+\3+\3"+
		"+\3+\3+\5+\u018d\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0197\n,\3-\3-\3-\5-\u019c"+
		"\n-\3.\3.\3.\6.\u01a1\n.\r.\16.\u01a2\3/\3/\3/\3/\3/\7/\u01aa\n/\f/\16"+
		"/\u01ad\13/\3/\3/\3\60\3\60\3\60\7\60\u01b4\n\60\f\60\16\60\u01b7\13\60"+
		"\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\2\2\63\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVX"+
		"Z\\^`b\2\n\3\3\26\26\4\2\"#--\5\2**,,..\3\2\n\13\3\2\3\4\3\2\f\r\3\2\16"+
		"\17\4\2\r\r))\2\u01bc\2j\3\2\2\2\4o\3\2\2\2\6w\3\2\2\2\b~\3\2\2\2\n\u0084"+
		"\3\2\2\2\f\u0090\3\2\2\2\16\u009f\3\2\2\2\20\u00a6\3\2\2\2\22\u00af\3"+
		"\2\2\2\24\u00bd\3\2\2\2\26\u00c2\3\2\2\2\30\u00d3\3\2\2\2\32\u00d5\3\2"+
		"\2\2\34\u00d9\3\2\2\2\36\u00dc\3\2\2\2 \u00e6\3\2\2\2\"\u00ec\3\2\2\2"+
		"$\u00ef\3\2\2\2&\u00f5\3\2\2\2(\u010b\3\2\2\2*\u0114\3\2\2\2,\u0119\3"+
		"\2\2\2.\u011e\3\2\2\2\60\u0122\3\2\2\2\62\u0126\3\2\2\2\64\u0129\3\2\2"+
		"\2\66\u012f\3\2\2\28\u0135\3\2\2\2:\u013c\3\2\2\2<\u0144\3\2\2\2>\u0146"+
		"\3\2\2\2@\u014f\3\2\2\2B\u0151\3\2\2\2D\u015a\3\2\2\2F\u015c\3\2\2\2H"+
		"\u0165\3\2\2\2J\u0167\3\2\2\2L\u0170\3\2\2\2N\u0172\3\2\2\2P\u017b\3\2"+
		"\2\2R\u0180\3\2\2\2T\u018c\3\2\2\2V\u0196\3\2\2\2X\u019b\3\2\2\2Z\u019d"+
		"\3\2\2\2\\\u01a4\3\2\2\2^\u01b0\3\2\2\2`\u01b8\3\2\2\2b\u01bd\3\2\2\2"+
		"de\5\4\3\2ef\b\2\1\2fi\3\2\2\2gi\7\26\2\2hd\3\2\2\2hg\3\2\2\2il\3\2\2"+
		"\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\b\2\1\2n\3\3\2\2\2op\7\27"+
		"\2\2pq\7-\2\2qr\b\3\1\2rs\5\b\5\2st\5\6\4\2tu\7\36\2\2uv\t\2\2\2v\5\3"+
		"\2\2\2wz\b\4\1\2x{\5\n\6\2y{\5\20\t\2zx\3\2\2\2zy\3\2\2\2{|\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\7\3\2\2\2~\177\b\5\1\2\177\u0080\7\3\2\2\u0080\u0081"+
		"\7,\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7\26\2\2\u0083\t\3\2\2\2\u0084"+
		"\u0085\b\6\1\2\u0085\u0086\5^\60\2\u0086\u008b\7-\2\2\u0087\u0088\7\5"+
		"\2\2\u0088\u008a\7-\2\2\u0089\u0087\3\2\2\2\u008a\u008d\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2"+
		"\2\2\u008e\u008f\7\26\2\2\u008f\13\3\2\2\2\u0090\u009b\b\7\1\2\u0091\u009c"+
		"\7\32\2\2\u0092\u009c\5\36\20\2\u0093\u009c\5&\24\2\u0094\u009c\5(\25"+
		"\2\u0095\u009c\5*\26\2\u0096\u009c\5\62\32\2\u0097\u009c\5\66\34\2\u0098"+
		"\u009c\5$\23\2\u0099\u009c\5,\27\2\u009a\u009c\5\"\22\2\u009b\u0091\3"+
		"\2\2\2\u009b\u0092\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0094\3\2\2\2\u009b"+
		"\u0095\3\2\2\2\u009b\u0096\3\2\2\2\u009b\u0097\3\2\2\2\u009b\u0098\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\7\26\2\2\u009e\r\3\2\2\2\u009f\u00a3\b\b\1\2\u00a0\u00a2\5\f\7"+
		"\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\17\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7"+
		"\u00a8\7-\2\2\u00a8\u00a9\b\t\1\2\u00a9\u00aa\5\22\n\2\u00aa\u00ab\7\26"+
		"\2\2\u00ab\u00ac\5\34\17\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\7\26\2\2\u00ae"+
		"\21\3\2\2\2\u00af\u00b0\b\n\1\2\u00b0\u00b9\7\6\2\2\u00b1\u00b6\5\32\16"+
		"\2\u00b2\u00b3\7\5\2\2\u00b3\u00b5\5\32\16\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00ba\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\7\7\2\2\u00bc\23\3\2\2\2\u00bd\u00be\b\13\1"+
		"\2\u00be\u00bf\7\6\2\2\u00bf\u00c0\5\30\r\2\u00c0\u00c1\7\7\2\2\u00c1"+
		"\25\3\2\2\2\u00c2\u00c3\b\f\1\2\u00c3\u00cc\7\6\2\2\u00c4\u00c9\5\30\r"+
		"\2\u00c5\u00c6\7\5\2\2\u00c6\u00c8\5\30\r\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cd\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\b\r\1"+
		"\2\u00d1\u00d4\7-\2\2\u00d2\u00d4\58\35\2\u00d3\u00d0\3\2\2\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\31\3\2\2\2\u00d5\u00d6\b\16\1\2\u00d6\u00d7\5^\60\2\u00d7"+
		"\u00d8\7-\2\2\u00d8\33\3\2\2\2\u00d9\u00da\b\17\1\2\u00da\u00db\5\16\b"+
		"\2\u00db\35\3\2\2\2\u00dc\u00dd\b\20\1\2\u00dd\u00de\5^\60\2\u00de\u00e3"+
		"\5 \21\2\u00df\u00e0\7\5\2\2\u00e0\u00e2\5 \21\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\37\3\2\2"+
		"\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b\21\1\2\u00e7\u00ea\7-\2\2\u00e8\u00e9"+
		"\7\b\2\2\u00e9\u00eb\58\35\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"!\3\2\2\2\u00ec\u00ed\b\22\1\2\u00ed\u00ee\7 \2\2\u00ee#\3\2\2\2\u00ef"+
		"\u00f0\b\23\1\2\u00f0\u00f1\7$\2\2\u00f1\u00f2\7\26\2\2\u00f2\u00f3\5"+
		"\16\b\2\u00f3\u00f4\7\36\2\2\u00f4%\3\2\2\2\u00f5\u00f6\b\24\1\2\u00f6"+
		"\u00f7\7\33\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\26\2\2\u00f9\u0101\5"+
		"\16\b\2\u00fa\u00fb\7\34\2\2\u00fb\u00fc\58\35\2\u00fc\u00fd\7\26\2\2"+
		"\u00fd\u00fe\5\16\b\2\u00fe\u0100\3\2\2\2\u00ff\u00fa\3\2\2\2\u0100\u0103"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0107\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0105\7\35\2\2\u0105\u0106\7\26\2\2\u0106\u0108\5"+
		"\16\b\2\u0107\u0104\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\7\36\2\2\u010a\'\3\2\2\2\u010b\u010c\b\25\1\2\u010c\u010d\7\37"+
		"\2\2\u010d\u010e\7-\2\2\u010e\u010f\7!\2\2\u010f\u0110\5V,\2\u0110\u0111"+
		"\7\26\2\2\u0111\u0112\5\16\b\2\u0112\u0113\7\36\2\2\u0113)\3\2\2\2\u0114"+
		"\u0115\b\26\1\2\u0115\u0116\t\3\2\2\u0116\u0117\7\t\2\2\u0117\u0118\5"+
		".\30\2\u0118+\3\2\2\2\u0119\u011a\b\27\1\2\u011a\u011b\5X-\2\u011b\u011c"+
		"\7\b\2\2\u011c\u011d\58\35\2\u011d-\3\2\2\2\u011e\u011f\b\30\1\2\u011f"+
		"\u0120\7-\2\2\u0120\u0121\5\26\f\2\u0121/\3\2\2\2\u0122\u0123\b\31\1\2"+
		"\u0123\u0124\7-\2\2\u0124\u0125\5\22\n\2\u0125\61\3\2\2\2\u0126\u0127"+
		"\b\32\1\2\u0127\u0128\5\64\33\2\u0128\63\3\2\2\2\u0129\u012a\b\33\1\2"+
		"\u012a\u012b\7%\2\2\u012b\u012c\7\6\2\2\u012c\u012d\7,\2\2\u012d\u012e"+
		"\7\7\2\2\u012e\65\3\2\2\2\u012f\u0130\b\34\1\2\u0130\u0131\7&\2\2\u0131"+
		"\u0132\7\6\2\2\u0132\u0133\t\4\2\2\u0133\u0134\7\7\2\2\u0134\67\3\2\2"+
		"\2\u0135\u0136\b\35\1\2\u0136\u0137\5:\36\2\u01379\3\2\2\2\u0138\u0139"+
		"\5> \2\u0139\u013a\5<\37\2\u013a\u013d\3\2\2\2\u013b\u013d\5V,\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013b\3\2\2\2\u013d;\3\2\2\2\u013e\u013f\b\37\1\2"+
		"\u013f\u0140\7(\2\2\u0140\u0141\5> \2\u0141\u0142\5<\37\2\u0142\u0145"+
		"\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u013e\3\2\2\2\u0144\u0143\3\2\2\2\u0145"+
		"=\3\2\2\2\u0146\u0147\5B\"\2\u0147\u0148\5@!\2\u0148?\3\2\2\2\u0149\u014a"+
		"\b!\1\2\u014a\u014b\7\'\2\2\u014b\u014c\5B\"\2\u014c\u014d\5@!\2\u014d"+
		"\u0150\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u014f\u014e\3\2"+
		"\2\2\u0150A\3\2\2\2\u0151\u0152\5F$\2\u0152\u0153\5D#\2\u0153C\3\2\2\2"+
		"\u0154\u0155\t\5\2\2\u0155\u0156\b#\1\2\u0156\u0157\5F$\2\u0157\u0158"+
		"\5D#\2\u0158\u015b\3\2\2\2\u0159\u015b\3\2\2\2\u015a\u0154\3\2\2\2\u015a"+
		"\u0159\3\2\2\2\u015bE\3\2\2\2\u015c\u015d\5J&\2\u015d\u015e\5H%\2\u015e"+
		"G\3\2\2\2\u015f\u0160\t\6\2\2\u0160\u0161\b%\1\2\u0161\u0162\5J&\2\u0162"+
		"\u0163\5H%\2\u0163\u0166\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u015f\3\2\2"+
		"\2\u0165\u0164\3\2\2\2\u0166I\3\2\2\2\u0167\u0168\5N(\2\u0168\u0169\5"+
		"L\'\2\u0169K\3\2\2\2\u016a\u016b\t\7\2\2\u016b\u016c\b\'\1\2\u016c\u016d"+
		"\5N(\2\u016d\u016e\5L\'\2\u016e\u0171\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016a\3\2\2\2\u0170\u016f\3\2\2\2\u0171M\3\2\2\2\u0172\u0173\5R*\2\u0173"+
		"\u0174\5P)\2\u0174O\3\2\2\2\u0175\u0176\t\b\2\2\u0176\u0177\b)\1\2\u0177"+
		"\u0178\5R*\2\u0178\u0179\5P)\2\u0179\u017c\3\2\2\2\u017a\u017c\3\2\2\2"+
		"\u017b\u0175\3\2\2\2\u017b\u017a\3\2\2\2\u017cQ\3\2\2\2\u017d\u017f\t"+
		"\t\2\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\b*"+
		"\1\2\u0184\u0185\5T+\2\u0185S\3\2\2\2\u0186\u0187\7\6\2\2\u0187\u0188"+
		"\b+\1\2\u0188\u0189\5:\36\2\u0189\u018a\7\7\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u018d\5V,\2\u018c\u0186\3\2\2\2\u018c\u018b\3\2\2\2\u018dU\3\2\2\2\u018e"+
		"\u018f\b,\1\2\u018f\u0197\7*\2\2\u0190\u0197\7,\2\2\u0191\u0197\7+\2\2"+
		"\u0192\u0197\7-\2\2\u0193\u0197\5Z.\2\u0194\u0197\5\62\32\2\u0195\u0197"+
		"\5\\/\2\u0196\u018e\3\2\2\2\u0196\u0190\3\2\2\2\u0196\u0191\3\2\2\2\u0196"+
		"\u0192\3\2\2\2\u0196\u0193\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0195\3\2"+
		"\2\2\u0197W\3\2\2\2\u0198\u0199\b-\1\2\u0199\u019c\7-\2\2\u019a\u019c"+
		"\5Z.\2\u019b\u0198\3\2\2\2\u019b\u019a\3\2\2\2\u019cY\3\2\2\2\u019d\u019e"+
		"\b.\1\2\u019e\u01a0\7-\2\2\u019f\u01a1\5b\62\2\u01a0\u019f\3\2\2\2\u01a1"+
		"\u01a2\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3[\3\2\2\2"+
		"\u01a4\u01a5\b/\1\2\u01a5\u01a6\7\20\2\2\u01a6\u01ab\58\35\2\u01a7\u01a8"+
		"\7\5\2\2\u01a8\u01aa\58\35\2\u01a9\u01a7\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad\u01ab\3\2"+
		"\2\2\u01ae\u01af\7\21\2\2\u01af]\3\2\2\2\u01b0\u01b1\b\60\1\2\u01b1\u01b5"+
		"\7\31\2\2\u01b2\u01b4\5`\61\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2"+
		"\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6_\3\2\2\2\u01b7\u01b5\3"+
		"\2\2\2\u01b8\u01b9\b\61\1\2\u01b9\u01ba\7\22\2\2\u01ba\u01bb\7,\2\2\u01bb"+
		"\u01bc\7\23\2\2\u01bca\3\2\2\2\u01bd\u01be\b\62\1\2\u01be\u01bf\7\22\2"+
		"\2\u01bf\u01c0\58\35\2\u01c0\u01c1\7\23\2\2\u01c1c\3\2\2\2 hjz|\u008b"+
		"\u009b\u00a3\u00b6\u00b9\u00c9\u00cc\u00d3\u00e3\u00ea\u0101\u0107\u013c"+
		"\u0144\u014f\u015a\u0165\u0170\u017b\u0180\u018c\u0196\u019b\u01a2\u01ab"+
		"\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}