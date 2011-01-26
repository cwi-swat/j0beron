package j0beron.interpreter.ast.stat;

import java.util.Collections;
import java.util.Iterator;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.expr.Expr;

public class Actuals extends ASTNode implements Iterable<Expr> {

	private final Exprs exprs;

	public Actuals(Exprs exprs) {
		this.exprs = exprs;
	}

	public Actuals() {
		this(null);
	}

	@Override
	public Iterator<Expr> iterator() {
		if (exprs == null) {
			return Collections.<Expr>emptyList().iterator();
		}
		return exprs.iterator();
	}

}
