package j0beron2.ast.decl;

import j0beron2.ast.ASTNode;
import j0beron2.ast.stat.Stats;
import j0beron2.eval.env.Env;

public class Body extends ASTNode {

	private final Stats stats;

	public Body(Stats stats) {
		this.stats = stats;
	}

	public void eval(Env env) {
		stats.eval(env);		
	}


}
