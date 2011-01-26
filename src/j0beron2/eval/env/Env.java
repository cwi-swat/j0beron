package j0beron2.eval.env;

import j0beron2.ast.decl.Proc;
import j0beron2.ast.type.Ident;
import j0beron2.ast.type.Type;
import j0beron2.eval.values.Value;

import java.util.HashMap;
import java.util.Map;

public class Env {

	private final Env parent;
	private final Map<Ident,Bindable> bindings;
	private final Map<Ident, Type> types;

	public Env() {
		this(null);
	}
	
	public Env(Env parent) {
		this.parent = parent;
		this.bindings = new HashMap<Ident, Bindable>();
		this.types = new HashMap<Ident, Type>();
	}
	
	public Bindable lookup(Ident name) {
		if (bindings.containsKey(name)) {
			return bindings.get(name);
		}
		if (parent != null) {
			return parent.lookup(name);
		}
		throw new RuntimeException("undefined variable: " + name);
	}
	
	public void declareVar(Ident name, Value value) {
		declareByRef(name, new Ref(value));
	}
	
	public void declareByRef(Ident name, Ref ref) {
		bindings.put(name, ref);
	}

	public void declareConstant(Ident name, Value value) {
		bindings.put(name, new Const(value));
	}

	public void declareProc(Ident name, Proc proc) {
		bindings.put(name, new Closure(this, proc));
	}

	public Env getParent() {
		return parent;
	}
	
	public Type lookupType(Ident name) {
		if (types.containsKey(name)) {
			return types.get(name);
		}
		if (parent != null) {
			return parent.lookupType(name);
		}
		throw new RuntimeException("undefined variable: " + name);
	}
	
	public void declareType(Ident name, Type type) {
		types.put(name, type);
	}



	
}
