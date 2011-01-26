package j0beron.visitor.ast.expr;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;
import j0beron.visitor.eval.values.Value;

public abstract class Expr extends ASTNode {
	
	public abstract Value accept(ExpressionEvaluator eval, Env env);

	public Ref lvalueOf(ExpressionEvaluator eval, Env env) {
		throw new UnsupportedOperationException("cannot get lvalue from " + this);
	}
	
}
