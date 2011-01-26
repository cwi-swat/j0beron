package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;

public class ElsIf extends ASTNode {

	private final Expr cond;
	private final Stats body;

	public ElsIf(Expr cond, Stats body) {
		this.cond = cond;
		this.body = body;
	}

	public boolean eval(Env env) {
		if (((Bool)cond.eval(env)).getValue()) {
			body.eval(env);
			return true;
		}
		return false;
	}

}
