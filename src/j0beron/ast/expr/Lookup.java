package j0beron.ast.expr;

import j0beron.ast.type.Ident;
import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.env.Ref;
import j0beron.eval.values.Value;

public class Lookup extends Expr {

	private final Selectors selectors;
	private final Ident ident;

	public Lookup(Ident ident, Selectors selectors) {
		this.ident = ident;
		this.selectors = selectors;
	}

	@Override
	public Value accept(ExpressionEvaluator eval, Env env) {
		return eval.eval(this, env);
	}
	
	public Ident getIdent() {
		return ident;
	}
	
	public Selectors getSelectors() {
		return selectors;
	}
	
	@Override
	public Ref lvalueOf(ExpressionEvaluator eval, Env env) {
		Ref x = (Ref)env.lookup(getIdent());
		x = getSelectors().deref(x, eval, env);
		return x;
	}

}
