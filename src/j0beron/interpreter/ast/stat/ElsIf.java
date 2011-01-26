package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.expr.Expr;

public class ElsIf extends ASTNode {

	private final Expr cond;
	private final Stats body;

	public ElsIf(Expr cond, Stats body) {
		this.cond = cond;
		this.body = body;
	}

	public Expr getCond() {
		return cond;
	}
	
	public Stats getBody() {
		return body;
	}

}
