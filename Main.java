import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                System.err.println("Error: Please provide a Pascal source file.");
                return;
            }

            // Create input stream from file
            CharStream input = CharStreams.fromFileName(args[0]);
            
            // Create lexer
            delphiLexer lexer = new delphiLexer(input);
            
            // Create token stream
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            
            // Create parser
            delphiParser parser = new delphiParser(tokens);
            
            // Create parse tree
            ParseTree tree = parser.program();
            
            // Create interpreter and visit parse tree
            DelphiInterpreter interpreter = new DelphiInterpreter();
            interpreter.visit(tree);
            
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}