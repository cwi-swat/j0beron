package j0beron2.ast.type;

import j0beron2.eval.env.Env;
import j0beron2.eval.values.Value;


public class Record extends Type {

	private final Fields fields;

	public Record(Fields fields) {
		this.fields = fields;
	}

	public Fields getFields() {
		return fields;
	}

	@Override
	public Value init(Env env) {
		j0beron2.eval.values.Record rec = new j0beron2.eval.values.Record();
		for (Field field: fields) {
			Value v = field.getType().init(env);
			for (Ident id: field.getIdents()) {
				rec.set(id, v);
			}
		}
		return rec;
	}
	

}
