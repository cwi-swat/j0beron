package j0beron2.ast.stat;

import j0beron2.ast.expr.Expr;
import j0beron2.eval.env.Env;
import j0beron2.eval.values.Bool;
import j0beron2.eval.values.Value;

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
		
	@Override
	public void eval(Env env) {
		Value x = cond.eval(env);
		if (((Bool)x).getValue()) {
			body.eval(env);
			return;
		}
		for (ElsIf ei: elsIfs) {
			Value y = ei.getCond().eval(env);
			if (((Bool)y).getValue()) {
				ei.getBody().eval(env);
				return;
			}		
		}
		if (hasElse()) {
			elsePart.getBody().eval(env);
		}		
	}

	

}
