package j0beron.visitor.eval.values;

import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.env.Ref;

import java.util.HashMap;
import java.util.Map;

public class Record extends Value {

	private final Map<Ident, Ref> fields;
	
	public Record() {
		this.fields = new HashMap<Ident, Ref>();
	}
	
	public void set(Ident name, Value value) {
		getField(name).set(value);
	}
	
	public Value get(Ident name) {
		return getField(name).get();
	}

	public Ref getField(Ident name) {
		if (!fields.containsKey(name)) {
			fields.put(name, new Ref());
		}
		return fields.get(name);
	}
	
}
