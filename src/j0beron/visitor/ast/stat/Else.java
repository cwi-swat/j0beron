package j0beron.visitor.ast.stat;

import j0beron.visitor.ast.ASTNode;

public class Else extends ASTNode {
	private final Stats body;
	
	public Else(Stats body) {
		this.body = body;
	}


	public Stats getBody() {
		return body;
	}

}
