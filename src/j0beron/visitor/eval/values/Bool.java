package j0beron.visitor.eval.values;

public class Bool extends Value {

	private final Boolean value;
	
	public Bool(boolean value) {
		this.value = value;
	}
	
	public Boolean getValue() {
		return value;
	}
	
}
