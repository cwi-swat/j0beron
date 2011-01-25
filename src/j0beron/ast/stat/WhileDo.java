package j0beron.ast.stat;

import j0beron.ast.expr.Expr;
import j0beron.eval.StatementEvaluator;

public class WhileDo extends Stat {

	private final Expr cond;
	private final Stats body;

	public WhileDo(Expr cond, Stats body) {
		this.cond = cond;
		this.body = body;
	}

	public Expr getCond() {
		return cond;
	}
	
	public Stats getBody() {
		return body;
	}

	@Override
	public void accept(StatementEvaluator eval) {
		eval.eval(this);
	}

}
