package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.*;

public interface IVisitor<T> {
	public T visit(Program n);

	public T visit(MainClass n);

	public T visit(ClassDeclSimple n);

	public T visit(ClassDeclExtends n);

	public T visit(VarDecl n);

	public T visit(MethodDecl n);

	public T visit(Formal n);

	public T visit(IntArrayType n);

	public T visit(BooleanType n);

	public T visit(IntegerType n);

	public T visit(IdentifierType n);

	public T visit(Block n);

	public T visit(If n);

	public T visit(While n);

	public T visit(Print n);

	public T visit(Assign n);

	public T visit(ArrayAssign n);

	public T visit(And n);

	public T visit(LessThan n);

	public T visit(Plus n);

	public T visit(Minus n);

	public T visit(Times n);

	public T visit(ArrayLookup n);

	public T visit(ArrayLength n);

	public T visit(Call n);

	public T visit(IntegerLiteral n);

	public T visit(True n);

	public T visit(False n);

	public T visit(IdentifierExp n);

	public T visit(This n);

	public T visit(NewArray n);

	public T visit(NewObject n);

	public T visit(Not n);

	public T visit(Identifier n);
}
