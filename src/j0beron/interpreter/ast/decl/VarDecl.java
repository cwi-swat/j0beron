package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.type.Idents;
import j0beron.interpreter.ast.type.Type;

public class VarDecl extends Decl {

	private final Idents idents;
	private final Type type;

	public VarDecl(Idents idents, Type type) {
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
