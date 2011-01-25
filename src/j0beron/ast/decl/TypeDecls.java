package j0beron.ast.decl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.ast.ASTNode;

public class TypeDecls extends ASTNode implements Iterable<TypeDecl> {
	private final List<TypeDecl> decls;

	public TypeDecls(TypeDecl decl, TypeDecls decls) {
		this();
		this.decls.add(decl);
		this.decls.addAll(decls.decls);
	}

	public TypeDecls() {
		decls = new LinkedList<TypeDecl>();
	}

	@Override
	public Iterator<TypeDecl> iterator() {
		return decls.iterator();
	}

}
