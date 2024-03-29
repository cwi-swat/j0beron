package j0beron.visitor.ast.stat;

import j0beron.visitor.ast.expr.Expr;
import j0beron.visitor.ast.expr.Selectors;
import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.StatementEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;

public class Assign extends Stat {

	private final Ident ident;
	private final Selectors selectors;
	private final Expr expr;

	public Assign(Ident ident, Selectors selectors, Expr expr) {
		this.ident = ident;
		this.selectors = selectors;
		this.expr = expr;
	}
	
	public Expr getExpr() {
		return expr;
	}
	
	public Ident getIdent() {
		return ident;
	}
	
	public Selectors getSelectors() {
		return selectors;
	}

	@Override
	public void accept(StatementEvaluator eval) {
		eval.eval(this);
	}
	
	public Ref lvalueOf(ExpressionEvaluator eval, Env env) {
		Ref x = (Ref)env.lookup(getIdent());
		x = getSelectors().deref(x, eval, env);
		return x;
	}

	
	
	

}
