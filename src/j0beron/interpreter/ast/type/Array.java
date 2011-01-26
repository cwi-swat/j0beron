package j0beron.interpreter.ast.type;

import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Int;
import j0beron.interpreter.eval.values.Value;

public class Array extends Type {
	private final Expr bound;
	private final Type type;

	public Array(Expr bound, Type type) {
		this.bound = bound;
		this.type = type;
	}

	@Override
	public Value init(Env env) {
		Value size = bound.eval(env);
		Value init = type.init(env);
		return new j0beron.interpreter.eval.values.Array(((Int)size).getValue(), init);
	}

}
