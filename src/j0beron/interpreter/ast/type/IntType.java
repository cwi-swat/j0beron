package j0beron.interpreter.ast.type;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Int;
import j0beron.interpreter.eval.values.Value;


public class IntType extends Type {

	@Override
	public Value init(Env env) {
		return new Int(0);
	}

}
