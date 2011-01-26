package j0beron2.ast.expr;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;
import j0beron2.eval.values.Value;

public abstract class Expr extends ASTNode {
	
	public abstract Value eval(Env env);

	public Ref lvalueOf(Env env) {
		throw new UnsupportedOperationException("cannot get lvalue from " + this);
	}
	
}
