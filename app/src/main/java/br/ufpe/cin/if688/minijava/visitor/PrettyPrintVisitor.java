package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.*;

public class PrettyPrintVisitor implements IVisitor<Void> {

	private int numberOfTabs = 0;

	// MainClass m;
	// ClassDeclList cl;
	public Void visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			System.out.println();
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Void visit(MainClass n) {
		System.out.print("class ");
		n.i1.accept(this);
		System.out.println(" {");
		++numberOfTabs;
		printTabs();
		System.out.print("public static void main (String[] ");
		n.i2.accept(this);
		System.out.print(") {");
		++numberOfTabs;
		n.s.accept(this);
		System.out.println();
		--numberOfTabs;
		printTabs();
		System.out.println("}");
		--numberOfTabs;
		System.out.println("}");
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Void visit(ClassDeclSimple n) {
		System.out.print("class ");
		n.i.accept(this);
		System.out.print(" {");
		++numberOfTabs;
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		--numberOfTabs;
		System.out.println();
		System.out.println("}");
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Void visit(ClassDeclExtends n) {
		System.out.print("class ");
		n.i.accept(this);
		System.out.print(" extends ");
		n.j.accept(this);
		System.out.println(" { ");
		++numberOfTabs;
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		--numberOfTabs;
		System.out.println();
		System.out.println("}");
		return null;
	}

	// Type t;
	// Identifier i;
	public Void visit(VarDecl n) {
		System.out.println();
		printTabs();
		n.t.accept(this);
		System.out.print(" ");
		n.i.accept(this);
		System.out.print(";");
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Void visit(MethodDecl n) {
		System.out.println();
		printTabs();
		System.out.print("public ");
		n.t.accept(this);
		System.out.print(" ");
		n.i.accept(this);
		System.out.print("(");
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
			if (i + 1 < n.fl.size()) {
				System.out.print(", ");
			}
		}
		System.out.print(") {");
		++numberOfTabs;
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		System.out.println();
		printTabs();
		System.out.print("return ");
		n.e.accept(this);
		System.out.println(";");
		--numberOfTabs;
		printTabs();
		System.out.print("}");
		return null;
	}

	// Type t;
	// Identifier i;
	public Void visit(Formal n) {
		n.t.accept(this);
		System.out.print(" ");
		n.i.accept(this);
		return null;
	}

	public Void visit(IntArrayType n) {
		System.out.print("int[]");
		return null;
	}

	public Void visit(BooleanType n) {
		System.out.print("boolean");
		return null;
	}

	public Void visit(IntegerType n) {
		System.out.print("int");
		return null;
	}

	// String s;
	public Void visit(IdentifierType n) {
		System.out.print(n.s);
		return null;
	}

	// StatementList sl;
	public Void visit(Block n) {
		System.out.print("{");
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		System.out.println();
		--numberOfTabs;
		printTabs();
		++numberOfTabs;
		System.out.print("}");
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Void visit(If n) {
		System.out.println();
		printTabs();
		System.out.print("if (");
		n.e.accept(this);
		System.out.print(") ");
		++numberOfTabs;
		n.s1.accept(this);
		--numberOfTabs;
		System.out.println();
		printTabs();
		System.out.print("else ");
		++numberOfTabs;
		n.s2.accept(this);
		--numberOfTabs;
		return null;
	}

	// Exp e;
	// Statement s;
	public Void visit(While n) {
		System.out.println();
		printTabs();
		System.out.print("while (");
		n.e.accept(this);
		System.out.print(") ");
		++numberOfTabs;
		n.s.accept(this);
		--numberOfTabs;
		return null;
	}

	// Exp e;
	public Void visit(Print n) {
		System.out.println();
		printTabs();
		System.out.print("System.out.println(");
		n.e.accept(this);
		System.out.print(");");
		return null;
	}

	// Identifier i;
	// Exp e;
	public Void visit(Assign n) {
		System.out.println();
		printTabs();
		n.i.accept(this);
		System.out.print(" = ");
		n.e.accept(this);
		System.out.print(";");
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Void visit(ArrayAssign n) {
		System.out.println();
		printTabs();
		n.i.accept(this);
		System.out.print("[");
		n.e1.accept(this);
		System.out.print("] = ");
		n.e2.accept(this);
		System.out.print(";");
		return null;
	}

	// Exp e1,e2;
	public Void visit(And n) {
		System.out.print("(");
		n.e1.accept(this);
		System.out.print(" && ");
		n.e2.accept(this);
		System.out.print(")");
		return null;
	}

	// Exp e1,e2;
	public Void visit(LessThan n) {
		System.out.print("(");
		n.e1.accept(this);
		System.out.print(" < ");
		n.e2.accept(this);
		System.out.print(")");
		return null;
	}

	// Exp e1,e2;
	public Void visit(Plus n) {
		System.out.print("(");
		n.e1.accept(this);
		System.out.print(" + ");
		n.e2.accept(this);
		System.out.print(")");
		return null;
	}

	// Exp e1,e2;
	public Void visit(Minus n) {
		System.out.print("(");
		n.e1.accept(this);
		System.out.print(" - ");
		n.e2.accept(this);
		System.out.print(")");
		return null;
	}

	// Exp e1,e2;
	public Void visit(Times n) {
		System.out.print("(");
		n.e1.accept(this);
		System.out.print(" * ");
		n.e2.accept(this);
		System.out.print(")");
		return null;
	}

	// Exp e1,e2;
	public Void visit(ArrayLookup n) {
		n.e1.accept(this);
		System.out.print("[");
		n.e2.accept(this);
		System.out.print("]");
		return null;
	}

	// Exp e;
	public Void visit(ArrayLength n) {
		n.e.accept(this);
		System.out.print(".length");
		return null;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Void visit(Call n) {
		n.e.accept(this);
		System.out.print(".");
		n.i.accept(this);
		System.out.print("(");
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
			if (i + 1 < n.el.size()) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
		return null;
	}

	// int i;
	public Void visit(IntegerLiteral n) {
		System.out.print(n.i);
		return null;
	}

	public Void visit(True n) {
		System.out.print("true");
		return null;
	}

	public Void visit(False n) {
		System.out.print("false");
		return null;
	}

	// String s;
	public Void visit(IdentifierExp n) {
		System.out.print(n.s);
		return null;
	}

	public Void visit(This n) {
		System.out.print("this");
		return null;
	}

	// Exp e;
	public Void visit(NewArray n) {
		System.out.print("new int[");
		n.e.accept(this);
		System.out.print("]");
		return null;
	}

	// Identifier i;
	public Void visit(NewObject n) {
		System.out.print("new ");
		System.out.print(n.i.s);
		System.out.print("()");
		return null;
	}

	// Exp e;
	public Void visit(Not n) {
		System.out.print("!");
		n.e.accept(this);
		return null;
	}

	// String s;
	public Void visit(Identifier n) {
		System.out.print(n.s);
		return null;
	}

	private void printTabs() {
		for (int i = 0; i < numberOfTabs; ++i)
			System.out.print("    ");
	}
}