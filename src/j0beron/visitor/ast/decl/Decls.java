package j0beron.visitor.ast.decl;

import j0beron.visitor.eval.DeclarationEvaluator;


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

	public ConstSect getConstSect() {
		return constSect;
	}
	
	public Procs getProcs() {
		return procs;
	}
	
	public TypeSect getTypeSect() {
		return typeSect;
	}
	
	public VarSect getVarSect() {
		return varSect;
	}
	
	
	@Override
	public void accept(DeclarationEvaluator eval) {
		eval.declare(this);
	}

}
