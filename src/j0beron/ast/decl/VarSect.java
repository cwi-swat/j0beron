package j0beron.ast.decl;

import java.util.Collections;
import java.util.Iterator;

import j0beron.eval.DeclarationEvaluator;

public class VarSect extends Section implements Iterable<VarDecl> {

	private final VarDecls decls;

	public VarSect(VarDecls decls) {
		this.decls = decls;
	}

	public VarSect() {
		this(null);
	}

	@Override
	public void accept(DeclarationEvaluator eval) {
		eval.declare(this);
	}

	@Override
	public Iterator<VarDecl> iterator() {
		if (decls == null) {
			return Collections.<VarDecl>emptyList().iterator();
		}
		return decls.iterator();
	}

}
