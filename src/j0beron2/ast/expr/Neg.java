package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Int;
import j0beron2.eval.values.Value;


public class Neg extends Unary {

	public Neg(Expr arg) {
		super(arg);
	}

	@Override
	public Value eval(Env env) {
		Value x = getArg().eval(env);
		return new Int(- ((Int)x).getValue());
	}
}
