package j0beron.visitor.ast.stat;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.eval.StatementEvaluator;

public abstract class Stat extends ASTNode {
	
	public abstract void accept(StatementEvaluator eval);

}
