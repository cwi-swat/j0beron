package j0beron.interpreter.ast.type;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.values.Value;

public abstract class Type extends ASTNode {
	
	public abstract Value init(Env env);

}
