package j0beron.ast.decl;

import j0beron.ast.ASTNode;
import j0beron.eval.DeclarationEvaluator;

public abstract class Section extends ASTNode {

	public abstract void accept(DeclarationEvaluator eval);
	
}
