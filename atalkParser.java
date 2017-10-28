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
		COMMENT=1, NEWLINE=2, SPACE=3, ACTOR=4, RECEIVER=5, TYPE=6, QUIT=7, IF=8, 
		ELSEIF=9, END=10, FOREACH=11, BREAK=12, IN=13, SENDER=14, SELF=15, BEGIN=16, 
		AND=17, OR=18, PLUS=19, MINUS=20, MULT=21, DIV=22, EQ=23, EQEQ=24, NOTEQ=25, 
		LT=26, GT=27, POPEN=28, PCLOSE=29, BOPEN=30, BCLOSE=31, COPEN=32, CCLOSE=33, 
		SEND_OP=34, SHARP=35, COMMA=36, STRING=37, CHAR=38, NUMBER=39, ID=40, 
		CHARACTER=41, ANY_CHAR=42;
	public static final int
		RULE_program = 0, RULE_actor = 1, RULE_actor_content = 2, RULE_actor_size = 3, 
		RULE_state = 4, RULE_receiver = 5, RULE_def_arguments = 6, RULE_arguments = 7, 
		RULE_arg_var = 8, RULE_receiver_content = 9, RULE_vardef = 10, RULE_var = 11, 
		RULE_statements = 12, RULE_loop_statements = 13, RULE_statement = 14, 
		RULE_condition = 15, RULE_foreach = 16, RULE_sender = 17, RULE_scope = 18, 
		RULE_assignment = 19, RULE_function_def = 20, RULE_function_call = 21, 
		RULE_value = 22, RULE_expr = 23, RULE_a1 = 24, RULE_a1p = 25, RULE_a2 = 26, 
		RULE_a2p = 27, RULE_a3 = 28, RULE_a3p = 29, RULE_a4 = 30, RULE_a4p = 31, 
		RULE_a5 = 32, RULE_a5p = 33, RULE_a6 = 34, RULE_a6p = 35, RULE_a7 = 36, 
		RULE_def_value = 37, RULE_array = 38, RULE_var_type = 39, RULE_array_def = 40, 
		RULE_array_access = 41;
	public static final String[] ruleNames = {
		"program", "actor", "actor_content", "actor_size", "state", "receiver", 
		"def_arguments", "arguments", "arg_var", "receiver_content", "vardef", 
		"var", "statements", "loop_statements", "statement", "condition", "foreach", 
		"sender", "scope", "assignment", "function_def", "function_call", "value", 
		"expr", "a1", "a1p", "a2", "a2p", "a3", "a3p", "a4", "a4p", "a5", "a5p", 
		"a6", "a6p", "a7", "def_value", "array", "var_type", "array_def", "array_access"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'actor'", "'receiver'", null, "'quit'", "'if'", 
		"'elseif'", "'end'", "'foreach'", "'break'", "'in'", "'sender'", "'self'", 
		"'begin'", "'and'", "'or'", "'+'", "'-'", "'*'", "'/'", "'='", "'=='", 
		"'<>'", "'<'", "'>'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'<<'", 
		"'#'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "COMMENT", "NEWLINE", "SPACE", "ACTOR", "RECEIVER", "TYPE", "QUIT", 
		"IF", "ELSEIF", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", "BEGIN", 
		"AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "EQEQ", "NOTEQ", "LT", 
		"GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", "COPEN", "CCLOSE", "SEND_OP", 
		"SHARP", "COMMA", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==ACTOR) {
				{
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ACTOR:
					{
					setState(84);
					actor();
					}
					break;
				case NEWLINE:
					{
					setState(85);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(90);
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
			setState(91);
			match(ACTOR);
			setState(92);
			match(ID);
			setState(93);
			actor_size();
			setState(94);
			actor_content();
			setState(95);
			match(END);
			setState(96);
			match(NEWLINE);
			print("actor");
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
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TYPE:
					{
					setState(99);
					state();
					}
					break;
				case RECEIVER:
					{
					setState(100);
					receiver();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RECEIVER || _la==TYPE );
			print("actor content");
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
			setState(107);
			match(LT);
			setState(108);
			match(NUMBER);
			setState(109);
			match(GT);
			setState(110);
			match(NEWLINE);
			print("actor size");
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
			print("state start");
			setState(114);
			var_type();
			setState(115);
			match(ID);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				match(ID);
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(NEWLINE);
			print("state");
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
		public Receiver_contentContext receiver_content() {
			return getRuleContext(Receiver_contentContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
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
		enterRule(_localctx, 10, RULE_receiver);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(RECEIVER);
			setState(127);
			function_def();
			setState(128);
			receiver_content();
			setState(129);
			match(END);
			setState(130);
			match(NEWLINE);
			print("receiver");
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
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public List<Arg_varContext> arg_var() {
			return getRuleContexts(Arg_varContext.class);
		}
		public Arg_varContext arg_var(int i) {
			return getRuleContext(Arg_varContext.class,i);
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
		enterRule(_localctx, 12, RULE_def_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(POPEN);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(134);
				arg_var();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
			match(PCLOSE);
			setState(141);
			match(NEWLINE);
			print("def arguments");
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
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 14, RULE_arguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(POPEN);
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(145);
				match(ID);
				}
				break;
			case 2:
				{
				setState(146);
				value();
				}
				break;
			}
			setState(149);
			match(PCLOSE);
			setState(150);
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

	public static class Arg_varContext extends ParserRuleContext {
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
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
		enterRule(_localctx, 16, RULE_arg_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			var_type();
			setState(153);
			match(ID);
			print("arg var");
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
		enterRule(_localctx, 18, RULE_receiver_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			statements();
			print("receiver content");
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
		enterRule(_localctx, 20, RULE_vardef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			var_type();
			setState(160);
			var();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(161);
				match(COMMA);
				setState(162);
				var();
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("vardef");
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 22, RULE_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(ID);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(171);
				match(EQ);
				setState(172);
				value();
				}
			}

			print("var");
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
		enterRule(_localctx, 24, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TYPE) | (1L << QUIT) | (1L << IF) | (1L << FOREACH) | (1L << BREAK) | (1L << SENDER) | (1L << SELF) | (1L << BEGIN) | (1L << ID))) != 0)) {
				{
				{
				setState(177);
				statement();
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("statements");
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
		enterRule(_localctx, 26, RULE_loop_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(BREAK);
			print("loop statements");
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
		enterRule(_localctx, 28, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(188);
				match(QUIT);
				}
				break;
			case 2:
				{
				setState(189);
				vardef();
				}
				break;
			case 3:
				{
				setState(190);
				condition();
				}
				break;
			case 4:
				{
				setState(191);
				foreach();
				}
				break;
			case 5:
				{
				setState(192);
				sender();
				}
				break;
			case 6:
				{
				setState(193);
				function_call();
				}
				break;
			case 7:
				{
				setState(194);
				scope();
				}
				break;
			case 8:
				{
				setState(195);
				assignment();
				}
				break;
			case 9:
				{
				setState(196);
				loop_statements();
				}
				break;
			}
			setState(199);
			match(NEWLINE);
			print("statement");
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
		enterRule(_localctx, 30, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(IF);
			setState(203);
			statements();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(204);
				match(ELSEIF);
				setState(205);
				statements();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(END);
			print("condition");
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
		public List<TerminalNode> ID() { return getTokens(atalkParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(atalkParser.ID, i);
		}
		public TerminalNode IN() { return getToken(atalkParser.IN, 0); }
		public TerminalNode NEWLINE() { return getToken(atalkParser.NEWLINE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode END() { return getToken(atalkParser.END, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_foreach);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(FOREACH);
			setState(215);
			match(ID);
			setState(216);
			match(IN);
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(217);
				match(ID);
				}
				break;
			case COPEN:
				{
				setState(218);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(221);
			match(NEWLINE);
			setState(222);
			statements();
			setState(223);
			match(END);
			print("foreach");
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
		enterRule(_localctx, 34, RULE_sender);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SENDER) | (1L << SELF) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			match(SEND_OP);
			setState(228);
			function_call();
			print("sender");
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
		enterRule(_localctx, 36, RULE_scope);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(BEGIN);
			setState(232);
			statements();
			setState(233);
			match(END);
			print("scope");
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
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode EQ() { return getToken(atalkParser.EQ, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ID);
			setState(237);
			match(EQ);
			setState(238);
			value();
			print("assignment");
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
		enterRule(_localctx, 40, RULE_function_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			def_arguments();
			print("function def");
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
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
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
		enterRule(_localctx, 42, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			arguments();
			print("function call");
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

	public static class ValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_value);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POPEN:
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				expr();
				}
				break;
			case COPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				array();
				print("value");
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
		enterRule(_localctx, 46, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		public Def_valueContext def_value() {
			return getRuleContext(Def_valueContext.class,0);
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
		enterRule(_localctx, 48, RULE_a1);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				a2();
				setState(258);
				a1p();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				def_value();
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
		enterRule(_localctx, 50, RULE_a1p);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OR:
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(OR);
				setState(264);
				a2();
				setState(265);
				a1p();
				}
				break;
			case NEWLINE:
			case PCLOSE:
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
		enterRule(_localctx, 52, RULE_a2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			a3();
			setState(271);
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
		enterRule(_localctx, 54, RULE_a2p);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(AND);
				setState(274);
				a3();
				setState(275);
				a2p();
				}
				break;
			case NEWLINE:
			case OR:
			case PCLOSE:
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
		enterRule(_localctx, 56, RULE_a3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			a4();
			setState(281);
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
		enterRule(_localctx, 58, RULE_a3p);
		int _la;
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQEQ:
			case NOTEQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==EQEQ || _la==NOTEQ) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				a4();
				setState(285);
				a3p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case PCLOSE:
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
		enterRule(_localctx, 60, RULE_a4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			a5();
			setState(291);
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
		enterRule(_localctx, 62, RULE_a4p);
		int _la;
		try {
			setState(298);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				_la = _input.LA(1);
				if ( !(_la==LT || _la==GT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(294);
				a5();
				setState(295);
				a4p();
				}
				break;
			case NEWLINE:
			case AND:
			case OR:
			case EQEQ:
			case NOTEQ:
			case PCLOSE:
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
		enterRule(_localctx, 64, RULE_a5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			a6();
			setState(301);
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
		enterRule(_localctx, 66, RULE_a5p);
		int _la;
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(304);
				a6();
				setState(305);
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
		enterRule(_localctx, 68, RULE_a6);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			a7();
			setState(311);
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
		enterRule(_localctx, 70, RULE_a6p);
		int _la;
		try {
			setState(318);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
			case DIV:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==MULT || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(314);
				a7();
				setState(315);
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
		public TerminalNode POPEN() { return getToken(atalkParser.POPEN, 0); }
		public A1Context a1() {
			return getRuleContext(A1Context.class,0);
		}
		public TerminalNode PCLOSE() { return getToken(atalkParser.PCLOSE, 0); }
		public Def_valueContext def_value() {
			return getRuleContext(Def_valueContext.class,0);
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
		enterRule(_localctx, 72, RULE_a7);
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				match(POPEN);
				setState(321);
				a1();
				setState(322);
				match(PCLOSE);
				}
				break;
			case STRING:
			case CHAR:
			case NUMBER:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				def_value();
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

	public static class Def_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(atalkParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public TerminalNode CHAR() { return getToken(atalkParser.CHAR, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public Def_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterDef_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitDef_value(this);
		}
	}

	public final Def_valueContext def_value() throws RecognitionException {
		Def_valueContext _localctx = new Def_valueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_def_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << CHAR) | (1L << NUMBER) | (1L << ID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			print("def value");
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 76, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(COPEN);
			setState(331);
			value();
			setState(336);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(333);
				value();
				}
				}
				setState(338);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(339);
			match(CCLOSE);
			print("array");
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
		enterRule(_localctx, 78, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			match(TYPE);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BOPEN) {
				{
				{
				setState(343);
				array_def();
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			print("var type");
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
		enterRule(_localctx, 80, RULE_array_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(351);
			match(BOPEN);
			setState(352);
			match(NUMBER);
			setState(353);
			match(BCLOSE);
			}
			print("array def");
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

	public static class Array_accessContext extends ParserRuleContext {
		public TerminalNode BOPEN() { return getToken(atalkParser.BOPEN, 0); }
		public TerminalNode BCLOSE() { return getToken(atalkParser.BCLOSE, 0); }
		public TerminalNode ID() { return getToken(atalkParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(atalkParser.NUMBER, 0); }
		public Array_accessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_access; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).enterArray_access(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atalkListener ) ((atalkListener)listener).exitArray_access(this);
		}
	}

	public final Array_accessContext array_access() throws RecognitionException {
		Array_accessContext _localctx = new Array_accessContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_array_access);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(357);
			match(BOPEN);
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(359);
			match(BCLOSE);
			}
			print("array access");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\6\4h\n\4\r\4\16\4i\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\7\b\u008a\n\b\f\b\16\b\u008d\13\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\t\u0096\n\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\r\3\r\3\r\5\r\u00b0\n\r"+
		"\3\r\3\r\3\16\7\16\u00b5\n\16\f\16\16\16\u00b8\13\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c8\n\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\7\21\u00d1\n\21\f\21\16\21\u00d4\13"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00de\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\5\30\u0100\n\30\3\31\3\31\3\32\3\32\3\32\3\32\5\32\u0108\n"+
		"\32\3\33\3\33\3\33\3\33\3\33\5\33\u010f\n\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0119\n\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u0123\n\37\3 \3 \3 \3!\3!\3!\3!\3!\5!\u012d\n!\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\5#\u0137\n#\3$\3$\3$\3%\3%\3%\3%\3%\5%\u0141\n%\3&\3&\3&\3"+
		"&\3&\5&\u0148\n&\3\'\3\'\3\'\3(\3(\3(\3(\7(\u0151\n(\f(\16(\u0154\13("+
		"\3(\3(\3(\3)\3)\7)\u015b\n)\f)\16)\u015e\13)\3)\3)\3*\3*\3*\3*\3*\3*\3"+
		"+\3+\3+\3+\3+\3+\3+\2\2,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&("+
		"*,.\60\62\64\668:<>@BDFHJLNPRT\2\t\4\2\20\21**\3\2\32\33\3\2\34\35\3\2"+
		"\25\26\3\2\27\30\3\2\'*\3\2)*\2\u0162\2Z\3\2\2\2\4]\3\2\2\2\6g\3\2\2\2"+
		"\bm\3\2\2\2\ns\3\2\2\2\f\u0080\3\2\2\2\16\u0087\3\2\2\2\20\u0092\3\2\2"+
		"\2\22\u009a\3\2\2\2\24\u009e\3\2\2\2\26\u00a1\3\2\2\2\30\u00ac\3\2\2\2"+
		"\32\u00b6\3\2\2\2\34\u00bb\3\2\2\2\36\u00c7\3\2\2\2 \u00cc\3\2\2\2\"\u00d8"+
		"\3\2\2\2$\u00e4\3\2\2\2&\u00e9\3\2\2\2(\u00ee\3\2\2\2*\u00f3\3\2\2\2,"+
		"\u00f7\3\2\2\2.\u00ff\3\2\2\2\60\u0101\3\2\2\2\62\u0107\3\2\2\2\64\u010e"+
		"\3\2\2\2\66\u0110\3\2\2\28\u0118\3\2\2\2:\u011a\3\2\2\2<\u0122\3\2\2\2"+
		">\u0124\3\2\2\2@\u012c\3\2\2\2B\u012e\3\2\2\2D\u0136\3\2\2\2F\u0138\3"+
		"\2\2\2H\u0140\3\2\2\2J\u0147\3\2\2\2L\u0149\3\2\2\2N\u014c\3\2\2\2P\u0158"+
		"\3\2\2\2R\u0161\3\2\2\2T\u0167\3\2\2\2VY\5\4\3\2WY\7\4\2\2XV\3\2\2\2X"+
		"W\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\3\3\2\2\2\\Z\3\2\2\2]^\7\6\2"+
		"\2^_\7*\2\2_`\5\b\5\2`a\5\6\4\2ab\7\f\2\2bc\7\4\2\2cd\b\3\1\2d\5\3\2\2"+
		"\2eh\5\n\6\2fh\5\f\7\2ge\3\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2jk\3\2\2\2kl\b\4\1\2l\7\3\2\2\2mn\7\34\2\2no\7)\2\2op\7\35\2\2pq\7\4"+
		"\2\2qr\b\5\1\2r\t\3\2\2\2st\b\6\1\2tu\5P)\2uz\7*\2\2vw\7&\2\2wy\7*\2\2"+
		"xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\4\2\2"+
		"~\177\b\6\1\2\177\13\3\2\2\2\u0080\u0081\7\7\2\2\u0081\u0082\5*\26\2\u0082"+
		"\u0083\5\24\13\2\u0083\u0084\7\f\2\2\u0084\u0085\7\4\2\2\u0085\u0086\b"+
		"\7\1\2\u0086\r\3\2\2\2\u0087\u008b\7\36\2\2\u0088\u008a\5\22\n\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\37\2\2\u008f"+
		"\u0090\7\4\2\2\u0090\u0091\b\b\1\2\u0091\17\3\2\2\2\u0092\u0095\7\36\2"+
		"\2\u0093\u0096\7*\2\2\u0094\u0096\5.\30\2\u0095\u0093\3\2\2\2\u0095\u0094"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\37\2\2\u0098\u0099\7\4\2\2"+
		"\u0099\21\3\2\2\2\u009a\u009b\5P)\2\u009b\u009c\7*\2\2\u009c\u009d\b\n"+
		"\1\2\u009d\23\3\2\2\2\u009e\u009f\5\32\16\2\u009f\u00a0\b\13\1\2\u00a0"+
		"\25\3\2\2\2\u00a1\u00a2\5P)\2\u00a2\u00a7\5\30\r\2\u00a3\u00a4\7&\2\2"+
		"\u00a4\u00a6\5\30\r\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\b\f\1\2\u00ab\27\3\2\2\2\u00ac\u00af\7*\2\2\u00ad\u00ae\7\31\2"+
		"\2\u00ae\u00b0\5.\30\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\b\r\1\2\u00b2\31\3\2\2\2\u00b3\u00b5\5\36\20\2\u00b4"+
		"\u00b3\3\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2"+
		"\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\b\16\1\2\u00ba"+
		"\33\3\2\2\2\u00bb\u00bc\7\16\2\2\u00bc\u00bd\b\17\1\2\u00bd\35\3\2\2\2"+
		"\u00be\u00c8\7\t\2\2\u00bf\u00c8\5\26\f\2\u00c0\u00c8\5 \21\2\u00c1\u00c8"+
		"\5\"\22\2\u00c2\u00c8\5$\23\2\u00c3\u00c8\5,\27\2\u00c4\u00c8\5&\24\2"+
		"\u00c5\u00c8\5(\25\2\u00c6\u00c8\5\34\17\2\u00c7\u00be\3\2\2\2\u00c7\u00bf"+
		"\3\2\2\2\u00c7\u00c0\3\2\2\2\u00c7\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7"+
		"\u00c3\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7\4\2\2\u00ca\u00cb\b\20\1\2\u00cb"+
		"\37\3\2\2\2\u00cc\u00cd\7\n\2\2\u00cd\u00d2\5\32\16\2\u00ce\u00cf\7\13"+
		"\2\2\u00cf\u00d1\5\32\16\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\b\21\1\2\u00d7!\3\2\2\2\u00d8\u00d9"+
		"\7\r\2\2\u00d9\u00da\7*\2\2\u00da\u00dd\7\17\2\2\u00db\u00de\7*\2\2\u00dc"+
		"\u00de\5N(\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2"+
		"\2\u00df\u00e0\7\4\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\f\2\2\u00e2"+
		"\u00e3\b\22\1\2\u00e3#\3\2\2\2\u00e4\u00e5\t\2\2\2\u00e5\u00e6\7$\2\2"+
		"\u00e6\u00e7\5,\27\2\u00e7\u00e8\b\23\1\2\u00e8%\3\2\2\2\u00e9\u00ea\7"+
		"\22\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7\f\2\2\u00ec\u00ed\b\24\1\2"+
		"\u00ed\'\3\2\2\2\u00ee\u00ef\7*\2\2\u00ef\u00f0\7\31\2\2\u00f0\u00f1\5"+
		".\30\2\u00f1\u00f2\b\25\1\2\u00f2)\3\2\2\2\u00f3\u00f4\7*\2\2\u00f4\u00f5"+
		"\5\16\b\2\u00f5\u00f6\b\26\1\2\u00f6+\3\2\2\2\u00f7\u00f8\7*\2\2\u00f8"+
		"\u00f9\5\20\t\2\u00f9\u00fa\b\27\1\2\u00fa-\3\2\2\2\u00fb\u0100\5\60\31"+
		"\2\u00fc\u00fd\5N(\2\u00fd\u00fe\b\30\1\2\u00fe\u0100\3\2\2\2\u00ff\u00fb"+
		"\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100/\3\2\2\2\u0101\u0102\5\62\32\2\u0102"+
		"\61\3\2\2\2\u0103\u0104\5\66\34\2\u0104\u0105\5\64\33\2\u0105\u0108\3"+
		"\2\2\2\u0106\u0108\5L\'\2\u0107\u0103\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\63\3\2\2\2\u0109\u010a\7\24\2\2\u010a\u010b\5\66\34\2\u010b\u010c\5\64"+
		"\33\2\u010c\u010f\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0109\3\2\2\2\u010e"+
		"\u010d\3\2\2\2\u010f\65\3\2\2\2\u0110\u0111\5:\36\2\u0111\u0112\58\35"+
		"\2\u0112\67\3\2\2\2\u0113\u0114\7\23\2\2\u0114\u0115\5:\36\2\u0115\u0116"+
		"\58\35\2\u0116\u0119\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0113\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u01199\3\2\2\2\u011a\u011b\5> \2\u011b\u011c\5<\37\2\u011c"+
		";\3\2\2\2\u011d\u011e\t\3\2\2\u011e\u011f\5> \2\u011f\u0120\5<\37\2\u0120"+
		"\u0123\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u011d\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123=\3\2\2\2\u0124\u0125\5B\"\2\u0125\u0126\5@!\2\u0126?\3\2\2"+
		"\2\u0127\u0128\t\4\2\2\u0128\u0129\5B\"\2\u0129\u012a\5@!\2\u012a\u012d"+
		"\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u0127\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"A\3\2\2\2\u012e\u012f\5F$\2\u012f\u0130\5D#\2\u0130C\3\2\2\2\u0131\u0132"+
		"\t\5\2\2\u0132\u0133\5F$\2\u0133\u0134\5D#\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0137\3\2\2\2\u0136\u0131\3\2\2\2\u0136\u0135\3\2\2\2\u0137E\3\2\2\2"+
		"\u0138\u0139\5J&\2\u0139\u013a\5H%\2\u013aG\3\2\2\2\u013b\u013c\t\6\2"+
		"\2\u013c\u013d\5J&\2\u013d\u013e\5H%\2\u013e\u0141\3\2\2\2\u013f\u0141"+
		"\3\2\2\2\u0140\u013b\3\2\2\2\u0140\u013f\3\2\2\2\u0141I\3\2\2\2\u0142"+
		"\u0143\7\36\2\2\u0143\u0144\5\62\32\2\u0144\u0145\7\37\2\2\u0145\u0148"+
		"\3\2\2\2\u0146\u0148\5L\'\2\u0147\u0142\3\2\2\2\u0147\u0146\3\2\2\2\u0148"+
		"K\3\2\2\2\u0149\u014a\t\7\2\2\u014a\u014b\b\'\1\2\u014bM\3\2\2\2\u014c"+
		"\u014d\7\"\2\2\u014d\u0152\5.\30\2\u014e\u014f\7&\2\2\u014f\u0151\5.\30"+
		"\2\u0150\u014e\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153"+
		"\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0156\7#\2\2\u0156"+
		"\u0157\b(\1\2\u0157O\3\2\2\2\u0158\u015c\7\b\2\2\u0159\u015b\5R*\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\b)\1\2\u0160"+
		"Q\3\2\2\2\u0161\u0162\7 \2\2\u0162\u0163\7)\2\2\u0163\u0164\7!\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0166\b*\1\2\u0166S\3\2\2\2\u0167\u0168\7 \2\2\u0168"+
		"\u0169\t\b\2\2\u0169\u016a\7!\2\2\u016a\u016b\3\2\2\2\u016b\u016c\b+\1"+
		"\2\u016cU\3\2\2\2\32XZgiz\u008b\u0095\u00a7\u00af\u00b6\u00c7\u00d2\u00dd"+
		"\u00ff\u0107\u010e\u0118\u0122\u012c\u0136\u0140\u0147\u0152\u015c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}