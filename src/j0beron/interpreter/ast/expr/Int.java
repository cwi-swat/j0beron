package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Value;


public class Int extends Expr {
	private Integer value;

	public Int(int value) {
		this.value = value;
	}
	
	public Integer getValue() {
		return value;
	}
	
	@Override
	public Value eval(Env env) {
		return new j0beron.interpreter.eval.values.Int(value);
	}

}
