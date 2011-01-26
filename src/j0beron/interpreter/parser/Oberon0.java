package j0beron.interpreter.parser;

import j0beron.AbstractOberon0;
import j0beron.interpreter.ast.decl.Module;

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
			Module ast = parser.getResult();
			ast.run(input, output);
		}
	}
	
	
}
