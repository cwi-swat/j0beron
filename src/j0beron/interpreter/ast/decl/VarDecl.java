package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.ast.type.Idents;
import j0beron.interpreter.ast.type.Type;
import j0beron.interpreter.eval.env.Env;

public class VarDecl extends ASTNode {

	private final Idents idents;
	private final Type type;

	public VarDecl(Idents idents, Type type) {
		this.idents = idents;
		this.type = type;
	}

	public void declare(Env env) {
		for (Ident id: idents) {
			env.declareVar(id, type.init(env));
		}
	}

}
