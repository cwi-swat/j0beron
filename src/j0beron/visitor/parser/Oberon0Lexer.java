package j0beron.visitor.parser;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import j0beron.visitor.ast.ASTNode;
import j0beron.visitor.ast.expr.Int;
import j0beron.visitor.ast.type.Ident;

public class Oberon0Lexer implements Oberon0Tokens {
	private static final Map<String, Integer> KEYWORDS;
	
	static {
		KEYWORDS = new HashMap<String, Integer>();
		KEYWORDS.put("ARRAY", ARRAY);
		KEYWORDS.put("BEGIN", BEGIN);
		KEYWORDS.put("BOOLEAN", BOOLEAN);
		KEYWORDS.put("CONST", CONST);
		KEYWORDS.put("DIV", DIV);
		KEYWORDS.put("DO", DO);
		KEYWORDS.put("ELSE", ELSE);
		KEYWORDS.put("ELSIF", ELSIF);
		KEYWORDS.put("END", END);
		KEYWORDS.put("IF", IF);
		KEYWORDS.put("INTEGER", INTEGER);
		KEYWORDS.put("LEQ", LEQ);
		KEYWORDS.put("MOD", MOD);
		KEYWORDS.put("MODULE", MODULE);
		KEYWORDS.put("OF", OF);
		KEYWORDS.put("OR", OR);
		KEYWORDS.put("PROCEDURE", PROCEDURE);
		KEYWORDS.put("RECORD", RECORD);
		KEYWORDS.put("THEN", THEN);
		KEYWORDS.put("TYPE", TYPE);
		KEYWORDS.put("VAR", VAR);
		KEYWORDS.put("WHILE", WHILE);
	}
	
	
	private int token;
	private int c = ' ';
	
	private ASTNode yylval;
	private final InputStream input;

	public Oberon0Lexer(InputStream input) {
		this.input = input;
	}
	
	
	private void nextChar() {
		if (c >= 0) {
			try {
				c = input.read();
			}
			catch (IOException e) {
				c = -1;
			}
		}
		
	}
	
	public int nextToken() {
		boolean inComment = false;
		for (;;) {
			if (inComment) {
				while (c != '*' && c != -1) {
					nextChar();
				}
				if (c == '*') {
					nextChar();
					if (c == ')') {
						nextChar();
						inComment = false;
					}
					continue;
				}
			}
			
			while (c == ' ' || c == '\t' || c == '\n' || c == '\r') {
				nextChar();
			}
			
			if (c < 0) {
				return token = ENDINPUT;
			}
			
			switch (c) {
			    case '#': nextChar(); return token = '#';
			    case '&': nextChar(); return token = '&';
			    case '(': {
			    	nextChar();
			    	if (c == '*') {
			    		inComment = true;
			    		nextChar();
			    		continue;
			    	}
			    	return token = '('; 
			    }
			    case ')': nextChar(); return ')';
			    case '*': {
			    	nextChar();
			    	if (inComment && c == ')') {
			    		inComment = false;
			    		nextChar();
			    		continue;
			    	}
			    	return token = '*';
			    }
			    case '+': nextChar(); return token = '+';
			    case ',': nextChar(); return token = ',';
			    case '-': nextChar(); return token = '-';
			    case '.': nextChar(); return token = '.';
			    case ':': {
			    	nextChar();
			    	if (c == '=') {
			    		nextChar();
			    		return token = BECOMES;
			    	}
			    	return token = ':';
			    }
			    case ';': nextChar(); return token = ';';
			    case '<': {
			    	nextChar();
			    	if (c == '=') {
			    		nextChar();
			    		return token = LEQ;
			    	}
			    	return '<';
			    }
			    case '=': nextChar(); return token =  '=';
			    case '>': {
			    	nextChar();
			    	if (c == '=') {
			    		nextChar();
			    		return token = GEQ;
			    	}
			    	return token = '>';
			    }
			    case '[': nextChar(); return token = '[';
			    case ']': nextChar(); return token = ']';
			    case '~': nextChar(); return token = '~';
			    default: {
			    	if (Character.isDigit(c)) {
			    		int n = 0; 
			    		do {
			    			n = 10 * n + (c - '0');
			    			nextChar(); 
			    		} while (Character.isDigit(c)); 
			    		yylval = new Int(n);
			    		return token = INT;
			    	}
			    	if (Character.isLetter(c)) {
			    		StringBuilder sb = new StringBuilder();
			    		do {
			    			sb.append((char)c);
			    			nextChar();
			    		}
			    		while (Character.isLetterOrDigit(c));
			    		String name = sb.toString();
			    		if (KEYWORDS.containsKey(name)) {
			    			return token = KEYWORDS.get(name);
			    		}
						yylval = new Ident(name);
			    		return token = IDENT;
			    	}
			    	throw new RuntimeException("Unexpected character: " + c);
			    }
			}
		}
	}

	
	public int getToken() {
		return token;
	}

	public ASTNode getSemantic() {
		return yylval;
	}


}
