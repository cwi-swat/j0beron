package j0beron2.ast.stat;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;

public abstract class Stat extends ASTNode {
	
	public abstract void eval(Env env);

}
