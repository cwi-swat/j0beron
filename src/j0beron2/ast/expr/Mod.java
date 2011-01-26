package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Int;
import j0beron2.eval.values.Value;


public class Mod extends Binary {

	public Mod(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Value eval(Env env) {
		Value x = getLhs().eval(env);
		Value y = getRhs().eval(env);
		return new Int(((Int)x).getValue() % ((Int)y).getValue());
	}


}
