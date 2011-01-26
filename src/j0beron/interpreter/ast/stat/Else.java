package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.ASTNode;

public class Else extends ASTNode {
	private final Stats body;
	
	public Else(Stats body) {
		this.body = body;
	}


	public Stats getBody() {
		return body;
	}

}
