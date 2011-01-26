package j0beron2.ast.stat;

import j0beron2.ast.decl.FPSect;
import j0beron2.ast.decl.Proc;
import j0beron2.ast.expr.Expr;
import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Closure;
import j0beron2.eval.env.Env;

import java.util.Iterator;

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
	public void eval(Env env) {
		Closure clos = (Closure) env.lookup(ident);
		Env callEnv = new Env(clos.getEnv());
		Proc proc = clos.getProc();
		proc.getDecls().declare(callEnv);
		Iterator<Expr> iter = actuals.iterator();
		for (FPSect fp: proc.getFormals()) {
			for (Ident id: fp.getIdents()) {
				Expr actual = iter.next();
				if (fp.isVar()) {
					callEnv.declareByRef(id, actual.lvalueOf(env));
				}
				else {
					callEnv.declareVar(id, actual.eval(env));
				}
			}
		}
		proc.getBody().eval(callEnv);
	}

}
