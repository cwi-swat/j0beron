package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;
import j0beron.interpreter.eval.values.Value;


public class Not extends Unary {

	public Not(Expr arg) {
		super(arg);
	}

	@Override
	public Value eval(Env env) {
		Value x = getArg().eval(env);
		return new Bool(! ((Bool)x).getValue());
	}

}
