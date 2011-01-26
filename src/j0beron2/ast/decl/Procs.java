package j0beron2.ast.decl;

import j0beron2.eval.env.Env;

import java.util.LinkedList;
import java.util.List;


public class Procs extends Section {
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
	public void declare(Env env) {
		for (Proc proc: procs) {
			env.declareProc(proc.getName(), proc);
		}
	}

}
