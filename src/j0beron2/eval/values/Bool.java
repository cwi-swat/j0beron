package j0beron2.eval.values;

public class Bool extends Value {

	private final Boolean value;
	
	public Bool(boolean value) {
		this.value = value;
	}
	
	public Boolean getValue() {
		return value;
	}
	
}
