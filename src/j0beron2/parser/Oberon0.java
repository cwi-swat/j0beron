package j0beron2.parser;

import j0beron2.ast.decl.Module;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class Oberon0 {

	private final BufferedReader stdin;
	private final PrintWriter stdout;

	public Oberon0() {
		this(new BufferedReader(new InputStreamReader(System.in)), new PrintWriter(System.out));
	}
	
	public Oberon0(BufferedReader input, PrintWriter output) {
		this.stdin = input;
		this.stdout = output;
	}
	
	public void run(File file, String ...inputs) {
		String str = "";
		for (int i = 0; i < inputs.length; i++) {
			str +=  inputs[i] + "\n";
		}
		run(file, str);
	}
	
	public void run(File file, String input) {
		BufferedReader stdin = new BufferedReader(new StringReader(input));
		run(file, stdin);
	}
	
	public String runIntoString(File file, String input) {
		StringWriter writer = new StringWriter();
		run(file, input, new PrintWriter(writer));
		return writer.toString();
	}
	
	public void run(File file, String input, PrintWriter output) {
		BufferedReader stdin = new BufferedReader(new StringReader(input));
		run(file, stdin, output);		
	}
	
	public void run(File file) {
		run(file, stdin);
	}
	
	public void run(File file, BufferedReader input)  {
		run(file, input, stdout);
	}
	
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
