package j0beron.visitor.ast.decl;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.visitor.ast.ASTNode;

public class VarDecls extends ASTNode implements Iterable<VarDecl> {
	private final List<VarDecl> decls;

	public VarDecls(VarDecl decl, VarDecls decls) {
		this();
		this.decls.add(decl);
		this.decls.addAll(decls.decls);
	}

	public VarDecls() {
		decls = new LinkedList<VarDecl>();
	}

	@Override
	public Iterator<VarDecl> iterator() {
		return decls.iterator();
	}

}
