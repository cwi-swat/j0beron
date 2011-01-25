package j0beron.ast.decl;

import java.util.Collections;
import java.util.Iterator;

import j0beron.eval.DeclarationEvaluator;

public class ConstSect extends Section implements Iterable<ConstDecl> {

	private final ConstDecls decls;

	public ConstSect(ConstDecls decls) {
		this.decls = decls;
	}

	public ConstSect() {
		this(null);
	}

	@Override
	public void accept(DeclarationEvaluator eval) {
		eval.declare(this);
	}

	@Override
	public Iterator<ConstDecl> iterator() {
		if (decls == null) {
			return Collections.<ConstDecl>emptyList().iterator();
		}
		return decls.iterator();
	}

}
