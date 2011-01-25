package j0beron.ast.decl;

import java.util.Collections;
import java.util.Iterator;

import j0beron.eval.DeclarationEvaluator;

public class TypeSect extends Section implements Iterable<TypeDecl> {

	private final TypeDecls decls;

	public TypeSect(TypeDecls decls) {
		this.decls = decls;
	}

	public TypeSect() {
		this(null);
	}

	@Override
	public void accept(DeclarationEvaluator eval) {
		eval.declare(this);
	}

	@Override
	public Iterator<TypeDecl> iterator() {
		if (decls == null) {
			return Collections.<TypeDecl>emptyList().iterator();
		}
		return decls.iterator();
	}

}
