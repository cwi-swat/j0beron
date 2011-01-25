package j0beron.ast.decl;

import j0beron.ast.ASTNode;
import j0beron.ast.type.Ident;

public class Proc extends ASTNode {

	private final Ident name;
	private final Formals formals;
	private final Decls decls;
	private final Body body;

	public Proc(Ident name, Formals formals, Decls decls, Body body) {
		this.name = name;
		this.formals = formals;
		this.decls = decls;
		this.body = body;
	}
	
	public Body getBody() {
		return body;
	}
	
	public Decls getDecls() {
		return decls;
	}
	
	public Formals getFormals() {
		return formals;
	}
	
	public Ident getName() {
		return name;
	}
	

}
