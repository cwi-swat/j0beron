package j0beron.visitor.ast.stat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.visitor.ast.ASTNode;


public class Stats extends ASTNode implements Iterable<Stat> {
	private final List<Stat> stats;

	public Stats(Stat stat, Stats stats) {
		this(stat);
		this.stats.addAll(stats.stats);
	}

	public Stats(Stat stat) {
		stats = new LinkedList<Stat>();
		stats.add(stat);
	}

	@Override
	public Iterator<Stat> iterator() {
		return stats.iterator();
	}

}
