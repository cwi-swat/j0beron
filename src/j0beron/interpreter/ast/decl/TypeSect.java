package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

public class TypeSect extends ASTNode{

	private final TypeDecls decls;

	public TypeSect(TypeDecls decls) {
		this.decls = decls;
	}

	public TypeSect() {
		this(null);
	}

	public void declare(Env env) {
		if (decls != null) {
			for (TypeDecl td: decls) {
				td.declare(env);
			}
		}
	}

}
