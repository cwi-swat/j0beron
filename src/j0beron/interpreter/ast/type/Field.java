package j0beron.interpreter.ast.type;

import j0beron.interpreter.ast.ASTNode;

public class Field extends ASTNode {

	private final Idents idents;
	private final Type type;

	public Field(Idents idents, Type type) {
		this.idents = idents;
		this.type = type;
	}
	
	public Idents getIdents() {
		return idents;
	}
	public Type getType() {
		return type;
	}

}
