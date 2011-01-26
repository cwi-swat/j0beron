package j0beron2.ast.stat;

import j0beron2.ast.ASTNode;

public class Else extends ASTNode {
	private final Stats body;
	
	public Else(Stats body) {
		this.body = body;
	}


	public Stats getBody() {
		return body;
	}

}
