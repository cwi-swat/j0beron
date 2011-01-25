package j0beron.ast.expr;

import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.values.Value;


public class Not extends Unary {

	public Not(Expr arg) {
		super(arg);
	}

	@Override
	public Value accept(ExpressionEvaluator eval, Env env) {
		return eval.eval(this, env);
	}

}
