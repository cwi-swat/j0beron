package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

public abstract class Section extends ASTNode {

	public abstract void declare(Env env);
	
}
