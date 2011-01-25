package j0beron.ast.decl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.eval.DeclarationEvaluator;


public class Procs extends Section implements Iterable<Proc> {
	private final List<Proc> procs;

	public Procs(Proc proc, Procs procs) {
		this();
		this.procs.add(proc);
		this.procs.addAll(procs.procs);
	}

	public Procs() {
		procs = new LinkedList<Proc>();
	}

	@Override
	public void accept(DeclarationEvaluator eval) {
		eval.declare(this);
	}

	@Override
	public Iterator<Proc> iterator() {
		return procs.iterator();
	}

}
