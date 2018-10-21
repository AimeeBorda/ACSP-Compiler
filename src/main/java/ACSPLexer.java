// Generated from /Users/aimeeborda/ACSP-Compiler/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACSPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, EQ=3, NEQ=4, LT=5, GT=6, LTEQ=7, GTEQ=8, NOT=9, PLUS=10, 
		TIMES=11, MINUS=12, NEW=13, DIV=14, MOD=15, IF=16, THEN=17, ELSE=18, Skip=19, 
		Stop=20, DIVERGE=21, TRUE=22, FALSE=23, GUARD=24, LPAREN=25, RPAREN=26, 
		LBRACKET=27, RBRACKET=28, LSYNC=29, RSYNC=30, INTL=31, ECHOICE=32, ICHOICE=33, 
		COMMA=34, COLLON=35, SEMICOL=36, DATATYPE=37, ARROW=38, RARROW=39, QUERY=40, 
		PLING=41, CHANNEL=42, DOT=43, LBRACE=44, LBBRACE=45, RBBRACE=46, RBRACE=47, 
		EQUAL=48, BACKSLASH=49, TIMEOUT=50, INTR=51, ASSERT=52, DEADLOCK=53, DETERMINISTIC=54, 
		DIVERGENCE=55, FAILUREDIVE=56, FAILURE=57, TRACE=58, TRACEREFINE=59, FAILUREREFINE=60, 
		FAILUREDIVREFINE=61, FREE=62, LET=63, WITHIN=64, INCLUDE=65, DBLQUOTE=66, 
		ACSP=67, BAR=68, SUBTYPE=69, DIGIT=70, ID=71, LINECOMMENT=72, WS=73;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", "TIMES", 
		"MINUS", "NEW", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", "DIVERGE", 
		"TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", "COMMA", "COLLON", "SEMICOL", 
		"DATATYPE", "ARROW", "RARROW", "QUERY", "PLING", "CHANNEL", "DOT", "LBRACE", 
		"LBBRACE", "RBBRACE", "RBRACE", "EQUAL", "BACKSLASH", "TIMEOUT", "INTR", 
		"ASSERT", "DEADLOCK", "DETERMINISTIC", "DIVERGENCE", "FAILUREDIVE", "FAILURE", 
		"TRACE", "TRACEREFINE", "FAILUREREFINE", "FAILUREDIVREFINE", "FREE", "LET", 
		"WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", "BAR", "SUBTYPE", "DIGIT", "ID", 
		"LINECOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'not'", 
		"'+'", "'*'", "'-'", "'new'", "'/'", "'%'", "'if'", "'then'", "'else'", 
		"'SKIP'", "'STOP'", "'div'", "'true'", "'false'", "'&'", "'('", "')'", 
		"'['", "']'", "'[|'", "'|]'", "'|||'", "'[]'", "'|~|'", "','", "':'", 
		"';'", "'datatype'", "'->'", "'<-'", "'?'", "'!'", "'channel'", "'.'", 
		"'{'", "'{|'", "'|}'", "'}'", "'='", "'\\'", "'[>'", "'/\\'", "'assert'", 
		"'deadlock'", "'deterministic'", "'divergence'", "' [FD]'", "' [F]'", 
		"' [T]'", "'[T='", "'[F='", "'[FD='", "' free'", "'let'", "'within'", 
		"'include'", "'\"'", "'acsp'", "'|'", "'subtype'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", 
		"TIMES", "MINUS", "NEW", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", 
		"DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", "COMMA", "COLLON", "SEMICOL", 
		"DATATYPE", "ARROW", "RARROW", "QUERY", "PLING", "CHANNEL", "DOT", "LBRACE", 
		"LBBRACE", "RBBRACE", "RBRACE", "EQUAL", "BACKSLASH", "TIMEOUT", "INTR", 
		"ASSERT", "DEADLOCK", "DETERMINISTIC", "DIVERGENCE", "FAILUREDIVE", "FAILURE", 
		"TRACE", "TRACEREFINE", "FAILUREREFINE", "FAILUREDIVREFINE", "FREE", "LET", 
		"WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", "BAR", "SUBTYPE", "DIGIT", "ID", 
		"LINECOMMENT", "WS"
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


	public ACSPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ACSP.g4"; }

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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2K\u01c1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35"+
		"\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60"+
		"\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3"+
		";\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3D\3D\3D\3"+
		"D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3H\3H\7H\u01ab\nH\fH\16H\u01ae"+
		"\13H\3I\3I\3I\3I\7I\u01b4\nI\fI\16I\u01b7\13I\3I\3I\3J\6J\u01bc\nJ\rJ"+
		"\16J\u01bd\3J\3J\2\2K\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\3\2\6\5\2C\\aac|\7\2))\62;C\\aac"+
		"|\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u01c3\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\3\u0095\3\2\2\2\5\u0099\3\2\2\2\7\u009c\3\2\2"+
		"\2\t\u009f\3\2\2\2\13\u00a2\3\2\2\2\r\u00a4\3\2\2\2\17\u00a6\3\2\2\2\21"+
		"\u00a9\3\2\2\2\23\u00ac\3\2\2\2\25\u00b0\3\2\2\2\27\u00b2\3\2\2\2\31\u00b4"+
		"\3\2\2\2\33\u00b6\3\2\2\2\35\u00ba\3\2\2\2\37\u00bc\3\2\2\2!\u00be\3\2"+
		"\2\2#\u00c1\3\2\2\2%\u00c6\3\2\2\2\'\u00cb\3\2\2\2)\u00d0\3\2\2\2+\u00d5"+
		"\3\2\2\2-\u00d9\3\2\2\2/\u00de\3\2\2\2\61\u00e4\3\2\2\2\63\u00e6\3\2\2"+
		"\2\65\u00e8\3\2\2\2\67\u00ea\3\2\2\29\u00ec\3\2\2\2;\u00ee\3\2\2\2=\u00f1"+
		"\3\2\2\2?\u00f4\3\2\2\2A\u00f8\3\2\2\2C\u00fb\3\2\2\2E\u00ff\3\2\2\2G"+
		"\u0101\3\2\2\2I\u0103\3\2\2\2K\u0105\3\2\2\2M\u010e\3\2\2\2O\u0111\3\2"+
		"\2\2Q\u0114\3\2\2\2S\u0116\3\2\2\2U\u0118\3\2\2\2W\u0120\3\2\2\2Y\u0122"+
		"\3\2\2\2[\u0124\3\2\2\2]\u0127\3\2\2\2_\u012a\3\2\2\2a\u012c\3\2\2\2c"+
		"\u012e\3\2\2\2e\u0130\3\2\2\2g\u0133\3\2\2\2i\u0136\3\2\2\2k\u013d\3\2"+
		"\2\2m\u0146\3\2\2\2o\u0154\3\2\2\2q\u015f\3\2\2\2s\u0165\3\2\2\2u\u016a"+
		"\3\2\2\2w\u016f\3\2\2\2y\u0173\3\2\2\2{\u0177\3\2\2\2}\u017c\3\2\2\2\177"+
		"\u0182\3\2\2\2\u0081\u0186\3\2\2\2\u0083\u018d\3\2\2\2\u0085\u0195\3\2"+
		"\2\2\u0087\u0197\3\2\2\2\u0089\u019c\3\2\2\2\u008b\u019e\3\2\2\2\u008d"+
		"\u01a6\3\2\2\2\u008f\u01a8\3\2\2\2\u0091\u01af\3\2\2\2\u0093\u01bb\3\2"+
		"\2\2\u0095\u0096\7c\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\4"+
		"\3\2\2\2\u0099\u009a\7q\2\2\u009a\u009b\7t\2\2\u009b\6\3\2\2\2\u009c\u009d"+
		"\7?\2\2\u009d\u009e\7?\2\2\u009e\b\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1"+
		"\7?\2\2\u00a1\n\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\f\3\2\2\2\u00a4\u00a5"+
		"\7@\2\2\u00a5\16\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\u00a8\7?\2\2\u00a8\20"+
		"\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa\u00ab\7?\2\2\u00ab\22\3\2\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7v\2\2\u00af\24\3\2\2\2\u00b0"+
		"\u00b1\7-\2\2\u00b1\26\3\2\2\2\u00b2\u00b3\7,\2\2\u00b3\30\3\2\2\2\u00b4"+
		"\u00b5\7/\2\2\u00b5\32\3\2\2\2\u00b6\u00b7\7p\2\2\u00b7\u00b8\7g\2\2\u00b8"+
		"\u00b9\7y\2\2\u00b9\34\3\2\2\2\u00ba\u00bb\7\61\2\2\u00bb\36\3\2\2\2\u00bc"+
		"\u00bd\7\'\2\2\u00bd \3\2\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7h\2\2\u00c0"+
		"\"\3\2\2\2\u00c1\u00c2\7v\2\2\u00c2\u00c3\7j\2\2\u00c3\u00c4\7g\2\2\u00c4"+
		"\u00c5\7p\2\2\u00c5$\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		"\u00c9\7u\2\2\u00c9\u00ca\7g\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7U\2\2\u00cc"+
		"\u00cd\7M\2\2\u00cd\u00ce\7K\2\2\u00ce\u00cf\7R\2\2\u00cf(\3\2\2\2\u00d0"+
		"\u00d1\7U\2\2\u00d1\u00d2\7V\2\2\u00d2\u00d3\7Q\2\2\u00d3\u00d4\7R\2\2"+
		"\u00d4*\3\2\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7x\2"+
		"\2\u00d8,\3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7t\2\2\u00db\u00dc\7"+
		"w\2\2\u00dc\u00dd\7g\2\2\u00dd.\3\2\2\2\u00de\u00df\7h\2\2\u00df\u00e0"+
		"\7c\2\2\u00e0\u00e1\7n\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7g\2\2\u00e3"+
		"\60\3\2\2\2\u00e4\u00e5\7(\2\2\u00e5\62\3\2\2\2\u00e6\u00e7\7*\2\2\u00e7"+
		"\64\3\2\2\2\u00e8\u00e9\7+\2\2\u00e9\66\3\2\2\2\u00ea\u00eb\7]\2\2\u00eb"+
		"8\3\2\2\2\u00ec\u00ed\7_\2\2\u00ed:\3\2\2\2\u00ee\u00ef\7]\2\2\u00ef\u00f0"+
		"\7~\2\2\u00f0<\3\2\2\2\u00f1\u00f2\7~\2\2\u00f2\u00f3\7_\2\2\u00f3>\3"+
		"\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6\u00f7\7~\2\2\u00f7"+
		"@\3\2\2\2\u00f8\u00f9\7]\2\2\u00f9\u00fa\7_\2\2\u00faB\3\2\2\2\u00fb\u00fc"+
		"\7~\2\2\u00fc\u00fd\7\u0080\2\2\u00fd\u00fe\7~\2\2\u00feD\3\2\2\2\u00ff"+
		"\u0100\7.\2\2\u0100F\3\2\2\2\u0101\u0102\7<\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\7=\2\2\u0104J\3\2\2\2\u0105\u0106\7f\2\2\u0106\u0107\7c\2\2\u0107\u0108"+
		"\7v\2\2\u0108\u0109\7c\2\2\u0109\u010a\7v\2\2\u010a\u010b\7{\2\2\u010b"+
		"\u010c\7r\2\2\u010c\u010d\7g\2\2\u010dL\3\2\2\2\u010e\u010f\7/\2\2\u010f"+
		"\u0110\7@\2\2\u0110N\3\2\2\2\u0111\u0112\7>\2\2\u0112\u0113\7/\2\2\u0113"+
		"P\3\2\2\2\u0114\u0115\7A\2\2\u0115R\3\2\2\2\u0116\u0117\7#\2\2\u0117T"+
		"\3\2\2\2\u0118\u0119\7e\2\2\u0119\u011a\7j\2\2\u011a\u011b\7c\2\2\u011b"+
		"\u011c\7p\2\2\u011c\u011d\7p\2\2\u011d\u011e\7g\2\2\u011e\u011f\7n\2\2"+
		"\u011fV\3\2\2\2\u0120\u0121\7\60\2\2\u0121X\3\2\2\2\u0122\u0123\7}\2\2"+
		"\u0123Z\3\2\2\2\u0124\u0125\7}\2\2\u0125\u0126\7~\2\2\u0126\\\3\2\2\2"+
		"\u0127\u0128\7~\2\2\u0128\u0129\7\177\2\2\u0129^\3\2\2\2\u012a\u012b\7"+
		"\177\2\2\u012b`\3\2\2\2\u012c\u012d\7?\2\2\u012db\3\2\2\2\u012e\u012f"+
		"\7^\2\2\u012fd\3\2\2\2\u0130\u0131\7]\2\2\u0131\u0132\7@\2\2\u0132f\3"+
		"\2\2\2\u0133\u0134\7\61\2\2\u0134\u0135\7^\2\2\u0135h\3\2\2\2\u0136\u0137"+
		"\7c\2\2\u0137\u0138\7u\2\2\u0138\u0139\7u\2\2\u0139\u013a\7g\2\2\u013a"+
		"\u013b\7t\2\2\u013b\u013c\7v\2\2\u013cj\3\2\2\2\u013d\u013e\7f\2\2\u013e"+
		"\u013f\7g\2\2\u013f\u0140\7c\2\2\u0140\u0141\7f\2\2\u0141\u0142\7n\2\2"+
		"\u0142\u0143\7q\2\2\u0143\u0144\7e\2\2\u0144\u0145\7m\2\2\u0145l\3\2\2"+
		"\2\u0146\u0147\7f\2\2\u0147\u0148\7g\2\2\u0148\u0149\7v\2\2\u0149\u014a"+
		"\7g\2\2\u014a\u014b\7t\2\2\u014b\u014c\7o\2\2\u014c\u014d\7k\2\2\u014d"+
		"\u014e\7p\2\2\u014e\u014f\7k\2\2\u014f\u0150\7u\2\2\u0150\u0151\7v\2\2"+
		"\u0151\u0152\7k\2\2\u0152\u0153\7e\2\2\u0153n\3\2\2\2\u0154\u0155\7f\2"+
		"\2\u0155\u0156\7k\2\2\u0156\u0157\7x\2\2\u0157\u0158\7g\2\2\u0158\u0159"+
		"\7t\2\2\u0159\u015a\7i\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7e\2\2\u015d\u015e\7g\2\2\u015ep\3\2\2\2\u015f\u0160\7\"\2\2\u0160"+
		"\u0161\7]\2\2\u0161\u0162\7H\2\2\u0162\u0163\7F\2\2\u0163\u0164\7_\2\2"+
		"\u0164r\3\2\2\2\u0165\u0166\7\"\2\2\u0166\u0167\7]\2\2\u0167\u0168\7H"+
		"\2\2\u0168\u0169\7_\2\2\u0169t\3\2\2\2\u016a\u016b\7\"\2\2\u016b\u016c"+
		"\7]\2\2\u016c\u016d\7V\2\2\u016d\u016e\7_\2\2\u016ev\3\2\2\2\u016f\u0170"+
		"\7]\2\2\u0170\u0171\7V\2\2\u0171\u0172\7?\2\2\u0172x\3\2\2\2\u0173\u0174"+
		"\7]\2\2\u0174\u0175\7H\2\2\u0175\u0176\7?\2\2\u0176z\3\2\2\2\u0177\u0178"+
		"\7]\2\2\u0178\u0179\7H\2\2\u0179\u017a\7F\2\2\u017a\u017b\7?\2\2\u017b"+
		"|\3\2\2\2\u017c\u017d\7\"\2\2\u017d\u017e\7h\2\2\u017e\u017f\7t\2\2\u017f"+
		"\u0180\7g\2\2\u0180\u0181\7g\2\2\u0181~\3\2\2\2\u0182\u0183\7n\2\2\u0183"+
		"\u0184\7g\2\2\u0184\u0185\7v\2\2\u0185\u0080\3\2\2\2\u0186\u0187\7y\2"+
		"\2\u0187\u0188\7k\2\2\u0188\u0189\7v\2\2\u0189\u018a\7j\2\2\u018a\u018b"+
		"\7k\2\2\u018b\u018c\7p\2\2\u018c\u0082\3\2\2\2\u018d\u018e\7k\2\2\u018e"+
		"\u018f\7p\2\2\u018f\u0190\7e\2\2\u0190\u0191\7n\2\2\u0191\u0192\7w\2\2"+
		"\u0192\u0193\7f\2\2\u0193\u0194\7g\2\2\u0194\u0084\3\2\2\2\u0195\u0196"+
		"\7$\2\2\u0196\u0086\3\2\2\2\u0197\u0198\7c\2\2\u0198\u0199\7e\2\2\u0199"+
		"\u019a\7u\2\2\u019a\u019b\7r\2\2\u019b\u0088\3\2\2\2\u019c\u019d\7~\2"+
		"\2\u019d\u008a\3\2\2\2\u019e\u019f\7u\2\2\u019f\u01a0\7w\2\2\u01a0\u01a1"+
		"\7d\2\2\u01a1\u01a2\7v\2\2\u01a2\u01a3\7{\2\2\u01a3\u01a4\7r\2\2\u01a4"+
		"\u01a5\7g\2\2\u01a5\u008c\3\2\2\2\u01a6\u01a7\4\62;\2\u01a7\u008e\3\2"+
		"\2\2\u01a8\u01ac\t\2\2\2\u01a9\u01ab\t\3\2\2\u01aa\u01a9\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u0090\3\2"+
		"\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\7/\2\2\u01b0\u01b1\7/\2\2\u01b1\u01b5"+
		"\3\2\2\2\u01b2\u01b4\n\4\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5"+
		"\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7\u01b5\3\2"+
		"\2\2\u01b8\u01b9\bI\2\2\u01b9\u0092\3\2\2\2\u01ba\u01bc\t\5\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\bJ\2\2\u01c0\u0094\3\2\2\2\6\2\u01ac"+
		"\u01b5\u01bd\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}