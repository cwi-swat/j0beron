package j0beron.interpreter.ast;

import j0beron.interpreter.ast.decl.Body;

public interface IASTVisitor {

	void visitBody(Body body);

}
