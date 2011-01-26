package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConstDecls extends ASTNode implements Iterable<ConstDecl> {
	private final List<ConstDecl> consts;

	public ConstDecls(ConstDecl constDecl, ConstDecls constDecls) {
		this();
		consts.add(constDecl);
		consts.addAll(constDecls.consts);
	}

	public ConstDecls() {
		consts = new LinkedList<ConstDecl>();
	}

	@Override
	public Iterator<ConstDecl> iterator() {
		return consts.iterator();
	}

}
