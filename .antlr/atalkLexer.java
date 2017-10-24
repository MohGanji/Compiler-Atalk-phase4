// Generated from /home/vmoh/uni_projs/compiler/CAD-Atalk-phase1/atalk.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class atalkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, COMMENT=7, NEWLINE=8, 
		SPACE=9, ACTOR=10, RECEIVER=11, TYPE=12, END=13, STRING=14, CHAR=15, NUMBER=16, 
		VALUE=17, ID=18, ANY_CHAR=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "COMMENT", "NEWLINE", 
		"SPACE", "ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", 
		"VALUE", "ID", "ANY_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'>'", "','", "'='", "'('", "')'", null, null, null, "'actor'", 
		"'receiver'", null, "'end'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "COMMENT", "NEWLINE", "SPACE", 
		"ACTOR", "RECEIVER", "TYPE", "END", "STRING", "CHAR", "NUMBER", "VALUE", 
		"ID", "ANY_CHAR"
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


	    void print(String str){
	        System.out.println(str);
	    }


	public atalkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "atalk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 15:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			VALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			print("COMMENT : " + getText());
			break;
		case 1:
			skip();
			break;
		}
	}
	private void NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			print("NEWLINE");
			break;
		}
	}
	private void SPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			skip();
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			print("ACTOR : " + getText());
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("TYPE : " + getText());
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("END");
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void VALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("VALUE : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			print("ID : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\7\b9\n\b\f\b\16\b<\13\b\3\b\3\b\7\b@\n\b\f\b\16\bC\13"+
		"\b\5\bE\n\b\3\b\3\b\3\b\3\t\3\t\3\t\6\tM\n\t\r\t\16\tN\3\t\3\t\3\n\6\n"+
		"T\n\n\r\n\16\nU\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rr\n\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\7\17~\n\17\f\17\16\17\u0081"+
		"\13\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\5\20\u0092\n\20\3\20\3\20\3\20\3\21\6\21\u0098\n\21\r\21\16"+
		"\21\u0099\3\21\3\21\3\22\3\22\3\22\5\22\u00a1\n\22\3\22\3\22\3\23\3\23"+
		"\7\23\u00a7\n\23\f\23\16\23\u00aa\13\23\3\23\3\23\3\24\3\24\2\2\25\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25\3\2\b\4\2\13\13\"\"\4\2\f\f$$\3\2\62;\5\2C\\aac|\6\2"+
		"\62;C\\aac|\3\2\f\f\2\u00c0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5+\3"+
		"\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17D\3\2\2\2\21"+
		"L\3\2\2\2\23S\3\2\2\2\25Y\3\2\2\2\27a\3\2\2\2\31q\3\2\2\2\33u\3\2\2\2"+
		"\35{\3\2\2\2\37\u0084\3\2\2\2!\u0097\3\2\2\2#\u00a0\3\2\2\2%\u00a4\3\2"+
		"\2\2\'\u00ad\3\2\2\2)*\7>\2\2*\4\3\2\2\2+,\7@\2\2,\6\3\2\2\2-.\7.\2\2"+
		".\b\3\2\2\2/\60\7?\2\2\60\n\3\2\2\2\61\62\7*\2\2\62\f\3\2\2\2\63\64\7"+
		"+\2\2\64\16\3\2\2\2\65\66\5\21\t\2\66:\7%\2\2\679\5\'\24\28\67\3\2\2\2"+
		"9<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;E\3\2\2\2<:\3\2\2\2=A\7%\2\2>@\5\'\24\2"+
		"?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BE\3\2\2\2CA\3\2\2\2D\65\3\2\2"+
		"\2D=\3\2\2\2EF\3\2\2\2FG\b\b\2\2GH\b\b\3\2H\20\3\2\2\2IJ\7\17\2\2JM\7"+
		"\f\2\2KM\7\f\2\2LI\3\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3"+
		"\2\2\2PQ\b\t\4\2Q\22\3\2\2\2RT\t\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2U"+
		"V\3\2\2\2VW\3\2\2\2WX\b\n\5\2X\24\3\2\2\2YZ\7c\2\2Z[\7e\2\2[\\\7v\2\2"+
		"\\]\7q\2\2]^\7t\2\2^_\3\2\2\2_`\b\13\6\2`\26\3\2\2\2ab\7t\2\2bc\7g\2\2"+
		"cd\7e\2\2de\7g\2\2ef\7k\2\2fg\7x\2\2gh\7g\2\2hi\7t\2\2i\30\3\2\2\2jk\7"+
		"k\2\2kl\7p\2\2lr\7v\2\2mn\7e\2\2no\7j\2\2op\7c\2\2pr\7t\2\2qj\3\2\2\2"+
		"qm\3\2\2\2rs\3\2\2\2st\b\r\7\2t\32\3\2\2\2uv\7g\2\2vw\7p\2\2wx\7f\2\2"+
		"xy\3\2\2\2yz\b\16\b\2z\34\3\2\2\2{\177\7$\2\2|~\5\37\20\2}|\3\2\2\2~\u0081"+
		"\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u0083\7$\2\2\u0083\36\3\2\2\2\u0084\u0091\7)\2\2\u0085"+
		"\u0092\n\3\2\2\u0086\u0087\7^\2\2\u0087\u0092\7$\2\2\u0088\u0089\7^\2"+
		"\2\u0089\u0092\7v\2\2\u008a\u008b\7^\2\2\u008b\u0092\7p\2\2\u008c\u008d"+
		"\7^\2\2\u008d\u0092\7^\2\2\u008e\u0092\7$\2\2\u008f\u0090\7^\2\2\u0090"+
		"\u0092\7)\2\2\u0091\u0085\3\2\2\2\u0091\u0086\3\2\2\2\u0091\u0088\3\2"+
		"\2\2\u0091\u008a\3\2\2\2\u0091\u008c\3\2\2\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7)\2\2\u0094\u0095\b\20"+
		"\t\2\u0095 \3\2\2\2\u0096\u0098\t\4\2\2\u0097\u0096\3\2\2\2\u0098\u0099"+
		"\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b"+
		"\u009c\b\21\n\2\u009c\"\3\2\2\2\u009d\u00a1\5\35\17\2\u009e\u00a1\5!\21"+
		"\2\u009f\u00a1\5\37\20\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\22\13\2\u00a3$\3\2\2"+
		"\2\u00a4\u00a8\t\5\2\2\u00a5\u00a7\t\6\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\b\23\f\2\u00ac&\3\2\2\2\u00ad\u00ae\n\7\2\2"+
		"\u00ae(\3\2\2\2\17\2:ADLNUq\177\u0091\u0099\u00a0\u00a8\r\3\b\2\3\b\3"+
		"\3\t\4\3\n\5\3\13\6\3\r\7\3\16\b\3\20\t\3\21\n\3\22\13\3\23\f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}