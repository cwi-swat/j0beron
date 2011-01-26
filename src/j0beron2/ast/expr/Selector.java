package j0beron2.ast.expr;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;

public abstract class Selector extends ASTNode {

	
	public abstract Ref select(Ref ref, Env env);

}
