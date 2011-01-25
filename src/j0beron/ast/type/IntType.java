package j0beron.ast.type;

import j0beron.eval.TypeInitializer;
import j0beron.eval.values.Value;


public class IntType extends Type {

	@Override
	public Value accept(TypeInitializer init) {
		return init.init(this);
	}

}
