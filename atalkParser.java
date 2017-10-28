// Generated from atalk.g4 by ANTLR 4.7
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
		SPACE=1, COMMENT=2, NEWLINE=3, ACTOR=4, RECEIVER=5, TYPE=6, QUIT=7, IF=8, 
		ELSEIF=9, ELSE=10, END=11, FOREACH=12, BREAK=13, IN=14, SENDER=15, SELF=16, 
		BEGIN=17, READ=18, WRITE=19, AND=20, OR=21, PLUS=22, MINUS=23, MULT=24, 
		DIV=25, EQ=26, EQEQ=27, NOTEQ=28, LT=29, GT=30, POPEN=31, PCLOSE=32, BOPEN=33, 
		BCLOSE=34, COPEN=35, CCLOSE=36, SEND_OP=37, SHARP=38, COMMA=39, NOT=40, 
		STRING=41, CHAR=42, NUMBER=43, ID=44, CHARACTER=45, ANY_CHAR=46;
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
		null, null, null, null, "'actor'", "'receiver'", null, "'quit'", "'if'", 
		"'elseif'", "'else'", "'end'", "'foreach'", "'break'", "'in'", "'sender'", 
		"'self'", "'begin'", "'read'", "'write'", "'and'", "'or'", "'+'", "'-'", 
		"'*'", "'/'", "'='", "'=='", "'<>'", "'<'", "'>'", "'('", "')'", "'['", 
		"']'", "'{'", "'}'", "'<<'", "'#'", "','", "'not'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "COMMENT", "NEWLINE", "ACTOR", "RECEIVER", "TYPE", "QUIT", 
		"IF", "ELSEIF", "ELSE", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", 
		"BEGIN", "READ", "WRITE", "AND", "OR", "PLUS", "MINUS", "MULT", "DIV", 
		"EQ", "EQEQ", "NOTEQ", "LT", "GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", 
		"COPEN", "CCLOSE", "SEND_OP", "SHARP", "COMMA", "NOT", "STRING", "CHAR", 
		"NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(98);
					actor();
					}
					break;
				case NEWLINE:
					{
					setState(99);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(104);
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

	public static class ActorContext extends ParserRuleContext {
		public TerminalNode ACTOR() { return getToken(atalkParser.ACTOR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Actor_sizeContext actor_size() {
			return getRuleContext(Actor_sizeContext.class,0);
		}
		public Actor_contentContext actor_content() {
			return getRuleContext(Actor_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public ActorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor(this);
		}
	}

	public final ActorContext actor() throws RecognitionException {
		ActorContext _localctx = new ActorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_actor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("actor");
			setState(106);
			match(ACTOR);
			setState(107);
			match(ID);
			setState(108);
			actor_size();
			setState(109);
			actor_content();
			setState(110);
			match(END);
			setState(111);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor_content(this);
		}
	}

	public final Actor_contentContext actor_content() throws RecognitionException {
		Actor_contentContext _localctx = new Actor_contentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_actor_content);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("actor content");
			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(116);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(114);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(115);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(118); 
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
		public TerminalNode LT() { return getToken(atalkParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode GT() { return getToken(atalkParser.GT, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public Actor_sizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actor_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterActor_size(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitActor_size(this);
		}
	}

	public final Actor_sizeContext actor_size() throws RecognitionException {
		Actor_sizeContext _localctx = new Actor_sizeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_actor_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("actor size");
			setState(121);
			match(LT);
			setState(122);
			match(NUMBER);
			setState(123);
			match(GT);
			setState(124);
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
		public List<TerminalNode> COMMA() { return getTokens(atalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(atalkParser.COMMA, i);
		}
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("state");
			setState(127);
			var_type();
			setState(128);
			match(ID);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(129);
				match(COMMA);
				setState(130);
				match(ID);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("statement");
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(139);
				match(QUIT);
				}
				break;
			case 2:
				{
				setState(140);
				vardef();
				}
				break;
			case 3:
				{
				setState(141);
				condition();
				}
				break;
			case 4:
				{
				setState(142);
				foreach();
				}
				break;
			case 5:
				{
				setState(143);
				sender();
				}
				break;
			case 6:
				{
				setState(144);
				function_call();
				}
				break;
			case 7:
				{
				setState(145);
				write_func();
				}
				break;
			case 8:
				{
				setState(146);
				scope();
				}
				break;
			case 9:
				{
				setState(147);
				assignment();
				}
				break;
			case 10:
				{
				setState(148);
				loop_statements();
				}
				break;
			}
			setState(151);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("statements");
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << QUIT) | (1L << IF) | (1L << FOREACH) | (1L << BREAK) | (1L << SENDER) | (1L << SELF) | (1L << BEGIN) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
				{
				{
				setState(154);
				statement();
				}
				}
				setState(159);
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
		public TerminalNode RECEIVER() { return getToken(atalkParser.RECEIVER, 0); }
		public Function_defContext function_def() {
			return getRuleContext(Function_defContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(atalkParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(atalkParser.NEWLINE, i);
		}
		public Receiver_contentContext receiver_content() {
			return getRuleContext(Receiver_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public ReceiverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receiver; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterReceiver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitReceiver(this);
		}
	}

	public final ReceiverContext receiver() throws RecognitionException {
		ReceiverContext _localctx = new ReceiverContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("receiver");
			setState(161);
			match(RECEIVER);
			setState(162);
			function_def();
			setState(163);
			match(NEWLINE);
			setState(164);
			receiver_content();
			setState(165);
			match(END);
			setState(166);
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
		public TerminalNode POPEN() { return getToken(atalkParser.POPEN, 0); }
		public TerminalNode PCLOSE() { return getToken(atalkParser.PCLOSE, 0); }
		public List<Arg_var_defContext> arg_var_def() {
			return getRuleContexts(Arg_var_defContext.class);
		}
		public Arg_var_defContext arg_var_def(int i) {
			return getRuleContext(Arg_var_defContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(atalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(atalkParser.COMMA, i);
		}
		public Def_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterDef_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitDef_arguments(this);
		}
	}

	public final Def_argumentsContext def_arguments() throws RecognitionException {
		Def_argumentsContext _localctx = new Def_argumentsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_def_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("def arguments");
			setState(169);
			match(POPEN);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(170);
				arg_var_def();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(171);
					match(COMMA);
					setState(172);
					arg_var_def();
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(180);
			match(PCLOSE);
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
		public TerminalNode POPEN() { return getToken(atalkParser.POPEN, 0); }
		public TerminalNode PCLOSE() { return getToken(atalkParser.PCLOSE, 0); }
		public Arg_varContext arg_var() {
			return getRuleContext(Arg_varContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArgument(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("argument");
			setState(183);
			match(POPEN);
			{
			setState(184);
			arg_var();
			}
			setState(185);
			match(PCLOSE);
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
		public TerminalNode POPEN() { return getToken(atalkParser.POPEN, 0); }
		public TerminalNode PCLOSE() { return getToken(atalkParser.PCLOSE, 0); }
		public List<Arg_varContext> arg_var() {
			return getRuleContexts(Arg_varContext.class);
		}
		public Arg_varContext arg_var(int i) {
			return getRuleContext(Arg_varContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(atalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(atalkParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("arguments");
			setState(188);
			match(POPEN);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << READ) | (1L << MINUS) | (1L << POPEN) | (1L << COPEN) | (1L << NOT) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(189);
				arg_var();
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(190);
					match(COMMA);
					setState(191);
					arg_var();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(199);
			match(PCLOSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArg_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArg_var(this);
		}
	}

	public final Arg_varContext arg_var() throws RecognitionException {
		Arg_varContext _localctx = new Arg_varContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arg_var);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("arg var");
				setState(202);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArg_var_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArg_var_def(this);
		}
	}

	public final Arg_var_defContext arg_var_def() throws RecognitionException {
		Arg_var_defContext _localctx = new Arg_var_defContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arg_var_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("arg var def");
			setState(207);
			var_type();
			setState(208);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterReceiver_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitReceiver_content(this);
		}
	}

	public final Receiver_contentContext receiver_content() throws RecognitionException {
		Receiver_contentContext _localctx = new Receiver_contentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_receiver_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("receiver content");
			setState(211);
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
		public List<TerminalNode> COMMA() { return getTokens(atalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(atalkParser.COMMA, i);
		}
		public VardefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVardef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVardef(this);
		}
	}

	public final VardefContext vardef() throws RecognitionException {
		VardefContext _localctx = new VardefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("vardef");
			setState(214);
			var_type();
			setState(215);
			var();
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(216);
				match(COMMA);
				setState(217);
				var();
				}
				}
				setState(222);
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
		public TerminalNode EQ() { return getToken(atalkParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("var");
			setState(224);
			match(ID);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(225);
				match(EQ);
				setState(226);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterLoop_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitLoop_statements(this);
		}
	}

	public final Loop_statementsContext loop_statements() throws RecognitionException {
		Loop_statementsContext _localctx = new Loop_statementsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_loop_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("loop statements");
			setState(230);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitScope(this);
		}
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("scope");
			setState(233);
			match(BEGIN);
			setState(234);
			match(NEWLINE);
			setState(235);
			statements();
			setState(236);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("condition");
			setState(239);
			match(IF);
			setState(240);
			expr();
			setState(241);
			match(NEWLINE);
			setState(242);
			statements();
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(243);
				match(ELSEIF);
				setState(244);
				expr();
				setState(245);
				match(NEWLINE);
				setState(246);
				statements();
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(253);
				match(ELSE);
				setState(254);
				match(NEWLINE);
				setState(255);
				statements();
				}
			}

			setState(258);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterForeach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitForeach(this);
		}
	}

	public final ForeachContext foreach() throws RecognitionException {
		ForeachContext _localctx = new ForeachContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("foreach");
			setState(261);
			match(FOREACH);
			setState(262);
			match(ID);
			setState(263);
			match(IN);
			setState(264);
			rvalue();
			setState(265);
			match(NEWLINE);
			setState(266);
			statements();
			setState(267);
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
		public TerminalNode SEND_OP() { return getToken(atalkParser.SEND_OP, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterSender(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitSender(this);
		}
	}

	public final SenderContext sender() throws RecognitionException {
		SenderContext _localctx = new SenderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("sender");
			setState(270);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SENDER) | (1L << SELF) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(271);
			match(SEND_OP);
			setState(272);
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
		public TerminalNode EQ() { return getToken(atalkParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("assignment");
			setState(275);
			lvalue();
			setState(276);
			match(EQ);
			setState(277);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterMethod_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitMethod_call(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("method call");
			setState(280);
			match(ID);
			setState(281);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterFunction_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitFunction_def(this);
		}
	}

	public final Function_defContext function_def() throws RecognitionException {
		Function_defContext _localctx = new Function_defContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function def");
			setState(284);
			match(ID);
			setState(285);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(288);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterRead_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitRead_func(this);
		}
	}

	public final Read_funcContext read_func() throws RecognitionException {
		Read_funcContext _localctx = new Read_funcContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_read_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(291);
			match(READ);
			setState(292);
			match(POPEN);
			setState(293);
			match(NUMBER);
			setState(294);
			match(PCLOSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterWrite_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitWrite_func(this);
		}
	}

	public final Write_funcContext write_func() throws RecognitionException {
		Write_funcContext _localctx = new Write_funcContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_write_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("function call");
			setState(297);
			match(WRITE);
			setState(298);
			match(POPEN);
			setState(299);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << CHARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(300);
			match(PCLOSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("expr");
			setState(303);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA1(this);
		}
	}

	public final A1Context a1() throws RecognitionException {
		A1Context _localctx = new A1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_a1);
		try {
			setState(309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				a2();
				setState(306);
				a1p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA1p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA1p(this);
		}
	}

	public final A1pContext a1p() throws RecognitionException {
		A1pContext _localctx = new A1pContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_a1p);
		try {
			setState(316);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(OR);
				setState(312);
				a2();
				setState(313);
				a1p();
				}
				break;
			case NEWLINE:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA2(this);
		}
	}

	public final A2Context a2() throws RecognitionException {
		A2Context _localctx = new A2Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_a2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			a3();
			setState(319);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA2p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA2p(this);
		}
	}

	public final A2pContext a2p() throws RecognitionException {
		A2pContext _localctx = new A2pContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_a2p);
		try {
			setState(326);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				match(AND);
				setState(322);
				a3();
				setState(323);
				a2p();
				}
				break;
			case NEWLINE:
			case OR:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA3(this);
		}
	}

	public final A3Context a3() throws RecognitionException {
		A3Context _localctx = new A3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_a3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			a4();
			setState(329);
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
		public A4Context a4() {
			return getRuleContext(A4Context.class,0);
		}
		public A3pContext a3p() {
			return getRuleContext(A3pContext.class,0);
		}
		public TerminalNode EQEQ() { return getToken(atalkParser.EQEQ, 0); }
		public TerminalNode NOTEQ() { return getToken(atalkParser.NOTEQ, 0); }
		public A3pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a3p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA3p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA3p(this);
		}
	}

	public final A3pContext a3p() throws RecognitionException {
		A3pContext _localctx = new A3pContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_a3p);
		int _la;
		try {
			setState(336);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
			case NOTEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(331);
				_la = _input.LA(1);
				if ( !(_la==EQEQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(332);
				a4();
				setState(333);
				a3p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA4(this);
		}
	}

	public final A4Context a4() throws RecognitionException {
		A4Context _localctx = new A4Context(_ctx, getState());
		enterRule(_localctx, 68, RULE_a4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			a5();
			setState(339);
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
		public A5Context a5() {
			return getRuleContext(A5Context.class,0);
		}
		public A4pContext a4p() {
			return getRuleContext(A4pContext.class,0);
		}
		public TerminalNode LT() { return getToken(atalkParser.LT, 0); }
		public TerminalNode GT() { return getToken(atalkParser.GT, 0); }
		public A4pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a4p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA4p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA4p(this);
		}
	}

	public final A4pContext a4p() throws RecognitionException {
		A4pContext _localctx = new A4pContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_a4p);
		int _la;
		try {
			setState(346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(342);
				a5();
				setState(343);
				a4p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case EQEQ:
			case NOTEQ:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA5(this);
		}
	}

	public final A5Context a5() throws RecognitionException {
		A5Context _localctx = new A5Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_a5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(348);
			a6();
			setState(349);
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
		public A6Context a6() {
			return getRuleContext(A6Context.class,0);
		}
		public A5pContext a5p() {
			return getRuleContext(A5pContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(atalkParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(atalkParser.MINUS, 0); }
		public A5pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a5p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA5p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA5p(this);
		}
	}

	public final A5pContext a5p() throws RecognitionException {
		A5pContext _localctx = new A5pContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_a5p);
		int _la;
		try {
			setState(356);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(352);
				a6();
				setState(353);
				a5p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case EQEQ:
			case NOTEQ:
			case LT:
			case GT:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA6(this);
		}
	}

	public final A6Context a6() throws RecognitionException {
		A6Context _localctx = new A6Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_a6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			a7();
			setState(359);
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
		public A7Context a7() {
			return getRuleContext(A7Context.class,0);
		}
		public A6pContext a6p() {
			return getRuleContext(A6pContext.class,0);
		}
		public TerminalNode MULT() { return getToken(atalkParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(atalkParser.DIV, 0); }
		public A6pContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a6p; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA6p(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA6p(this);
		}
	}

	public final A6pContext a6p() throws RecognitionException {
		A6pContext _localctx = new A6pContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_a6p);
		int _la;
		try {
			setState(366);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(362);
				a7();
				setState(363);
				a6p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case PLUS:
			case MINUS:
			case EQEQ:
			case NOTEQ:
			case LT:
			case GT:
			case PCLOSE:
			case BCLOSE:
			case CCLOSE:
			case COMMA:
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
		public List<TerminalNode> MINUS() { return getTokens(atalkParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(atalkParser.MINUS, i);
		}
		public List<TerminalNode> NOT() { return getTokens(atalkParser.NOT); }
		public TerminalNode NOT(int i) {
			return getToken(atalkParser.NOT, i);
		}
		public A7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA7(this);
		}
	}

	public final A7Context a7() throws RecognitionException {
		A7Context _localctx = new A7Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_a7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MINUS || _la==NOT) {
				{
				{
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==MINUS || _la==NOT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
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
		public TerminalNode POPEN() { return getToken(atalkParser.POPEN, 0); }
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public TerminalNode PCLOSE() { return getToken(atalkParser.PCLOSE, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public A8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterA8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitA8(this);
		}
	}

	public final A8Context a8() throws RecognitionException {
		A8Context _localctx = new A8Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_a8);
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(376);
				match(POPEN);
				setState(377);
				a1();
				setState(378);
				match(PCLOSE);
				}
				break;
			case READ:
			case COPEN:
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(380);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		RvalueContext _localctx = new RvalueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_rvalue);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("rvalue");
				setState(384);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(386);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(388);
				access_array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(389);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(390);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_lvalue);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterAccess_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitAccess_array(this);
		}
	}

	public final Access_arrayContext access_array() throws RecognitionException {
		Access_arrayContext _localctx = new Access_arrayContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_access_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("access array");
			setState(398);
			match(ID);
			setState(400); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(399);
				array_index();
				}
				}
				setState(402); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==BOPEN );
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
		public TerminalNode COPEN() { return getToken(atalkParser.COPEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CCLOSE() { return getToken(atalkParser.CCLOSE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(atalkParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(atalkParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array");
			setState(405);
			match(COPEN);
			setState(406);
			expr();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(407);
				match(COMMA);
				setState(408);
				expr();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(CCLOSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitVar_type(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("var type");
			setState(417);
			match(TYPE);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOPEN) {
				{
				{
				setState(418);
				array_def();
				}
				}
				setState(423);
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
		public TerminalNode BOPEN() { return getToken(atalkParser.BOPEN, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode BCLOSE() { return getToken(atalkParser.BCLOSE, 0); }
		public Array_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray_def(this);
		}
	}

	public final Array_defContext array_def() throws RecognitionException {
		Array_defContext _localctx = new Array_defContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array def");
			{
			setState(425);
			match(BOPEN);
			setState(426);
			match(NUMBER);
			setState(427);
			match(BCLOSE);
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
		public TerminalNode BOPEN() { return getToken(atalkParser.BOPEN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode BCLOSE() { return getToken(atalkParser.BCLOSE, 0); }
		public Array_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray_index(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray_index(this);
		}
	}

	public final Array_indexContext array_index() throws RecognitionException {
		Array_indexContext _localctx = new Array_indexContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_array_index);
		try {
			enterOuterAlt(_localctx, 1);
			{
			print("array access");
			{
			setState(430);
			match(BOPEN);
			setState(431);
			expr();
			setState(432);
			match(BCLOSE);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u01b5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4w\n\4\r"+
		"\4\16\4x\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6"+
		"\16\6\u0089\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0098\n\7\3\7\3\7\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3"+
		"\13\n\5\n\u00b5\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00c3\n\f\f\f\16\f\u00c6\13\f\5\f\u00c8\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\5\r\u00cf\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\7\20\u00dd\n\20\f\20\16\20\u00e0\13\20\3\21\3\21\3\21\3\21\5\21"+
		"\u00e6\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00fb\n\24\f\24\16\24\u00fe\13"+
		"\24\3\24\3\24\3\24\5\24\u0103\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\5\36\u0138\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u013f\n\37\3"+
		" \3 \3 \3!\3!\3!\3!\3!\5!\u0149\n!\3\"\3\"\3\"\3#\3#\3#\3#\3#\5#\u0153"+
		"\n#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u015d\n%\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u0167\n\'\3(\3(\3(\3)\3)\3)\3)\3)\5)\u0171\n)\3*\7*\u0174\n*\f*\16"+
		"*\u0177\13*\3*\3*\3+\3+\3+\3+\3+\5+\u0180\n+\3,\3,\3,\3,\3,\3,\3,\3,\5"+
		",\u018a\n,\3-\3-\5-\u018e\n-\3.\3.\3.\6.\u0193\n.\r.\16.\u0194\3/\3/\3"+
		"/\3/\3/\7/\u019c\n/\f/\16/\u019f\13/\3/\3/\3\60\3\60\3\60\7\60\u01a6\n"+
		"\60\f\60\16\60\u01a9\13\60\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\2\2\63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\t\4\2\21\22..\5\2++--//\3\2\35\36\3\2"+
		"\37 \3\2\30\31\3\2\32\33\4\2\31\31**\2\u01ae\2h\3\2\2\2\4k\3\2\2\2\6s"+
		"\3\2\2\2\bz\3\2\2\2\n\u0080\3\2\2\2\f\u008c\3\2\2\2\16\u009b\3\2\2\2\20"+
		"\u00a2\3\2\2\2\22\u00aa\3\2\2\2\24\u00b8\3\2\2\2\26\u00bd\3\2\2\2\30\u00ce"+
		"\3\2\2\2\32\u00d0\3\2\2\2\34\u00d4\3\2\2\2\36\u00d7\3\2\2\2 \u00e1\3\2"+
		"\2\2\"\u00e7\3\2\2\2$\u00ea\3\2\2\2&\u00f0\3\2\2\2(\u0106\3\2\2\2*\u010f"+
		"\3\2\2\2,\u0114\3\2\2\2.\u0119\3\2\2\2\60\u011d\3\2\2\2\62\u0121\3\2\2"+
		"\2\64\u0124\3\2\2\2\66\u012a\3\2\2\28\u0130\3\2\2\2:\u0137\3\2\2\2<\u013e"+
		"\3\2\2\2>\u0140\3\2\2\2@\u0148\3\2\2\2B\u014a\3\2\2\2D\u0152\3\2\2\2F"+
		"\u0154\3\2\2\2H\u015c\3\2\2\2J\u015e\3\2\2\2L\u0166\3\2\2\2N\u0168\3\2"+
		"\2\2P\u0170\3\2\2\2R\u0175\3\2\2\2T\u017f\3\2\2\2V\u0189\3\2\2\2X\u018d"+
		"\3\2\2\2Z\u018f\3\2\2\2\\\u0196\3\2\2\2^\u01a2\3\2\2\2`\u01aa\3\2\2\2"+
		"b\u01af\3\2\2\2dg\5\4\3\2eg\7\5\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3"+
		"\2\2\2hi\3\2\2\2i\3\3\2\2\2jh\3\2\2\2kl\b\3\1\2lm\7\6\2\2mn\7.\2\2no\5"+
		"\b\5\2op\5\6\4\2pq\7\r\2\2qr\7\5\2\2r\5\3\2\2\2sv\b\4\1\2tw\5\n\6\2uw"+
		"\5\20\t\2vt\3\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2"+
		"z{\b\5\1\2{|\7\37\2\2|}\7-\2\2}~\7 \2\2~\177\7\5\2\2\177\t\3\2\2\2\u0080"+
		"\u0081\b\6\1\2\u0081\u0082\5^\60\2\u0082\u0087\7.\2\2\u0083\u0084\7)\2"+
		"\2\u0084\u0086\7.\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\5\2\2\u008b\13\3\2\2\2\u008c\u0097\b\7\1\2\u008d\u0098\7\t\2"+
		"\2\u008e\u0098\5\36\20\2\u008f\u0098\5&\24\2\u0090\u0098\5(\25\2\u0091"+
		"\u0098\5*\26\2\u0092\u0098\5\62\32\2\u0093\u0098\5\66\34\2\u0094\u0098"+
		"\5$\23\2\u0095\u0098\5,\27\2\u0096\u0098\5\"\22\2\u0097\u008d\3\2\2\2"+
		"\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\5"+
		"\2\2\u009a\r\3\2\2\2\u009b\u009f\b\b\1\2\u009c\u009e\5\f\7\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\17\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\b\t\1\2\u00a3\u00a4\7\7\2"+
		"\2\u00a4\u00a5\5\60\31\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\5\34\17\2\u00a7"+
		"\u00a8\7\r\2\2\u00a8\u00a9\7\5\2\2\u00a9\21\3\2\2\2\u00aa\u00ab\b\n\1"+
		"\2\u00ab\u00b4\7!\2\2\u00ac\u00b1\5\32\16\2\u00ad\u00ae\7)\2\2\u00ae\u00b0"+
		"\5\32\16\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2"+
		"\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00ac"+
		"\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\"\2\2\u00b7"+
		"\23\3\2\2\2\u00b8\u00b9\b\13\1\2\u00b9\u00ba\7!\2\2\u00ba\u00bb\5\30\r"+
		"\2\u00bb\u00bc\7\"\2\2\u00bc\25\3\2\2\2\u00bd\u00be\b\f\1\2\u00be\u00c7"+
		"\7!\2\2\u00bf\u00c4\5\30\r\2\u00c0\u00c1\7)\2\2\u00c1\u00c3\5\30\r\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00bf\3\2\2\2\u00c7"+
		"\u00c8\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\"\2\2\u00ca\27\3\2\2"+
		"\2\u00cb\u00cc\b\r\1\2\u00cc\u00cf\7.\2\2\u00cd\u00cf\58\35\2\u00ce\u00cb"+
		"\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\31\3\2\2\2\u00d0\u00d1\b\16\1\2\u00d1"+
		"\u00d2\5^\60\2\u00d2\u00d3\7.\2\2\u00d3\33\3\2\2\2\u00d4\u00d5\b\17\1"+
		"\2\u00d5\u00d6\5\16\b\2\u00d6\35\3\2\2\2\u00d7\u00d8\b\20\1\2\u00d8\u00d9"+
		"\5^\60\2\u00d9\u00de\5 \21\2\u00da\u00db\7)\2\2\u00db\u00dd\5 \21\2\u00dc"+
		"\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\37\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\b\21\1\2\u00e2\u00e5"+
		"\7.\2\2\u00e3\u00e4\7\34\2\2\u00e4\u00e6\58\35\2\u00e5\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6!\3\2\2\2\u00e7\u00e8\b\22\1\2\u00e8\u00e9\7\17\2"+
		"\2\u00e9#\3\2\2\2\u00ea\u00eb\b\23\1\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed"+
		"\7\5\2\2\u00ed\u00ee\5\16\b\2\u00ee\u00ef\7\r\2\2\u00ef%\3\2\2\2\u00f0"+
		"\u00f1\b\24\1\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\58\35\2\u00f3\u00f4\7"+
		"\5\2\2\u00f4\u00fc\5\16\b\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\58\35\2\u00f7"+
		"\u00f8\7\5\2\2\u00f8\u00f9\5\16\b\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3"+
		"\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u0102\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\f\2\2\u0100\u0101\7\5"+
		"\2\2\u0101\u0103\5\16\b\2\u0102\u00ff\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\7\r\2\2\u0105\'\3\2\2\2\u0106\u0107\b\25\1"+
		"\2\u0107\u0108\7\16\2\2\u0108\u0109\7.\2\2\u0109\u010a\7\20\2\2\u010a"+
		"\u010b\5V,\2\u010b\u010c\7\5\2\2\u010c\u010d\5\16\b\2\u010d\u010e\7\r"+
		"\2\2\u010e)\3\2\2\2\u010f\u0110\b\26\1\2\u0110\u0111\t\2\2\2\u0111\u0112"+
		"\7\'\2\2\u0112\u0113\5.\30\2\u0113+\3\2\2\2\u0114\u0115\b\27\1\2\u0115"+
		"\u0116\5X-\2\u0116\u0117\7\34\2\2\u0117\u0118\58\35\2\u0118-\3\2\2\2\u0119"+
		"\u011a\b\30\1\2\u011a\u011b\7.\2\2\u011b\u011c\5\26\f\2\u011c/\3\2\2\2"+
		"\u011d\u011e\b\31\1\2\u011e\u011f\7.\2\2\u011f\u0120\5\22\n\2\u0120\61"+
		"\3\2\2\2\u0121\u0122\b\32\1\2\u0122\u0123\5\64\33\2\u0123\63\3\2\2\2\u0124"+
		"\u0125\b\33\1\2\u0125\u0126\7\24\2\2\u0126\u0127\7!\2\2\u0127\u0128\7"+
		"-\2\2\u0128\u0129\7\"\2\2\u0129\65\3\2\2\2\u012a\u012b\b\34\1\2\u012b"+
		"\u012c\7\25\2\2\u012c\u012d\7!\2\2\u012d\u012e\t\3\2\2\u012e\u012f\7\""+
		"\2\2\u012f\67\3\2\2\2\u0130\u0131\b\35\1\2\u0131\u0132\5:\36\2\u01329"+
		"\3\2\2\2\u0133\u0134\5> \2\u0134\u0135\5<\37\2\u0135\u0138\3\2\2\2\u0136"+
		"\u0138\5V,\2\u0137\u0133\3\2\2\2\u0137\u0136\3\2\2\2\u0138;\3\2\2\2\u0139"+
		"\u013a\7\27\2\2\u013a\u013b\5> \2\u013b\u013c\5<\37\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013d\3\2\2\2\u013f"+
		"=\3\2\2\2\u0140\u0141\5B\"\2\u0141\u0142\5@!\2\u0142?\3\2\2\2\u0143\u0144"+
		"\7\26\2\2\u0144\u0145\5B\"\2\u0145\u0146\5@!\2\u0146\u0149\3\2\2\2\u0147"+
		"\u0149\3\2\2\2\u0148\u0143\3\2\2\2\u0148\u0147\3\2\2\2\u0149A\3\2\2\2"+
		"\u014a\u014b\5F$\2\u014b\u014c\5D#\2\u014cC\3\2\2\2\u014d\u014e\t\4\2"+
		"\2\u014e\u014f\5F$\2\u014f\u0150\5D#\2\u0150\u0153\3\2\2\2\u0151\u0153"+
		"\3\2\2\2\u0152\u014d\3\2\2\2\u0152\u0151\3\2\2\2\u0153E\3\2\2\2\u0154"+
		"\u0155\5J&\2\u0155\u0156\5H%\2\u0156G\3\2\2\2\u0157\u0158\t\5\2\2\u0158"+
		"\u0159\5J&\2\u0159\u015a\5H%\2\u015a\u015d\3\2\2\2\u015b\u015d\3\2\2\2"+
		"\u015c\u0157\3\2\2\2\u015c\u015b\3\2\2\2\u015dI\3\2\2\2\u015e\u015f\5"+
		"N(\2\u015f\u0160\5L\'\2\u0160K\3\2\2\2\u0161\u0162\t\6\2\2\u0162\u0163"+
		"\5N(\2\u0163\u0164\5L\'\2\u0164\u0167\3\2\2\2\u0165\u0167\3\2\2\2\u0166"+
		"\u0161\3\2\2\2\u0166\u0165\3\2\2\2\u0167M\3\2\2\2\u0168\u0169\5R*\2\u0169"+
		"\u016a\5P)\2\u016aO\3\2\2\2\u016b\u016c\t\7\2\2\u016c\u016d\5R*\2\u016d"+
		"\u016e\5P)\2\u016e\u0171\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016b\3\2\2"+
		"\2\u0170\u016f\3\2\2\2\u0171Q\3\2\2\2\u0172\u0174\t\b\2\2\u0173\u0172"+
		"\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2\2\2\u0176"+
		"\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179\5T+\2\u0179S\3\2\2\2\u017a"+
		"\u017b\7!\2\2\u017b\u017c\5:\36\2\u017c\u017d\7\"\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u0180\5V,\2\u017f\u017a\3\2\2\2\u017f\u017e\3\2\2\2\u0180U"+
		"\3\2\2\2\u0181\u0182\b,\1\2\u0182\u018a\7+\2\2\u0183\u018a\7-\2\2\u0184"+
		"\u018a\7,\2\2\u0185\u018a\7.\2\2\u0186\u018a\5Z.\2\u0187\u018a\5\62\32"+
		"\2\u0188\u018a\5\\/\2\u0189\u0181\3\2\2\2\u0189\u0183\3\2\2\2\u0189\u0184"+
		"\3\2\2\2\u0189\u0185\3\2\2\2\u0189\u0186\3\2\2\2\u0189\u0187\3\2\2\2\u0189"+
		"\u0188\3\2\2\2\u018aW\3\2\2\2\u018b\u018e\7.\2\2\u018c\u018e\5Z.\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018eY\3\2\2\2\u018f\u0190\b.\1\2\u0190"+
		"\u0192\7.\2\2\u0191\u0193\5b\62\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195[\3\2\2\2\u0196\u0197"+
		"\b/\1\2\u0197\u0198\7%\2\2\u0198\u019d\58\35\2\u0199\u019a\7)\2\2\u019a"+
		"\u019c\58\35\2\u019b\u0199\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2"+
		"\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\7&\2\2\u01a1]\3\2\2\2\u01a2\u01a3\b\60\1\2\u01a3\u01a7\7\b\2\2"+
		"\u01a4\u01a6\5`\61\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5"+
		"\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8_\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa"+
		"\u01ab\b\61\1\2\u01ab\u01ac\7#\2\2\u01ac\u01ad\7-\2\2\u01ad\u01ae\7$\2"+
		"\2\u01aea\3\2\2\2\u01af\u01b0\b\62\1\2\u01b0\u01b1\7#\2\2\u01b1\u01b2"+
		"\58\35\2\u01b2\u01b3\7$\2\2\u01b3c\3\2\2\2 fhvx\u0087\u0097\u009f\u00b1"+
		"\u00b4\u00c4\u00c7\u00ce\u00de\u00e5\u00fc\u0102\u0137\u013e\u0148\u0152"+
		"\u015c\u0166\u0170\u0175\u017f\u0189\u018d\u0194\u019d\u01a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}