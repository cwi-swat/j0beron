package j0beron.visitor.eval;

import static j0beron.visitor.eval.Builtins.initGlobals;
import j0beron.visitor.ast.decl.Module;
import j0beron.visitor.eval.env.Env;

import java.io.BufferedReader;
import java.io.PrintWriter;

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
