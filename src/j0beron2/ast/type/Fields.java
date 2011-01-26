package j0beron2.ast.type;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import j0beron2.ast.ASTNode;

public class Fields extends ASTNode implements Iterable<Field> {
	private final List<Field> fields;
	
	public Fields(Field field, Fields fields) {
		this(field);
		this.fields.addAll(fields.fields);
	}

	public Fields(Field field) {
		fields = new LinkedList<Field>();
		fields.add(field);
	}

	@Override
	public Iterator<Field> iterator() {
		return fields.iterator();
	}


}
