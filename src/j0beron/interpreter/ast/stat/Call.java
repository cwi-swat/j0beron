package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.decl.FPSect;
import j0beron.interpreter.ast.decl.Formals;
import j0beron.interpreter.ast.decl.Proc;
import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Closure;
import j0beron.interpreter.eval.env.Env;

import java.util.Iterator;

public class Call extends Stat {

	private final Ident ident;
	private final Actuals actuals;

	public Call(Ident ident, Actuals actuals) {
		this.ident = ident;
		this.actuals = actuals;
	}

	@Override
	public void eval(Env env) {
		Closure clos = (Closure) env.lookup(ident);
		Env callEnv = new Env(clos.getEnv());
		Proc proc = clos.getProc();
		proc.getDecls().declare(callEnv);
		bind(callEnv, proc.getFormals());
		proc.getBody().eval(callEnv);
	}

	private void bind(Env env, Formals formals) {
		Iterator<Expr> iter = actuals.iterator();
		for (FPSect fp: formals) {
			for (Ident id: fp.getIdents()) {
				Expr actual = iter.next();
				
				if (fp.isVar()) {
					env.declareByRef(id, actual.lvalueOf(env));
				}
				else {
					env.declareVar(id, actual.eval(env));
				}
			}
		}
		
	}

}
