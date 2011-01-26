package j0beron2.ast.decl;

import j0beron2.eval.env.Env;

import java.util.Collections;
import java.util.Iterator;

public class ConstSect extends Section implements Iterable<ConstDecl> {

	private final ConstDecls decls;

	public ConstSect(ConstDecls decls) {
		this.decls = decls;
	}

	public ConstSect() {
		this(null);
	}

	@Override
	public void declare(Env env) {
		for (ConstDecl cd: this) {
			env.declareConstant(cd.getIdent(), cd.getInit().eval(env));
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
