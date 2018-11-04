// Generated from /Users/aimee/IdeaProjects/untitled/src/main/java/ACSP.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ACSPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND=1, OR=2, EQ=3, NEQ=4, LT=5, GT=6, LTEQ=7, GTEQ=8, NOT=9, PLUS=10, 
		TIMES=11, MINUS=12, NEW=13, DIV=14, MOD=15, IF=16, THEN=17, ELSE=18, Skip=19, 
		Stop=20, DIVERGE=21, TRUE=22, FALSE=23, GUARD=24, LPAREN=25, RPAREN=26, 
		LBRACKET=27, RBRACKET=28, LSYNC=29, RSYNC=30, INTL=31, ECHOICE=32, ICHOICE=33, 
		PROJECT=34, COMMA=35, COLLON=36, SEMICOL=37, DATATYPE=38, ARROW=39, RARROW=40, 
		QUERY=41, PLING=42, CHANNEL=43, DOT=44, LBRACE=45, LBBRACE=46, RBBRACE=47, 
		RBRACE=48, EQUAL=49, BACKSLASH=50, TIMEOUT=51, INTR=52, ASSERT=53, DEADLOCK=54, 
		DETERMINISTIC=55, LIVELOCK=56, DIVERGENCE=57, FAILUREDIVE=58, FAILURE=59, 
		TRACE=60, TRACEREFINE=61, FAILUREREFINE=62, FAILUREDIVREFINE=63, FREE=64, 
		LET=65, WITHIN=66, INCLUDE=67, DBLQUOTE=68, ACSP=69, BAR=70, SUBTYPE=71, 
		TRANSPARENT=72, EXTERNAL=73, NAMETYPE=74, DIGIT=75, POR=76, ID=77, LINECOMMENT=78, 
		WS=79;
	public static final int
		RULE_spec = 0, RULE_definition = 1, RULE_includeFile = 2, RULE_funcImport = 3, 
		RULE_dataTypeDefinition = 4, RULE_channelDecl = 5, RULE_channelNames = 6, 
		RULE_channelColonType = 7, RULE_simpleDefinition = 8, RULE_assertDefinition = 9, 
		RULE_refinedBy = 10, RULE_definitionLeft = 11, RULE_any = 12, RULE_checkConditionBody = 13, 
		RULE_modelCheckType = 14, RULE_type = 15, RULE_simple = 16, RULE_set = 17, 
		RULE_setComprehension = 18, RULE_proc = 19, RULE_event = 20, RULE_locProcess = 21, 
		RULE_locOutput = 22, RULE_parallelProc = 23, RULE_letProc = 24, RULE_locNames = 25, 
		RULE_boolExp = 26, RULE_boolOrAmb = 27, RULE_expr = 28, RULE_number = 29;
	public static final String[] ruleNames = {
		"spec", "definition", "includeFile", "funcImport", "dataTypeDefinition", 
		"channelDecl", "channelNames", "channelColonType", "simpleDefinition", 
		"assertDefinition", "refinedBy", "definitionLeft", "any", "checkConditionBody", 
		"modelCheckType", "type", "simple", "set", "setComprehension", "proc", 
		"event", "locProcess", "locOutput", "parallelProc", "letProc", "locNames", 
		"boolExp", "boolOrAmb", "expr", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'and'", "'or'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'not'", 
		"'+'", "'*'", "'-'", "'new'", "'/'", "'%'", "'if'", "'then'", "'else'", 
		"'SKIP'", "'STOP'", "'div'", "'true'", "'false'", "'&'", "'('", "')'", 
		"'['", "']'", "'[|'", "'|]'", "'|||'", "'[]'", "'|~|'", "'|\\'", "','", 
		"':'", "';'", "'datatype'", "'->'", "'<-'", "'?'", "'!'", "'channel'", 
		"'.'", "'{'", "'{|'", "'|}'", "'}'", "'='", "'\\'", "'[>'", "'/\\'", "'assert'", 
		"'deadlock'", "'deterministic'", "'livelock'", "'divergence'", "' [FD]'", 
		"' [F]'", "' [T]'", "'[T='", "'[F='", "'[FD='", "' free'", "'let'", "'within'", 
		"'include'", "'\"'", "'acsp'", "'|'", "'subtype'", "'transparent'", "'external'", 
		"'nametype'", null, "'partial order reduce'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "AND", "OR", "EQ", "NEQ", "LT", "GT", "LTEQ", "GTEQ", "NOT", "PLUS", 
		"TIMES", "MINUS", "NEW", "DIV", "MOD", "IF", "THEN", "ELSE", "Skip", "Stop", 
		"DIVERGE", "TRUE", "FALSE", "GUARD", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
		"LSYNC", "RSYNC", "INTL", "ECHOICE", "ICHOICE", "PROJECT", "COMMA", "COLLON", 
		"SEMICOL", "DATATYPE", "ARROW", "RARROW", "QUERY", "PLING", "CHANNEL", 
		"DOT", "LBRACE", "LBBRACE", "RBBRACE", "RBRACE", "EQUAL", "BACKSLASH", 
		"TIMEOUT", "INTR", "ASSERT", "DEADLOCK", "DETERMINISTIC", "LIVELOCK", 
		"DIVERGENCE", "FAILUREDIVE", "FAILURE", "TRACE", "TRACEREFINE", "FAILUREREFINE", 
		"FAILUREDIVREFINE", "FREE", "LET", "WITHIN", "INCLUDE", "DBLQUOTE", "ACSP", 
		"BAR", "SUBTYPE", "TRANSPARENT", "EXTERNAL", "NAMETYPE", "DIGIT", "POR", 
		"ID", "LINECOMMENT", "WS"
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
	public String getGrammarFileName() { return "ACSP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ACSPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SpecContext extends ParserRuleContext {
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_spec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (DATATYPE - 38)) | (1L << (CHANNEL - 38)) | (1L << (ASSERT - 38)) | (1L << (INCLUDE - 38)) | (1L << (SUBTYPE - 38)) | (1L << (TRANSPARENT - 38)) | (1L << (EXTERNAL - 38)) | (1L << (NAMETYPE - 38)) | (1L << (ID - 38)))) != 0)) {
				{
				{
				setState(60);
				definition();
				}
				}
				setState(65);
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

	public static class DefinitionContext extends ParserRuleContext {
		public DataTypeDefinitionContext dataTypeDefinition() {
			return getRuleContext(DataTypeDefinitionContext.class,0);
		}
		public ChannelDeclContext channelDecl() {
			return getRuleContext(ChannelDeclContext.class,0);
		}
		public AssertDefinitionContext assertDefinition() {
			return getRuleContext(AssertDefinitionContext.class,0);
		}
		public FuncImportContext funcImport() {
			return getRuleContext(FuncImportContext.class,0);
		}
		public IncludeFileContext includeFile() {
			return getRuleContext(IncludeFileContext.class,0);
		}
		public SimpleDefinitionContext simpleDefinition() {
			return getRuleContext(SimpleDefinitionContext.class,0);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_definition);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
			case SUBTYPE:
			case NAMETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				dataTypeDefinition();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				channelDecl();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				assertDefinition();
				}
				break;
			case TRANSPARENT:
			case EXTERNAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				funcImport();
				}
				break;
			case INCLUDE:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				includeFile();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 6);
				{
				setState(71);
				simpleDefinition();
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

	public static class IncludeFileContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(ACSPParser.INCLUDE, 0); }
		public List<TerminalNode> DBLQUOTE() { return getTokens(ACSPParser.DBLQUOTE); }
		public TerminalNode DBLQUOTE(int i) {
			return getToken(ACSPParser.DBLQUOTE, i);
		}
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public TerminalNode ACSP() { return getToken(ACSPParser.ACSP, 0); }
		public IncludeFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_includeFile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterIncludeFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitIncludeFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitIncludeFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncludeFileContext includeFile() throws RecognitionException {
		IncludeFileContext _localctx = new IncludeFileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_includeFile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(INCLUDE);
			setState(75);
			match(DBLQUOTE);
			setState(76);
			match(ID);
			setState(77);
			match(DOT);
			setState(78);
			match(ACSP);
			setState(79);
			match(DBLQUOTE);
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

	public static class FuncImportContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode TRANSPARENT() { return getToken(ACSPParser.TRANSPARENT, 0); }
		public TerminalNode EXTERNAL() { return getToken(ACSPParser.EXTERNAL, 0); }
		public FuncImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterFuncImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitFuncImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitFuncImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncImportContext funcImport() throws RecognitionException {
		FuncImportContext _localctx = new FuncImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_funcImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==TRANSPARENT || _la==EXTERNAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(82);
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

	public static class DataTypeDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ACSPParser.EQUAL, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DATATYPE() { return getToken(ACSPParser.DATATYPE, 0); }
		public TerminalNode SUBTYPE() { return getToken(ACSPParser.SUBTYPE, 0); }
		public TerminalNode NAMETYPE() { return getToken(ACSPParser.NAMETYPE, 0); }
		public List<TerminalNode> BAR() { return getTokens(ACSPParser.BAR); }
		public TerminalNode BAR(int i) {
			return getToken(ACSPParser.BAR, i);
		}
		public DataTypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTypeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDataTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDataTypeDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDataTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeDefinitionContext dataTypeDefinition() throws RecognitionException {
		DataTypeDefinitionContext _localctx = new DataTypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (DATATYPE - 38)) | (1L << (SUBTYPE - 38)) | (1L << (NAMETYPE - 38)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			match(ID);
			setState(86);
			match(EQUAL);
			setState(87);
			type(0);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(88);
				match(BAR);
				setState(89);
				type(0);
				}
				}
				setState(94);
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

	public static class ChannelDeclContext extends ParserRuleContext {
		public TerminalNode CHANNEL() { return getToken(ACSPParser.CHANNEL, 0); }
		public ChannelNamesContext channelNames() {
			return getRuleContext(ChannelNamesContext.class,0);
		}
		public ChannelColonTypeContext channelColonType() {
			return getRuleContext(ChannelColonTypeContext.class,0);
		}
		public ChannelDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelDeclContext channelDecl() throws RecognitionException {
		ChannelDeclContext _localctx = new ChannelDeclContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_channelDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(CHANNEL);
			setState(96);
			channelNames();
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLON) {
				{
				setState(97);
				channelColonType();
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

	public static class ChannelNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public ChannelNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelNamesContext channelNames() throws RecognitionException {
		ChannelNamesContext _localctx = new ChannelNamesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_channelNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(101);
				match(COMMA);
				setState(102);
				match(ID);
				}
				}
				setState(107);
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

	public static class ChannelColonTypeContext extends ParserRuleContext {
		public TerminalNode COLLON() { return getToken(ACSPParser.COLLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ChannelColonTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelColonType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterChannelColonType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitChannelColonType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitChannelColonType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelColonTypeContext channelColonType() throws RecognitionException {
		ChannelColonTypeContext _localctx = new ChannelColonTypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_channelColonType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(COLLON);
			setState(109);
			type(0);
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

	public static class SimpleDefinitionContext extends ParserRuleContext {
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(ACSPParser.EQUAL, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public SimpleDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSimpleDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSimpleDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSimpleDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDefinitionContext simpleDefinition() throws RecognitionException {
		SimpleDefinitionContext _localctx = new SimpleDefinitionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			definitionLeft();
			setState(112);
			match(EQUAL);
			setState(113);
			any();
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

	public static class AssertDefinitionContext extends ParserRuleContext {
		public TerminalNode ASSERT() { return getToken(ACSPParser.ASSERT, 0); }
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode COLLON() { return getToken(ACSPParser.COLLON, 0); }
		public TerminalNode LBRACKET() { return getToken(ACSPParser.LBRACKET, 0); }
		public CheckConditionBodyContext checkConditionBody() {
			return getRuleContext(CheckConditionBodyContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(ACSPParser.RBRACKET, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public RefinedByContext refinedBy() {
			return getRuleContext(RefinedByContext.class,0);
		}
		public AssertDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assertDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterAssertDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitAssertDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitAssertDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssertDefinitionContext assertDefinition() throws RecognitionException {
		AssertDefinitionContext _localctx = new AssertDefinitionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assertDefinition);
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(ASSERT);
				setState(116);
				definitionLeft();
				setState(117);
				match(COLLON);
				setState(118);
				match(LBRACKET);
				setState(119);
				checkConditionBody();
				setState(120);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ASSERT);
				setState(123);
				proc(0);
				setState(124);
				refinedBy();
				setState(125);
				proc(0);
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

	public static class RefinedByContext extends ParserRuleContext {
		public TerminalNode TRACEREFINE() { return getToken(ACSPParser.TRACEREFINE, 0); }
		public TerminalNode FAILUREREFINE() { return getToken(ACSPParser.FAILUREREFINE, 0); }
		public TerminalNode FAILUREDIVREFINE() { return getToken(ACSPParser.FAILUREDIVREFINE, 0); }
		public RefinedByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refinedBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterRefinedBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitRefinedBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitRefinedBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefinedByContext refinedBy() throws RecognitionException {
		RefinedByContext _localctx = new RefinedByContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_refinedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRACEREFINE) | (1L << FAILUREREFINE) | (1L << FAILUREDIVREFINE))) != 0)) ) {
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

	public static class DefinitionLeftContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public DefinitionLeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionLeft; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterDefinitionLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitDefinitionLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitDefinitionLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionLeftContext definitionLeft() throws RecognitionException {
		DefinitionLeftContext _localctx = new DefinitionLeftContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_definitionLeft);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(ID);
				setState(133);
				match(LPAREN);
				setState(134);
				any();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					match(COMMA);
					setState(136);
					any();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(RPAREN);
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

	public static class AnyContext extends ParserRuleContext {
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AnyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterAny(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitAny(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitAny(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnyContext any() throws RecognitionException {
		AnyContext _localctx = new AnyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_any);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				proc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				boolExp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				event();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				type(0);
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

	public static class CheckConditionBodyContext extends ParserRuleContext {
		public TerminalNode DEADLOCK() { return getToken(ACSPParser.DEADLOCK, 0); }
		public TerminalNode FREE() { return getToken(ACSPParser.FREE, 0); }
		public ModelCheckTypeContext modelCheckType() {
			return getRuleContext(ModelCheckTypeContext.class,0);
		}
		public TerminalNode LIVELOCK() { return getToken(ACSPParser.LIVELOCK, 0); }
		public TerminalNode DIVERGENCE() { return getToken(ACSPParser.DIVERGENCE, 0); }
		public TerminalNode DETERMINISTIC() { return getToken(ACSPParser.DETERMINISTIC, 0); }
		public TerminalNode POR() { return getToken(ACSPParser.POR, 0); }
		public CheckConditionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkConditionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterCheckConditionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitCheckConditionBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitCheckConditionBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckConditionBodyContext checkConditionBody() throws RecognitionException {
		CheckConditionBodyContext _localctx = new CheckConditionBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_checkConditionBody);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEADLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(DEADLOCK);
				setState(154);
				match(FREE);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(155);
					modelCheckType();
					}
				}

				}
				break;
			case LIVELOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				match(LIVELOCK);
				setState(159);
				match(FREE);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(160);
					modelCheckType();
					}
				}

				}
				break;
			case DIVERGENCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(DIVERGENCE);
				setState(164);
				match(FREE);
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(165);
					modelCheckType();
					}
				}

				}
				break;
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(DETERMINISTIC);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(169);
					modelCheckType();
					}
				}

				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				match(POR);
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

	public static class ModelCheckTypeContext extends ParserRuleContext {
		public TerminalNode FAILUREDIVE() { return getToken(ACSPParser.FAILUREDIVE, 0); }
		public TerminalNode FAILURE() { return getToken(ACSPParser.FAILURE, 0); }
		public TerminalNode TRACE() { return getToken(ACSPParser.TRACE, 0); }
		public ModelCheckTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modelCheckType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterModelCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitModelCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitModelCheckType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModelCheckTypeContext modelCheckType() throws RecognitionException {
		ModelCheckTypeContext _localctx = new ModelCheckTypeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modelCheckType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(178);
				simple();
				}
				break;
			case 2:
				{
				setState(179);
				set();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(187);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(182);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(183);
					match(DOT);
					setState(184);
					type(3);
					}
					} 
				}
				setState(189);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public SimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleContext simple() throws RecognitionException {
		SimpleContext _localctx = new SimpleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
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

	public static class SetContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(ACSPParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ACSPParser.RBRACE, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(ACSPParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ACSPParser.DOT, i);
		}
		public TerminalNode LBBRACE() { return getToken(ACSPParser.LBBRACE, 0); }
		public TerminalNode RBBRACE() { return getToken(ACSPParser.RBBRACE, 0); }
		public DefinitionLeftContext definitionLeft() {
			return getRuleContext(DefinitionLeftContext.class,0);
		}
		public TerminalNode BAR() { return getToken(ACSPParser.BAR, 0); }
		public List<SetComprehensionContext> setComprehension() {
			return getRuleContexts(SetComprehensionContext.class);
		}
		public SetComprehensionContext setComprehension(int i) {
			return getRuleContext(SetComprehensionContext.class,i);
		}
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_set);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(192);
				match(LBRACE);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(193);
					any();
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(194);
						match(COMMA);
						setState(195);
						any();
						}
						}
						setState(200);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LET - 65)) | (1L << (DIGIT - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(201);
						any();
						setState(202);
						match(DOT);
						setState(203);
						match(DOT);
						setState(204);
						any();
						}
					}

					}
					break;
				}
				setState(210);
				match(RBRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(211);
				match(LBBRACE);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(212);
					any();
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(213);
						match(COMMA);
						setState(214);
						any();
						}
						}
						setState(219);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LET - 65)) | (1L << (DIGIT - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(220);
						any();
						setState(221);
						match(DOT);
						setState(222);
						match(DOT);
						setState(223);
						any();
						}
					}

					}
					break;
				}
				setState(229);
				match(RBBRACE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				definitionLeft();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(LBRACE);
				setState(232);
				any();
				setState(233);
				match(BAR);
				setState(234);
				setComprehension();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(235);
					match(COMMA);
					setState(236);
					setComprehension();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(RBRACE);
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

	public static class SetComprehensionContext extends ParserRuleContext {
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(ACSPParser.RARROW, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public SetComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setComprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterSetComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitSetComprehension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitSetComprehension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetComprehensionContext setComprehension() throws RecognitionException {
		SetComprehensionContext _localctx = new SetComprehensionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setComprehension);
		try {
			setState(251);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				any();
				setState(247);
				match(RARROW);
				setState(248);
				type(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				boolExp(0);
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

	public static class ProcContext extends ParserRuleContext {
		public TerminalNode Skip() { return getToken(ACSPParser.Skip, 0); }
		public TerminalNode Stop() { return getToken(ACSPParser.Stop, 0); }
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ACSPParser.ARROW, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode IF() { return getToken(ACSPParser.IF, 0); }
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ACSPParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(ACSPParser.ELSE, 0); }
		public TerminalNode GUARD() { return getToken(ACSPParser.GUARD, 0); }
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public LocProcessContext locProcess() {
			return getRuleContext(LocProcessContext.class,0);
		}
		public LocOutputContext locOutput() {
			return getRuleContext(LocOutputContext.class,0);
		}
		public ParallelProcContext parallelProc() {
			return getRuleContext(ParallelProcContext.class,0);
		}
		public LetProcContext letProc() {
			return getRuleContext(LetProcContext.class,0);
		}
		public TerminalNode ECHOICE() { return getToken(ACSPParser.ECHOICE, 0); }
		public TerminalNode ICHOICE() { return getToken(ACSPParser.ICHOICE, 0); }
		public TerminalNode INTL() { return getToken(ACSPParser.INTL, 0); }
		public TerminalNode LSYNC() { return getToken(ACSPParser.LSYNC, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode RSYNC() { return getToken(ACSPParser.RSYNC, 0); }
		public TerminalNode TIMEOUT() { return getToken(ACSPParser.TIMEOUT, 0); }
		public TerminalNode INTR() { return getToken(ACSPParser.INTR, 0); }
		public TerminalNode SEMICOL() { return getToken(ACSPParser.SEMICOL, 0); }
		public TerminalNode BACKSLASH() { return getToken(ACSPParser.BACKSLASH, 0); }
		public TerminalNode PROJECT() { return getToken(ACSPParser.PROJECT, 0); }
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcContext proc() throws RecognitionException {
		return proc(0);
	}

	private ProcContext proc(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProcContext _localctx = new ProcContext(_ctx, _parentState);
		ProcContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_proc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(254);
				match(Skip);
				}
				break;
			case 2:
				{
				setState(255);
				match(Stop);
				}
				break;
			case 3:
				{
				setState(256);
				event();
				setState(257);
				match(ARROW);
				setState(258);
				proc(18);
				}
				break;
			case 4:
				{
				setState(260);
				match(IF);
				setState(261);
				boolExp(0);
				setState(262);
				match(THEN);
				setState(263);
				proc(0);
				setState(264);
				match(ELSE);
				setState(265);
				proc(14);
				}
				break;
			case 5:
				{
				setState(267);
				boolExp(0);
				setState(268);
				match(GUARD);
				setState(269);
				proc(13);
				}
				break;
			case 6:
				{
				setState(271);
				match(LPAREN);
				setState(272);
				proc(0);
				setState(273);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(275);
				match(ID);
				setState(276);
				match(LPAREN);
				setState(277);
				any();
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(278);
					match(COMMA);
					setState(279);
					any();
					}
					}
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(285);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(287);
				locProcess();
				}
				break;
			case 9:
				{
				setState(288);
				locOutput();
				}
				break;
			case 10:
				{
				setState(289);
				parallelProc();
				}
				break;
			case 11:
				{
				setState(290);
				letProc();
				}
				break;
			case 12:
				{
				setState(291);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(294);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(295);
						match(ECHOICE);
						setState(296);
						proc(18);
						}
						break;
					case 2:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(297);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(298);
						match(ICHOICE);
						setState(299);
						proc(17);
						}
						break;
					case 3:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(300);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(301);
						match(INTL);
						setState(302);
						proc(16);
						}
						break;
					case 4:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(303);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(304);
						match(LSYNC);
						setState(305);
						set();
						setState(306);
						match(RSYNC);
						setState(307);
						proc(12);
						}
						break;
					case 5:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(309);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(310);
						match(TIMEOUT);
						setState(311);
						proc(11);
						}
						break;
					case 6:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(312);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(313);
						match(INTR);
						setState(314);
						proc(10);
						}
						break;
					case 7:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(315);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(316);
						match(SEMICOL);
						setState(317);
						proc(9);
						}
						break;
					case 8:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(318);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(319);
						_la = _input.LA(1);
						if ( !(_la==PROJECT || _la==BACKSLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						set();
						}
						break;
					}
					} 
				}
				setState(325);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public List<AnyContext> any() {
			return getRuleContexts(AnyContext.class);
		}
		public AnyContext any(int i) {
			return getRuleContext(AnyContext.class,i);
		}
		public List<TerminalNode> QUERY() { return getTokens(ACSPParser.QUERY); }
		public TerminalNode QUERY(int i) {
			return getToken(ACSPParser.QUERY, i);
		}
		public List<TerminalNode> PLING() { return getTokens(ACSPParser.PLING); }
		public TerminalNode PLING(int i) {
			return getToken(ACSPParser.PLING, i);
		}
		public List<TerminalNode> COLLON() { return getTokens(ACSPParser.COLLON); }
		public TerminalNode COLLON(int i) {
			return getToken(ACSPParser.COLLON, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_event);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(ID);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(327);
					_la = _input.LA(1);
					if ( !(_la==QUERY || _la==PLING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(328);
					any();
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						setState(329);
						match(COLLON);
						setState(330);
						type(0);
						}
						break;
					}
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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

	public static class LocProcessContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode LBRACKET() { return getToken(ACSPParser.LBRACKET, 0); }
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(ACSPParser.RBRACKET, 0); }
		public LocProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locProcess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocProcessContext locProcess() throws RecognitionException {
		LocProcessContext _localctx = new LocProcessContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_locProcess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(ID);
			setState(339);
			match(LBRACKET);
			setState(340);
			proc(0);
			setState(341);
			match(RBRACKET);
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

	public static class LocOutputContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public TerminalNode PLING() { return getToken(ACSPParser.PLING, 0); }
		public TerminalNode LT() { return getToken(ACSPParser.LT, 0); }
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode GT() { return getToken(ACSPParser.GT, 0); }
		public TerminalNode DOT() { return getToken(ACSPParser.DOT, 0); }
		public LocOutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locOutput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocOutputContext locOutput() throws RecognitionException {
		LocOutputContext _localctx = new LocOutputContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_locOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(ID);
			setState(344);
			match(PLING);
			setState(345);
			match(LT);
			setState(346);
			proc(0);
			setState(347);
			match(GT);
			setState(348);
			match(DOT);
			setState(349);
			proc(0);
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

	public static class ParallelProcContext extends ParserRuleContext {
		public List<TerminalNode> LPAREN() { return getTokens(ACSPParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(ACSPParser.LPAREN, i);
		}
		public TerminalNode NEW() { return getToken(ACSPParser.NEW, 0); }
		public LocNamesContext locNames() {
			return getRuleContext(LocNamesContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(ACSPParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(ACSPParser.RPAREN, i);
		}
		public List<ProcContext> proc() {
			return getRuleContexts(ProcContext.class);
		}
		public ProcContext proc(int i) {
			return getRuleContext(ProcContext.class,i);
		}
		public TerminalNode LSYNC() { return getToken(ACSPParser.LSYNC, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TerminalNode RSYNC() { return getToken(ACSPParser.RSYNC, 0); }
		public ParallelProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterParallelProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitParallelProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitParallelProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelProcContext parallelProc() throws RecognitionException {
		ParallelProcContext _localctx = new ParallelProcContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_parallelProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(LPAREN);
			setState(352);
			match(NEW);
			setState(353);
			locNames();
			setState(354);
			match(RPAREN);
			setState(355);
			match(LPAREN);
			setState(356);
			proc(0);
			setState(357);
			match(LSYNC);
			setState(358);
			set();
			setState(359);
			match(RSYNC);
			setState(360);
			proc(0);
			setState(361);
			match(RPAREN);
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

	public static class LetProcContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ACSPParser.LET, 0); }
		public TerminalNode WITHIN() { return getToken(ACSPParser.WITHIN, 0); }
		public AnyContext any() {
			return getRuleContext(AnyContext.class,0);
		}
		public List<SimpleDefinitionContext> simpleDefinition() {
			return getRuleContexts(SimpleDefinitionContext.class);
		}
		public SimpleDefinitionContext simpleDefinition(int i) {
			return getRuleContext(SimpleDefinitionContext.class,i);
		}
		public LetProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letProc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLetProc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLetProc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLetProc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetProcContext letProc() throws RecognitionException {
		LetProcContext _localctx = new LetProcContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_letProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LET);
			setState(365); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(364);
				simpleDefinition();
				}
				}
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(369);
			match(WITHIN);
			setState(370);
			any();
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

	public static class LocNamesContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ACSPParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ACSPParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ACSPParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ACSPParser.COMMA, i);
		}
		public LocNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterLocNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitLocNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitLocNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocNamesContext locNames() throws RecognitionException {
		LocNamesContext _localctx = new LocNamesContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_locNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ID);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(373);
				match(COMMA);
				setState(374);
				match(ID);
				}
				}
				setState(379);
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

	public static class BoolExpContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(ACSPParser.NOT, 0); }
		public BoolOrAmbContext boolOrAmb() {
			return getRuleContext(BoolOrAmbContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LT() { return getToken(ACSPParser.LT, 0); }
		public TerminalNode GT() { return getToken(ACSPParser.GT, 0); }
		public TerminalNode LTEQ() { return getToken(ACSPParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(ACSPParser.GTEQ, 0); }
		public TerminalNode EQ() { return getToken(ACSPParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(ACSPParser.NEQ, 0); }
		public TerminalNode TRUE() { return getToken(ACSPParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ACSPParser.FALSE, 0); }
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(ACSPParser.LBRACE, 0); }
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(ACSPParser.RBRACE, 0); }
		public TerminalNode AND() { return getToken(ACSPParser.AND, 0); }
		public TerminalNode OR() { return getToken(ACSPParser.OR, 0); }
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterBoolExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitBoolExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitBoolExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(381);
				match(NOT);
				setState(382);
				boolOrAmb();
				}
				break;
			case 2:
				{
				setState(383);
				expr(0);
				setState(384);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(385);
				expr(0);
				}
				break;
			case 3:
				{
				setState(387);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(388);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(389);
				match(ID);
				}
				break;
			case 6:
				{
				setState(390);
				number();
				}
				break;
			case 7:
				{
				setState(391);
				match(LBRACE);
				setState(392);
				boolExp(0);
				setState(393);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(397);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(398);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(399);
					boolExp(7);
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BoolOrAmbContext extends ParserRuleContext {
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public SimpleContext simple() {
			return getRuleContext(SimpleContext.class,0);
		}
		public BoolOrAmbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrAmb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterBoolOrAmb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitBoolOrAmb(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitBoolOrAmb(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolOrAmbContext boolOrAmb() throws RecognitionException {
		BoolOrAmbContext _localctx = new BoolOrAmbContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_boolOrAmb);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(405);
				boolExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(406);
				simple();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(ACSPParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(ACSPParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(ACSPParser.RPAREN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(ACSPParser.ID, 0); }
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode TIMES() { return getToken(ACSPParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(ACSPParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(ACSPParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(ACSPParser.MOD, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(410);
				match(MINUS);
				setState(411);
				expr(7);
				}
				break;
			case 2:
				{
				setState(412);
				match(LPAREN);
				setState(413);
				expr(0);
				setState(414);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(416);
				number();
				}
				break;
			case 4:
				{
				setState(417);
				match(ID);
				}
				break;
			case 5:
				{
				setState(418);
				set();
				}
				break;
			case 6:
				{
				setState(419);
				event();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(427);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(422);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(423);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(424);
					expr(7);
					}
					} 
				}
				setState(429);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ACSPParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ACSPParser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ACSPListener ) ((ACSPListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ACSPVisitor ) return ((ACSPVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(430);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(433); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 15:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 19:
			return proc_sempred((ProcContext)_localctx, predIndex);
		case 26:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		case 28:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean proc_sempred(ProcContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 10);
		case 6:
			return precpred(_ctx, 9);
		case 7:
			return precpred(_ctx, 8);
		case 8:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u01b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6"+
		"\3\7\3\7\3\7\5\7e\n\7\3\b\3\b\3\b\7\bj\n\b\f\b\16\bm\13\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u0082\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u008c\n\r\f"+
		"\r\16\r\u008f\13\r\3\r\3\r\5\r\u0093\n\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u009a\n\16\3\17\3\17\3\17\5\17\u009f\n\17\3\17\3\17\3\17\5\17\u00a4\n"+
		"\17\3\17\3\17\3\17\5\17\u00a9\n\17\3\17\3\17\5\17\u00ad\n\17\3\17\5\17"+
		"\u00b0\n\17\3\20\3\20\3\21\3\21\3\21\5\21\u00b7\n\21\3\21\3\21\3\21\7"+
		"\21\u00bc\n\21\f\21\16\21\u00bf\13\21\3\22\3\22\3\23\3\23\3\23\3\23\7"+
		"\23\u00c7\n\23\f\23\16\23\u00ca\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d1"+
		"\n\23\5\23\u00d3\n\23\3\23\3\23\3\23\3\23\3\23\7\23\u00da\n\23\f\23\16"+
		"\23\u00dd\13\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e4\n\23\5\23\u00e6\n"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f0\n\23\f\23\16\23"+
		"\u00f3\13\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24\3\24\3\24\3\24\5\24\u00fe"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\7\25\u011b\n\25\f\25\16\25\u011e\13\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u0127\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u0144\n\25\f\25\16\25\u0147\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u014e\n\26\7\26\u0150\n\26\f\26\16\26\u0153\13\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\6\32\u0170"+
		"\n\32\r\32\16\32\u0171\3\32\3\32\3\32\3\33\3\33\3\33\7\33\u017a\n\33\f"+
		"\33\16\33\u017d\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u018e\n\34\3\34\3\34\3\34\7\34\u0193\n"+
		"\34\f\34\16\34\u0196\13\34\3\35\3\35\5\35\u019a\n\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u01a7\n\36\3\36\3\36\3\36"+
		"\7\36\u01ac\n\36\f\36\16\36\u01af\13\36\3\37\6\37\u01b2\n\37\r\37\16\37"+
		"\u01b3\3\37\2\6 (\66: \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<\2\13\3\2JK\5\2((IILL\3\2?A\3\2<>\4\2$$\64\64\3\2+,\3"+
		"\2\5\n\3\2\3\4\4\2\f\16\20\21\2\u01e3\2A\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2"+
		"\bS\3\2\2\2\nV\3\2\2\2\fa\3\2\2\2\16f\3\2\2\2\20n\3\2\2\2\22q\3\2\2\2"+
		"\24\u0081\3\2\2\2\26\u0083\3\2\2\2\30\u0092\3\2\2\2\32\u0099\3\2\2\2\34"+
		"\u00af\3\2\2\2\36\u00b1\3\2\2\2 \u00b6\3\2\2\2\"\u00c0\3\2\2\2$\u00f6"+
		"\3\2\2\2&\u00fd\3\2\2\2(\u0126\3\2\2\2*\u0148\3\2\2\2,\u0154\3\2\2\2."+
		"\u0159\3\2\2\2\60\u0161\3\2\2\2\62\u016d\3\2\2\2\64\u0176\3\2\2\2\66\u018d"+
		"\3\2\2\28\u0199\3\2\2\2:\u01a6\3\2\2\2<\u01b1\3\2\2\2>@\5\4\3\2?>\3\2"+
		"\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\3\3\2\2\2CA\3\2\2\2DK\5\n\6\2EK\5"+
		"\f\7\2FK\5\24\13\2GK\5\b\5\2HK\5\6\4\2IK\5\22\n\2JD\3\2\2\2JE\3\2\2\2"+
		"JF\3\2\2\2JG\3\2\2\2JH\3\2\2\2JI\3\2\2\2K\5\3\2\2\2LM\7E\2\2MN\7F\2\2"+
		"NO\7O\2\2OP\7.\2\2PQ\7G\2\2QR\7F\2\2R\7\3\2\2\2ST\t\2\2\2TU\7O\2\2U\t"+
		"\3\2\2\2VW\t\3\2\2WX\7O\2\2XY\7\63\2\2Y^\5 \21\2Z[\7H\2\2[]\5 \21\2\\"+
		"Z\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ab\7-\2"+
		"\2bd\5\16\b\2ce\5\20\t\2dc\3\2\2\2de\3\2\2\2e\r\3\2\2\2fk\7O\2\2gh\7%"+
		"\2\2hj\7O\2\2ig\3\2\2\2jm\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mk\3"+
		"\2\2\2no\7&\2\2op\5 \21\2p\21\3\2\2\2qr\5\30\r\2rs\7\63\2\2st\5\32\16"+
		"\2t\23\3\2\2\2uv\7\67\2\2vw\5\30\r\2wx\7&\2\2xy\7\35\2\2yz\5\34\17\2z"+
		"{\7\36\2\2{\u0082\3\2\2\2|}\7\67\2\2}~\5(\25\2~\177\5\26\f\2\177\u0080"+
		"\5(\25\2\u0080\u0082\3\2\2\2\u0081u\3\2\2\2\u0081|\3\2\2\2\u0082\25\3"+
		"\2\2\2\u0083\u0084\t\4\2\2\u0084\27\3\2\2\2\u0085\u0093\7O\2\2\u0086\u0087"+
		"\7O\2\2\u0087\u0088\7\33\2\2\u0088\u008d\5\32\16\2\u0089\u008a\7%\2\2"+
		"\u008a\u008c\5\32\16\2\u008b\u0089\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b"+
		"\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\34\2\2\u0091\u0093\3\2\2\2\u0092\u0085\3\2\2\2\u0092\u0086\3"+
		"\2\2\2\u0093\31\3\2\2\2\u0094\u009a\5(\25\2\u0095\u009a\5\66\34\2\u0096"+
		"\u009a\5:\36\2\u0097\u009a\5*\26\2\u0098\u009a\5 \21\2\u0099\u0094\3\2"+
		"\2\2\u0099\u0095\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099"+
		"\u0098\3\2\2\2\u009a\33\3\2\2\2\u009b\u009c\78\2\2\u009c\u009e\7B\2\2"+
		"\u009d\u009f\5\36\20\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00b0"+
		"\3\2\2\2\u00a0\u00a1\7:\2\2\u00a1\u00a3\7B\2\2\u00a2\u00a4\5\36\20\2\u00a3"+
		"\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00b0\3\2\2\2\u00a5\u00a6\7;"+
		"\2\2\u00a6\u00a8\7B\2\2\u00a7\u00a9\5\36\20\2\u00a8\u00a7\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00b0\3\2\2\2\u00aa\u00ac\79\2\2\u00ab\u00ad\5\36"+
		"\20\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae"+
		"\u00b0\7N\2\2\u00af\u009b\3\2\2\2\u00af\u00a0\3\2\2\2\u00af\u00a5\3\2"+
		"\2\2\u00af\u00aa\3\2\2\2\u00af\u00ae\3\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b2"+
		"\t\5\2\2\u00b2\37\3\2\2\2\u00b3\u00b4\b\21\1\2\u00b4\u00b7\5\"\22\2\u00b5"+
		"\u00b7\5$\23\2\u00b6\u00b3\3\2\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00bd\3\2"+
		"\2\2\u00b8\u00b9\f\4\2\2\u00b9\u00ba\7.\2\2\u00ba\u00bc\5 \21\5\u00bb"+
		"\u00b8\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be!\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c1\7O\2\2\u00c1#\3\2"+
		"\2\2\u00c2\u00d2\7/\2\2\u00c3\u00c8\5\32\16\2\u00c4\u00c5\7%\2\2\u00c5"+
		"\u00c7\5\32\16\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d3\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\5\32\16\2\u00cc\u00cd\7.\2\2\u00cd\u00ce\7.\2\2\u00ce\u00cf\5\32"+
		"\16\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00c3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d4\3\2"+
		"\2\2\u00d4\u00f7\7\62\2\2\u00d5\u00e5\7\60\2\2\u00d6\u00db\5\32\16\2\u00d7"+
		"\u00d8\7%\2\2\u00d8\u00da\5\32\16\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3"+
		"\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00e6\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\5\32\16\2\u00df\u00e0\7.\2\2\u00e0\u00e1\7"+
		".\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00d6\3\2\2\2\u00e5\u00e3\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f7\7\61\2\2\u00e8\u00f7\5\30\r\2\u00e9"+
		"\u00ea\7/\2\2\u00ea\u00eb\5\32\16\2\u00eb\u00ec\7H\2\2\u00ec\u00f1\5&"+
		"\24\2\u00ed\u00ee\7%\2\2\u00ee\u00f0\5&\24\2\u00ef\u00ed\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f5\7\62\2\2\u00f5\u00f7\3\2\2\2\u00f6"+
		"\u00c2\3\2\2\2\u00f6\u00d5\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00e9\3\2"+
		"\2\2\u00f7%\3\2\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fa\7*\2\2\u00fa\u00fb"+
		"\5 \21\2\u00fb\u00fe\3\2\2\2\u00fc\u00fe\5\66\34\2\u00fd\u00f8\3\2\2\2"+
		"\u00fd\u00fc\3\2\2\2\u00fe\'\3\2\2\2\u00ff\u0100\b\25\1\2\u0100\u0127"+
		"\7\25\2\2\u0101\u0127\7\26\2\2\u0102\u0103\5*\26\2\u0103\u0104\7)\2\2"+
		"\u0104\u0105\5(\25\24\u0105\u0127\3\2\2\2\u0106\u0107\7\22\2\2\u0107\u0108"+
		"\5\66\34\2\u0108\u0109\7\23\2\2\u0109\u010a\5(\25\2\u010a\u010b\7\24\2"+
		"\2\u010b\u010c\5(\25\20\u010c\u0127\3\2\2\2\u010d\u010e\5\66\34\2\u010e"+
		"\u010f\7\32\2\2\u010f\u0110\5(\25\17\u0110\u0127\3\2\2\2\u0111\u0112\7"+
		"\33\2\2\u0112\u0113\5(\25\2\u0113\u0114\7\34\2\2\u0114\u0127\3\2\2\2\u0115"+
		"\u0116\7O\2\2\u0116\u0117\7\33\2\2\u0117\u011c\5\32\16\2\u0118\u0119\7"+
		"%\2\2\u0119\u011b\5\32\16\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0120\7\34\2\2\u0120\u0127\3\2\2\2\u0121\u0127\5,\27\2\u0122"+
		"\u0127\5.\30\2\u0123\u0127\5\60\31\2\u0124\u0127\5\62\32\2\u0125\u0127"+
		"\7O\2\2\u0126\u00ff\3\2\2\2\u0126\u0101\3\2\2\2\u0126\u0102\3\2\2\2\u0126"+
		"\u0106\3\2\2\2\u0126\u010d\3\2\2\2\u0126\u0111\3\2\2\2\u0126\u0115\3\2"+
		"\2\2\u0126\u0121\3\2\2\2\u0126\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0125\3\2\2\2\u0127\u0145\3\2\2\2\u0128\u0129\f\23"+
		"\2\2\u0129\u012a\7\"\2\2\u012a\u0144\5(\25\24\u012b\u012c\f\22\2\2\u012c"+
		"\u012d\7#\2\2\u012d\u0144\5(\25\23\u012e\u012f\f\21\2\2\u012f\u0130\7"+
		"!\2\2\u0130\u0144\5(\25\22\u0131\u0132\f\r\2\2\u0132\u0133\7\37\2\2\u0133"+
		"\u0134\5$\23\2\u0134\u0135\7 \2\2\u0135\u0136\5(\25\16\u0136\u0144\3\2"+
		"\2\2\u0137\u0138\f\f\2\2\u0138\u0139\7\65\2\2\u0139\u0144\5(\25\r\u013a"+
		"\u013b\f\13\2\2\u013b\u013c\7\66\2\2\u013c\u0144\5(\25\f\u013d\u013e\f"+
		"\n\2\2\u013e\u013f\7\'\2\2\u013f\u0144\5(\25\13\u0140\u0141\f\16\2\2\u0141"+
		"\u0142\t\6\2\2\u0142\u0144\5$\23\2\u0143\u0128\3\2\2\2\u0143\u012b\3\2"+
		"\2\2\u0143\u012e\3\2\2\2\u0143\u0131\3\2\2\2\u0143\u0137\3\2\2\2\u0143"+
		"\u013a\3\2\2\2\u0143\u013d\3\2\2\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2"+
		"\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146)\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0148\u0151\7O\2\2\u0149\u014a\t\7\2\2\u014a\u014d\5\32\16\2"+
		"\u014b\u014c\7&\2\2\u014c\u014e\5 \21\2\u014d\u014b\3\2\2\2\u014d\u014e"+
		"\3\2\2\2\u014e\u0150\3\2\2\2\u014f\u0149\3\2\2\2\u0150\u0153\3\2\2\2\u0151"+
		"\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152+\3\2\2\2\u0153\u0151\3\2\2\2"+
		"\u0154\u0155\7O\2\2\u0155\u0156\7\35\2\2\u0156\u0157\5(\25\2\u0157\u0158"+
		"\7\36\2\2\u0158-\3\2\2\2\u0159\u015a\7O\2\2\u015a\u015b\7,\2\2\u015b\u015c"+
		"\7\7\2\2\u015c\u015d\5(\25\2\u015d\u015e\7\b\2\2\u015e\u015f\7.\2\2\u015f"+
		"\u0160\5(\25\2\u0160/\3\2\2\2\u0161\u0162\7\33\2\2\u0162\u0163\7\17\2"+
		"\2\u0163\u0164\5\64\33\2\u0164\u0165\7\34\2\2\u0165\u0166\7\33\2\2\u0166"+
		"\u0167\5(\25\2\u0167\u0168\7\37\2\2\u0168\u0169\5$\23\2\u0169\u016a\7"+
		" \2\2\u016a\u016b\5(\25\2\u016b\u016c\7\34\2\2\u016c\61\3\2\2\2\u016d"+
		"\u016f\7C\2\2\u016e\u0170\5\22\n\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2"+
		"\2\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\7D\2\2\u0174\u0175\5\32\16\2\u0175\63\3\2\2\2\u0176\u017b\7O\2"+
		"\2\u0177\u0178\7%\2\2\u0178\u017a\7O\2\2\u0179\u0177\3\2\2\2\u017a\u017d"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\65\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\b\34\1\2\u017f\u0180\7\13\2\2\u0180\u018e\5"+
		"8\35\2\u0181\u0182\5:\36\2\u0182\u0183\t\b\2\2\u0183\u0184\5:\36\2\u0184"+
		"\u018e\3\2\2\2\u0185\u018e\7\30\2\2\u0186\u018e\7\31\2\2\u0187\u018e\7"+
		"O\2\2\u0188\u018e\5<\37\2\u0189\u018a\7/\2\2\u018a\u018b\5\66\34\2\u018b"+
		"\u018c\7\62\2\2\u018c\u018e\3\2\2\2\u018d\u017e\3\2\2\2\u018d\u0181\3"+
		"\2\2\2\u018d\u0185\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d"+
		"\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018e\u0194\3\2\2\2\u018f\u0190\f\b"+
		"\2\2\u0190\u0191\t\t\2\2\u0191\u0193\5\66\34\t\u0192\u018f\3\2\2\2\u0193"+
		"\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\67\3\2\2"+
		"\2\u0196\u0194\3\2\2\2\u0197\u019a\5\66\34\2\u0198\u019a\5\"\22\2\u0199"+
		"\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a9\3\2\2\2\u019b\u019c\b\36\1\2"+
		"\u019c\u019d\7\16\2\2\u019d\u01a7\5:\36\t\u019e\u019f\7\33\2\2\u019f\u01a0"+
		"\5:\36\2\u01a0\u01a1\7\34\2\2\u01a1\u01a7\3\2\2\2\u01a2\u01a7\5<\37\2"+
		"\u01a3\u01a7\7O\2\2\u01a4\u01a7\5$\23\2\u01a5\u01a7\5*\26\2\u01a6\u019b"+
		"\3\2\2\2\u01a6\u019e\3\2\2\2\u01a6\u01a2\3\2\2\2\u01a6\u01a3\3\2\2\2\u01a6"+
		"\u01a4\3\2\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9\f\b"+
		"\2\2\u01a9\u01aa\t\n\2\2\u01aa\u01ac\5:\36\t\u01ab\u01a8\3\2\2\2\u01ac"+
		"\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae;\3\2\2\2"+
		"\u01af\u01ad\3\2\2\2\u01b0\u01b2\7M\2\2\u01b1\u01b0\3\2\2\2\u01b2\u01b3"+
		"\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4=\3\2\2\2)AJ^dk"+
		"\u0081\u008d\u0092\u0099\u009e\u00a3\u00a8\u00ac\u00af\u00b6\u00bd\u00c8"+
		"\u00d0\u00d2\u00db\u00e3\u00e5\u00f1\u00f6\u00fd\u011c\u0126\u0143\u0145"+
		"\u014d\u0151\u0171\u017b\u018d\u0194\u0199\u01a6\u01ad\u01b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}