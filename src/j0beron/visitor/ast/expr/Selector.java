package j0beron.visitor.ast.expr;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;

public abstract class Selector extends ASTNode {

	
	public abstract Ref select(Ref ref, ExpressionEvaluator eval, Env env);

}
