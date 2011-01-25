package j0beron.ast.stat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.ast.ASTNode;

public class ElsIfs extends ASTNode implements Iterable<ElsIf> {
	private final List<ElsIf> elsIfs;

	public ElsIfs(ElsIf elsIf, ElsIfs elsIfs) {
		this();
		this.elsIfs.add(elsIf);
		this.elsIfs.addAll(elsIfs.elsIfs);
	}

	public ElsIfs() {
		this.elsIfs = new LinkedList<ElsIf>();
	}

	@Override
	public Iterator<ElsIf> iterator() {
		return elsIfs.iterator();
	}

}
