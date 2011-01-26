package j0beron2.eval.env;

import j0beron2.eval.values.Value;

public class Const extends Ref {

	public Const(Value value) {
		super(value);
	}
	
	@Override
	public void set(Value value) {
		throw new UnsupportedOperationException("cannot assign to constants");
	}
	
}
