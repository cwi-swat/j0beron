package j0beron.visitor.ast.expr;

import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.values.Value;


public class LEq extends Binary {

	public LEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Value accept(ExpressionEvaluator eval, Env env) {
		return eval.eval(this, env);
	}

}
