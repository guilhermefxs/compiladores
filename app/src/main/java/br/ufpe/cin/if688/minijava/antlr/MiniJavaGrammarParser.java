package br.ufpe.cin.if688.minijava.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LENGTH=1, DOT=2, AND=3, LESS_THAN=4, PLUS=5, MINUS=6, TIMES=7, NOT=8, 
		NEW=9, INTEGER=10, THIS=11, TRUE=12, FALSE=13, WHILE=14, IF=15, ELSE=16, 
		SISOUT=17, EQUALS=18, SEMICOLON=19, RETURN=20, COMMA=21, INT=22, INT_ARRAY=23, 
		BOOLEAN=24, EXTENDS=25, CLASS=26, OPEN_BLOCK=27, CLOSE_BLOCK=28, OPEN_PARENTESIS=29, 
		CLOSE_PARENTESIS=30, OPEN_BRACKET=31, CLOSE_BRACKET=32, PUBLIC=33, STATIC=34, 
		VOID=35, MAIN=36, STRING=37, IDENTIFIER=38, VALID_ID_START=39, VALID_ID_CHAR=40, 
		SLASH=41, COMMENT=42, MULTI_LINE_COMMENT=43, WS=44;
	public static final int
		RULE_program = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_parameterList = 5, RULE_statement = 6, 
		RULE_statementBlock = 7, RULE_ifStatement = 8, RULE_whileStatement = 9, 
		RULE_assignment = 10, RULE_print = 11, RULE_arrayAssignment = 12, RULE_expression = 13, 
		RULE_parentesis = 14, RULE_parameterListCall = 15, RULE_notExpression = 16, 
		RULE_objectInstatiation = 17, RULE_arrayInstatiation = 18, RULE_identifier = 19, 
		RULE_type = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
			"parameterList", "statement", "statementBlock", "ifStatement", "whileStatement", 
			"assignment", "print", "arrayAssignment", "expression", "parentesis", 
			"parameterListCall", "notExpression", "objectInstatiation", "arrayInstatiation", 
			"identifier", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'length'", "'.'", "'&&'", "'<'", "'+'", "'-'", "'*'", "'!'", "'new'", 
			null, "'this'", "'true'", "'false'", "'while'", "'if'", "'else'", "'System.out.println'", 
			"'='", "';'", "'return'", "','", "'int'", null, "'boolean'", "'extends'", 
			"'class'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'public'", "'static'", 
			"'void'", "'main'", "'String'", null, null, null, "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LENGTH", "DOT", "AND", "LESS_THAN", "PLUS", "MINUS", "TIMES", 
			"NOT", "NEW", "INTEGER", "THIS", "TRUE", "FALSE", "WHILE", "IF", "ELSE", 
			"SISOUT", "EQUALS", "SEMICOLON", "RETURN", "COMMA", "INT", "INT_ARRAY", 
			"BOOLEAN", "EXTENDS", "CLASS", "OPEN_BLOCK", "CLOSE_BLOCK", "OPEN_PARENTESIS", 
			"CLOSE_PARENTESIS", "OPEN_BRACKET", "CLOSE_BRACKET", "PUBLIC", "STATIC", 
			"VOID", "MAIN", "STRING", "IDENTIFIER", "VALID_ID_START", "VALID_ID_CHAR", 
			"SLASH", "COMMENT", "MULTI_LINE_COMMENT", "WS"
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
	public String getGrammarFileName() { return "MiniJavaGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			mainClass();
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(43);
				classDeclaration();
				}
				}
				setState(48);
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

	public static class MainClassContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaGrammarParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> OPEN_BLOCK() { return getTokens(MiniJavaGrammarParser.OPEN_BLOCK); }
		public TerminalNode OPEN_BLOCK(int i) {
			return getToken(MiniJavaGrammarParser.OPEN_BLOCK, i);
		}
		public TerminalNode PUBLIC() { return getToken(MiniJavaGrammarParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(MiniJavaGrammarParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(MiniJavaGrammarParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MiniJavaGrammarParser.MAIN, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public TerminalNode STRING() { return getToken(MiniJavaGrammarParser.STRING, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MiniJavaGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MiniJavaGrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public List<TerminalNode> CLOSE_BLOCK() { return getTokens(MiniJavaGrammarParser.CLOSE_BLOCK); }
		public TerminalNode CLOSE_BLOCK(int i) {
			return getToken(MiniJavaGrammarParser.CLOSE_BLOCK, i);
		}
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(CLASS);
			setState(50);
			identifier();
			setState(51);
			match(OPEN_BLOCK);
			setState(52);
			match(PUBLIC);
			setState(53);
			match(STATIC);
			setState(54);
			match(VOID);
			setState(55);
			match(MAIN);
			setState(56);
			match(OPEN_PARENTESIS);
			setState(57);
			match(STRING);
			setState(58);
			match(OPEN_BRACKET);
			setState(59);
			match(CLOSE_BRACKET);
			setState(60);
			identifier();
			setState(61);
			match(CLOSE_PARENTESIS);
			setState(62);
			match(OPEN_BLOCK);
			setState(63);
			statement();
			setState(64);
			match(CLOSE_BLOCK);
			setState(65);
			match(CLOSE_BLOCK);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(MiniJavaGrammarParser.CLASS, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OPEN_BLOCK() { return getToken(MiniJavaGrammarParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(MiniJavaGrammarParser.CLOSE_BLOCK, 0); }
		public TerminalNode EXTENDS() { return getToken(MiniJavaGrammarParser.EXTENDS, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(CLASS);
			setState(68);
			identifier();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				setState(69);
				match(EXTENDS);
				setState(70);
				identifier();
				}
			}

			setState(73);
			match(OPEN_BLOCK);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INT_ARRAY) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(74);
				varDeclaration();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUBLIC) {
				{
				{
				setState(80);
				methodDeclaration();
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(CLOSE_BLOCK);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			type();
			setState(89);
			identifier();
			setState(90);
			match(SEMICOLON);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MiniJavaGrammarParser.PUBLIC, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode OPEN_BLOCK() { return getToken(MiniJavaGrammarParser.OPEN_BLOCK, 0); }
		public TerminalNode RETURN() { return getToken(MiniJavaGrammarParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(MiniJavaGrammarParser.CLOSE_BLOCK, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(PUBLIC);
			setState(93);
			type();
			setState(94);
			identifier();
			setState(95);
			match(OPEN_PARENTESIS);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << INT_ARRAY) | (1L << BOOLEAN) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(96);
				parameterList();
				}
			}

			setState(99);
			match(CLOSE_PARENTESIS);
			setState(100);
			match(OPEN_BLOCK);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					varDeclaration();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SISOUT) | (1L << OPEN_BLOCK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(107);
				statement();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(RETURN);
			setState(114);
			expression(0);
			setState(115);
			match(SEMICOLON);
			setState(116);
			match(CLOSE_BLOCK);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaGrammarParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			type();
			setState(119);
			identifier();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(120);
				match(COMMA);
				setState(121);
				type();
				setState(122);
				identifier();
				}
				}
				setState(128);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				statementBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				arrayAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				print();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				ifStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(134);
				whileStatement();
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

	public static class StatementBlockContext extends ParserRuleContext {
		public TerminalNode OPEN_BLOCK() { return getToken(MiniJavaGrammarParser.OPEN_BLOCK, 0); }
		public TerminalNode CLOSE_BLOCK() { return getToken(MiniJavaGrammarParser.CLOSE_BLOCK, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(OPEN_BLOCK);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE) | (1L << IF) | (1L << SISOUT) | (1L << OPEN_BLOCK) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(138);
				statement();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(CLOSE_BLOCK);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniJavaGrammarParser.IF, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(MiniJavaGrammarParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(IF);
			setState(147);
			match(OPEN_PARENTESIS);
			setState(148);
			expression(0);
			setState(149);
			match(CLOSE_PARENTESIS);
			setState(150);
			statement();
			setState(151);
			match(ELSE);
			setState(152);
			statement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniJavaGrammarParser.WHILE, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(WHILE);
			setState(155);
			match(OPEN_PARENTESIS);
			setState(156);
			expression(0);
			setState(157);
			match(CLOSE_PARENTESIS);
			setState(158);
			statement();
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

	public static class AssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(MiniJavaGrammarParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			identifier();
			setState(161);
			match(EQUALS);
			setState(162);
			expression(0);
			setState(163);
			match(SEMICOLON);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode SISOUT() { return getToken(MiniJavaGrammarParser.SISOUT, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(SISOUT);
			setState(166);
			match(OPEN_PARENTESIS);
			setState(167);
			expression(0);
			setState(168);
			match(CLOSE_PARENTESIS);
			setState(169);
			match(SEMICOLON);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(MiniJavaGrammarParser.OPEN_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MiniJavaGrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQUALS() { return getToken(MiniJavaGrammarParser.EQUALS, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniJavaGrammarParser.SEMICOLON, 0); }
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			identifier();
			setState(172);
			match(OPEN_BRACKET);
			setState(173);
			expression(0);
			setState(174);
			match(CLOSE_BRACKET);
			setState(175);
			match(EQUALS);
			setState(176);
			expression(0);
			setState(177);
			match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(MiniJavaGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MiniJavaGrammarParser.FALSE, 0); }
		public TerminalNode INTEGER() { return getToken(MiniJavaGrammarParser.INTEGER, 0); }
		public TerminalNode THIS() { return getToken(MiniJavaGrammarParser.THIS, 0); }
		public NotExpressionContext notExpression() {
			return getRuleContext(NotExpressionContext.class,0);
		}
		public ObjectInstatiationContext objectInstatiation() {
			return getRuleContext(ObjectInstatiationContext.class,0);
		}
		public ArrayInstatiationContext arrayInstatiation() {
			return getRuleContext(ArrayInstatiationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParentesisContext parentesis() {
			return getRuleContext(ParentesisContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(MiniJavaGrammarParser.AND, 0); }
		public TerminalNode PLUS() { return getToken(MiniJavaGrammarParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniJavaGrammarParser.MINUS, 0); }
		public TerminalNode TIMES() { return getToken(MiniJavaGrammarParser.TIMES, 0); }
		public TerminalNode LESS_THAN() { return getToken(MiniJavaGrammarParser.LESS_THAN, 0); }
		public TerminalNode DOT() { return getToken(MiniJavaGrammarParser.DOT, 0); }
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public ParameterListCallContext parameterListCall() {
			return getRuleContext(ParameterListCallContext.class,0);
		}
		public TerminalNode LENGTH() { return getToken(MiniJavaGrammarParser.LENGTH, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MiniJavaGrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(MiniJavaGrammarParser.CLOSE_BRACKET, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(180);
				match(TRUE);
				}
				break;
			case 2:
				{
				setState(181);
				match(FALSE);
				}
				break;
			case 3:
				{
				setState(182);
				match(INTEGER);
				}
				break;
			case 4:
				{
				setState(183);
				match(THIS);
				}
				break;
			case 5:
				{
				setState(184);
				notExpression();
				}
				break;
			case 6:
				{
				setState(185);
				objectInstatiation();
				}
				break;
			case 7:
				{
				setState(186);
				arrayInstatiation();
				}
				break;
			case 8:
				{
				setState(187);
				identifier();
				}
				break;
			case 9:
				{
				setState(188);
				parentesis();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(211);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AND) | (1L << LESS_THAN) | (1L << PLUS) | (1L << MINUS) | (1L << TIMES))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(193);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(194);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(195);
						match(DOT);
						setState(196);
						identifier();
						setState(197);
						match(OPEN_PARENTESIS);
						setState(199);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << NEW) | (1L << INTEGER) | (1L << THIS) | (1L << TRUE) | (1L << FALSE) | (1L << OPEN_PARENTESIS) | (1L << IDENTIFIER))) != 0)) {
							{
							setState(198);
							parameterListCall();
							}
						}

						setState(201);
						match(CLOSE_PARENTESIS);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(204);
						match(DOT);
						setState(205);
						match(LENGTH);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(207);
						match(OPEN_BRACKET);
						setState(208);
						expression(0);
						setState(209);
						match(CLOSE_BRACKET);
						}
						break;
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class ParentesisContext extends ParserRuleContext {
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public ParentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterParentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitParentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitParentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParentesisContext parentesis() throws RecognitionException {
		ParentesisContext _localctx = new ParentesisContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(OPEN_PARENTESIS);
			setState(217);
			expression(0);
			setState(218);
			match(CLOSE_PARENTESIS);
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

	public static class ParameterListCallContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniJavaGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniJavaGrammarParser.COMMA, i);
		}
		public ParameterListCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterListCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterParameterListCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitParameterListCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitParameterListCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListCallContext parameterListCall() throws RecognitionException {
		ParameterListCallContext _localctx = new ParameterListCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_parameterListCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			expression(0);
			setState(225);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(221);
				match(COMMA);
				setState(222);
				expression(0);
				}
				}
				setState(227);
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

	public static class NotExpressionContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MiniJavaGrammarParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitNotExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitNotExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotExpressionContext notExpression() throws RecognitionException {
		NotExpressionContext _localctx = new NotExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_notExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(NOT);
			setState(229);
			expression(0);
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

	public static class ObjectInstatiationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(MiniJavaGrammarParser.NEW, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OPEN_PARENTESIS() { return getToken(MiniJavaGrammarParser.OPEN_PARENTESIS, 0); }
		public TerminalNode CLOSE_PARENTESIS() { return getToken(MiniJavaGrammarParser.CLOSE_PARENTESIS, 0); }
		public ObjectInstatiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectInstatiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterObjectInstatiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitObjectInstatiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitObjectInstatiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectInstatiationContext objectInstatiation() throws RecognitionException {
		ObjectInstatiationContext _localctx = new ObjectInstatiationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_objectInstatiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NEW);
			setState(232);
			identifier();
			setState(233);
			match(OPEN_PARENTESIS);
			setState(234);
			match(CLOSE_PARENTESIS);
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

	public static class ArrayInstatiationContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(MiniJavaGrammarParser.NEW, 0); }
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(MiniJavaGrammarParser.OPEN_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(MiniJavaGrammarParser.CLOSE_BRACKET, 0); }
		public ArrayInstatiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInstatiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterArrayInstatiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitArrayInstatiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitArrayInstatiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInstatiationContext arrayInstatiation() throws RecognitionException {
		ArrayInstatiationContext _localctx = new ArrayInstatiationContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayInstatiation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(NEW);
			setState(237);
			match(INT);
			setState(238);
			match(OPEN_BRACKET);
			setState(239);
			expression(0);
			setState(240);
			match(CLOSE_BRACKET);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(MiniJavaGrammarParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(IDENTIFIER);
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
		public TerminalNode INT() { return getToken(MiniJavaGrammarParser.INT, 0); }
		public TerminalNode INT_ARRAY() { return getToken(MiniJavaGrammarParser.INT_ARRAY, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniJavaGrammarParser.BOOLEAN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJavaGrammarListener) ((MiniJavaGrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJavaGrammarVisitor ) return ((MiniJavaGrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_type);
		try {
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(INT);
				}
				break;
			case INT_ARRAY:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(INT_ARRAY);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(BOOLEAN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				identifier();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00fd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\7\2/\n\2\f\2\16\2\62"+
		"\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\5\4J\n\4\3\4\3\4\7\4N\n\4\f\4\16\4Q\13\4\3\4"+
		"\7\4T\n\4\f\4\16\4W\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5"+
		"\6d\n\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\7\6o\n\6\f\6\16\6r\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\177\n\7\f\7\16\7\u0082"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\7\t\u008e\n\t\f\t"+
		"\16\t\u0091\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u00c0\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u00ca\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00d6"+
		"\n\17\f\17\16\17\u00d9\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u00e2"+
		"\n\21\f\21\16\21\u00e5\13\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\5\26\u00fb"+
		"\n\26\3\26\2\3\34\27\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*\2\3"+
		"\3\2\5\t\2\u0106\2,\3\2\2\2\4\63\3\2\2\2\6E\3\2\2\2\bZ\3\2\2\2\n^\3\2"+
		"\2\2\fx\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2\2\2\22\u0094\3\2\2\2\24"+
		"\u009c\3\2\2\2\26\u00a2\3\2\2\2\30\u00a7\3\2\2\2\32\u00ad\3\2\2\2\34\u00bf"+
		"\3\2\2\2\36\u00da\3\2\2\2 \u00de\3\2\2\2\"\u00e6\3\2\2\2$\u00e9\3\2\2"+
		"\2&\u00ee\3\2\2\2(\u00f4\3\2\2\2*\u00fa\3\2\2\2,\60\5\4\3\2-/\5\6\4\2"+
		".-\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3"+
		"\2\2\2\63\64\7\34\2\2\64\65\5(\25\2\65\66\7\35\2\2\66\67\7#\2\2\678\7"+
		"$\2\289\7%\2\29:\7&\2\2:;\7\37\2\2;<\7\'\2\2<=\7!\2\2=>\7\"\2\2>?\5(\25"+
		"\2?@\7 \2\2@A\7\35\2\2AB\5\16\b\2BC\7\36\2\2CD\7\36\2\2D\5\3\2\2\2EF\7"+
		"\34\2\2FI\5(\25\2GH\7\33\2\2HJ\5(\25\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2K"+
		"O\7\35\2\2LN\5\b\5\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PU\3\2\2\2"+
		"QO\3\2\2\2RT\5\n\6\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2"+
		"WU\3\2\2\2XY\7\36\2\2Y\7\3\2\2\2Z[\5*\26\2[\\\5(\25\2\\]\7\25\2\2]\t\3"+
		"\2\2\2^_\7#\2\2_`\5*\26\2`a\5(\25\2ac\7\37\2\2bd\5\f\7\2cb\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2ef\7 \2\2fj\7\35\2\2gi\5\b\5\2hg\3\2\2\2il\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2kp\3\2\2\2lj\3\2\2\2mo\5\16\b\2nm\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\26\2\2tu\5\34\17\2uv\7\25\2"+
		"\2vw\7\36\2\2w\13\3\2\2\2xy\5*\26\2y\u0080\5(\25\2z{\7\27\2\2{|\5*\26"+
		"\2|}\5(\25\2}\177\3\2\2\2~z\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\r\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u008a\5\20\t"+
		"\2\u0084\u008a\5\26\f\2\u0085\u008a\5\32\16\2\u0086\u008a\5\30\r\2\u0087"+
		"\u008a\5\22\n\2\u0088\u008a\5\24\13\2\u0089\u0083\3\2\2\2\u0089\u0084"+
		"\3\2\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\17\3\2\2\2\u008b\u008f\7\35\2\2\u008c\u008e\5\16"+
		"\b\2\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\36"+
		"\2\2\u0093\21\3\2\2\2\u0094\u0095\7\21\2\2\u0095\u0096\7\37\2\2\u0096"+
		"\u0097\5\34\17\2\u0097\u0098\7 \2\2\u0098\u0099\5\16\b\2\u0099\u009a\7"+
		"\22\2\2\u009a\u009b\5\16\b\2\u009b\23\3\2\2\2\u009c\u009d\7\20\2\2\u009d"+
		"\u009e\7\37\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\7 \2\2\u00a0\u00a1\5"+
		"\16\b\2\u00a1\25\3\2\2\2\u00a2\u00a3\5(\25\2\u00a3\u00a4\7\24\2\2\u00a4"+
		"\u00a5\5\34\17\2\u00a5\u00a6\7\25\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\23"+
		"\2\2\u00a8\u00a9\7\37\2\2\u00a9\u00aa\5\34\17\2\u00aa\u00ab\7 \2\2\u00ab"+
		"\u00ac\7\25\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\5(\25\2\u00ae\u00af\7!\2"+
		"\2\u00af\u00b0\5\34\17\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7\24\2\2\u00b2"+
		"\u00b3\5\34\17\2\u00b3\u00b4\7\25\2\2\u00b4\33\3\2\2\2\u00b5\u00b6\b\17"+
		"\1\2\u00b6\u00c0\7\16\2\2\u00b7\u00c0\7\17\2\2\u00b8\u00c0\7\f\2\2\u00b9"+
		"\u00c0\7\r\2\2\u00ba\u00c0\5\"\22\2\u00bb\u00c0\5$\23\2\u00bc\u00c0\5"+
		"&\24\2\u00bd\u00c0\5(\25\2\u00be\u00c0\5\36\20\2\u00bf\u00b5\3\2\2\2\u00bf"+
		"\u00b7\3\2\2\2\u00bf\u00b8\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2"+
		"\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00d7\3\2\2\2\u00c1\u00c2\f\5\2\2\u00c2\u00c3\t\2"+
		"\2\2\u00c3\u00d6\5\34\17\6\u00c4\u00c5\f\6\2\2\u00c5\u00c6\7\4\2\2\u00c6"+
		"\u00c7\5(\25\2\u00c7\u00c9\7\37\2\2\u00c8\u00ca\5 \21\2\u00c9\u00c8\3"+
		"\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\7 \2\2\u00cc"+
		"\u00d6\3\2\2\2\u00cd\u00ce\f\4\2\2\u00ce\u00cf\7\4\2\2\u00cf\u00d6\7\3"+
		"\2\2\u00d0\u00d1\f\3\2\2\u00d1\u00d2\7!\2\2\u00d2\u00d3\5\34\17\2\u00d3"+
		"\u00d4\7\"\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00c1\3\2\2\2\u00d5\u00c4\3\2"+
		"\2\2\u00d5\u00cd\3\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\35\3\2\2\2\u00d9\u00d7\3\2\2"+
		"\2\u00da\u00db\7\37\2\2\u00db\u00dc\5\34\17\2\u00dc\u00dd\7 \2\2\u00dd"+
		"\37\3\2\2\2\u00de\u00e3\5\34\17\2\u00df\u00e0\7\27\2\2\u00e0\u00e2\5\34"+
		"\17\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\n\2\2"+
		"\u00e7\u00e8\5\34\17\2\u00e8#\3\2\2\2\u00e9\u00ea\7\13\2\2\u00ea\u00eb"+
		"\5(\25\2\u00eb\u00ec\7\37\2\2\u00ec\u00ed\7 \2\2\u00ed%\3\2\2\2\u00ee"+
		"\u00ef\7\13\2\2\u00ef\u00f0\7\30\2\2\u00f0\u00f1\7!\2\2\u00f1\u00f2\5"+
		"\34\17\2\u00f2\u00f3\7\"\2\2\u00f3\'\3\2\2\2\u00f4\u00f5\7(\2\2\u00f5"+
		")\3\2\2\2\u00f6\u00fb\7\30\2\2\u00f7\u00fb\7\31\2\2\u00f8\u00fb\7\32\2"+
		"\2\u00f9\u00fb\5(\25\2\u00fa\u00f6\3\2\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb+\3\2\2\2\22\60IOUcjp\u0080\u0089\u008f"+
		"\u00bf\u00c9\u00d5\u00d7\u00e3\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}