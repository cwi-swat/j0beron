package j0beron2.ast.decl;

import java.util.Collections;
import java.util.Iterator;

import j0beron2.ast.ASTNode;

public class Formals extends ASTNode implements Iterable<FPSect> {
	private final FPSects fpSects;

	public Formals(FPSects fpSects) {
		this.fpSects = fpSects;
	}

	public Formals() {
		this(null);
	}

	@Override
	public Iterator<FPSect> iterator() {
		if (fpSects == null) {
			return Collections.<FPSect>emptyList().iterator();
		}
		return fpSects.iterator();
	}

}
