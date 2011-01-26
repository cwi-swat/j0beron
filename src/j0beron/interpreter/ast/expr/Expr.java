package j0beron.interpreter.ast.expr;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;
import j0beron.interpreter.eval.values.Value;

public abstract class Expr extends ASTNode {
	
	public abstract Value eval(Env env);

	public Ref lvalueOf(Env env) {
		throw new UnsupportedOperationException("cannot get lvalue from " + this);
	}
	
}
