package j0beron2.ast.type;

import j0beron2.ast.ASTNode;

public class Ident extends ASTNode {
	
	private final String name;

	public Ident(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Ident)) {
			return false;
		}
		return name.equals(((Ident)obj).name);
	}
}
