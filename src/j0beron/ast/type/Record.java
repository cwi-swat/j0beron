package j0beron.ast.type;

import j0beron.eval.TypeInitializer;
import j0beron.eval.values.Value;


public class Record extends Type {

	private final Fields fields;

	public Record(Fields fields) {
		this.fields = fields;
	}

	@Override
	public Value accept(TypeInitializer init) {
		return init.init(this);
	}
	
	public Fields getFields() {
		return fields;
	}
	

}
