package j0beron.visitor.eval;

import java.util.Iterator;

import j0beron.visitor.ast.decl.FPSect;
import j0beron.visitor.ast.decl.Proc;
import j0beron.visitor.ast.expr.Expr;
import j0beron.visitor.ast.stat.Assign;
import j0beron.visitor.ast.stat.Call;
import j0beron.visitor.ast.stat.ElsIf;
import j0beron.visitor.ast.stat.IfThenElse;
import j0beron.visitor.ast.stat.Stat;
import j0beron.visitor.ast.stat.Stats;
import j0beron.visitor.ast.stat.WhileDo;
import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.env.Closure;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;
import j0beron.visitor.eval.values.Bool;
import j0beron.visitor.eval.values.Value;

public class StatementEvaluator {
	
	private Env env;
	private final ExpressionEvaluator expEval;
	
	public StatementEvaluator(Env globals) {
		this.env = globals;
		this.expEval = new ExpressionEvaluator();
	}
	
	public void eval(Assign assign) {
		Value x = assign.getExpr().accept(expEval, env);
		Ref ref = assign.lvalueOf(expEval, env);
		ref.set(x);
	}
	
	public void eval(Call call) {
		Closure clos = (Closure) env.lookup(call.getIdent());
		Env callEnv = new Env(clos.getEnv());
		Proc proc = clos.getProc();
		proc.getDecls().accept(new DeclarationEvaluator(callEnv, expEval));
		Iterator<Expr> actuals = call.getActuals().iterator();
		for (FPSect fp: proc.getFormals()) {
			for (Ident id: fp.getIdents()) {
				Expr actual = actuals.next();
				if (fp.isVar()) {
					callEnv.declareByRef(id, actual.lvalueOf(expEval, env));
				}
				else {
					callEnv.declareVar(id, actual.accept(expEval, env));
				}
			}
		}
		Env old = env;
		env = callEnv;
		proc.getBody().accept(this);
		env = old;
	}

	public void eval(IfThenElse ite) {
		Value x = ite.getCond().accept(expEval, env);
		if (((Bool)x).getValue()) {
			eval(ite.getBody());
			return;
		}
		for (ElsIf ei: ite.getElsIfs()) {
			Value y = ei.getCond().accept(expEval, env);
			if (((Bool)y).getValue()) {
				eval(ei.getBody());
				return;
			}		
		}
		if (ite.hasElse()) {
			eval(ite.getElsePart().getBody());
		}
	}
	
	public void eval(WhileDo wd) {
		Value x = wd.getCond().accept(expEval, env);
		while (((Bool)x).getValue()) {
			eval(wd.getBody());
			x = wd.getCond().accept(expEval, env);
		}
	}

	
	public void eval(Stats stats) {
		for (Stat stat: stats) {
			stat.accept(this);
		}
	}

	public Env getEnv() {
		return env;
	}


}
