package j0beron2.ast.decl;

import static j0beron2.eval.Builtins.initGlobals;

import java.io.BufferedReader;
import java.io.PrintWriter;

import j0beron2.ast.ASTNode;
import j0beron2.ast.type.Ident;
import j0beron2.eval.env.Env;

public class Module extends ASTNode {

	private final Ident name;
	private final Decls decls;
	private final Body body;

	public Module(Ident name, Decls decls, Body body) {
		this.name = name;
		this.decls = decls;
		this.body = body;
	}
	
	public Body getBody() {
		return body;
	}
	
	public Decls getDecls() {
		return decls;
	}
	
	public Ident getName() {
		return name;
	}
	
	public void run(BufferedReader input, PrintWriter output) {
		Env env = new Env();
		initGlobals(env, input, output);
		decls.declare(env);
		body.eval(env);
	}

}
