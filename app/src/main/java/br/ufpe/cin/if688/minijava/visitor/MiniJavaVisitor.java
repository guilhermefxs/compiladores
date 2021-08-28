package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.antlr.MiniJavaGrammarParser;
import br.ufpe.cin.if688.minijava.antlr.MiniJavaGrammarVisitor;
import br.ufpe.cin.if688.minijava.ast.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import static java.lang.Integer.parseInt;

public class MiniJavaVisitor implements MiniJavaGrammarVisitor<Program> {


    private Program currentProgram;
    private MainClass currentMain;
    private ClassDecl currentClass;
    private Identifier currentIdentifier;
    private String currentSymbol;
    private Type currentType;
    private MethodDecl currentMethod;
    private Exp currentExp;
    private Statement currentStatement;
    private ExpList currentExpList;
    private VarDecl currentVarDeclaration;

    @Override
    public Program visit(ParseTree parseTree) {
        parseTree.accept(this);
        return currentProgram;
    }


    @Override
    public Program visitChildren(RuleNode ruleNode) {
        System.out.println(ruleNode);
        return ruleNode.accept(this);
    }

    @Override
    public Program visitErrorNode(ErrorNode errorNode) {
        System.out.println(errorNode);
        return errorNode.accept(this);
    }

    @Override
    public Program visitTerminal(TerminalNode terminalNode) {
        currentSymbol = terminalNode.getSymbol().getText();
        return currentProgram;
    }

    @Override
    public Program visitProgram(MiniJavaGrammarParser.ProgramContext ctx) {
        ctx.mainClass().accept(this);
        MainClass mainClass = currentMain;

        ClassDeclList classDeclarationList = new ClassDeclList();

        currentProgram = new Program(mainClass, classDeclarationList);

        for (MiniJavaGrammarParser.ClassDeclarationContext classDeclarationCtx : ctx.classDeclaration()) {
            classDeclarationCtx.accept(this);
            classDeclarationList.addElement(currentClass);
        }

        return currentProgram;
    }

    @Override
    public Program visitMainClass(MiniJavaGrammarParser.MainClassContext ctx) {
        ctx.identifier(0).accept(this);
        Identifier className = currentIdentifier;

        ctx.identifier(1).accept(this);
        Identifier args = currentIdentifier;

        ctx.statement().accept(this);
        Statement mainStatement = currentStatement;

        currentMain = new MainClass(className, args, mainStatement);
        return currentProgram;
    }

    @Override
    public Program visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx) {
        MiniJavaGrammarParser.IdentifierContext classNameCtx = ctx.identifier(0);
        classNameCtx.accept(this);
        Identifier className = currentIdentifier;

        MiniJavaGrammarParser.IdentifierContext extendsClassNameCtx = ctx.identifier(1);
        boolean hasExtends = extendsClassNameCtx != null;

        VarDeclList varDeclList = new VarDeclList();
        MethodDeclList methodDeclList = new MethodDeclList();

        if (hasExtends) {
            extendsClassNameCtx.accept(this);
            Identifier extendsClassName = currentIdentifier;

            currentClass = new ClassDeclExtends(className, extendsClassName, varDeclList, methodDeclList);
        } else {
            currentClass = new ClassDeclSimple(className, varDeclList, methodDeclList);
        }

        for (MiniJavaGrammarParser.VarDeclarationContext varDeclarationContext : ctx.varDeclaration()) {
            varDeclarationContext.accept(this);
            varDeclList.addElement(currentVarDeclaration);
        }

        for (MiniJavaGrammarParser.MethodDeclarationContext methodDeclarationCtx : ctx.methodDeclaration()) {
            methodDeclarationCtx.accept(this);
            methodDeclList.addElement(currentMethod);
        }

        return currentProgram;
    }

    @Override
    public Program visitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx) {
        ctx.IDENTIFIER().accept(this);

        currentIdentifier = new Identifier(currentSymbol);

        return currentProgram;
    }

    @Override
    public Program visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx) {
        MiniJavaGrammarParser.TypeContext typeCtx = ctx.type();
        MiniJavaGrammarParser.IdentifierContext indentifierCtx = ctx.identifier();

        indentifierCtx.accept(this);
        Identifier variableIdentifier = currentIdentifier;

        typeCtx.accept(this);
        Type variableType = currentType;


        VarDecl varDeclaration = new VarDecl(variableType, variableIdentifier);

        currentVarDeclaration = varDeclaration;

        return currentProgram;
    }

    @Override
    public Program visitType(MiniJavaGrammarParser.TypeContext ctx) {
        if (ctx.BOOLEAN() != null) {
            currentType = new BooleanType();
        } else if (ctx.INT() != null) {
            currentType = new IntegerType();
        } else if (ctx.INT_ARRAY() != null) {
            currentType = new IntArrayType();
        } else {
            ctx.identifier().accept(this);
            currentType = new IdentifierType(currentIdentifier.s);
        }
        return currentProgram;
    }

    @Override
    public Program visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        ctx.type().accept(this);
        Type returnType = currentType;

        ctx.identifier().accept(this);
        Identifier name = currentIdentifier;

        ctx.expression().accept(this);
        Exp returnExp = currentExp;

        FormalList formalList = new FormalList();
        VarDeclList varDeclList = new VarDeclList();
        StatementList statementList = new StatementList();

        currentMethod = new MethodDecl(
                returnType,
                name,
                formalList,
                varDeclList,
                statementList,
                returnExp
        );

        if (ctx.parameterList() != null) {
            ctx.parameterList().accept(this);
        }

        for (MiniJavaGrammarParser.VarDeclarationContext varDeclCtx : ctx.varDeclaration()) {
            varDeclCtx.accept(this);
            varDeclList.addElement(currentVarDeclaration);
        }

        for (MiniJavaGrammarParser.StatementContext stmCtx : ctx.statement()) {
            stmCtx.accept(this);
            statementList.addElement(currentStatement);
        }

        return currentProgram;
    }


    @Override
    public Program visitParameterList(MiniJavaGrammarParser.ParameterListContext ctx) {

        for (int i = 0; i < ctx.type().size(); i++) {
            ctx.type(i).accept(this);
            Type parameterType = currentType;

            ctx.identifier(i).accept(this);
            Identifier parameterIdentifier = currentIdentifier;

            Formal formal = new Formal(parameterType, parameterIdentifier);

            currentMethod.fl.addElement(formal);
        }

        return currentProgram;
    }

    @Override
    public Program visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        MiniJavaGrammarParser.NotExpressionContext notExpression = ctx.notExpression();
        MiniJavaGrammarParser.ObjectInstatiationContext objInstatiation = ctx.objectInstatiation();
        MiniJavaGrammarParser.ArrayInstatiationContext arrayInstatiation = ctx.arrayInstatiation();
        MiniJavaGrammarParser.ParentesisContext parentesisContext = ctx.parentesis();

        if (ctx.TRUE() != null) {
            currentExp = new True();
        } else if (ctx.FALSE() != null) {
            currentExp = new False();
        } else if (ctx.THIS() != null) {
            currentExp = new This();
        } else if (ctx.INTEGER() != null) {
            ctx.INTEGER().accept(this);
            currentExp = new IntegerLiteral(parseInt(currentSymbol));
        } else if (ctx.identifier() != null && ctx.DOT() == null) {
            ctx.identifier().accept(this);
            currentExp = new IdentifierExp(currentIdentifier.toString());
        } else if (notExpression != null) {
            notExpression.accept(this);
        } else if (objInstatiation != null) {
            objInstatiation.accept(this);
        } else if (arrayInstatiation != null) {
            arrayInstatiation.accept(this);
        } else if (parentesisContext != null) {
            parentesisContext.accept(this);
        } else if (ctx.LENGTH() != null) {
            // array length
            ctx.expression(0).accept(this);

            currentExp = new ArrayLength(currentExp);
        } else if (ctx.OPEN_BRACKET() != null && ctx.CLOSE_BRACKET() != null) {
            // array lookup
            ctx.expression(0).accept(this);
            Exp array = currentExp;
            ctx.expression(1).accept(this);
            Exp index = currentExp;

            currentExp = new ArrayLookup(array, index);
        } else if (ctx.OPEN_PARENTESIS() !=  null && ctx.CLOSE_PARENTESIS() != null) {
            // method call

            ctx.expression(0).accept(this);
            Exp leftExp = currentExp;

            ctx.identifier().accept(this);
            Identifier methodName = currentIdentifier;

            if (ctx.parameterListCall() != null) {
                ctx.parameterListCall().accept(this);
            } else {
                currentExpList = new ExpList();
            }

            currentExp = new Call(leftExp, methodName, currentExpList);

        } else {
            // operation

            ctx.expression(0).accept(this);
            Exp left = currentExp;

            ctx.expression(1).accept(this);
            Exp right = currentExp;

            if (ctx.PLUS() != null) {
                currentExp = new Plus(left, right);
            } else if (ctx.MINUS() != null) {
                currentExp = new Minus(left, right);
            } else if (ctx.TIMES() != null) {
                currentExp = new Times(left, right);
            } else if (ctx.LESS_THAN() != null) {
                currentExp = new LessThan(left, right);
            } else if (ctx.AND() != null) {
                currentExp = new And(left, right);
            }
        }

        return currentProgram;
    }



    @Override
    public Program visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if (ctx.assignment() != null) {
            ctx.assignment().accept(this);
        } else if (ctx.arrayAssignment() != null) {
            ctx.arrayAssignment().accept(this);
        } else if (ctx.ifStatement() != null) {
            ctx.ifStatement().accept(this);
        } else if (ctx.statementBlock() != null) {
            ctx.statementBlock().accept(this);
        } else if (ctx.print() != null) {
            ctx.print().accept(this);
        } else if (ctx.whileStatement() != null) {
            ctx.whileStatement().accept(this);
        }

        return currentProgram;
    }

    @Override
    public Program visitNotExpression(MiniJavaGrammarParser.NotExpressionContext ctx) {
        ctx.expression().accept(this);

        currentExp = new Not(currentExp);
        return currentProgram;
    }


    @Override
    public Program visitObjectInstatiation(MiniJavaGrammarParser.ObjectInstatiationContext ctx) {
        ctx.identifier().accept(this);
        Identifier objClass = currentIdentifier;

        currentExp = new NewObject(objClass);

        return currentProgram;
    }


    @Override
    public Program visitArrayInstatiation(MiniJavaGrammarParser.ArrayInstatiationContext ctx) {
        ctx.expression().accept(this);
        Exp index = currentExp;

        currentExp = new NewArray(index);

        return currentProgram;
    }

    @Override
    public Program visitParentesis(MiniJavaGrammarParser.ParentesisContext ctx) {
        ctx.expression().accept(this);

        return currentProgram;
    }

    @Override
    public Program visitParameterListCall(MiniJavaGrammarParser.ParameterListCallContext ctx) {
        ExpList parameterList = new ExpList();


        for (MiniJavaGrammarParser.ExpressionContext parameterCtx : ctx.expression()) {
            parameterCtx.accept(this);

            parameterList.addElement(currentExp);
        }

        currentExpList = parameterList;

        return currentProgram;
    }



    @Override
    public Program visitAssignment(MiniJavaGrammarParser.AssignmentContext ctx) {
        ctx.identifier().accept(this);
        Identifier variableIdentifier = currentIdentifier;

        ctx.expression().accept(this);
        Exp assignmentExp = currentExp;


        Assign assignment = new Assign(variableIdentifier, assignmentExp);
        currentStatement = assignment;

        return currentProgram;
    }


    @Override
    public Program visitArrayAssignment(MiniJavaGrammarParser.ArrayAssignmentContext ctx) {
        ctx.identifier().accept(this);
        Identifier arrayName = currentIdentifier;

        ctx.expression(0).accept(this);
        Exp index = currentExp;

        ctx.expression(1).accept(this);
        Exp value = currentExp;

        currentStatement = new ArrayAssign(arrayName, index, value);

        return currentProgram;
    }


    @Override
    public Program visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx) {
        ctx.expression().accept(this);
        Exp condition =  currentExp;

        ctx.statement(0).accept(this);
        Statement mainStm = currentStatement;

        ctx.statement(1).accept(this);
        Statement elseStm = currentStatement;

        currentStatement = new If(condition, mainStm, elseStm);

        return currentProgram;
    }


    @Override
    public Program visitPrint(MiniJavaGrammarParser.PrintContext ctx) {
        ctx.expression().accept(this);
        Exp value = currentExp;

        currentStatement = new Print(value);

        return currentProgram;
    }

    @Override
    public Program visitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx) {
        StatementList stmList = new StatementList();

        for (MiniJavaGrammarParser.StatementContext stmCtx : ctx.statement()) {
            stmCtx.accept(this);
            stmList.addElement(currentStatement);
        }


        currentStatement = new Block(stmList);

        return currentProgram;
    }

    @Override
    public Program visitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx) {
        ctx.expression().accept(this);
        Exp condition = currentExp;

        ctx.statement().accept(this);
        Statement code = currentStatement;

        currentStatement = new While(condition, code);

        return currentProgram;
    }
}