package j0beron.ast.expr;

import j0beron.ast.ASTNode;
import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.env.Ref;

public abstract class Selector extends ASTNode {

	
	public abstract Ref select(Ref ref, ExpressionEvaluator eval, Env env);

}
