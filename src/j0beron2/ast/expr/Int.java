package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Value;


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
		return new j0beron2.eval.values.Int(value);
	}

}
