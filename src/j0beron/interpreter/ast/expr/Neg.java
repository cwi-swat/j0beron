package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Int;
import j0beron.interpreter.eval.values.Value;


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
