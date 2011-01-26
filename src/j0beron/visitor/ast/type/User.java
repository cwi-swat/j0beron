package j0beron.visitor.ast.type;

import j0beron.visitor.eval.TypeInitializer;
import j0beron.visitor.eval.values.Value;


public class User extends Type {

	private final Ident ident;

	public User(Ident ident) {
		this.ident = ident;
	}

	@Override
	public Value accept(TypeInitializer init) {
		return init.init(this);
	}

	public Ident getIdent() {
		return ident;
	}
}
