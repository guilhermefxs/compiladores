package br.ufpe.cin.if688.minijava.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniJavaGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(MiniJavaGrammarParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(MiniJavaGrammarParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MiniJavaGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(MiniJavaGrammarParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentesis(MiniJavaGrammarParser.ParentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#parameterListCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterListCall(MiniJavaGrammarParser.ParameterListCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#notExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MiniJavaGrammarParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#objectInstatiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectInstatiation(MiniJavaGrammarParser.ObjectInstatiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#arrayInstatiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInstatiation(MiniJavaGrammarParser.ArrayInstatiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaGrammarParser.TypeContext ctx);
}