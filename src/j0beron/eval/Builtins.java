package j0beron.eval;

import j0beron.ast.decl.ConstSect;
import j0beron.ast.decl.Decls;
import j0beron.ast.decl.FPSect;
import j0beron.ast.decl.FPSects;
import j0beron.ast.decl.Formals;
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
import java.io.PrintWriter;

public class Builtins {

	
	public static void initGlobals(Env env, final BufferedReader input, final PrintWriter output) {
		Decls empty = new Decls(new ConstSect(), new TypeSect(), new VarSect(), new Procs());
		
		Ident writeLn = new Ident("WriteLn");
		env.declareProc(writeLn, new Proc(writeLn, new Formals(), empty, new Builtin() {
			@Override
			public void accept(StatementEvaluator eval) {
				output.println();
				output.flush();
			}
		}));

		final Ident x = new Ident("x");

		Ident write = new Ident("Write");
		env.declareProc(write, new Proc(write, 
				new Formals(new FPSects(new FPSect(false, new Idents(x), new IntType()))), empty, new Builtin() {
			@Override
			public void accept(StatementEvaluator eval) {
				Value y = ((Ref)eval.getEnv().lookup(x)).get();
				output.print(((Int)y).getValue());
				output.flush();
			}
		}));
		
		
		Ident read = new Ident("Read");
		env.declareProc(read, new Proc(read, 
				new Formals(new FPSects(new FPSect(true, new Idents(x), new IntType()))), empty, new Builtin() {
			@Override
			public void accept(StatementEvaluator eval) {
				Ref ref = (Ref)eval.getEnv().lookup(x);
				String line = null;
			    try {
			    	line = input.readLine();
			    	ref.set(new Int(Integer.parseInt(line)));
			    } 
			    catch (IOException e) {
			    	throw new RuntimeException(e);
			    }
			}
		}));

	}
}
