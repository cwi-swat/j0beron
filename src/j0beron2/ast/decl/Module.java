package j0beron2.ast.decl;

import static j0beron2.eval.Builtins.initGlobals;
import j0beron2.ast.ASTNode;
import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Env;

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
