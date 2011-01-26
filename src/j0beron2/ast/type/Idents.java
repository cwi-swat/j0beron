package j0beron2.ast.type;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron2.ast.ASTNode;

public class Idents extends ASTNode implements Iterable<Ident> {

	private final List<Ident> idents;

	public Idents(Ident ident, Idents idents) {
		this(ident);
		this.idents.addAll(idents.idents);
	}

	public Idents(Ident ident) {
		idents = new LinkedList<Ident>();
		idents.add(ident);
	}

	@Override
	public Iterator<Ident> iterator() {
		return idents.iterator();
	}

}
