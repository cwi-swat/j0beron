package j0beron.interpreter.ast.expr;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Int;
import j0beron.interpreter.eval.values.Value;


public class Add extends Binary {

	public Add(Expr lhs, Expr rhs) {
		super(lhs, rhs);
	}

	@Override
	public Value eval(Env env) {
		Value x = getLhs().eval(env);
		Value y = getRhs().eval(env);
		return new Int(((Int)x).getValue() + ((Int)y).getValue());
	}
	
}
