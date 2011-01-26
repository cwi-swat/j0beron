package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;
import j0beron.interpreter.eval.values.Value;


public class Or extends Binary {

	public Or(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}
	
	@Override
	public Value eval(Env env) {
		Value x = getLhs().eval(env);
		if (((Bool)x).getValue()) {
			return x;
		}
		return getRhs().eval(env);
	}
}
