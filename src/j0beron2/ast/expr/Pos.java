package j0beron2.ast.expr;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Value;


public class Pos extends Unary {

	public Pos(Expr arg) {
		super(arg);
	}

	@Override
	public Value eval(Env env) {
		return getArg().eval(env);
	}
}
