import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

// Visit https://stackoverflow.com/questions/26451636/how-do-i-use-antlr-generated-parser-and-lexer
public class Lol {
	public static void main(String[] args) throws IOException {
		ANTLRInputStream reader = new ANTLRFileStream("in.lol");

		// Pass #1
		LolPass1Lexer pass1Lexer = new LolPass1Lexer(reader);
		CommonTokenStream pass1Tokens = new CommonTokenStream(pass1Lexer);
		LolPass1Parser pass1Parser = new LolPass1Parser(pass1Tokens);
		ParseTree pass1Tree = pass1Parser.program(); // Program is starting production rule
		// System.out.println(pass1Tree.toStringTree());
		
		// Pass #2
		reader.reset();
		LolPass2Lexer pass2Lexer = new LolPass2Lexer(reader);
		CommonTokenStream pass2Tokens = new CommonTokenStream(pass2Lexer);
		LolPass2Parser pass2Parser = new LolPass2Parser(pass2Tokens);
		ParseTree pass2Tree = pass2Parser.program();
	}
}