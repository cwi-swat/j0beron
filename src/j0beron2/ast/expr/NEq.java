package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Bool;
import j0beron2.eval.values.Int;
import j0beron2.eval.values.Value;


public class NEq extends Binary {

	public NEq(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Value eval(Env env) {
		Value x = getLhs().eval(env);
		Value y = getRhs().eval(env);
		return new Bool(((Int)x).getValue() != ((Int)y).getValue());
	}


}
