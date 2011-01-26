package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;
import j0beron.interpreter.eval.values.Array;
import j0beron.interpreter.eval.values.Int;
import j0beron.interpreter.eval.values.Value;

public class Subscript extends Selector {

	private final Expr expr;

	public Subscript(Expr expr) {
		this.expr = expr;
	}

	@Override
	public Ref select(Ref ref, Env env) {
		Value i = expr.eval(env);
		return ((Array)ref.get()).getIndex(((Int)i).getValue());
	}


}
