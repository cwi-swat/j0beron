package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.expr.Expr;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Env;

public class ConstDecl extends ASTNode {

	private final Ident ident;
	private final Expr init;

	public ConstDecl(Ident ident, Expr init) {
		this.ident = ident;
		this.init = init;
	}

	public void declare(Env env) {
		env.declareConstant(ident, init.eval(env));
	}

}
