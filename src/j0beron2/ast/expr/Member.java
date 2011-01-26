package j0beron2.ast.expr;

import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Env;
import j0beron2.eval.env.Ref;
import j0beron2.eval.values.Record;

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
