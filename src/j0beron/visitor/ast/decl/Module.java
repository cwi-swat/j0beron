package j0beron.visitor.ast.decl;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.ast.type.Ident;

public class Module extends ASTNode {

	private final Ident name;
	private final Decls decls;
	private final Body body;

	public Module(Ident name, Decls decls, Body body) {
		this.name = name;
		this.decls = decls;
		this.body = body;
	}
	
	public Body getBody() {
		return body;
	}
	
	public Decls getDecls() {
		return decls;
	}
	
	public Ident getName() {
		return name;
	}

}
