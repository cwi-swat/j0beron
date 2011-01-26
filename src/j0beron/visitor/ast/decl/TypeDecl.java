package j0beron.visitor.ast.decl;

import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.ast.type.Type;

public class TypeDecl extends Decl {

	private final Ident ident;
	private final Type type;

	public TypeDecl(Ident ident, Type type) {
		this.ident = ident;
		this.type = type;
	}
	
	public Ident getIdent() {
		return ident;
	}
	
	public Type getType() {
		return type;
	}

}
