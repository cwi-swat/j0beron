package j0beron.interpreter.eval.env;

import j0beron.interpreter.ast.decl.Proc;

public class Closure implements Bindable {

	private final Env env;
	private final Proc proc;

	public Closure(Env env, Proc proc) {
		this.env = env;
		this.proc = proc;
	}
	
	public Env getEnv() {
		return env;
	}
	
	public Proc getProc() {
		return proc;
	}

}
