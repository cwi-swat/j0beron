package j0beron2.ast.type;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;
import j0beron2.eval.values.Value;

public abstract class Type extends ASTNode {
	
	public abstract Value init(Env env);

}
