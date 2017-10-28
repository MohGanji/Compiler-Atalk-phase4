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
		COMMENT=1, NEWLINE=2, SPACE=3, ACTOR=4, RECEIVER=5, TYPE=6, QUIT=7, IF=8, 
		ELSEIF=9, END=10, FOREACH=11, BREAK=12, IN=13, SENDER=14, SELF=15, BEGIN=16, 
		AND=17, OR=18, PLUS=19, MINUS=20, MULT=21, DIV=22, EQ=23, EQEQ=24, NOTEQ=25, 
		LT=26, GT=27, POPEN=28, PCLOSE=29, BOPEN=30, BCLOSE=31, COPEN=32, CCLOSE=33, 
		SEND_OP=34, SHARP=35, COMMA=36, STRING=37, CHAR=38, NUMBER=39, ID=40, 
		CHARACTER=41, ANY_CHAR=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"COMMENT", "NEWLINE", "SPACE", "ACTOR", "RECEIVER", "TYPE", "QUIT", "IF", 
		"ELSEIF", "END", "FOREACH", "BREAK", "IN", "SENDER", "SELF", "BEGIN", 
		"AND", "OR", "PLUS", "MINUS", "MULT", "DIV", "EQ", "EQEQ", "NOTEQ", "LT", 
		"GT", "POPEN", "PCLOSE", "BOPEN", "BCLOSE", "COPEN", "CCLOSE", "SEND_OP", 
		"SHARP", "COMMA", "STRING", "CHAR", "NUMBER", "ID", "CHARACTER", "ANY_CHAR"
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
		case 0:
			COMMENT_action((RuleContext)_localctx, actionIndex);
			break;
		case 1:
			NEWLINE_action((RuleContext)_localctx, actionIndex);
			break;
		case 2:
			SPACE_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			ACTOR_action((RuleContext)_localctx, actionIndex);
			break;
		case 4:
			RECEIVER_action((RuleContext)_localctx, actionIndex);
			break;
		case 5:
			TYPE_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			QUIT_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			IF_action((RuleContext)_localctx, actionIndex);
			break;
		case 8:
			ELSEIF_action((RuleContext)_localctx, actionIndex);
			break;
		case 9:
			END_action((RuleContext)_localctx, actionIndex);
			break;
		case 16:
			AND_action((RuleContext)_localctx, actionIndex);
			break;
		case 17:
			OR_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
			PLUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 19:
			MINUS_action((RuleContext)_localctx, actionIndex);
			break;
		case 20:
			MULT_action((RuleContext)_localctx, actionIndex);
			break;
		case 21:
			DIV_action((RuleContext)_localctx, actionIndex);
			break;
		case 22:
			EQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 23:
			EQEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 24:
			NOTEQ_action((RuleContext)_localctx, actionIndex);
			break;
		case 25:
			LT_action((RuleContext)_localctx, actionIndex);
			break;
		case 26:
			GT_action((RuleContext)_localctx, actionIndex);
			break;
		case 27:
			POPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 28:
			PCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 29:
			BOPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 30:
			BCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 31:
			COPEN_action((RuleContext)_localctx, actionIndex);
			break;
		case 32:
			CCLOSE_action((RuleContext)_localctx, actionIndex);
			break;
		case 33:
			SEND_OP_action((RuleContext)_localctx, actionIndex);
			break;
		case 34:
			SHARP_action((RuleContext)_localctx, actionIndex);
			break;
		case 35:
			COMMA_action((RuleContext)_localctx, actionIndex);
			break;
		case 36:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		case 37:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		case 38:
			NUMBER_action((RuleContext)_localctx, actionIndex);
			break;
		case 39:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 40:
			CHARACTER_action((RuleContext)_localctx, actionIndex);
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
	private void RECEIVER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5:
			print("RECEIVER");
			break;
		}
	}
	private void TYPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6:
			print("TYPE : " + getText());
			break;
		}
	}
	private void QUIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7:
			print("QUIT");
			break;
		}
	}
	private void IF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8:
			print("QUIT");
			break;
		}
	}
	private void ELSEIF_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9:
			print("QUIT");
			break;
		}
	}
	private void END_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10:
			print("END");
			break;
		}
	}
	private void AND_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11:
			print("AND");
			break;
		}
	}
	private void OR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12:
			print("OR");
			break;
		}
	}
	private void PLUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13:
			print("PLUS");
			break;
		}
	}
	private void MINUS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14:
			print("MINUS");
			break;
		}
	}
	private void MULT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15:
			print("MULT");
			break;
		}
	}
	private void DIV_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16:
			print("DIV");
			break;
		}
	}
	private void EQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17:
			print("EQ");
			break;
		}
	}
	private void EQEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18:
			print("EQEQ");
			break;
		}
	}
	private void NOTEQ_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19:
			print("NOTEQ");
			break;
		}
	}
	private void LT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20:
			print("LT");
			break;
		}
	}
	private void GT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21:
			print("GT");
			break;
		}
	}
	private void POPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22:
			print("POPEN");
			break;
		}
	}
	private void PCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23:
			print("PCLOSE");
			break;
		}
	}
	private void BOPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24:
			print("BOPEN");
			break;
		}
	}
	private void BCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25:
			print("BCLOSE");
			break;
		}
	}
	private void COPEN_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26:
			print("COPEN");
			break;
		}
	}
	private void CCLOSE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27:
			print("CCLOSE");
			break;
		}
	}
	private void SEND_OP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28:
			print("SEND_OP");
			break;
		}
	}
	private void SHARP_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29:
			print("SHARP");
			break;
		}
	}
	private void COMMA_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30:
			print("COMMA");
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31:
			print("STRING : " + getText());
			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32:
			print("CHAR : " + getText());
			break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33:
			print("NUMBER : " + getText());
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34:
			print("ID : " + getText());
			break;
		}
	}
	private void CHARACTER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35:
			print("CHARACTER : " + getText());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0151\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\7\2[\n\2\f\2\16\2^\13\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\5\2"+
		"g\n\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3o\n\3\r\3\16\3p\3\3\3\3\3\4\6\4v\n\4"+
		"\r\4\16\4w\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0096\n\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\7&\u0121\n&\f&\16&\u0124"+
		"\13&\3&\3&\3&\3\'\3\'\3\'\5\'\u012c\n\'\3\'\3\'\3\'\3(\6(\u0132\n(\r("+
		"\16(\u0133\3(\3(\3)\3)\7)\u013a\n)\f)\16)\u013d\13)\3)\3)\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\5*\u014c\n*\3*\3*\3+\3+\2\2,\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,\3\2\b\4\2\13\13\"\"\3\2\62;\5\2C\\aac|\6\2\62;C\\aac|\4\2\f"+
		"\f$$\3\2\f\f\2\u0160\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3f\3\2\2\2\5n\3\2\2\2\7u\3\2\2\2\t{\3\2"+
		"\2\2\13\u0083\3\2\2\2\r\u0095\3\2\2\2\17\u0099\3\2\2\2\21\u00a0\3\2\2"+
		"\2\23\u00a5\3\2\2\2\25\u00ae\3\2\2\2\27\u00b4\3\2\2\2\31\u00bc\3\2\2\2"+
		"\33\u00c2\3\2\2\2\35\u00c5\3\2\2\2\37\u00cc\3\2\2\2!\u00d1\3\2\2\2#\u00d7"+
		"\3\2\2\2%\u00dd\3\2\2\2\'\u00e2\3\2\2\2)\u00e5\3\2\2\2+\u00e8\3\2\2\2"+
		"-\u00eb\3\2\2\2/\u00ee\3\2\2\2\61\u00f1\3\2\2\2\63\u00f6\3\2\2\2\65\u00fb"+
		"\3\2\2\2\67\u00fe\3\2\2\29\u0101\3\2\2\2;\u0104\3\2\2\2=\u0107\3\2\2\2"+
		"?\u010a\3\2\2\2A\u010d\3\2\2\2C\u0110\3\2\2\2E\u0113\3\2\2\2G\u0118\3"+
		"\2\2\2I\u011b\3\2\2\2K\u011e\3\2\2\2M\u0128\3\2\2\2O\u0131\3\2\2\2Q\u0137"+
		"\3\2\2\2S\u014b\3\2\2\2U\u014f\3\2\2\2WX\5\5\3\2X\\\5G$\2Y[\5U+\2ZY\3"+
		"\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]g\3\2\2\2^\\\3\2\2\2_c\5G$\2`b"+
		"\5U+\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dg\3\2\2\2ec\3\2\2\2fW\3"+
		"\2\2\2f_\3\2\2\2gh\3\2\2\2hi\b\2\2\2ij\b\2\3\2j\4\3\2\2\2kl\7\17\2\2l"+
		"o\7\f\2\2mo\7\f\2\2nk\3\2\2\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2"+
		"qr\3\2\2\2rs\b\3\4\2s\6\3\2\2\2tv\t\2\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2"+
		"\2wx\3\2\2\2xy\3\2\2\2yz\b\4\5\2z\b\3\2\2\2{|\7c\2\2|}\7e\2\2}~\7v\2\2"+
		"~\177\7q\2\2\177\u0080\7t\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\5\6\2"+
		"\u0082\n\3\2\2\2\u0083\u0084\7t\2\2\u0084\u0085\7g\2\2\u0085\u0086\7e"+
		"\2\2\u0086\u0087\7g\2\2\u0087\u0088\7k\2\2\u0088\u0089\7x\2\2\u0089\u008a"+
		"\7g\2\2\u008a\u008b\7t\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\6\7\2\u008d"+
		"\f\3\2\2\2\u008e\u008f\7k\2\2\u008f\u0090\7p\2\2\u0090\u0096\7v\2\2\u0091"+
		"\u0092\7e\2\2\u0092\u0093\7j\2\2\u0093\u0094\7c\2\2\u0094\u0096\7t\2\2"+
		"\u0095\u008e\3\2\2\2\u0095\u0091\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098"+
		"\b\7\b\2\u0098\16\3\2\2\2\u0099\u009a\7s\2\2\u009a\u009b\7w\2\2\u009b"+
		"\u009c\7k\2\2\u009c\u009d\7v\2\2\u009d\u009e\3\2\2\2\u009e\u009f\b\b\t"+
		"\2\u009f\20\3\2\2\2\u00a0\u00a1\7k\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\b\t\n\2\u00a4\22\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7n\2\2\u00a7\u00a8\7u\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7k\2\2"+
		"\u00aa\u00ab\7h\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\n\13\2\u00ad\24"+
		"\3\2\2\2\u00ae\u00af\7g\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b3\b\13\f\2\u00b3\26\3\2\2\2\u00b4\u00b5\7h\2"+
		"\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7j\2\2\u00bb\30\3\2\2\2\u00bc\u00bd"+
		"\7d\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7c\2\2\u00c0"+
		"\u00c1\7m\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7k\2\2\u00c3\u00c4\7p\2\2\u00c4"+
		"\34\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7p\2\2\u00c8"+
		"\u00c9\7f\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7t\2\2\u00cb\36\3\2\2\2\u00cc"+
		"\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d0\7h\2\2"+
		"\u00d0 \3\2\2\2\u00d1\u00d2\7d\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7i\2"+
		"\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\"\3\2\2\2\u00d7\u00d8\7"+
		"c\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7f\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\b\22\r\2\u00dc$\3\2\2\2\u00dd\u00de\7q\2\2\u00de\u00df\7t\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e1\b\23\16\2\u00e1&\3\2\2\2\u00e2\u00e3\7-\2\2"+
		"\u00e3\u00e4\b\24\17\2\u00e4(\3\2\2\2\u00e5\u00e6\7/\2\2\u00e6\u00e7\b"+
		"\25\20\2\u00e7*\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea\b\26\21\2\u00ea"+
		",\3\2\2\2\u00eb\u00ec\7\61\2\2\u00ec\u00ed\b\27\22\2\u00ed.\3\2\2\2\u00ee"+
		"\u00ef\7?\2\2\u00ef\u00f0\b\30\23\2\u00f0\60\3\2\2\2\u00f1\u00f2\7?\2"+
		"\2\u00f2\u00f3\7?\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\b\31\24\2\u00f5"+
		"\62\3\2\2\2\u00f6\u00f7\7>\2\2\u00f7\u00f8\7@\2\2\u00f8\u00f9\3\2\2\2"+
		"\u00f9\u00fa\b\32\25\2\u00fa\64\3\2\2\2\u00fb\u00fc\7>\2\2\u00fc\u00fd"+
		"\b\33\26\2\u00fd\66\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\b\34\27\2\u0100"+
		"8\3\2\2\2\u0101\u0102\7*\2\2\u0102\u0103\b\35\30\2\u0103:\3\2\2\2\u0104"+
		"\u0105\7+\2\2\u0105\u0106\b\36\31\2\u0106<\3\2\2\2\u0107\u0108\7]\2\2"+
		"\u0108\u0109\b\37\32\2\u0109>\3\2\2\2\u010a\u010b\7_\2\2\u010b\u010c\b"+
		" \33\2\u010c@\3\2\2\2\u010d\u010e\7}\2\2\u010e\u010f\b!\34\2\u010fB\3"+
		"\2\2\2\u0110\u0111\7\177\2\2\u0111\u0112\b\"\35\2\u0112D\3\2\2\2\u0113"+
		"\u0114\7>\2\2\u0114\u0115\7>\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b#\36"+
		"\2\u0117F\3\2\2\2\u0118\u0119\7%\2\2\u0119\u011a\b$\37\2\u011aH\3\2\2"+
		"\2\u011b\u011c\7.\2\2\u011c\u011d\b% \2\u011dJ\3\2\2\2\u011e\u0122\7$"+
		"\2\2\u011f\u0121\5S*\2\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120"+
		"\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125"+
		"\u0126\7$\2\2\u0126\u0127\b&!\2\u0127L\3\2\2\2\u0128\u012b\7)\2\2\u0129"+
		"\u012c\5S*\2\u012a\u012c\7$\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012e\7)\2\2\u012e\u012f\b\'\"\2\u012fN\3"+
		"\2\2\2\u0130\u0132\t\3\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b("+
		"#\2\u0136P\3\2\2\2\u0137\u013b\t\4\2\2\u0138\u013a\t\5\2\2\u0139\u0138"+
		"\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\b)$\2\u013fR\3\2\2\2\u0140"+
		"\u014c\n\6\2\2\u0141\u0142\7^\2\2\u0142\u014c\7$\2\2\u0143\u0144\7^\2"+
		"\2\u0144\u014c\7v\2\2\u0145\u0146\7^\2\2\u0146\u014c\7p\2\2\u0147\u0148"+
		"\7^\2\2\u0148\u014c\7^\2\2\u0149\u014a\7^\2\2\u014a\u014c\7)\2\2\u014b"+
		"\u0140\3\2\2\2\u014b\u0141\3\2\2\2\u014b\u0143\3\2\2\2\u014b\u0145\3\2"+
		"\2\2\u014b\u0147\3\2\2\2\u014b\u0149\3\2\2\2\u014c\u014d\3\2\2\2\u014d"+
		"\u014e\b*%\2\u014eT\3\2\2\2\u014f\u0150\n\7\2\2\u0150V\3\2\2\2\17\2\\"+
		"cfnpw\u0095\u0122\u012b\u0133\u013b\u014b&\3\2\2\3\2\3\3\3\4\3\4\5\3\5"+
		"\6\3\6\7\3\7\b\3\b\t\3\t\n\3\n\13\3\13\f\3\22\r\3\23\16\3\24\17\3\25\20"+
		"\3\26\21\3\27\22\3\30\23\3\31\24\3\32\25\3\33\26\3\34\27\3\35\30\3\36"+
		"\31\3\37\32\3 \33\3!\34\3\"\35\3#\36\3$\37\3% \3&!\3\'\"\3(#\3)$\3*%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}