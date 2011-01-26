package j0beron2.ast.type;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Int;
import j0beron2.eval.values.Value;


public class IntType extends Type {

	@Override
	public Value init(Env env) {
		return new Int(0);
	}

}
