// Generated from src/main/resources/TypeDefs.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TypeDefsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, TypeName=6, FieldName=7, ReferenceModifier=8, 
		NullableModifier=9, WS=10;
	public static final int
		RULE_typeDefs = 0, RULE_typeDef = 1, RULE_fieldDef = 2, RULE_typeReference = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"typeDefs", "typeDef", "fieldDef", "typeReference"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'TYPE'", "'{'", "','", "'}'", "':'", null, null, "'&'", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "TypeName", "FieldName", "ReferenceModifier", 
			"NullableModifier", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TypeDefs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeDefsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefsContext extends ParserRuleContext {
		public List<TypeDefContext> typeDef() {
			return getRuleContexts(TypeDefContext.class);
		}
		public TypeDefContext typeDef(int i) {
			return getRuleContext(TypeDefContext.class,i);
		}
		public TypeDefsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).enterTypeDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).exitTypeDefs(this);
		}
	}

	public final TypeDefsContext typeDefs() throws RecognitionException {
		TypeDefsContext _localctx = new TypeDefsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_typeDefs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				typeDef();
				}
				}
				setState(11); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 );
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDefContext extends ParserRuleContext {
		public TerminalNode TypeName() { return getToken(TypeDefsParser.TypeName, 0); }
		public List<FieldDefContext> fieldDef() {
			return getRuleContexts(FieldDefContext.class);
		}
		public FieldDefContext fieldDef(int i) {
			return getRuleContext(FieldDefContext.class,i);
		}
		public TypeDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).enterTypeDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).exitTypeDef(this);
		}
	}

	public final TypeDefContext typeDef() throws RecognitionException {
		TypeDefContext _localctx = new TypeDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			match(T__0);
			setState(14);
			match(TypeName);
			setState(15);
			match(T__1);
			setState(16);
			fieldDef();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(17);
				match(T__2);
				setState(18);
				fieldDef();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FieldDefContext extends ParserRuleContext {
		public TerminalNode FieldName() { return getToken(TypeDefsParser.FieldName, 0); }
		public TypeReferenceContext typeReference() {
			return getRuleContext(TypeReferenceContext.class,0);
		}
		public FieldDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).enterFieldDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).exitFieldDef(this);
		}
	}

	public final FieldDefContext fieldDef() throws RecognitionException {
		FieldDefContext _localctx = new FieldDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fieldDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(FieldName);
			setState(27);
			match(T__4);
			setState(28);
			typeReference();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeReferenceContext extends ParserRuleContext {
		public TerminalNode TypeName() { return getToken(TypeDefsParser.TypeName, 0); }
		public TerminalNode ReferenceModifier() { return getToken(TypeDefsParser.ReferenceModifier, 0); }
		public TerminalNode NullableModifier() { return getToken(TypeDefsParser.NullableModifier, 0); }
		public TypeReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeReference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).enterTypeReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TypeDefsListener ) ((TypeDefsListener)listener).exitTypeReference(this);
		}
	}

	public final TypeReferenceContext typeReference() throws RecognitionException {
		TypeReferenceContext _localctx = new TypeReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeReference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(TypeName);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ReferenceModifier) {
				{
				setState(31);
				match(ReferenceModifier);
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NullableModifier) {
				{
				setState(34);
				match(NullableModifier);
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

	public static final String _serializedATN =
		"\u0004\u0001\n&\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0004\u0000\n\b"+
		"\u0000\u000b\u0000\f\u0000\u000b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0003\u0003!\b\u0003\u0001\u0003"+
		"\u0003\u0003$\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004"+
		"\u0006\u0000\u0000%\u0000\t\u0001\u0000\u0000\u0000\u0002\r\u0001\u0000"+
		"\u0000\u0000\u0004\u001a\u0001\u0000\u0000\u0000\u0006\u001e\u0001\u0000"+
		"\u0000\u0000\b\n\u0003\u0002\u0001\u0000\t\b\u0001\u0000\u0000\u0000\n"+
		"\u000b\u0001\u0000\u0000\u0000\u000b\t\u0001\u0000\u0000\u0000\u000b\f"+
		"\u0001\u0000\u0000\u0000\f\u0001\u0001\u0000\u0000\u0000\r\u000e\u0005"+
		"\u0001\u0000\u0000\u000e\u000f\u0005\u0006\u0000\u0000\u000f\u0010\u0005"+
		"\u0002\u0000\u0000\u0010\u0015\u0003\u0004\u0002\u0000\u0011\u0012\u0005"+
		"\u0003\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015\u0013\u0001"+
		"\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0018\u0001"+
		"\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u0004\u0000\u0000\u0019\u0003\u0001\u0000\u0000\u0000\u001a\u001b\u0005"+
		"\u0007\u0000\u0000\u001b\u001c\u0005\u0005\u0000\u0000\u001c\u001d\u0003"+
		"\u0006\u0003\u0000\u001d\u0005\u0001\u0000\u0000\u0000\u001e \u0005\u0006"+
		"\u0000\u0000\u001f!\u0005\b\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0005\t\u0000"+
		"\u0000#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0007\u0001"+
		"\u0000\u0000\u0000\u0004\u000b\u0015 #";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}