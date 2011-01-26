package j0beron.visitor.ast.decl;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.ast.stat.Stats;
import j0beron.visitor.eval.StatementEvaluator;

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
