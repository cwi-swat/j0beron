package j0beron.visitor.ast.type;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.TypeInitializer;
import j0beron.visitor.eval.values.Value;

public abstract class Type extends ASTNode {
	
	public abstract Value accept(TypeInitializer init);

}
