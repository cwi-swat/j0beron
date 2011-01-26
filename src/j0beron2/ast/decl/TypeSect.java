package j0beron2.ast.decl;

import j0beron2.eval.env.Env;

public class TypeSect extends Section {

	private final TypeDecls decls;

	public TypeSect(TypeDecls decls) {
		this.decls = decls;
	}

	public TypeSect() {
		this(null);
	}

	@Override
	public void declare(Env env) {
		if (decls != null) {
			for (TypeDecl td: decls) {
				env.declareType(td.getIdent(), td.getType());
			}
		}
	}

}
