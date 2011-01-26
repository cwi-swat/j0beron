package j0beron.interpreter.ast.decl;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;

import java.util.Collections;
import java.util.Iterator;

public class ConstSect extends ASTNode implements Iterable<ConstDecl> {

	private final ConstDecls decls;

	public ConstSect(ConstDecls decls) {
		this.decls = decls;
	}

	public ConstSect() {
		this(null);
	}

	public void declare(Env env) {
		for (ConstDecl cd: this) {
			cd.declare(env);
		}
	}

	@Override
	public Iterator<ConstDecl> iterator() {
		if (decls == null) {
			return Collections.<ConstDecl>emptyList().iterator();
		}
		return decls.iterator();
	}

}
