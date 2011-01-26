package j0beron2.eval.values;

import j0beron2.eval.env.Ref;

public class Array extends Value {

	private final Ref[] values;
	
	public Array(int size, Value init) {
		values = new Ref[size];
		for (int i = 0; i < size; i++) {
			values[i] = new Ref(init);
		}
	}
	
	public void set(int i, Value value) {
		getIndex(i).set(value);
	}
	
	public Value get(int i) {
		return getIndex(i).get();
	}

	public Ref getIndex(int i) {
		return values[i];
	}

}
