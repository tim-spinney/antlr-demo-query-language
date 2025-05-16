// Generated from src/main/resources/Processor.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ProcessorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		StringLiteral=10, Types=11, Queries=12, VarName=13, TypeName=14, WS=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"StringLiteral", "Types", "Queries", "VarName", "TypeName", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'INCLUDE'", "';'", "'LOAD'", "'INTO'", "'AS'", "'RUN'", "'ON'", 
			"'SAVE'", "'TO'", null, "'TYPES'", "'QUERIES'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "StringLiteral", 
			"Types", "Queries", "VarName", "TypeName", "WS"
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


	public ProcessorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Processor.g4"; }

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
		"\u0004\u0000\u000fs\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tJ\b\t\n\t\f\tM\t\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0005\fa\b\f\n\f\f\fd\t\f\u0001\r\u0001\r"+
		"\u0005\rh\b\r\n\r\f\rk\t\r\u0001\u000e\u0004\u000en\b\u000e\u000b\u000e"+
		"\f\u000eo\u0001\u000e\u0001\u000e\u0001K\u0000\u000f\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u0001\u0000"+
		"\u0004\u0001\u0000az\u0002\u0000AZaz\u0001\u0000AZ\u0003\u0000\t\n\r\r"+
		"  w\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000"+
		"\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000"+
		"\u001d\u0001\u0000\u0000\u0000\u0001\u001f\u0001\u0000\u0000\u0000\u0003"+
		"\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000\u0007.\u0001"+
		"\u0000\u0000\u0000\t3\u0001\u0000\u0000\u0000\u000b6\u0001\u0000\u0000"+
		"\u0000\r:\u0001\u0000\u0000\u0000\u000f=\u0001\u0000\u0000\u0000\u0011"+
		"B\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015P\u0001"+
		"\u0000\u0000\u0000\u0017V\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000"+
		"\u0000\u001be\u0001\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001f"+
		" \u0005I\u0000\u0000 !\u0005N\u0000\u0000!\"\u0005C\u0000\u0000\"#\u0005"+
		"L\u0000\u0000#$\u0005U\u0000\u0000$%\u0005D\u0000\u0000%&\u0005E\u0000"+
		"\u0000&\u0002\u0001\u0000\u0000\u0000\'(\u0005;\u0000\u0000(\u0004\u0001"+
		"\u0000\u0000\u0000)*\u0005L\u0000\u0000*+\u0005O\u0000\u0000+,\u0005A"+
		"\u0000\u0000,-\u0005D\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005"+
		"I\u0000\u0000/0\u0005N\u0000\u000001\u0005T\u0000\u000012\u0005O\u0000"+
		"\u00002\b\u0001\u0000\u0000\u000034\u0005A\u0000\u000045\u0005S\u0000"+
		"\u00005\n\u0001\u0000\u0000\u000067\u0005R\u0000\u000078\u0005U\u0000"+
		"\u000089\u0005N\u0000\u00009\f\u0001\u0000\u0000\u0000:;\u0005O\u0000"+
		"\u0000;<\u0005N\u0000\u0000<\u000e\u0001\u0000\u0000\u0000=>\u0005S\u0000"+
		"\u0000>?\u0005A\u0000\u0000?@\u0005V\u0000\u0000@A\u0005E\u0000\u0000"+
		"A\u0010\u0001\u0000\u0000\u0000BC\u0005T\u0000\u0000CD\u0005O\u0000\u0000"+
		"D\u0012\u0001\u0000\u0000\u0000EK\u0005\"\u0000\u0000FJ\t\u0000\u0000"+
		"\u0000GH\u0005\\\u0000\u0000HJ\u0005\"\u0000\u0000IF\u0001\u0000\u0000"+
		"\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000NO\u0005\"\u0000\u0000O\u0014\u0001\u0000\u0000\u0000"+
		"PQ\u0005T\u0000\u0000QR\u0005Y\u0000\u0000RS\u0005P\u0000\u0000ST\u0005"+
		"E\u0000\u0000TU\u0005S\u0000\u0000U\u0016\u0001\u0000\u0000\u0000VW\u0005"+
		"Q\u0000\u0000WX\u0005U\u0000\u0000XY\u0005E\u0000\u0000YZ\u0005R\u0000"+
		"\u0000Z[\u0005I\u0000\u0000[\\\u0005E\u0000\u0000\\]\u0005S\u0000\u0000"+
		"]\u0018\u0001\u0000\u0000\u0000^b\u0007\u0000\u0000\u0000_a\u0007\u0001"+
		"\u0000\u0000`_\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000b`\u0001"+
		"\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000c\u001a\u0001\u0000\u0000"+
		"\u0000db\u0001\u0000\u0000\u0000ei\u0007\u0002\u0000\u0000fh\u0007\u0001"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u001c\u0001\u0000\u0000"+
		"\u0000ki\u0001\u0000\u0000\u0000ln\u0007\u0003\u0000\u0000ml\u0001\u0000"+
		"\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001"+
		"\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qr\u0006\u000e\u0000\u0000"+
		"r\u001e\u0001\u0000\u0000\u0000\u0006\u0000IKbio\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}