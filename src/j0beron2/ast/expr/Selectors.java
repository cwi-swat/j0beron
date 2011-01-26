package j0beron2.ast.expr;

import j0beron2.ast.ASTNode;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

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
	
	public Ref deref(Ref x, Env env) {
		for (Selector s: selectors) {
			x = s.select(x, env);
		}
		return x;
	}

}
