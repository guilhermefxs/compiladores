package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.exceptions.PrintException;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.symboltable.Variable;


public class TypeCheckVisitor implements IVisitor<Type> {
    private static Type BOOLEAN = new BooleanType();
    private static Type INTEGERARRAYTYPE = new IntArrayType();
    private static Type INTEGER = new IntegerType();
    private SymbolTable symbolTable;
	private Class currentClass;
	private Method currentMethod;
	private String main;
	private boolean terminateUponError;
    private PrintException error;
    public TypeCheckVisitor(SymbolTable st) {
        this.symbolTable = st;
		this.terminateUponError = false;
    }

    // MainClass m;
    // ClassDeclList cl;
    public Type visit(Program n) {
        n.m.accept(this);
        for (int i = 0; i < n.cl.size(); i++) {
            n.cl.elementAt(i).accept(this);
        }
        return null;
    }

    // Identifier i1,i2;
    // Statement s;
    public Type visit(MainClass n) {
        main = n.i1.s;
		currentClass = symbolTable.getClass(n.i1.s);
		n.s.accept(this);
		currentClass = null;
		return null;
    }

    // Identifier i;
    // VarDeclList vl;
    // MethodDeclList ml;
    public Type visit(ClassDeclSimple n) {
        currentClass = symbolTable.getClass(n.i.s);
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
    }

    // Identifier i;
    // Identifier j;
    // VarDeclList vl;
    // MethodDeclList ml;
    public Type visit(ClassDeclExtends n) {
        currentClass = symbolTable.getClass(n.i.toString());

        n.i.accept(this);
        n.j.accept(this);
        for (int i = 0; i < n.vl.size(); i++) {
            n.vl.elementAt(i).accept(this);
        }
        for (int i = 0; i < n.ml.size(); i++) {
            n.ml.elementAt(i).accept(this);
        }

        // Resetting current class
        currentClass = null;

        return null;
    }

    // Type t;
    // Identifier i;
    public Type visit(VarDecl n) {
        return n.t;
    }

    // Type t;
    // Identifier i;
    // FormalList fl;
    // VarDeclList vl;
    // StatementList sl;
    // Exp e;
    public Type visit(MethodDecl n) {
        currentMethod = currentClass.getMethod(n.i.s);
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		
		Type t = n.e.accept(this);
		if (!symbolTable.compareTypes(t, currentMethod.type())) {
			error.typeMatch(t, currentMethod.type());
		}
		
		currentMethod = null;
		return n.t;
    }

    // Type t;
    // Identifier i;
    public Type visit(Formal n) {
        return n.t;
    }

    public Type visit(IntArrayType n) {
        return n;
    }

    public Type visit(BooleanType n) {
        return n;
    }

    public Type visit(IntegerType n) {
        return n;
    }

    // String s;
    public Type visit(IdentifierType n) {
        return n;
    }

    // StatementList sl;
    public Type visit(Block n) {
        for (int i = 0; i < n.sl.size(); i++) {
            n.sl.elementAt(i).accept(this);
        }
        return null;
    }

    // Exp e;
    // Statement s1,s2;
    public Type visit(If n) {
        if (!(n.e.accept(this) instanceof BooleanType)) {
			error.typeMatch(BOOLEAN, n.e.accept(this));
		}
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
    }

    // Exp e;
    // Statement s;
    public Type visit(While n) {
        if (!(n.e.accept(this) instanceof BooleanType)) {
			error.typeMatch(BOOLEAN, n.e.accept(this));
		}
		n.s.accept(this);
		return null;
    }

    // Exp e;
    public Type visit(Print n) {
        n.e.accept(this);
        return null;
    }

    // Identifier i;
    // Exp e;
    public Type visit(Assign n) {
        Type t1 = n.i.accept(this);
		Type t2 = n.e.accept(this);
		if(!symbolTable.compareTypes(t1, t2)) {
            error.typeMatch(t1, t2);
		}
		return null;
    }

    private void arrayCheck(Exp e , Object n) {
		Type t = e.accept(this);
		if(!(t instanceof IntArrayType)) {
            error.typeMatch(INTEGERARRAYTYPE, t);
		}
	}
	
	private BooleanType boolCheck(Exp e, Object n) {
		Type t = e.accept(this);
		if(!(t instanceof BooleanType)) {
            error.typeMatch(BOOLEAN, t);
			return new BooleanType();
		}
		return (BooleanType) t;
	}
	
	private IntegerType intCheck(Exp e , Object n) {
		Type t = e.accept(this);
		if(!(t instanceof IntegerType)) {
			error.typeMatch(INTEGER, t);
			return new IntegerType();
		}
		return (IntegerType) t;
	}

    // Identifier i;
    // Exp e1,e2;
    public Type visit(ArrayAssign n) {
        arrayCheck(new IdentifierExp(n.i.s), n);
		intCheck(n.e1, n);
		intCheck(n.e2, n);
		return null;
    }

    // Exp e1,e2;
    public Type visit(And n) {
        boolCheck(n.e1, n);
		return boolCheck(n.e2, n);
    }

    // Exp e1,e2;
    public Type visit(LessThan n) {
        intCheck(n.e1, n);
		intCheck(n.e2, n);
		return new BooleanType();
    }

    // Exp e1,e2;
    public Type visit(Plus n) {
        intCheck(n.e1, n);
		return intCheck(n.e2, n);
    }

    // Exp e1,e2;
    public Type visit(Minus n) {
        intCheck(n.e1, n);
		return intCheck(n.e2, n);
    }

    // Exp e1,e2;
    public Type visit(Times n) {
        intCheck(n.e1, n);
		return intCheck(n.e2, n);
    }

    // Exp e1,e2;
    public Type visit(ArrayLookup n) {
        arrayCheck(n.e1, n);
		return intCheck(n.e2, n);
    }

    // Exp e;
    public Type visit(ArrayLength n) {
        arrayCheck(n.e, n);
		return new IntegerType();
    }

    // Exp e;
    // Identifier i;
    // ExpList el;
    public Type visit(Call n) {
        IdentifierType classType = null;
		Type t = n.e.accept(this);
		if(!(t instanceof IdentifierType)) {
            error.methodDeclarationOutsideOfClass(t.getClass().getSimpleName());
		} else {
			classType = (IdentifierType) t;
		}
		Method m = symbolTable.getMethod(n.i.s, classType.s);
		
		int i;
		for (i = 0; i < n.el.size(); i++) {
			Variable v = m.getParamAt(i);
			if (v == null) {
				error.tooManyArguments(m.getId());
				return m.type();
			}
			
			Type argType = n.el.elementAt(i).accept(this);
			if (!symbolTable.compareTypes(v.type(), argType)) {
                error.typeMatch(argType, v.type());
			}
		}
		if (m.getParamAt(i) != null) {
            error.tooFewArguments(m.getId());
		}
		
		return m.type();
    }

    // int i;
    public Type visit(IntegerLiteral n) {
        return new IntegerType();
    }

    public Type visit(True n) {
        return new BooleanType();
    }

    public Type visit(False n) {
        return new BooleanType();
    }

    // String s;
    public Type visit(IdentifierExp n) {
        return symbolTable.getVarType(currentMethod, currentClass, n.s);
    }

    public Type visit(This n) {
        try {
			return new IdentifierType(currentClass.getId());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.exit(0);
		return null;
    }

    // Exp e;
    public Type visit(NewArray n) {
        intCheck(n.e, n);
		return new IntArrayType();
    }

    // Identifier i;
    public Type visit(NewObject n) {
        return new IdentifierType(n.i.s);   
    }

    // Exp e;
    public Type visit(Not n) {
        boolCheck(n.e, n);
		return new BooleanType();
    }

    // String s;
    public Type visit(Identifier n) {
        String id = n.toString();
        Variable v = currentMethod.getParam(id);
        if (v == null) v = currentMethod.getVar(id);
        if (v == null) v = currentClass.getVar(id);
        if (v == null) error.idNotFound(id);
        else return symbolTable.getVarType(currentMethod, currentClass, n.s);

        return null;
    }
}
