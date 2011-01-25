package j0beron.ast.decl;

import j0beron.ast.expr.Expr;
import j0beron.ast.type.Ident;

public class ConstDecl extends Decl {

	private final Ident ident;
	private final Expr init;

	public ConstDecl(Ident ident, Expr init) {
		this.ident = ident;
		this.init = init;
	}
	
	public Ident getIdent() {
		return ident;
	}
	
	public Expr getInit() {
		return init;
	}

}
