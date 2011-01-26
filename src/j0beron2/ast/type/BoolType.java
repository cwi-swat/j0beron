package j0beron2.ast.type;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Bool;
import j0beron2.eval.values.Value;


public class BoolType extends Type {

	@Override
	public Value init(Env env) {
		return new Bool(false);
	}


}
