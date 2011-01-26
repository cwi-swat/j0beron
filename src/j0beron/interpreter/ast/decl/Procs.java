package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

import java.util.LinkedList;
import java.util.List;


public class Procs extends ASTNode {
	private final List<Proc> procs;

	public Procs(Proc proc, Procs procs) {
		this();
		this.procs.add(proc);
		this.procs.addAll(procs.procs);
	}

	public Procs() {
		procs = new LinkedList<Proc>();
	}

	public void declare(Env env) {
		for (Proc proc: procs) {
			env.declareProc(proc.getName(), proc);
		}
	}

}
