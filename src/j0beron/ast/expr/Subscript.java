package j0beron.ast.expr;

import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.env.Ref;
import j0beron.eval.values.Array;
import j0beron.eval.values.Int;
import j0beron.eval.values.Value;

public class Subscript extends Selector {

	private final Expr expr;

	public Subscript(Expr expr) {
		this.expr = expr;
	}

	@Override
	public Ref select(Ref ref, ExpressionEvaluator eval, Env env) {
		Value i = expr.accept(eval, env);
		return ((Array)ref.get()).getIndex(((Int)i).getValue());
	}

}
