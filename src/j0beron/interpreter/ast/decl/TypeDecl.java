package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.ast.type.Type;
import j0beron.interpreter.eval.env.Env;

public class TypeDecl extends ASTNode {

	private final Ident ident;
	private final Type type;

	public TypeDecl(Ident ident, Type type) {
		this.ident = ident;
		this.type = type;
	}
	
	public void declare(Env env) {
		env.declareType(ident, type);
	}

}
