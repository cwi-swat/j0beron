package j0beron.ast.expr;

import j0beron.ast.ASTNode;
import j0beron.eval.ExpressionEvaluator;
import j0beron.eval.env.Env;
import j0beron.eval.env.Ref;
import j0beron.eval.values.Value;

public abstract class Expr extends ASTNode {
	
	public abstract Value accept(ExpressionEvaluator eval, Env env);

	public Ref lvalueOf(ExpressionEvaluator eval, Env env) {
		throw new UnsupportedOperationException("cannot get lvalue from " + this);
	}
	
}
