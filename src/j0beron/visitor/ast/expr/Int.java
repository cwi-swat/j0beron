package j0beron.visitor.ast.expr;

import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.values.Value;


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
