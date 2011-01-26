package j0beron.visitor.ast.stat;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.ast.expr.Expr;

public class Exprs extends ASTNode implements Iterable<Expr> {

	private final List<Expr> exprs;

	public Exprs(Exprs exprs) {
		this();
		this.exprs.addAll(exprs.exprs);
	}

	public Exprs(Expr expr) {
		this();
		exprs.add(expr);
	}

	public Exprs(Expr expr, Exprs exprs) {
		this(expr);
		this.exprs.addAll(exprs.exprs);
	}

	public Exprs() {
		this.exprs = new LinkedList<Expr>();
	}

	@Override
	public Iterator<Expr> iterator() {
		return exprs.iterator();
	}

	
}
