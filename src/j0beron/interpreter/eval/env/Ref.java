package j0beron.interpreter.eval.env;

import j0beron.interpreter.eval.values.Value;

public class Ref implements Bindable {

	private Value value;

	public Ref() {
		this(null);
	}
	
	public Ref(Value value) {
		// don't call set here; it is overriden by Const
		this.value = value;
	}

	public void set(Value value) {
		this.value = value;
	}

	public Value get() {
		return value;
	}
	
}
