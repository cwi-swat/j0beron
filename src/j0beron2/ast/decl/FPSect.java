package j0beron2.ast.decl;

import j0beron2.ast.ASTNode;
import j0beron2.ast.type.Idents;
import j0beron2.ast.type.Type;

public class FPSect extends ASTNode  {

	private final boolean isVar;
	private final Idents idents;
	private final Type type;

	public FPSect(boolean b, Idents idents, Type type) {
		this.isVar = b;
		this.idents = idents;
		this.type = type;
	}

	public Idents getIdents() {
		return idents;
	}

	public Type getType() {
		return type;
	}
	
	public boolean isVar() {
		return isVar;
	}
}
