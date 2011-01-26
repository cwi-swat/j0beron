package j0beron.visitor.ast.expr;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;

public class Selectors extends ASTNode implements Iterable<Selector> {
	private final List<Selector> selectors;

	public Selectors(Selector selector, Selectors selectors) {
		this();
		this.selectors.add(selector);
		this.selectors.addAll(selectors.selectors);
	}

	public Selectors() {
		selectors = new LinkedList<Selector>();
	}

	@Override
	public Iterator<Selector> iterator() {
		return selectors.iterator();
	}
	
	public Ref deref(Ref x, ExpressionEvaluator eval, Env env) {
		for (Selector s: selectors) {
			x = s.select(x, eval, env);
		}
		return x;
	}

}
