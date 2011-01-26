package j0beron.interpreter.ast.expr;

import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Env;
import j0beron.interpreter.eval.env.Ref;
import j0beron.interpreter.eval.values.Record;

public class Member extends Selector {

	private final Ident ident;

	public Member(Ident ident) {
		this.ident = ident;
	}

	@Override
	public Ref select(Ref ref, Env env) {
		return ((Record)ref.get()).getField(ident);
	}

}
