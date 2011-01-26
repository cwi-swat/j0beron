package j0beron2.ast.stat;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;

import java.util.LinkedList;
import java.util.List;


public class Stats extends ASTNode {
	private final List<Stat> stats;

	public Stats(Stat stat, Stats stats) {
		this(stat);
		this.stats.addAll(stats.stats);
	}

	public Stats(Stat stat) {
		stats = new LinkedList<Stat>();
		stats.add(stat);
	}

	public void eval(Env env) {
		for (Stat stat: stats) {
			stat.eval(env);
		}
	}

}
