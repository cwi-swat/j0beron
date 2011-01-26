package j0beron.visitor.parser;

import j0beron.AbstractOberon0;
import j0beron.visitor.eval.ModuleEvaluator;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PrintWriter;

public class Oberon0 extends AbstractOberon0 {
	
	@Override
	protected void eval(InputStream src, BufferedReader input, PrintWriter output) {
		Oberon0Lexer lexer = new Oberon0Lexer(src);
		lexer.nextToken();
		Oberon0Parser parser = new Oberon0Parser(lexer);
		if (parser.parse()) {
			ModuleEvaluator eval = new ModuleEvaluator(parser.getResult(), input, output);
			eval.run();
		}
	}

	@Override
	public String getName() {
		return "visitor";
	}
	
	
	
}
