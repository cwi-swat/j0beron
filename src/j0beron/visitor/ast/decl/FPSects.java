package j0beron.visitor.ast.decl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.visitor.ast.ASTNode;

public class FPSects extends ASTNode implements Iterable<FPSect> {
	private final List<FPSect> fpSects;

	public FPSects(FPSect fpSect, FPSects fpSects) {
		this(fpSect);
		this.fpSects.addAll(fpSects.fpSects);
	}

	public FPSects(FPSect fpSect) {
		fpSects = new LinkedList<FPSect>();
		fpSects.add(fpSect);
	}

	@Override
	public Iterator<FPSect> iterator() {
		return fpSects.iterator();
	}

}
