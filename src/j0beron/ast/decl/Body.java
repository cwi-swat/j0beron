package j0beron.ast.decl;

import j0beron.ast.ASTNode;
import j0beron.ast.stat.Stats;
import j0beron.eval.StatementEvaluator;

public class Body extends ASTNode {

	private final Stats stats;

	public Body(Stats stats) {
		this.stats = stats;
	}
	
	public Stats getStats() {
		return stats;
	}

	public void accept(StatementEvaluator eval) {
		eval.eval(stats);
	}


}
