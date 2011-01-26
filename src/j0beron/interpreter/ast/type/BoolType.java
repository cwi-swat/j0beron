package j0beron.interpreter.ast.type;

import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;
import j0beron.interpreter.eval.values.Value;


public class BoolType extends Type {

	@Override
	public Value init(Env env) {
		return new Bool(false);
	}


}
