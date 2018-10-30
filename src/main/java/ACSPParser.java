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
		RULE_spec = 0, RULE_definition = 1, RULE_funcImport = 2, RULE_dataTypeDefinition = 3, 
		RULE_channelDecl = 4, RULE_channelNames = 5, RULE_channelColonType = 6, 
		RULE_simpleDefinition = 7, RULE_assertDefinition = 8, RULE_refinedBy = 9, 
		RULE_definitionLeft = 10, RULE_any = 11, RULE_checkConditionBody = 12, 
		RULE_modelCheckType = 13, RULE_type = 14, RULE_simple = 15, RULE_set = 16, 
		RULE_setComprehension = 17, RULE_proc = 18, RULE_event = 19, RULE_locProcess = 20, 
		RULE_locOutput = 21, RULE_parallelProc = 22, RULE_letProc = 23, RULE_locNames = 24, 
		RULE_boolExp = 25, RULE_boolOrAmb = 26, RULE_expr = 27, RULE_number = 28;
	public static final String[] ruleNames = {
		"spec", "definition", "funcImport", "dataTypeDefinition", "channelDecl", 
		"channelNames", "channelColonType", "simpleDefinition", "assertDefinition", 
		"refinedBy", "definitionLeft", "any", "checkConditionBody", "modelCheckType", 
		"type", "simple", "set", "setComprehension", "proc", "event", "locProcess", 
		"locOutput", "parallelProc", "letProc", "locNames", "boolExp", "boolOrAmb", 
		"expr", "number"
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (DATATYPE - 38)) | (1L << (CHANNEL - 38)) | (1L << (ASSERT - 38)) | (1L << (SUBTYPE - 38)) | (1L << (TRANSPARENT - 38)) | (1L << (EXTERNAL - 38)) | (1L << (NAMETYPE - 38)) | (1L << (ID - 38)))) != 0)) {
				{
				{
				setState(58);
				definition();
				}
				}
				setState(63);
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
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DATATYPE:
			case SUBTYPE:
			case NAMETYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				dataTypeDefinition();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				channelDecl();
				}
				break;
			case ASSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				assertDefinition();
				}
				break;
			case TRANSPARENT:
			case EXTERNAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				funcImport();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
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
		enterRule(_localctx, 4, RULE_funcImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_la = _input.LA(1);
			if ( !(_la==TRANSPARENT || _la==EXTERNAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(72);
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
		enterRule(_localctx, 6, RULE_dataTypeDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_la = _input.LA(1);
			if ( !(((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & ((1L << (DATATYPE - 38)) | (1L << (SUBTYPE - 38)) | (1L << (NAMETYPE - 38)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			match(ID);
			setState(76);
			match(EQUAL);
			setState(77);
			type(0);
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BAR) {
				{
				{
				setState(78);
				match(BAR);
				setState(79);
				type(0);
				}
				}
				setState(84);
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
		enterRule(_localctx, 8, RULE_channelDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(CHANNEL);
			setState(86);
			channelNames();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLON) {
				{
				setState(87);
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
		enterRule(_localctx, 10, RULE_channelNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(ID);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(91);
				match(COMMA);
				setState(92);
				match(ID);
				}
				}
				setState(97);
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
		enterRule(_localctx, 12, RULE_channelColonType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(COLLON);
			setState(99);
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
		enterRule(_localctx, 14, RULE_simpleDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			definitionLeft();
			setState(102);
			match(EQUAL);
			setState(103);
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
		enterRule(_localctx, 16, RULE_assertDefinition);
		try {
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ASSERT);
				setState(106);
				definitionLeft();
				setState(107);
				match(COLLON);
				setState(108);
				match(LBRACKET);
				setState(109);
				checkConditionBody();
				setState(110);
				match(RBRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(ASSERT);
				setState(113);
				proc(0);
				setState(114);
				refinedBy();
				setState(115);
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
		enterRule(_localctx, 18, RULE_refinedBy);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
		enterRule(_localctx, 20, RULE_definitionLeft);
		int _la;
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ID);
				setState(123);
				match(LPAREN);
				setState(124);
				any();
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(125);
					match(COMMA);
					setState(126);
					any();
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132);
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
		enterRule(_localctx, 22, RULE_any);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				proc(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				boolExp(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				event();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
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
		enterRule(_localctx, 24, RULE_checkConditionBody);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEADLOCK:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(DEADLOCK);
				setState(144);
				match(FREE);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(145);
					modelCheckType();
					}
				}

				}
				break;
			case LIVELOCK:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(LIVELOCK);
				setState(149);
				match(FREE);
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(150);
					modelCheckType();
					}
				}

				}
				break;
			case DIVERGENCE:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(DIVERGENCE);
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
			case DETERMINISTIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(158);
				match(DETERMINISTIC);
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FAILUREDIVE) | (1L << FAILURE) | (1L << TRACE))) != 0)) {
					{
					setState(159);
					modelCheckType();
					}
				}

				}
				break;
			case POR:
				enterOuterAlt(_localctx, 5);
				{
				setState(162);
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
		enterRule(_localctx, 26, RULE_modelCheckType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(168);
				simple();
				}
				break;
			case 2:
				{
				setState(169);
				set();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(177);
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
					setState(172);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(173);
					match(DOT);
					setState(174);
					type(3);
					}
					} 
				}
				setState(179);
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
		enterRule(_localctx, 30, RULE_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
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
		enterRule(_localctx, 32, RULE_set);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(182);
				match(LBRACE);
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(183);
					any();
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(184);
						match(COMMA);
						setState(185);
						any();
						}
						}
						setState(190);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LET - 65)) | (1L << (DIGIT - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(191);
						any();
						setState(192);
						match(DOT);
						setState(193);
						match(DOT);
						setState(194);
						any();
						}
					}

					}
					break;
				}
				setState(200);
				match(RBRACE);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(201);
				match(LBBRACE);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(202);
					any();
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(203);
						match(COMMA);
						setState(204);
						any();
						}
						}
						setState(209);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << MINUS) | (1L << IF) | (1L << Skip) | (1L << Stop) | (1L << TRUE) | (1L << FALSE) | (1L << LPAREN) | (1L << LBRACE) | (1L << LBBRACE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (LET - 65)) | (1L << (DIGIT - 65)) | (1L << (ID - 65)))) != 0)) {
						{
						setState(210);
						any();
						setState(211);
						match(DOT);
						setState(212);
						match(DOT);
						setState(213);
						any();
						}
					}

					}
					break;
				}
				setState(219);
				match(RBBRACE);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				definitionLeft();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(221);
				match(LBRACE);
				setState(222);
				any();
				setState(223);
				match(BAR);
				setState(224);
				setComprehension();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(225);
					match(COMMA);
					setState(226);
					setComprehension();
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
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
		enterRule(_localctx, 34, RULE_setComprehension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			any();
			setState(237);
			match(RARROW);
			setState(238);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_proc, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(241);
				match(Skip);
				}
				break;
			case 2:
				{
				setState(242);
				match(Stop);
				}
				break;
			case 3:
				{
				setState(243);
				event();
				setState(244);
				match(ARROW);
				setState(245);
				proc(19);
				}
				break;
			case 4:
				{
				setState(247);
				match(IF);
				setState(248);
				boolExp(0);
				setState(249);
				match(THEN);
				setState(250);
				proc(0);
				setState(251);
				match(ELSE);
				setState(252);
				proc(15);
				}
				break;
			case 5:
				{
				setState(254);
				boolExp(0);
				setState(255);
				match(GUARD);
				setState(256);
				proc(14);
				}
				break;
			case 6:
				{
				setState(258);
				match(LPAREN);
				setState(259);
				proc(0);
				setState(260);
				match(RPAREN);
				}
				break;
			case 7:
				{
				setState(262);
				match(ID);
				setState(263);
				match(LPAREN);
				setState(264);
				any();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(265);
					match(COMMA);
					setState(266);
					any();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(274);
				locProcess();
				}
				break;
			case 9:
				{
				setState(275);
				locOutput();
				}
				break;
			case 10:
				{
				setState(276);
				parallelProc();
				}
				break;
			case 11:
				{
				setState(277);
				letProc();
				}
				break;
			case 12:
				{
				setState(278);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(317);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(315);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(281);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(282);
						match(ECHOICE);
						setState(283);
						proc(19);
						}
						break;
					case 2:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(284);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(285);
						match(ICHOICE);
						setState(286);
						proc(18);
						}
						break;
					case 3:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(287);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(288);
						match(INTL);
						setState(289);
						proc(17);
						}
						break;
					case 4:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(290);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(291);
						match(LSYNC);
						setState(292);
						set();
						setState(293);
						match(RSYNC);
						setState(294);
						proc(13);
						}
						break;
					case 5:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(296);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(297);
						match(TIMEOUT);
						setState(298);
						proc(12);
						}
						break;
					case 6:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(299);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(300);
						match(INTR);
						setState(301);
						proc(11);
						}
						break;
					case 7:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(302);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(303);
						match(SEMICOL);
						setState(304);
						proc(10);
						}
						break;
					case 8:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(305);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(306);
						_la = _input.LA(1);
						if ( !(_la==PROJECT || _la==BACKSLASH) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						set();
						}
						break;
					case 9:
						{
						_localctx = new ProcContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_proc);
						setState(308);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(309);
						match(LSYNC);
						setState(310);
						set();
						setState(311);
						match(RSYNC);
						setState(312);
						proc(0);
						setState(313);
						match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
		enterRule(_localctx, 38, RULE_event);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(ID);
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(321);
					_la = _input.LA(1);
					if ( !(_la==QUERY || _la==PLING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(322);
					any();
					setState(325);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						setState(323);
						match(COLLON);
						setState(324);
						type(0);
						}
						break;
					}
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 40, RULE_locProcess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(ID);
			setState(333);
			match(LBRACKET);
			setState(334);
			proc(0);
			setState(335);
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
		enterRule(_localctx, 42, RULE_locOutput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(338);
			match(PLING);
			setState(339);
			match(LT);
			setState(340);
			proc(0);
			setState(341);
			match(GT);
			setState(342);
			match(DOT);
			setState(343);
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
		enterRule(_localctx, 44, RULE_parallelProc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(LPAREN);
			setState(346);
			match(NEW);
			setState(347);
			locNames();
			setState(348);
			match(RPAREN);
			setState(349);
			match(LPAREN);
			setState(350);
			proc(0);
			setState(351);
			match(LSYNC);
			setState(352);
			set();
			setState(353);
			match(RSYNC);
			setState(354);
			proc(0);
			setState(355);
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
		enterRule(_localctx, 46, RULE_letProc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			match(LET);
			setState(359); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(358);
				simpleDefinition();
				}
				}
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			setState(363);
			match(WITHIN);
			setState(364);
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
		enterRule(_localctx, 48, RULE_locNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(ID);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(367);
				match(COMMA);
				setState(368);
				match(ID);
				}
				}
				setState(373);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(375);
				match(NOT);
				setState(376);
				boolOrAmb();
				}
				break;
			case 2:
				{
				setState(377);
				expr(0);
				setState(378);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << GT) | (1L << LTEQ) | (1L << GTEQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(379);
				expr(0);
				}
				break;
			case 3:
				{
				setState(381);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(382);
				match(FALSE);
				}
				break;
			case 5:
				{
				setState(383);
				match(ID);
				}
				break;
			case 6:
				{
				setState(384);
				number();
				}
				break;
			case 7:
				{
				setState(385);
				match(LBRACE);
				setState(386);
				boolExp(0);
				setState(387);
				match(RBRACE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BoolExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(391);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(392);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(393);
					boolExp(7);
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 52, RULE_boolOrAmb);
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				boolExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(404);
				match(MINUS);
				setState(405);
				expr(7);
				}
				break;
			case 2:
				{
				setState(406);
				match(LPAREN);
				setState(407);
				expr(0);
				setState(408);
				match(RPAREN);
				}
				break;
			case 3:
				{
				setState(410);
				number();
				}
				break;
			case 4:
				{
				setState(411);
				match(ID);
				}
				break;
			case 5:
				{
				setState(412);
				set();
				}
				break;
			case 6:
				{
				setState(413);
				event();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(421);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(416);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(417);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << TIMES) | (1L << MINUS) | (1L << DIV) | (1L << MOD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(418);
					expr(7);
					}
					} 
				}
				setState(423);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 56, RULE_number);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(424);
					match(DIGIT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(427); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		case 14:
			return type_sempred((TypeContext)_localctx, predIndex);
		case 18:
			return proc_sempred((ProcContext)_localctx, predIndex);
		case 25:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		case 27:
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
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3Q\u01b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\3\3\3\3\3\3\3\3\3\5\3H\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\3\6\5\6[\n\6\3\7\3\7\3\7\7\7`\n\7"+
		"\f\7\16\7c\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\nx\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f"+
		"\u0082\n\f\f\f\16\f\u0085\13\f\3\f\3\f\5\f\u0089\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0090\n\r\3\16\3\16\3\16\5\16\u0095\n\16\3\16\3\16\3\16\5\16\u009a"+
		"\n\16\3\16\3\16\3\16\5\16\u009f\n\16\3\16\3\16\5\16\u00a3\n\16\3\16\5"+
		"\16\u00a6\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u00ad\n\20\3\20\3\20\3\20"+
		"\7\20\u00b2\n\20\f\20\16\20\u00b5\13\20\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\7\22\u00bd\n\22\f\22\16\22\u00c0\13\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u00c7\n\22\5\22\u00c9\n\22\3\22\3\22\3\22\3\22\3\22\7\22\u00d0\n\22\f"+
		"\22\16\22\u00d3\13\22\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\5\22\u00dc"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e6\n\22\f\22\16"+
		"\22\u00e9\13\22\3\22\3\22\5\22\u00ed\n\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u010e\n\24"+
		"\f\24\16\24\u0111\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011a"+
		"\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u013e\n\24\f\24\16\24\u0141\13"+
		"\24\3\25\3\25\3\25\3\25\3\25\5\25\u0148\n\25\7\25\u014a\n\25\f\25\16\25"+
		"\u014d\13\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\6\31\u016a\n\31\r\31\16\31\u016b\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\7\32\u0174\n\32\f\32\16\32\u0177\13\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0188\n\33\3\33\3\33"+
		"\3\33\7\33\u018d\n\33\f\33\16\33\u0190\13\33\3\34\3\34\5\34\u0194\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a1\n\35"+
		"\3\35\3\35\3\35\7\35\u01a6\n\35\f\35\16\35\u01a9\13\35\3\36\6\36\u01ac"+
		"\n\36\r\36\16\36\u01ad\3\36\2\6\36&\648\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\13\3\2JK\5\2((IILL\3\2?A\3\2<>\4"+
		"\2$$\64\64\3\2+,\3\2\5\n\3\2\3\4\4\2\f\16\20\21\2\u01dd\2?\3\2\2\2\4G"+
		"\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2\nW\3\2\2\2\f\\\3\2\2\2\16d\3\2\2\2\20g"+
		"\3\2\2\2\22w\3\2\2\2\24y\3\2\2\2\26\u0088\3\2\2\2\30\u008f\3\2\2\2\32"+
		"\u00a5\3\2\2\2\34\u00a7\3\2\2\2\36\u00ac\3\2\2\2 \u00b6\3\2\2\2\"\u00ec"+
		"\3\2\2\2$\u00ee\3\2\2\2&\u0119\3\2\2\2(\u0142\3\2\2\2*\u014e\3\2\2\2,"+
		"\u0153\3\2\2\2.\u015b\3\2\2\2\60\u0167\3\2\2\2\62\u0170\3\2\2\2\64\u0187"+
		"\3\2\2\2\66\u0193\3\2\2\28\u01a0\3\2\2\2:\u01ab\3\2\2\2<>\5\4\3\2=<\3"+
		"\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\3\3\2\2\2A?\3\2\2\2BH\5\b\5\2CH"+
		"\5\n\6\2DH\5\22\n\2EH\5\6\4\2FH\5\20\t\2GB\3\2\2\2GC\3\2\2\2GD\3\2\2\2"+
		"GE\3\2\2\2GF\3\2\2\2H\5\3\2\2\2IJ\t\2\2\2JK\7O\2\2K\7\3\2\2\2LM\t\3\2"+
		"\2MN\7O\2\2NO\7\63\2\2OT\5\36\20\2PQ\7H\2\2QS\5\36\20\2RP\3\2\2\2SV\3"+
		"\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VT\3\2\2\2WX\7-\2\2XZ\5\f\7\2Y[\5"+
		"\16\b\2ZY\3\2\2\2Z[\3\2\2\2[\13\3\2\2\2\\a\7O\2\2]^\7%\2\2^`\7O\2\2_]"+
		"\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\r\3\2\2\2ca\3\2\2\2de\7&\2\2e"+
		"f\5\36\20\2f\17\3\2\2\2gh\5\26\f\2hi\7\63\2\2ij\5\30\r\2j\21\3\2\2\2k"+
		"l\7\67\2\2lm\5\26\f\2mn\7&\2\2no\7\35\2\2op\5\32\16\2pq\7\36\2\2qx\3\2"+
		"\2\2rs\7\67\2\2st\5&\24\2tu\5\24\13\2uv\5&\24\2vx\3\2\2\2wk\3\2\2\2wr"+
		"\3\2\2\2x\23\3\2\2\2yz\t\4\2\2z\25\3\2\2\2{\u0089\7O\2\2|}\7O\2\2}~\7"+
		"\33\2\2~\u0083\5\30\r\2\177\u0080\7%\2\2\u0080\u0082\5\30\r\2\u0081\177"+
		"\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7\34\2\2\u0087\u0089\3"+
		"\2\2\2\u0088{\3\2\2\2\u0088|\3\2\2\2\u0089\27\3\2\2\2\u008a\u0090\5&\24"+
		"\2\u008b\u0090\5\64\33\2\u008c\u0090\58\35\2\u008d\u0090\5(\25\2\u008e"+
		"\u0090\5\36\20\2\u008f\u008a\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008c\3"+
		"\2\2\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\31\3\2\2\2\u0091"+
		"\u0092\78\2\2\u0092\u0094\7B\2\2\u0093\u0095\5\34\17\2\u0094\u0093\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u00a6\3\2\2\2\u0096\u0097\7:\2\2\u0097"+
		"\u0099\7B\2\2\u0098\u009a\5\34\17\2\u0099\u0098\3\2\2\2\u0099\u009a\3"+
		"\2\2\2\u009a\u00a6\3\2\2\2\u009b\u009c\7;\2\2\u009c\u009e\7B\2\2\u009d"+
		"\u009f\5\34\17\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a6\3"+
		"\2\2\2\u00a0\u00a2\79\2\2\u00a1\u00a3\5\34\17\2\u00a2\u00a1\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a6\7N\2\2\u00a5\u0091\3\2"+
		"\2\2\u00a5\u0096\3\2\2\2\u00a5\u009b\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\33\3\2\2\2\u00a7\u00a8\t\5\2\2\u00a8\35\3\2\2\2\u00a9"+
		"\u00aa\b\20\1\2\u00aa\u00ad\5 \21\2\u00ab\u00ad\5\"\22\2\u00ac\u00a9\3"+
		"\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b3\3\2\2\2\u00ae\u00af\f\4\2\2\u00af"+
		"\u00b0\7.\2\2\u00b0\u00b2\5\36\20\5\u00b1\u00ae\3\2\2\2\u00b2\u00b5\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\37\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7O\2\2\u00b7!\3\2\2\2\u00b8\u00c8\7/\2\2\u00b9"+
		"\u00be\5\30\r\2\u00ba\u00bb\7%\2\2\u00bb\u00bd\5\30\r\2\u00bc\u00ba\3"+
		"\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c9\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7"+
		".\2\2\u00c3\u00c4\7.\2\2\u00c4\u00c5\5\30\r\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c1\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00b9\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ed\7\62\2\2\u00cb"+
		"\u00db\7\60\2\2\u00cc\u00d1\5\30\r\2\u00cd\u00ce\7%\2\2\u00ce\u00d0\5"+
		"\30\r\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00dc\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\5\30"+
		"\r\2\u00d5\u00d6\7.\2\2\u00d6\u00d7\7.\2\2\u00d7\u00d8\5\30\r\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d4\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00cc\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00ed\7\61\2\2\u00de\u00ed\5\26\f\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5"+
		"\30\r\2\u00e1\u00e2\7H\2\2\u00e2\u00e7\5$\23\2\u00e3\u00e4\7%\2\2\u00e4"+
		"\u00e6\5$\23\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2"+
		"\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\7\62\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00b8\3\2\2\2\u00ec\u00cb\3"+
		"\2\2\2\u00ec\u00de\3\2\2\2\u00ec\u00df\3\2\2\2\u00ed#\3\2\2\2\u00ee\u00ef"+
		"\5\30\r\2\u00ef\u00f0\7*\2\2\u00f0\u00f1\5\36\20\2\u00f1%\3\2\2\2\u00f2"+
		"\u00f3\b\24\1\2\u00f3\u011a\7\25\2\2\u00f4\u011a\7\26\2\2\u00f5\u00f6"+
		"\5(\25\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\5&\24\25\u00f8\u011a\3\2\2\2\u00f9"+
		"\u00fa\7\22\2\2\u00fa\u00fb\5\64\33\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd"+
		"\5&\24\2\u00fd\u00fe\7\24\2\2\u00fe\u00ff\5&\24\21\u00ff\u011a\3\2\2\2"+
		"\u0100\u0101\5\64\33\2\u0101\u0102\7\32\2\2\u0102\u0103\5&\24\20\u0103"+
		"\u011a\3\2\2\2\u0104\u0105\7\33\2\2\u0105\u0106\5&\24\2\u0106\u0107\7"+
		"\34\2\2\u0107\u011a\3\2\2\2\u0108\u0109\7O\2\2\u0109\u010a\7\33\2\2\u010a"+
		"\u010f\5\30\r\2\u010b\u010c\7%\2\2\u010c\u010e\5\30\r\2\u010d\u010b\3"+
		"\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\7\34\2\2\u0113\u011a\3"+
		"\2\2\2\u0114\u011a\5*\26\2\u0115\u011a\5,\27\2\u0116\u011a\5.\30\2\u0117"+
		"\u011a\5\60\31\2\u0118\u011a\7O\2\2\u0119\u00f2\3\2\2\2\u0119\u00f4\3"+
		"\2\2\2\u0119\u00f5\3\2\2\2\u0119\u00f9\3\2\2\2\u0119\u0100\3\2\2\2\u0119"+
		"\u0104\3\2\2\2\u0119\u0108\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2"+
		"\2\2\u0119\u0116\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a"+
		"\u013f\3\2\2\2\u011b\u011c\f\24\2\2\u011c\u011d\7\"\2\2\u011d\u013e\5"+
		"&\24\25\u011e\u011f\f\23\2\2\u011f\u0120\7#\2\2\u0120\u013e\5&\24\24\u0121"+
		"\u0122\f\22\2\2\u0122\u0123\7!\2\2\u0123\u013e\5&\24\23\u0124\u0125\f"+
		"\16\2\2\u0125\u0126\7\37\2\2\u0126\u0127\5\"\22\2\u0127\u0128\7 \2\2\u0128"+
		"\u0129\5&\24\17\u0129\u013e\3\2\2\2\u012a\u012b\f\r\2\2\u012b\u012c\7"+
		"\65\2\2\u012c\u013e\5&\24\16\u012d\u012e\f\f\2\2\u012e\u012f\7\66\2\2"+
		"\u012f\u013e\5&\24\r\u0130\u0131\f\13\2\2\u0131\u0132\7\'\2\2\u0132\u013e"+
		"\5&\24\f\u0133\u0134\f\17\2\2\u0134\u0135\t\6\2\2\u0135\u013e\5\"\22\2"+
		"\u0136\u0137\f\3\2\2\u0137\u0138\7\37\2\2\u0138\u0139\5\"\22\2\u0139\u013a"+
		"\7 \2\2\u013a\u013b\5&\24\2\u013b\u013c\7\34\2\2\u013c\u013e\3\2\2\2\u013d"+
		"\u011b\3\2\2\2\u013d\u011e\3\2\2\2\u013d\u0121\3\2\2\2\u013d\u0124\3\2"+
		"\2\2\u013d\u012a\3\2\2\2\u013d\u012d\3\2\2\2\u013d\u0130\3\2\2\2\u013d"+
		"\u0133\3\2\2\2\u013d\u0136\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\'\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u014b"+
		"\7O\2\2\u0143\u0144\t\7\2\2\u0144\u0147\5\30\r\2\u0145\u0146\7&\2\2\u0146"+
		"\u0148\5\36\20\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u014a\3"+
		"\2\2\2\u0149\u0143\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c)\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7O\2\2\u014f"+
		"\u0150\7\35\2\2\u0150\u0151\5&\24\2\u0151\u0152\7\36\2\2\u0152+\3\2\2"+
		"\2\u0153\u0154\7O\2\2\u0154\u0155\7,\2\2\u0155\u0156\7\7\2\2\u0156\u0157"+
		"\5&\24\2\u0157\u0158\7\b\2\2\u0158\u0159\7.\2\2\u0159\u015a\5&\24\2\u015a"+
		"-\3\2\2\2\u015b\u015c\7\33\2\2\u015c\u015d\7\17\2\2\u015d\u015e\5\62\32"+
		"\2\u015e\u015f\7\34\2\2\u015f\u0160\7\33\2\2\u0160\u0161\5&\24\2\u0161"+
		"\u0162\7\37\2\2\u0162\u0163\5\"\22\2\u0163\u0164\7 \2\2\u0164\u0165\5"+
		"&\24\2\u0165\u0166\7\34\2\2\u0166/\3\2\2\2\u0167\u0169\7C\2\2\u0168\u016a"+
		"\5\20\t\2\u0169\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2"+
		"\u016b\u016c\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016e\7D\2\2\u016e\u016f"+
		"\5\30\r\2\u016f\61\3\2\2\2\u0170\u0175\7O\2\2\u0171\u0172\7%\2\2\u0172"+
		"\u0174\7O\2\2\u0173\u0171\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\63\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0179"+
		"\b\33\1\2\u0179\u017a\7\13\2\2\u017a\u0188\5\66\34\2\u017b\u017c\58\35"+
		"\2\u017c\u017d\t\b\2\2\u017d\u017e\58\35\2\u017e\u0188\3\2\2\2\u017f\u0188"+
		"\7\30\2\2\u0180\u0188\7\31\2\2\u0181\u0188\7O\2\2\u0182\u0188\5:\36\2"+
		"\u0183\u0184\7/\2\2\u0184\u0185\5\64\33\2\u0185\u0186\7\62\2\2\u0186\u0188"+
		"\3\2\2\2\u0187\u0178\3\2\2\2\u0187\u017b\3\2\2\2\u0187\u017f\3\2\2\2\u0187"+
		"\u0180\3\2\2\2\u0187\u0181\3\2\2\2\u0187\u0182\3\2\2\2\u0187\u0183\3\2"+
		"\2\2\u0188\u018e\3\2\2\2\u0189\u018a\f\b\2\2\u018a\u018b\t\t\2\2\u018b"+
		"\u018d\5\64\33\t\u018c\u0189\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3"+
		"\2\2\2\u018e\u018f\3\2\2\2\u018f\65\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0194\5\64\33\2\u0192\u0194\5 \21\2\u0193\u0191\3\2\2\2\u0193\u0192\3"+
		"\2\2\2\u0194\67\3\2\2\2\u0195\u0196\b\35\1\2\u0196\u0197\7\16\2\2\u0197"+
		"\u01a1\58\35\t\u0198\u0199\7\33\2\2\u0199\u019a\58\35\2\u019a\u019b\7"+
		"\34\2\2\u019b\u01a1\3\2\2\2\u019c\u01a1\5:\36\2\u019d\u01a1\7O\2\2\u019e"+
		"\u01a1\5\"\22\2\u019f\u01a1\5(\25\2\u01a0\u0195\3\2\2\2\u01a0\u0198\3"+
		"\2\2\2\u01a0\u019c\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a7\3\2\2\2\u01a2\u01a3\f\b\2\2\u01a3\u01a4\t\n"+
		"\2\2\u01a4\u01a6\58\35\t\u01a5\u01a2\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7"+
		"\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a89\3\2\2\2\u01a9\u01a7\3\2\2\2"+
		"\u01aa\u01ac\7M\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae;\3\2\2\2(?GTZaw\u0083\u0088\u008f\u0094"+
		"\u0099\u009e\u00a2\u00a5\u00ac\u00b3\u00be\u00c6\u00c8\u00d1\u00d9\u00db"+
		"\u00e7\u00ec\u010f\u0119\u013d\u013f\u0147\u014b\u016b\u0175\u0187\u018e"+
		"\u0193\u01a0\u01a7\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}