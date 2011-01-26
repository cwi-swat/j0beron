package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Value;


public class Pos extends Unary {

	public Pos(Expr arg) {
		super(arg);
	}

	@Override
	public Value eval(Env env) {
		return getArg().eval(env);
	}
}
