package j0beron.interpreter.ast.expr;

import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;

import java.util.LinkedList;
import java.util.List;

public class Selectors extends ASTNode {
	private final List<Selector> selectors;

	public Selectors(Selector selector, Selectors selectors) {
		this();
		this.selectors.add(selector);
		this.selectors.addAll(selectors.selectors);
	}

	public Selectors() {
		selectors = new LinkedList<Selector>();
	}

	public Ref deref(Ref x, Env env) {
		for (Selector s: selectors) {
			x = s.select(x, env);
		}
		return x;
	}

}
