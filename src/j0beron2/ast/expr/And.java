package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Bool;
import j0beron2.eval.values.Value;


public class And extends Binary {

	public And(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Value eval(Env env) {
		Value x = getLhs().eval(env);
		if (!((Bool)x).getValue()) {
			return x;
		}
		return getRhs().eval(env);
	}

}
