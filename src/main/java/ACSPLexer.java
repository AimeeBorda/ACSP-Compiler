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
		ACSP=67, BAR=68, SUBTYPE=69, TRANSPARENT=70, EXTERNAL=71, DIGIT=72, ID=73, 
		LINECOMMENT=74, WS=75;
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
		"WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", "BAR", "SUBTYPE", "TRANSPARENT", 
		"EXTERNAL", "DIGIT", "ID", "LINECOMMENT", "WS"
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
		"'include'", "'\"'", "'acsp'", "'|'", "'subtype'", "'transparent'", "'external'"
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
		"WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", "BAR", "SUBTYPE", "TRANSPARENT", 
		"EXTERNAL", "DIGIT", "ID", "LINECOMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2M\u01da\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3-\3-\3.\3.\3.\3/"+
		"\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3"+
		":\3;\3;\3;\3;\3;\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3"+
		"D\3D\3D\3D\3D\3E\3E\3F\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3H\3H\3I\3I\3J\3J\7J\u01c4\nJ\fJ\16J\u01c7"+
		"\13J\3K\3K\3K\3K\7K\u01cd\nK\fK\16K\u01d0\13K\3K\3K\3L\6L\u01d5\nL\rL"+
		"\16L\u01d6\3L\3L\2\2M\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\3\2\6\5\2C\\aac|\7"+
		"\2))\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u01dc\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2"+
		"q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3"+
		"\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2"+
		"\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\3\u0099\3\2\2\2\5\u009d\3\2\2\2\7\u00a0\3\2\2\2\t\u00a3\3\2\2\2\13"+
		"\u00a6\3\2\2\2\r\u00a8\3\2\2\2\17\u00aa\3\2\2\2\21\u00ad\3\2\2\2\23\u00b0"+
		"\3\2\2\2\25\u00b4\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33\u00ba\3"+
		"\2\2\2\35\u00be\3\2\2\2\37\u00c0\3\2\2\2!\u00c2\3\2\2\2#\u00c5\3\2\2\2"+
		"%\u00ca\3\2\2\2\'\u00cf\3\2\2\2)\u00d4\3\2\2\2+\u00d9\3\2\2\2-\u00dd\3"+
		"\2\2\2/\u00e2\3\2\2\2\61\u00e8\3\2\2\2\63\u00ea\3\2\2\2\65\u00ec\3\2\2"+
		"\2\67\u00ee\3\2\2\29\u00f0\3\2\2\2;\u00f2\3\2\2\2=\u00f5\3\2\2\2?\u00f8"+
		"\3\2\2\2A\u00fc\3\2\2\2C\u00ff\3\2\2\2E\u0103\3\2\2\2G\u0105\3\2\2\2I"+
		"\u0107\3\2\2\2K\u0109\3\2\2\2M\u0112\3\2\2\2O\u0115\3\2\2\2Q\u0118\3\2"+
		"\2\2S\u011a\3\2\2\2U\u011c\3\2\2\2W\u0124\3\2\2\2Y\u0126\3\2\2\2[\u0128"+
		"\3\2\2\2]\u012b\3\2\2\2_\u012e\3\2\2\2a\u0130\3\2\2\2c\u0132\3\2\2\2e"+
		"\u0134\3\2\2\2g\u0137\3\2\2\2i\u013a\3\2\2\2k\u0141\3\2\2\2m\u014a\3\2"+
		"\2\2o\u0158\3\2\2\2q\u0163\3\2\2\2s\u0169\3\2\2\2u\u016e\3\2\2\2w\u0173"+
		"\3\2\2\2y\u0177\3\2\2\2{\u017b\3\2\2\2}\u0180\3\2\2\2\177\u0186\3\2\2"+
		"\2\u0081\u018a\3\2\2\2\u0083\u0191\3\2\2\2\u0085\u0199\3\2\2\2\u0087\u019b"+
		"\3\2\2\2\u0089\u01a0\3\2\2\2\u008b\u01a2\3\2\2\2\u008d\u01aa\3\2\2\2\u008f"+
		"\u01b6\3\2\2\2\u0091\u01bf\3\2\2\2\u0093\u01c1\3\2\2\2\u0095\u01c8\3\2"+
		"\2\2\u0097\u01d4\3\2\2\2\u0099\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b\u009c"+
		"\7f\2\2\u009c\4\3\2\2\2\u009d\u009e\7q\2\2\u009e\u009f\7t\2\2\u009f\6"+
		"\3\2\2\2\u00a0\u00a1\7?\2\2\u00a1\u00a2\7?\2\2\u00a2\b\3\2\2\2\u00a3\u00a4"+
		"\7#\2\2\u00a4\u00a5\7?\2\2\u00a5\n\3\2\2\2\u00a6\u00a7\7>\2\2\u00a7\f"+
		"\3\2\2\2\u00a8\u00a9\7@\2\2\u00a9\16\3\2\2\2\u00aa\u00ab\7>\2\2\u00ab"+
		"\u00ac\7?\2\2\u00ac\20\3\2\2\2\u00ad\u00ae\7@\2\2\u00ae\u00af\7?\2\2\u00af"+
		"\22\3\2\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\24\3\2\2\2\u00b4\u00b5\7-\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7"+
		"\30\3\2\2\2\u00b8\u00b9\7/\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7p\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\u00bd\7y\2\2\u00bd\34\3\2\2\2\u00be\u00bf\7\61\2\2"+
		"\u00bf\36\3\2\2\2\u00c0\u00c1\7\'\2\2\u00c1 \3\2\2\2\u00c2\u00c3\7k\2"+
		"\2\u00c3\u00c4\7h\2\2\u00c4\"\3\2\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7"+
		"j\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7p\2\2\u00c9$\3\2\2\2\u00ca\u00cb"+
		"\7g\2\2\u00cb\u00cc\7n\2\2\u00cc\u00cd\7u\2\2\u00cd\u00ce\7g\2\2\u00ce"+
		"&\3\2\2\2\u00cf\u00d0\7U\2\2\u00d0\u00d1\7M\2\2\u00d1\u00d2\7K\2\2\u00d2"+
		"\u00d3\7R\2\2\u00d3(\3\2\2\2\u00d4\u00d5\7U\2\2\u00d5\u00d6\7V\2\2\u00d6"+
		"\u00d7\7Q\2\2\u00d7\u00d8\7R\2\2\u00d8*\3\2\2\2\u00d9\u00da\7f\2\2\u00da"+
		"\u00db\7k\2\2\u00db\u00dc\7x\2\2\u00dc,\3\2\2\2\u00dd\u00de\7v\2\2\u00de"+
		"\u00df\7t\2\2\u00df\u00e0\7w\2\2\u00e0\u00e1\7g\2\2\u00e1.\3\2\2\2\u00e2"+
		"\u00e3\7h\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e6\7u\2\2"+
		"\u00e6\u00e7\7g\2\2\u00e7\60\3\2\2\2\u00e8\u00e9\7(\2\2\u00e9\62\3\2\2"+
		"\2\u00ea\u00eb\7*\2\2\u00eb\64\3\2\2\2\u00ec\u00ed\7+\2\2\u00ed\66\3\2"+
		"\2\2\u00ee\u00ef\7]\2\2\u00ef8\3\2\2\2\u00f0\u00f1\7_\2\2\u00f1:\3\2\2"+
		"\2\u00f2\u00f3\7]\2\2\u00f3\u00f4\7~\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7"+
		"~\2\2\u00f6\u00f7\7_\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7~\2\2\u00f9\u00fa"+
		"\7~\2\2\u00fa\u00fb\7~\2\2\u00fb@\3\2\2\2\u00fc\u00fd\7]\2\2\u00fd\u00fe"+
		"\7_\2\2\u00feB\3\2\2\2\u00ff\u0100\7~\2\2\u0100\u0101\7\u0080\2\2\u0101"+
		"\u0102\7~\2\2\u0102D\3\2\2\2\u0103\u0104\7.\2\2\u0104F\3\2\2\2\u0105\u0106"+
		"\7<\2\2\u0106H\3\2\2\2\u0107\u0108\7=\2\2\u0108J\3\2\2\2\u0109\u010a\7"+
		"f\2\2\u010a\u010b\7c\2\2\u010b\u010c\7v\2\2\u010c\u010d\7c\2\2\u010d\u010e"+
		"\7v\2\2\u010e\u010f\7{\2\2\u010f\u0110\7r\2\2\u0110\u0111\7g\2\2\u0111"+
		"L\3\2\2\2\u0112\u0113\7/\2\2\u0113\u0114\7@\2\2\u0114N\3\2\2\2\u0115\u0116"+
		"\7>\2\2\u0116\u0117\7/\2\2\u0117P\3\2\2\2\u0118\u0119\7A\2\2\u0119R\3"+
		"\2\2\2\u011a\u011b\7#\2\2\u011bT\3\2\2\2\u011c\u011d\7e\2\2\u011d\u011e"+
		"\7j\2\2\u011e\u011f\7c\2\2\u011f\u0120\7p\2\2\u0120\u0121\7p\2\2\u0121"+
		"\u0122\7g\2\2\u0122\u0123\7n\2\2\u0123V\3\2\2\2\u0124\u0125\7\60\2\2\u0125"+
		"X\3\2\2\2\u0126\u0127\7}\2\2\u0127Z\3\2\2\2\u0128\u0129\7}\2\2\u0129\u012a"+
		"\7~\2\2\u012a\\\3\2\2\2\u012b\u012c\7~\2\2\u012c\u012d\7\177\2\2\u012d"+
		"^\3\2\2\2\u012e\u012f\7\177\2\2\u012f`\3\2\2\2\u0130\u0131\7?\2\2\u0131"+
		"b\3\2\2\2\u0132\u0133\7^\2\2\u0133d\3\2\2\2\u0134\u0135\7]\2\2\u0135\u0136"+
		"\7@\2\2\u0136f\3\2\2\2\u0137\u0138\7\61\2\2\u0138\u0139\7^\2\2\u0139h"+
		"\3\2\2\2\u013a\u013b\7c\2\2\u013b\u013c\7u\2\2\u013c\u013d\7u\2\2\u013d"+
		"\u013e\7g\2\2\u013e\u013f\7t\2\2\u013f\u0140\7v\2\2\u0140j\3\2\2\2\u0141"+
		"\u0142\7f\2\2\u0142\u0143\7g\2\2\u0143\u0144\7c\2\2\u0144\u0145\7f\2\2"+
		"\u0145\u0146\7n\2\2\u0146\u0147\7q\2\2\u0147\u0148\7e\2\2\u0148\u0149"+
		"\7m\2\2\u0149l\3\2\2\2\u014a\u014b\7f\2\2\u014b\u014c\7g\2\2\u014c\u014d"+
		"\7v\2\2\u014d\u014e\7g\2\2\u014e\u014f\7t\2\2\u014f\u0150\7o\2\2\u0150"+
		"\u0151\7k\2\2\u0151\u0152\7p\2\2\u0152\u0153\7k\2\2\u0153\u0154\7u\2\2"+
		"\u0154\u0155\7v\2\2\u0155\u0156\7k\2\2\u0156\u0157\7e\2\2\u0157n\3\2\2"+
		"\2\u0158\u0159\7f\2\2\u0159\u015a\7k\2\2\u015a\u015b\7x\2\2\u015b\u015c"+
		"\7g\2\2\u015c\u015d\7t\2\2\u015d\u015e\7i\2\2\u015e\u015f\7g\2\2\u015f"+
		"\u0160\7p\2\2\u0160\u0161\7e\2\2\u0161\u0162\7g\2\2\u0162p\3\2\2\2\u0163"+
		"\u0164\7\"\2\2\u0164\u0165\7]\2\2\u0165\u0166\7H\2\2\u0166\u0167\7F\2"+
		"\2\u0167\u0168\7_\2\2\u0168r\3\2\2\2\u0169\u016a\7\"\2\2\u016a\u016b\7"+
		"]\2\2\u016b\u016c\7H\2\2\u016c\u016d\7_\2\2\u016dt\3\2\2\2\u016e\u016f"+
		"\7\"\2\2\u016f\u0170\7]\2\2\u0170\u0171\7V\2\2\u0171\u0172\7_\2\2\u0172"+
		"v\3\2\2\2\u0173\u0174\7]\2\2\u0174\u0175\7V\2\2\u0175\u0176\7?\2\2\u0176"+
		"x\3\2\2\2\u0177\u0178\7]\2\2\u0178\u0179\7H\2\2\u0179\u017a\7?\2\2\u017a"+
		"z\3\2\2\2\u017b\u017c\7]\2\2\u017c\u017d\7H\2\2\u017d\u017e\7F\2\2\u017e"+
		"\u017f\7?\2\2\u017f|\3\2\2\2\u0180\u0181\7\"\2\2\u0181\u0182\7h\2\2\u0182"+
		"\u0183\7t\2\2\u0183\u0184\7g\2\2\u0184\u0185\7g\2\2\u0185~\3\2\2\2\u0186"+
		"\u0187\7n\2\2\u0187\u0188\7g\2\2\u0188\u0189\7v\2\2\u0189\u0080\3\2\2"+
		"\2\u018a\u018b\7y\2\2\u018b\u018c\7k\2\2\u018c\u018d\7v\2\2\u018d\u018e"+
		"\7j\2\2\u018e\u018f\7k\2\2\u018f\u0190\7p\2\2\u0190\u0082\3\2\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193\u0194\7e\2\2\u0194\u0195\7n\2\2"+
		"\u0195\u0196\7w\2\2\u0196\u0197\7f\2\2\u0197\u0198\7g\2\2\u0198\u0084"+
		"\3\2\2\2\u0199\u019a\7$\2\2\u019a\u0086\3\2\2\2\u019b\u019c\7c\2\2\u019c"+
		"\u019d\7e\2\2\u019d\u019e\7u\2\2\u019e\u019f\7r\2\2\u019f\u0088\3\2\2"+
		"\2\u01a0\u01a1\7~\2\2\u01a1\u008a\3\2\2\2\u01a2\u01a3\7u\2\2\u01a3\u01a4"+
		"\7w\2\2\u01a4\u01a5\7d\2\2\u01a5\u01a6\7v\2\2\u01a6\u01a7\7{\2\2\u01a7"+
		"\u01a8\7r\2\2\u01a8\u01a9\7g\2\2\u01a9\u008c\3\2\2\2\u01aa\u01ab\7v\2"+
		"\2\u01ab\u01ac\7t\2\2\u01ac\u01ad\7c\2\2\u01ad\u01ae\7p\2\2\u01ae\u01af"+
		"\7u\2\2\u01af\u01b0\7r\2\2\u01b0\u01b1\7c\2\2\u01b1\u01b2\7t\2\2\u01b2"+
		"\u01b3\7g\2\2\u01b3\u01b4\7p\2\2\u01b4\u01b5\7v\2\2\u01b5\u008e\3\2\2"+
		"\2\u01b6\u01b7\7g\2\2\u01b7\u01b8\7z\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba"+
		"\7g\2\2\u01ba\u01bb\7t\2\2\u01bb\u01bc\7p\2\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7n\2\2\u01be\u0090\3\2\2\2\u01bf\u01c0\4\62;\2\u01c0\u0092\3\2"+
		"\2\2\u01c1\u01c5\t\2\2\2\u01c2\u01c4\t\3\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u0094\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01c9\7/\2\2\u01c9\u01ca\7/\2\2\u01ca\u01ce"+
		"\3\2\2\2\u01cb\u01cd\n\4\2\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0\3\2\2\2\u01ce"+
		"\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d1\u01d2\bK\2\2\u01d2\u0096\3\2\2\2\u01d3\u01d5\t\5\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2"+
		"\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\bL\2\2\u01d9\u0098\3\2\2\2\6\2\u01c5"+
		"\u01ce\u01d6\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}