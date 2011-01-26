package j0beron.interpreter.eval.env;

import j0beron.interpreter.eval.values.Value;

public class Const extends Ref {

	public Const(Value value) {
		super(value);
	}
	
	@Override
	public void set(Value value) {
		throw new UnsupportedOperationException("cannot assign to constants");
	}
	
}
