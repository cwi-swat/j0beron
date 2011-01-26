package j0beron.visitor.ast.stat;

import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.StatementEvaluator;

public class Call extends Stat {

	private final Ident ident;
	private final Actuals actuals;

	public Call(Ident ident, Actuals actuals) {
		this.ident = ident;
		this.actuals = actuals;
	}

	public Actuals getActuals() {
		return actuals;
	}
	
	public Ident getIdent() {
		return ident;
	}

	@Override
	public void accept(StatementEvaluator eval) {
		eval.eval(this);
	}
}
