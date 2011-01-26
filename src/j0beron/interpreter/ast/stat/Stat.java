package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

public abstract class Stat extends ASTNode {
	
	public abstract void eval(Env env);

}
