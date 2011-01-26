package j0beron.visitor.ast.stat;

import j0beron.visitor.ast.expr.Expr;
import j0beron.visitor.eval.StatementEvaluator;

public class IfThenElse extends Stat {

	private final Expr cond;
	private final Stats body;
	private final ElsIfs elsIfs;
	private final Else elsePart;

	public IfThenElse(Expr cond, Stats body, ElsIfs elsIfs, Else elsePart) {
		this.cond = cond;
		this.body = body;
		this.elsIfs = elsIfs;
		this.elsePart = elsePart;
	}
	
	public IfThenElse(Expr cond, Stats body, ElsIfs elsIfs) {
		this(cond, body, elsIfs, null);
	}
	
	public boolean hasElse() {
		return elsePart != null;
	}
		
	
	public Stats getBody() {
		return body;
	}
	
	public Expr getCond() {
		return cond;
	}
	
	public Else getElsePart() {
		return elsePart;
	}
	
	public ElsIfs getElsIfs() {
		return elsIfs;
	}

	@Override
	public void accept(StatementEvaluator eval) {
		eval.eval(this);
	}

}
