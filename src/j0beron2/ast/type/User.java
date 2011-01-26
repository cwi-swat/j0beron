package j0beron2.ast.type;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Value;


public class User extends Type {

	private final Ident ident;

	public User(Ident ident) {
		this.ident = ident;
	}

	@Override
	public Value init(Env env) {
		return ((Type)env.lookupType(ident)).init(env);
	}
}
