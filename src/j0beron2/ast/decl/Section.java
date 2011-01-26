package j0beron2.ast.decl;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;

public abstract class Section extends ASTNode {

	public abstract void declare(Env env);
	
}
