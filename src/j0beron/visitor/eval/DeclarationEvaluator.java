package j0beron.visitor.eval;

import j0beron.visitor.ast.decl.ConstDecl;
import j0beron.visitor.ast.decl.ConstSect;
import j0beron.visitor.ast.decl.Decls;
import j0beron.visitor.ast.decl.Proc;
import j0beron.visitor.ast.decl.Procs;
import j0beron.visitor.ast.decl.TypeDecl;
import j0beron.visitor.ast.decl.TypeSect;
import j0beron.visitor.ast.decl.VarDecl;
import j0beron.visitor.ast.decl.VarSect;
import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.env.Env;

public class DeclarationEvaluator {

	private final Env env;
	private final ExpressionEvaluator eval;

	public DeclarationEvaluator(Env env, ExpressionEvaluator eval) {
		this.env = env;
		this.eval = eval;
	}
	
	public void declare(ConstSect cs) {
		for (ConstDecl cd: cs) {
			env.declareConstant(cd.getIdent(), cd.getInit().accept(eval, env));
		}
		
	}
	
	public void declare(TypeSect ts) {
		for (TypeDecl td: ts) {
			env.declareType(td.getIdent(), td.getType());
		}
	}
	
	public void declare(VarSect vs) {
		for (VarDecl vd: vs) {
			for (Ident id: vd.getIdents()) {
				env.declareVar(id, vd.getType().accept(new TypeInitializer(env, eval)));
			}
		}
		
	}
	
	public void declare(Procs procs) {
		for (Proc proc: procs) {
			env.declareProc(proc.getName(), proc);
		}
	}

	public void declare(Decls decls) {
		decls.getConstSect().accept(this);
		decls.getTypeSect().accept(this);
		decls.getVarSect().accept(this);
		decls.getProcs().accept(this);
	}
	
}
