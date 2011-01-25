package j0beron.ast.type;

import j0beron.ast.ASTNode;
import j0beron.eval.TypeInitializer;
import j0beron.eval.values.Value;

public abstract class Type extends ASTNode {
	
	public abstract Value accept(TypeInitializer init);

}
