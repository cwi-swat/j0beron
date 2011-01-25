package j0beron.ast.expr;

import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.values.Value;


public class Int extends Expr {
	private Integer value;

	public Int(int value) {
		this.value = value;
	}

	@Override
	public Value accept(ExpressionEvaluator eval, Env env) {
		return eval.eval(this, env);
	}
	
	public Integer getValue() {
		return value;
	}

}
