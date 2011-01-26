package j0beron2.ast.stat;

import j0beron2.ast.expr.Expr;
import j0beron2.ast.expr.Selectors;
import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;
import j0beron2.eval.values.Value;

public class Assign extends Stat {

	private final Ident ident;
	private final Selectors selectors;
	private final Expr expr;

	public Assign(Ident ident, Selectors selectors, Expr expr) {
		this.ident = ident;
		this.selectors = selectors;
		this.expr = expr;
	}
	
	public Ref lvalueOf(Env env) {
		Ref x = (Ref)env.lookup(ident);
		x = selectors.deref(x, env);
		return x;
	}

	@Override
	public void eval(Env env) {
		Value x = expr.eval(env);
		Ref ref = lvalueOf(env);
		ref.set(x);
	}

	
	
	

}
