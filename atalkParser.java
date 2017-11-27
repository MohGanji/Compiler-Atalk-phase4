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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(ACTOR);
			setState(106);
			((ActorContext)_localctx).name = match(ID);
			print("actor : " + ((ActorContext)_localctx).name.getText());
			setState(108);
			actor_size();
			setState(109);
			actor_content();
			setState(110);
			match(END);
			setState(111);
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
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
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
			match(T__0);
			setState(122);
			match(NUMBER);
			setState(123);
			match(T__1);
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
			while (_la==T__2) {
				{
				{
				setState(129);
				match(T__2);
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
			setState(160);
			match(RECEIVER);
			setState(161);
			((ReceiverContext)_localctx).name = match(ID);
			print("receiver : " + ((ReceiverContext)_localctx).name.getText());
			setState(163);
			def_arguments();
			setState(164);
			match(NEWLINE);
			setState(165);
			receiver_content();
			setState(166);
			match(END);
			setState(167);
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
			setState(170);
			match(T__3);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(171);
				arg_var_def();
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(172);
					match(T__2);
					setState(173);
					arg_var_def();
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(181);
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
			setState(184);
			match(T__3);
			{
			setState(185);
			arg_var();
			}
			setState(186);
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
			setState(189);
			match(T__3);
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << READ) | (1L << NOT) | (1L << STRING) | (1L << CHAR) | (1L << NUMBER) | (1L << ID))) != 0)) {
				{
				setState(190);
				arg_var();
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(191);
					match(T__2);
					setState(192);
					arg_var();
					}
					}
					setState(197);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(200);
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
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("arg var");
				setState(203);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
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
			setState(208);
			var_type();
			setState(209);
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
			setState(212);
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
			setState(215);
			var_type();
			setState(216);
			var();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(217);
				match(T__2);
				setState(218);
				var();
				}
				}
				setState(223);
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
			setState(225);
			match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(226);
				match(T__5);
				setState(227);
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
			setState(231);
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
			setState(234);
			match(BEGIN);
			setState(235);
			match(NEWLINE);
			setState(236);
			statements();
			setState(237);
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
			setState(240);
			match(IF);
			setState(241);
			expr();
			setState(242);
			match(NEWLINE);
			setState(243);
			statements();
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(244);
				match(ELSEIF);
				setState(245);
				expr();
				setState(246);
				match(NEWLINE);
				setState(247);
				statements();
				}
				}
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(254);
				match(ELSE);
				setState(255);
				match(NEWLINE);
				setState(256);
				statements();
				}
			}

			setState(259);
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
			setState(262);
			match(FOREACH);
			setState(263);
			match(ID);
			setState(264);
			match(IN);
			setState(265);
			rvalue();
			setState(266);
			match(NEWLINE);
			setState(267);
			statements();
			setState(268);
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
			setState(271);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SENDER) | (1L << SELF) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(272);
			match(T__6);
			setState(273);
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
			setState(276);
			lvalue();
			setState(277);
			match(T__5);
			setState(278);
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
			setState(281);
			match(ID);
			setState(282);
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
			setState(285);
			match(ID);
			setState(286);
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
			setState(289);
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
			setState(292);
			match(READ);
			setState(293);
			match(T__3);
			setState(294);
			match(NUMBER);
			setState(295);
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
			setState(298);
			match(WRITE);
			setState(299);
			match(T__3);
			setState(300);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << NUMBER) | (1L << CHARACTER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(301);
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
			setState(304);
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
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				a2();
				setState(307);
				a1p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
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
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				{
				print("a1p : or");
				setState(313);
				match(OR);
				setState(314);
				a2();
				setState(315);
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
			setState(320);
			a3();
			setState(321);
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
			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				{
				print("a1p : and");
				setState(324);
				match(AND);
				setState(325);
				a3();
				setState(326);
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
			setState(331);
			a4();
			setState(332);
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
			setState(340);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(334);
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
				setState(336);
				a4();
				setState(337);
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
			setState(342);
			a5();
			setState(343);
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
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(345);
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
				setState(347);
				a5();
				setState(348);
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
			setState(353);
			a6();
			setState(354);
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
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(356);
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
				setState(358);
				a6();
				setState(359);
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
			setState(364);
			a7();
			setState(365);
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
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(367);
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
				setState(369);
				a7();
				setState(370);
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
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10 || _la==NOT) {
				{
				{
				setState(375);
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
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("a1p : -");
			setState(382);
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
			setState(390);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(384);
				match(T__3);
				print("a1p : ()");
				setState(386);
				a1();
				setState(387);
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
				setState(389);
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
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("rvalue");
				setState(393);
				match(STRING);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(395);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(397);
				access_array();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(398);
				function_call();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(399);
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
			setState(405);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				print("lvalue");
				setState(403);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(404);
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
			setState(408);
			match(ID);
			setState(410); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(409);
				array_index();
				}
				}
				setState(412); 
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
			setState(415);
			match(T__13);
			setState(416);
			expr();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(417);
				match(T__2);
				setState(418);
				expr();
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
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
			setState(427);
			match(TYPE);
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__15) {
				{
				{
				setState(428);
				array_def();
				}
				}
				setState(433);
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
			setState(435);
			match(T__15);
			setState(436);
			match(NUMBER);
			setState(437);
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
			setState(440);
			match(T__15);
			setState(441);
			expr();
			setState(442);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u01bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\6\4w\n\4\r"+
		"\4\16\4x\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\7\6\u0086\n\6\f\6"+
		"\16\6\u0089\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0098\n\7\3\7\3\7\3\b\3\b\7\b\u009e\n\b\f\b\16\b\u00a1\13\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00b1\n\n\f\n\16"+
		"\n\u00b4\13\n\5\n\u00b6\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00c4\n\f\f\f\16\f\u00c7\13\f\5\f\u00c9\n\f\3\f\3\f\3\r"+
		"\3\r\3\r\5\r\u00d0\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\7\20\u00de\n\20\f\20\16\20\u00e1\13\20\3\21\3\21\3\21\3"+
		"\21\5\21\u00e7\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u00fc\n\24\f\24\16"+
		"\24\u00ff\13\24\3\24\3\24\3\24\5\24\u0104\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u0139\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u0141\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\5!\u014c\n!\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\5#\u0157\n#\3$\3$\3$\3%\3%\3%\3%\3%\3%\5%\u0162\n%\3&\3&\3"+
		"&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016d\n\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\5)"+
		"\u0178\n)\3*\7*\u017b\n*\f*\16*\u017e\13*\3*\3*\3*\3+\3+\3+\3+\3+\3+\5"+
		"+\u0189\n+\3,\3,\3,\3,\3,\3,\3,\3,\5,\u0193\n,\3-\3-\3-\5-\u0198\n-\3"+
		".\3.\3.\6.\u019d\n.\r.\16.\u019e\3/\3/\3/\3/\3/\7/\u01a6\n/\f/\16/\u01a9"+
		"\13/\3/\3/\3\60\3\60\3\60\7\60\u01b0\n\60\f\60\16\60\u01b3\13\60\3\61"+
		"\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\2\2\63\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`b\2\n\3\3\26\26\4\2\"#--\5\2**,,..\3\2\n\13\3\2\3\4\3\2\f\r\3\2\16\17"+
		"\4\2\r\r))\2\u01b8\2h\3\2\2\2\4k\3\2\2\2\6s\3\2\2\2\bz\3\2\2\2\n\u0080"+
		"\3\2\2\2\f\u008c\3\2\2\2\16\u009b\3\2\2\2\20\u00a2\3\2\2\2\22\u00ab\3"+
		"\2\2\2\24\u00b9\3\2\2\2\26\u00be\3\2\2\2\30\u00cf\3\2\2\2\32\u00d1\3\2"+
		"\2\2\34\u00d5\3\2\2\2\36\u00d8\3\2\2\2 \u00e2\3\2\2\2\"\u00e8\3\2\2\2"+
		"$\u00eb\3\2\2\2&\u00f1\3\2\2\2(\u0107\3\2\2\2*\u0110\3\2\2\2,\u0115\3"+
		"\2\2\2.\u011a\3\2\2\2\60\u011e\3\2\2\2\62\u0122\3\2\2\2\64\u0125\3\2\2"+
		"\2\66\u012b\3\2\2\28\u0131\3\2\2\2:\u0138\3\2\2\2<\u0140\3\2\2\2>\u0142"+
		"\3\2\2\2@\u014b\3\2\2\2B\u014d\3\2\2\2D\u0156\3\2\2\2F\u0158\3\2\2\2H"+
		"\u0161\3\2\2\2J\u0163\3\2\2\2L\u016c\3\2\2\2N\u016e\3\2\2\2P\u0177\3\2"+
		"\2\2R\u017c\3\2\2\2T\u0188\3\2\2\2V\u0192\3\2\2\2X\u0197\3\2\2\2Z\u0199"+
		"\3\2\2\2\\\u01a0\3\2\2\2^\u01ac\3\2\2\2`\u01b4\3\2\2\2b\u01b9\3\2\2\2"+
		"dg\5\4\3\2eg\7\26\2\2fd\3\2\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\3\3\2\2\2jh\3\2\2\2kl\7\27\2\2lm\7-\2\2mn\b\3\1\2no\5\b\5\2op\5\6"+
		"\4\2pq\7\36\2\2qr\t\2\2\2r\5\3\2\2\2sv\b\4\1\2tw\5\n\6\2uw\5\20\t\2vt"+
		"\3\2\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2z{\b\5\1\2"+
		"{|\7\3\2\2|}\7,\2\2}~\7\4\2\2~\177\7\26\2\2\177\t\3\2\2\2\u0080\u0081"+
		"\b\6\1\2\u0081\u0082\5^\60\2\u0082\u0087\7-\2\2\u0083\u0084\7\5\2\2\u0084"+
		"\u0086\7-\2\2\u0085\u0083\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u008b\7\26\2\2\u008b\13\3\2\2\2\u008c\u0097\b\7\1\2\u008d\u0098\7\32"+
		"\2\2\u008e\u0098\5\36\20\2\u008f\u0098\5&\24\2\u0090\u0098\5(\25\2\u0091"+
		"\u0098\5*\26\2\u0092\u0098\5\62\32\2\u0093\u0098\5\66\34\2\u0094\u0098"+
		"\5$\23\2\u0095\u0098\5,\27\2\u0096\u0098\5\"\22\2\u0097\u008d\3\2\2\2"+
		"\u0097\u008e\3\2\2\2\u0097\u008f\3\2\2\2\u0097\u0090\3\2\2\2\u0097\u0091"+
		"\3\2\2\2\u0097\u0092\3\2\2\2\u0097\u0093\3\2\2\2\u0097\u0094\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\26"+
		"\2\2\u009a\r\3\2\2\2\u009b\u009f\b\b\1\2\u009c\u009e\5\f\7\2\u009d\u009c"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\17\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\30\2\2\u00a3\u00a4\7-\2"+
		"\2\u00a4\u00a5\b\t\1\2\u00a5\u00a6\5\22\n\2\u00a6\u00a7\7\26\2\2\u00a7"+
		"\u00a8\5\34\17\2\u00a8\u00a9\7\36\2\2\u00a9\u00aa\7\26\2\2\u00aa\21\3"+
		"\2\2\2\u00ab\u00ac\b\n\1\2\u00ac\u00b5\7\6\2\2\u00ad\u00b2\5\32\16\2\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b1\5\32\16\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3"+
		"\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00ad\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b8\7\7\2\2\u00b8\23\3\2\2\2\u00b9\u00ba\b\13\1\2\u00ba\u00bb"+
		"\7\6\2\2\u00bb\u00bc\5\30\r\2\u00bc\u00bd\7\7\2\2\u00bd\25\3\2\2\2\u00be"+
		"\u00bf\b\f\1\2\u00bf\u00c8\7\6\2\2\u00c0\u00c5\5\30\r\2\u00c1\u00c2\7"+
		"\5\2\2\u00c2\u00c4\5\30\r\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5"+
		"\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\7\7\2\2\u00cb\27\3\2\2\2\u00cc\u00cd\b\r\1\2\u00cd\u00d0\7-\2\2"+
		"\u00ce\u00d0\58\35\2\u00cf\u00cc\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0\31"+
		"\3\2\2\2\u00d1\u00d2\b\16\1\2\u00d2\u00d3\5^\60\2\u00d3\u00d4\7-\2\2\u00d4"+
		"\33\3\2\2\2\u00d5\u00d6\b\17\1\2\u00d6\u00d7\5\16\b\2\u00d7\35\3\2\2\2"+
		"\u00d8\u00d9\b\20\1\2\u00d9\u00da\5^\60\2\u00da\u00df\5 \21\2\u00db\u00dc"+
		"\7\5\2\2\u00dc\u00de\5 \21\2\u00dd\u00db\3\2\2\2\u00de\u00e1\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\37\3\2\2\2\u00e1\u00df\3\2\2"+
		"\2\u00e2\u00e3\b\21\1\2\u00e3\u00e6\7-\2\2\u00e4\u00e5\7\b\2\2\u00e5\u00e7"+
		"\58\35\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7!\3\2\2\2\u00e8"+
		"\u00e9\b\22\1\2\u00e9\u00ea\7 \2\2\u00ea#\3\2\2\2\u00eb\u00ec\b\23\1\2"+
		"\u00ec\u00ed\7$\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\5\16\b\2\u00ef\u00f0"+
		"\7\36\2\2\u00f0%\3\2\2\2\u00f1\u00f2\b\24\1\2\u00f2\u00f3\7\33\2\2\u00f3"+
		"\u00f4\58\35\2\u00f4\u00f5\7\26\2\2\u00f5\u00fd\5\16\b\2\u00f6\u00f7\7"+
		"\34\2\2\u00f7\u00f8\58\35\2\u00f8\u00f9\7\26\2\2\u00f9\u00fa\5\16\b\2"+
		"\u00fa\u00fc\3\2\2\2\u00fb\u00f6\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0103\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\7\35\2\2\u0101\u0102\7\26\2\2\u0102\u0104\5\16\b\2\u0103\u0100"+
		"\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\36\2\2"+
		"\u0106\'\3\2\2\2\u0107\u0108\b\25\1\2\u0108\u0109\7\37\2\2\u0109\u010a"+
		"\7-\2\2\u010a\u010b\7!\2\2\u010b\u010c\5V,\2\u010c\u010d\7\26\2\2\u010d"+
		"\u010e\5\16\b\2\u010e\u010f\7\36\2\2\u010f)\3\2\2\2\u0110\u0111\b\26\1"+
		"\2\u0111\u0112\t\3\2\2\u0112\u0113\7\t\2\2\u0113\u0114\5.\30\2\u0114+"+
		"\3\2\2\2\u0115\u0116\b\27\1\2\u0116\u0117\5X-\2\u0117\u0118\7\b\2\2\u0118"+
		"\u0119\58\35\2\u0119-\3\2\2\2\u011a\u011b\b\30\1\2\u011b\u011c\7-\2\2"+
		"\u011c\u011d\5\26\f\2\u011d/\3\2\2\2\u011e\u011f\b\31\1\2\u011f\u0120"+
		"\7-\2\2\u0120\u0121\5\22\n\2\u0121\61\3\2\2\2\u0122\u0123\b\32\1\2\u0123"+
		"\u0124\5\64\33\2\u0124\63\3\2\2\2\u0125\u0126\b\33\1\2\u0126\u0127\7%"+
		"\2\2\u0127\u0128\7\6\2\2\u0128\u0129\7,\2\2\u0129\u012a\7\7\2\2\u012a"+
		"\65\3\2\2\2\u012b\u012c\b\34\1\2\u012c\u012d\7&\2\2\u012d\u012e\7\6\2"+
		"\2\u012e\u012f\t\4\2\2\u012f\u0130\7\7\2\2\u0130\67\3\2\2\2\u0131\u0132"+
		"\b\35\1\2\u0132\u0133\5:\36\2\u01339\3\2\2\2\u0134\u0135\5> \2\u0135\u0136"+
		"\5<\37\2\u0136\u0139\3\2\2\2\u0137\u0139\5V,\2\u0138\u0134\3\2\2\2\u0138"+
		"\u0137\3\2\2\2\u0139;\3\2\2\2\u013a\u013b\b\37\1\2\u013b\u013c\7(\2\2"+
		"\u013c\u013d\5> \2\u013d\u013e\5<\37\2\u013e\u0141\3\2\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u013a\3\2\2\2\u0140\u013f\3\2\2\2\u0141=\3\2\2\2\u0142"+
		"\u0143\5B\"\2\u0143\u0144\5@!\2\u0144?\3\2\2\2\u0145\u0146\b!\1\2\u0146"+
		"\u0147\7\'\2\2\u0147\u0148\5B\"\2\u0148\u0149\5@!\2\u0149\u014c\3\2\2"+
		"\2\u014a\u014c\3\2\2\2\u014b\u0145\3\2\2\2\u014b\u014a\3\2\2\2\u014cA"+
		"\3\2\2\2\u014d\u014e\5F$\2\u014e\u014f\5D#\2\u014fC\3\2\2\2\u0150\u0151"+
		"\t\5\2\2\u0151\u0152\b#\1\2\u0152\u0153\5F$\2\u0153\u0154\5D#\2\u0154"+
		"\u0157\3\2\2\2\u0155\u0157\3\2\2\2\u0156\u0150\3\2\2\2\u0156\u0155\3\2"+
		"\2\2\u0157E\3\2\2\2\u0158\u0159\5J&\2\u0159\u015a\5H%\2\u015aG\3\2\2\2"+
		"\u015b\u015c\t\6\2\2\u015c\u015d\b%\1\2\u015d\u015e\5J&\2\u015e\u015f"+
		"\5H%\2\u015f\u0162\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015b\3\2\2\2\u0161"+
		"\u0160\3\2\2\2\u0162I\3\2\2\2\u0163\u0164\5N(\2\u0164\u0165\5L\'\2\u0165"+
		"K\3\2\2\2\u0166\u0167\t\7\2\2\u0167\u0168\b\'\1\2\u0168\u0169\5N(\2\u0169"+
		"\u016a\5L\'\2\u016a\u016d\3\2\2\2\u016b\u016d\3\2\2\2\u016c\u0166\3\2"+
		"\2\2\u016c\u016b\3\2\2\2\u016dM\3\2\2\2\u016e\u016f\5R*\2\u016f\u0170"+
		"\5P)\2\u0170O\3\2\2\2\u0171\u0172\t\b\2\2\u0172\u0173\b)\1\2\u0173\u0174"+
		"\5R*\2\u0174\u0175\5P)\2\u0175\u0178\3\2\2\2\u0176\u0178\3\2\2\2\u0177"+
		"\u0171\3\2\2\2\u0177\u0176\3\2\2\2\u0178Q\3\2\2\2\u0179\u017b\t\t\2\2"+
		"\u017a\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d"+
		"\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0180\b*\1\2\u0180"+
		"\u0181\5T+\2\u0181S\3\2\2\2\u0182\u0183\7\6\2\2\u0183\u0184\b+\1\2\u0184"+
		"\u0185\5:\36\2\u0185\u0186\7\7\2\2\u0186\u0189\3\2\2\2\u0187\u0189\5V"+
		",\2\u0188\u0182\3\2\2\2\u0188\u0187\3\2\2\2\u0189U\3\2\2\2\u018a\u018b"+
		"\b,\1\2\u018b\u0193\7*\2\2\u018c\u0193\7,\2\2\u018d\u0193\7+\2\2\u018e"+
		"\u0193\7-\2\2\u018f\u0193\5Z.\2\u0190\u0193\5\62\32\2\u0191\u0193\5\\"+
		"/\2\u0192\u018a\3\2\2\2\u0192\u018c\3\2\2\2\u0192\u018d\3\2\2\2\u0192"+
		"\u018e\3\2\2\2\u0192\u018f\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0191\3\2"+
		"\2\2\u0193W\3\2\2\2\u0194\u0195\b-\1\2\u0195\u0198\7-\2\2\u0196\u0198"+
		"\5Z.\2\u0197\u0194\3\2\2\2\u0197\u0196\3\2\2\2\u0198Y\3\2\2\2\u0199\u019a"+
		"\b.\1\2\u019a\u019c\7-\2\2\u019b\u019d\5b\62\2\u019c\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f[\3\2\2\2"+
		"\u01a0\u01a1\b/\1\2\u01a1\u01a2\7\20\2\2\u01a2\u01a7\58\35\2\u01a3\u01a4"+
		"\7\5\2\2\u01a4\u01a6\58\35\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9\u01a7\3\2"+
		"\2\2\u01aa\u01ab\7\21\2\2\u01ab]\3\2\2\2\u01ac\u01ad\b\60\1\2\u01ad\u01b1"+
		"\7\31\2\2\u01ae\u01b0\5`\61\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2"+
		"\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2_\3\2\2\2\u01b3\u01b1\3"+
		"\2\2\2\u01b4\u01b5\b\61\1\2\u01b5\u01b6\7\22\2\2\u01b6\u01b7\7,\2\2\u01b7"+
		"\u01b8\7\23\2\2\u01b8a\3\2\2\2\u01b9\u01ba\b\62\1\2\u01ba\u01bb\7\22\2"+
		"\2\u01bb\u01bc\58\35\2\u01bc\u01bd\7\23\2\2\u01bdc\3\2\2\2 fhvx\u0087"+
		"\u0097\u009f\u00b2\u00b5\u00c5\u00c8\u00cf\u00df\u00e6\u00fd\u0103\u0138"+
		"\u0140\u014b\u0156\u0161\u016c\u0177\u017c\u0188\u0192\u0197\u019e\u01a7"+
		"\u01b1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}