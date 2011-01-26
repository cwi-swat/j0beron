package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Bool;

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
		if (((Bool)cond.eval(env)).getValue()) {
			body.eval(env);
			return;
		}
		for (ElsIf ei: elsIfs) {
			if (ei.eval(env)) {
				return;
			}
		}
		if (hasElse()) {
			elsePart.eval(env);
		}		
	}

	

}
