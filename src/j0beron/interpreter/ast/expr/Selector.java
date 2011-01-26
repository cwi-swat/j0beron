package j0beron.interpreter.ast.expr;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;

public abstract class Selector extends ASTNode {

	
	public abstract Ref select(Ref ref, Env env);

}
