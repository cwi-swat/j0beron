package j0beron.interpreter.parser;

import j0beron.AbstractOberon0;
import j0beron.interpreter.ast.decl.Module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Oberon0 extends AbstractOberon0 {

	public void run(File file, BufferedReader input, PrintWriter output) {
		FileInputStream src = null;
		try {
			src = new FileInputStream(file);
			Oberon0Lexer lexer = new Oberon0Lexer(src);
			lexer.nextToken();
			Oberon0Parser parser = new Oberon0Parser(lexer);
			if (parser.parse()) {
				Module ast = parser.getResult();
				ast.run(input, output);
			}
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
		finally {
			if (src != null) {
				try {
					src.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}

	
	
}
