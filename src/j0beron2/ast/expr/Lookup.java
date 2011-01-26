package j0beron2.ast.expr;

import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;
import j0beron2.eval.values.Value;

public class Lookup extends Expr {

	private final Selectors selectors;
	private final Ident ident;

	public Lookup(Ident ident, Selectors selectors) {
		this.ident = ident;
		this.selectors = selectors;
	}

	@Override
	public Value eval(Env env) {
		Ref ref = lvalueOf(env);
		return ref.get();
	}

	
	public Ident getIdent() {
		return ident;
	}
	
	public Selectors getSelectors() {
		return selectors;
	}
	
	@Override
	public Ref lvalueOf(Env env) {
		Ref x = (Ref)env.lookup(getIdent());
		x = getSelectors().deref(x, env);
		return x;
	}

}
