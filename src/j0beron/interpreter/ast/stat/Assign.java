package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.ast.expr.Selectors;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;
import j0beron.interpreter.eval.values.Value;

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
		Ref ref = (Ref)env.lookup(ident);
		return selectors.deref(ref, env);
	}

	@Override
	public void eval(Env env) {
		Value x = expr.eval(env);
		lvalueOf(env).set(x);
	}

	
	
	

}
