package j0beron.interpreter.ast.decl;

import j0beron.interpreter.eval.env.Env;


public class Decls extends Section {

	private final ConstSect constSect;
	private final TypeSect typeSect;
	private final VarSect varSect;
	private final Procs procs;

	public Decls(ConstSect constSect, TypeSect typeSect, VarSect varSect,
			Procs procs) {
		this.constSect = constSect;
		this.typeSect = typeSect;
		this.varSect = varSect;
		this.procs = procs;
	}

	@Override
	public void declare(Env env) {
		constSect.declare(env);
		typeSect.declare(env);
		varSect.declare(env);
		procs.declare(env);
	}

}
