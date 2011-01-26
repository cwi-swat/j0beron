package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Env;

public class VarSect extends ASTNode {

	private final VarDecls decls;

	public VarSect(VarDecls decls) {
		this.decls = decls;
	}

	public VarSect() {
		this(null);
	}

	public void declare(Env env) {
		if (decls != null) {
			for (VarDecl vd: decls) {
				for (Ident id: vd.getIdents()) {
					env.declareVar(id, vd.getType().init(env));
				}
			}
		}
	}

}
