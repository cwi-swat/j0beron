package j0beron.visitor.ast.type;

import j0beron.visitor.ast.expr.Expr;
import j0beron.visitor.eval.TypeInitializer;
import j0beron.visitor.eval.values.Value;

public class Array extends Type {
	private final Expr bound;
	private final Type type;

	public Array(Expr bound, Type type) {
		this.bound = bound;
		this.type = type;
	}

	@Override
	public Value accept(TypeInitializer init) {
		return init.init(this);
	}
	
	public Expr getSize() {
		return bound;
	}
	
	public Type getType() {
		return type;
	}

}
