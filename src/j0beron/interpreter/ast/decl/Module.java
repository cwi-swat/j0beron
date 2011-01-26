package j0beron.interpreter.ast.decl;

import static j0beron.interpreter.eval.Builtins.initGlobals;
import j0beron.interpreter.ast.ASTNode;
import j0beron.interpreter.ast.type.Ident;
import j0beron.interpreter.eval.env.Env;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Module extends ASTNode {

	@SuppressWarnings("unused")
	private final Ident name;
	private final Decls decls;
	private final Body body;

	public Module(Ident name, Decls decls, Body body) {
		this.name = name;
		this.decls = decls;
		this.body = body;
	}
	
	public void run(BufferedReader input, PrintWriter output) {
		Env env = new Env();
		initGlobals(env, input, output);
		decls.declare(env);
		body.eval(env);
	}

}
