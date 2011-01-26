package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;
import j0beron.interpreter.eval.values.Value;

public class WhileDo extends Stat {

	private final Expr cond;
	private final Stats body;

	public WhileDo(Expr cond, Stats body) {
		this.cond = cond;
		this.body = body;
	}

	@Override
	public void eval(Env env) {
		Value x = cond.eval(env);
		while (((Bool)x).getValue()) {
			body.eval(env);
			x = cond.eval(env);
		}
	}

}
