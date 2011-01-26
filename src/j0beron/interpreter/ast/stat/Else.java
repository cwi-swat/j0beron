package j0beron.interpreter.ast.stat;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

public class Else extends ASTNode {
	private final Stats body;
	
	public Else(Stats body) {
		this.body = body;
	}

	public void eval(Env env) {
		body.eval(env);
	}

}
