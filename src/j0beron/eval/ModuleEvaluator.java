package j0beron.eval;

import j0beron.ast.decl.ConstSect;
import j0beron.ast.decl.Decls;
import j0beron.ast.decl.FPSect;
import j0beron.ast.decl.FPSects;
import j0beron.ast.decl.Formals;
import j0beron.ast.decl.Module;
import j0beron.ast.decl.Proc;
import j0beron.ast.decl.Procs;
import j0beron.ast.decl.TypeSect;
import j0beron.ast.decl.VarSect;
import j0beron.ast.type.Ident;
import j0beron.ast.type.Idents;
import j0beron.ast.type.IntType;
import j0beron.eval.env.Builtin;
import j0beron.eval.env.Env;
import j0beron.eval.env.Ref;
import j0beron.eval.values.Int;
import j0beron.eval.values.Value;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

import static j0beron.eval.Builtins.initGlobals;

public class ModuleEvaluator {

	private final Module module;
	private final Env env;

	public ModuleEvaluator(Module module, BufferedReader input, PrintWriter output) {
		this.module = module;
		this.env = new Env();
		initGlobals(env, input, output);
	}
	
	
	
	public void run() {
		ExpressionEvaluator expEval = new ExpressionEvaluator();
		module.getDecls().accept(new DeclarationEvaluator(env, expEval));
		StatementEvaluator statEval = new StatementEvaluator(env);
		module.getBody().accept(statEval);
	}
	
}
