package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MiniJavaGrammarParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MiniJavaGrammarParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(MiniJavaGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(MiniJavaGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MiniJavaGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MiniJavaGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignment(MiniJavaGrammarParser.ArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignment(MiniJavaGrammarParser.ArrayAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(MiniJavaGrammarParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parentesis}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(MiniJavaGrammarParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#parameterListCall}.
	 * @param ctx the parse tree
	 */
	void enterParameterListCall(MiniJavaGrammarParser.ParameterListCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#parameterListCall}.
	 * @param ctx the parse tree
	 */
	void exitParameterListCall(MiniJavaGrammarParser.ParameterListCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#notExpression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#objectInstatiation}.
	 * @param ctx the parse tree
	 */
	void enterObjectInstatiation(MiniJavaGrammarParser.ObjectInstatiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#objectInstatiation}.
	 * @param ctx the parse tree
	 */
	void exitObjectInstatiation(MiniJavaGrammarParser.ObjectInstatiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#arrayInstatiation}.
	 * @param ctx the parse tree
	 */
	void enterArrayInstatiation(MiniJavaGrammarParser.ArrayInstatiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#arrayInstatiation}.
	 * @param ctx the parse tree
	 */
	void exitArrayInstatiation(MiniJavaGrammarParser.ArrayInstatiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaGrammarParser.TypeContext ctx);
}