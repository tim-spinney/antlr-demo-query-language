// Generated from src/main/resources/Queries.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class QueriesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, Mult=6, Div=7, Add=8, Sub=9, Mod=10, 
		And=11, Or=12, Not=13, Comparator=14, IntLiteral=15, VarName=16, TypeName=17, 
		WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "Mult", "Div", "Add", "Sub", 
			"Mod", "And", "Or", "Not", "Comparator", "IntLiteral", "VarName", "TypeName", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'QUERY'", "':'", "';'", "'WHERE'", "'.'", "'*'", "'/'", "'+'", 
			"'-'", "'%'", "'AND'", "'OR'", "'NOT'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "Mult", "Div", "Add", "Sub", "Mod", 
			"And", "Or", "Not", "Comparator", "IntLiteral", "VarName", "TypeName", 
			"WS"
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


	public QueriesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Queries.g4"; }

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
		"\u0004\u0000\u0012t\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\rV\b"+
		"\r\u0001\u000e\u0003\u000eY\b\u000e\u0001\u000e\u0004\u000e\\\b\u000e"+
		"\u000b\u000e\f\u000e]\u0001\u000f\u0001\u000f\u0005\u000fb\b\u000f\n\u000f"+
		"\f\u000fe\t\u000f\u0001\u0010\u0001\u0010\u0005\u0010i\b\u0010\n\u0010"+
		"\f\u0010l\t\u0010\u0001\u0011\u0004\u0011o\b\u0011\u000b\u0011\f\u0011"+
		"p\u0001\u0011\u0001\u0011\u0000\u0000\u0012\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012\u0001\u0000\u0007\u0002\u0000<<>>\u0001\u0000--\u0001\u000009"+
		"\u0001\u0000az\u0002\u0000AZaz\u0001\u0000AZ\u0003\u0000\t\n\r\r  |\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u0007"+
		"/\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b7\u0001\u0000"+
		"\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f;\u0001\u0000\u0000\u0000"+
		"\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001\u0000\u0000\u0000\u0015A"+
		"\u0001\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019H\u0001\u0000"+
		"\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000"+
		"\u001f_\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#n\u0001\u0000"+
		"\u0000\u0000%&\u0005Q\u0000\u0000&\'\u0005U\u0000\u0000\'(\u0005E\u0000"+
		"\u0000()\u0005R\u0000\u0000)*\u0005Y\u0000\u0000*\u0002\u0001\u0000\u0000"+
		"\u0000+,\u0005:\u0000\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005;\u0000"+
		"\u0000.\u0006\u0001\u0000\u0000\u0000/0\u0005W\u0000\u000001\u0005H\u0000"+
		"\u000012\u0005E\u0000\u000023\u0005R\u0000\u000034\u0005E\u0000\u0000"+
		"4\b\u0001\u0000\u0000\u000056\u0005.\u0000\u00006\n\u0001\u0000\u0000"+
		"\u000078\u0005*\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005/\u0000"+
		"\u0000:\u000e\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000<\u0010\u0001"+
		"\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0012\u0001\u0000\u0000\u0000"+
		"?@\u0005%\u0000\u0000@\u0014\u0001\u0000\u0000\u0000AB\u0005A\u0000\u0000"+
		"BC\u0005N\u0000\u0000CD\u0005D\u0000\u0000D\u0016\u0001\u0000\u0000\u0000"+
		"EF\u0005O\u0000\u0000FG\u0005R\u0000\u0000G\u0018\u0001\u0000\u0000\u0000"+
		"HI\u0005N\u0000\u0000IJ\u0005O\u0000\u0000JK\u0005T\u0000\u0000K\u001a"+
		"\u0001\u0000\u0000\u0000LM\u0005=\u0000\u0000MV\u0005=\u0000\u0000NO\u0005"+
		"<\u0000\u0000OV\u0005>\u0000\u0000PV\u0007\u0000\u0000\u0000QR\u0005>"+
		"\u0000\u0000RV\u0005=\u0000\u0000ST\u0005<\u0000\u0000TV\u0005=\u0000"+
		"\u0000UL\u0001\u0000\u0000\u0000UN\u0001\u0000\u0000\u0000UP\u0001\u0000"+
		"\u0000\u0000UQ\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000V\u001c"+
		"\u0001\u0000\u0000\u0000WY\u0007\u0001\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000Z\\\u0007\u0002"+
		"\u0000\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^\u001e\u0001\u0000\u0000"+
		"\u0000_c\u0007\u0003\u0000\u0000`b\u0007\u0004\u0000\u0000a`\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d \u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fj\u0007\u0005\u0000\u0000gi\u0007\u0004\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000il\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000"+
		"\u0000\u0000k\"\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000mo\u0007"+
		"\u0006\u0000\u0000nm\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000"+
		"\u0000rs\u0006\u0011\u0000\u0000s$\u0001\u0000\u0000\u0000\u0007\u0000"+
		"UX]cjp\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}