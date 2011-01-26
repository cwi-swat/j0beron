package j0beron.visitor.ast.decl;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.DeclarationEvaluator;

public abstract class Section extends ASTNode {

	public abstract void accept(DeclarationEvaluator eval);
	
}
