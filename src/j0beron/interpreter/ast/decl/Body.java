package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.stat.Stats;
import j0beron.interpreter.eval.env.Env;

public class Body extends ASTNode {

	private final Stats stats;

	public Body(Stats stats) {
		this.stats = stats;
	}

	public void eval(Env env) {
		stats.eval(env);		
	}


}
