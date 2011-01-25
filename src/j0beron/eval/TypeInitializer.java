package j0beron.eval;

import j0beron.ast.type.Array;
import j0beron.ast.type.BoolType;
import j0beron.ast.type.Field;
import j0beron.ast.type.Ident;
import j0beron.ast.type.IntType;
import j0beron.ast.type.Record;
import j0beron.ast.type.Type;
import j0beron.ast.type.User;
import j0beron.eval.env.Env;
import j0beron.eval.values.Bool;
import j0beron.eval.values.Int;
import j0beron.eval.values.Value;

public class TypeInitializer {
	private final Env env;
	private final ExpressionEvaluator eval;
	
	public TypeInitializer(Env env, ExpressionEvaluator eval) {
		this.env = env;
		this.eval = eval;
	}

	public Value init(IntType it) {
		return new Int(0);
	}

	public Value init(BoolType bt) {
		return new Bool(false);
	}
	
	public Value init(Record rt) {
		j0beron.eval.values.Record rec = new j0beron.eval.values.Record();
		for (Field field: rt.getFields()) {
			Value v = field.getType().accept(this);
			for (Ident id: field.getIdents()) {
				rec.set(id, v);
			}
		}
		return rec;
	}

	public Value init(User user) {
		Type type = env.lookupType(user.getIdent());
		return type.accept(this);
	}

	public Value init(Array array) {
		Value size = array.getSize().accept(eval, env);
		Value init = array.getType().accept(this);
		return new j0beron.eval.values.Array(((Int)size).getValue(), init);
	}
	
	
}
