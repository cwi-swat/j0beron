package j0beron.visitor.ast.expr;

import j0beron.visitor.ast.type.Ident;
import j0beron.visitor.eval.ExpressionEvaluator;
import j0beron.visitor.eval.env.Env;
import j0beron.visitor.eval.env.Ref;
import j0beron.visitor.eval.values.Record;

public class Member extends Selector {

	private final Ident ident;

	public Member(Ident ident) {
		this.ident = ident;
	}

	@Override
	public Ref select(Ref ref, ExpressionEvaluator eval, Env env) {
		return ((Record)ref.get()).getField(ident);
	}

}
