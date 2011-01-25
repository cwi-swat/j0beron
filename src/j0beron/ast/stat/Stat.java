package j0beron.ast.stat;

import j0beron.ast.ASTNode;
import j0beron.eval.StatementEvaluator;

public abstract class Stat extends ASTNode {
	
	public abstract void accept(StatementEvaluator eval);

}
