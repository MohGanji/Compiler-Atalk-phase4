// Generated from atalk.g4 by ANTLR 4.7
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, ACTOR=8, TYPE=9, 
		VALUE=10, COMMENT=11, ID=12, CHAR=13, STRING_CHAR=14, NUMBER=15, ANY_CHAR=16, 
		NEWLINE=17, Space=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "ACTOR", "TYPE", 
		"VALUE", "COMMENT", "ID", "CHAR", "STRING_CHAR", "NUMBER", "ANY_CHAR", 
		"NEWLINE", "Space"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'<'", "'>'", "'end'", "','", "'='", "'as'", "'actor'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "ACTOR", "TYPE", "VALUE", 
		"COMMENT", "ID", "CHAR", "STRING_CHAR", "NUMBER", "ANY_CHAR", "NEWLINE", 
		"Space"
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
		case 7:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			VALUE_action((RuleContext)_localctx, actionIndex);
			break;
		case 10:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 13:
			STRING_CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 14:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			Space_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ACTOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			print("ACTOR");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			print("TYPE");
			break;
		}
	}
	private void VALUE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2:
			print("VALUE");
			break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3:
			print("COMMENT");
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4:
			print("ID");
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("CHAR");
			break;
		}
	}
	private void STRING_CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("STRING CHAR");
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("NUMBER");
			break;
		}
	}
	private void Space_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u0098\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\nH\n\n\3\n\3\n\3\13\3\13\7\13N\n\13\f\13\16\13Q\13\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13Y\n\13\3\13\3\13\3\f\3\f\7\f_\n\f\f\f\16\fb\13"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\7\rj\n\r\f\r\16\rm\13\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16{\n\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17\u0082\n\17\3\17\3\17\3\20\6\20\u0087\n\20\r\20\16\20\u0088"+
		"\3\20\3\20\3\21\3\21\3\22\5\22\u0090\n\22\3\22\3\22\5\22\u0094\n\22\3"+
		"\23\3\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\5\2C\\aac|\6\2\62;C\\aac"+
		"|\4\2\f\f$$\3\2\62;\3\2\f\f\4\2\13\13\"\"\2\u00a6\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3"+
		"\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17"+
		"\65\3\2\2\2\218\3\2\2\2\23G\3\2\2\2\25X\3\2\2\2\27\\\3\2\2\2\31g\3\2\2"+
		"\2\33z\3\2\2\2\35\u0081\3\2\2\2\37\u0086\3\2\2\2!\u008c\3\2\2\2#\u0093"+
		"\3\2\2\2%\u0095\3\2\2\2\'(\7\"\2\2(\4\3\2\2\2)*\7>\2\2*\6\3\2\2\2+,\7"+
		"@\2\2,\b\3\2\2\2-.\7g\2\2./\7p\2\2/\60\7f\2\2\60\n\3\2\2\2\61\62\7.\2"+
		"\2\62\f\3\2\2\2\63\64\7?\2\2\64\16\3\2\2\2\65\66\7c\2\2\66\67\7u\2\2\67"+
		"\20\3\2\2\289\7c\2\29:\7e\2\2:;\7v\2\2;<\7q\2\2<=\7t\2\2=>\3\2\2\2>?\b"+
		"\t\2\2?\22\3\2\2\2@A\7k\2\2AB\7p\2\2BH\7v\2\2CD\7e\2\2DE\7j\2\2EF\7c\2"+
		"\2FH\7t\2\2G@\3\2\2\2GC\3\2\2\2HI\3\2\2\2IJ\b\n\3\2J\24\3\2\2\2KO\7$\2"+
		"\2LN\5\35\17\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2"+
		"\2\2RY\7$\2\2SY\5\37\20\2TU\7)\2\2UV\5\33\16\2VW\7)\2\2WY\3\2\2\2XK\3"+
		"\2\2\2XS\3\2\2\2XT\3\2\2\2YZ\3\2\2\2Z[\b\13\4\2[\26\3\2\2\2\\`\7%\2\2"+
		"]_\5!\21\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2"+
		"cd\b\f\5\2de\3\2\2\2ef\b\f\6\2f\30\3\2\2\2gk\t\2\2\2hj\t\3\2\2ih\3\2\2"+
		"\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2no\b\r\7\2o\32\3\2"+
		"\2\2p{\5\35\17\2qr\7^\2\2r{\7v\2\2st\7^\2\2t{\7p\2\2uv\7^\2\2v{\7^\2\2"+
		"w{\7$\2\2xy\7^\2\2y{\7)\2\2zp\3\2\2\2zq\3\2\2\2zs\3\2\2\2zu\3\2\2\2zw"+
		"\3\2\2\2zx\3\2\2\2{|\3\2\2\2|}\b\16\b\2}\34\3\2\2\2~\u0082\n\4\2\2\177"+
		"\u0080\7^\2\2\u0080\u0082\7$\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\b\17\t\2\u0084\36\3\2\2\2\u0085\u0087\t\5\2"+
		"\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\b\20\n\2\u008b \3\2\2\2\u008c"+
		"\u008d\n\6\2\2\u008d\"\3\2\2\2\u008e\u0090\7\17\2\2\u008f\u008e\3\2\2"+
		"\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0094\7\f\2\2\u0092\u0094"+
		"\7\17\2\2\u0093\u008f\3\2\2\2\u0093\u0092\3\2\2\2\u0094$\3\2\2\2\u0095"+
		"\u0096\t\7\2\2\u0096\u0097\b\23\13\2\u0097&\3\2\2\2\r\2GOX`kz\u0081\u0088"+
		"\u008f\u0093\f\3\t\2\3\n\3\3\13\4\3\f\5\b\2\2\3\r\6\3\16\7\3\17\b\3\20"+
		"\t\3\23\n";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}