import java.io.*;

import org.antlr.v4.runtime.*;

public class Test {
    public static void main(final String[] args) throws IOException {
        String printSource = null, printSymTab = null, printIR = null, printAsm = null;
        ACSPLexer lexer = new ACSPLexer(new ANTLRInputStream(args[0]));
        ACSPParser parser = new ACSPParser(new CommonTokenStream(lexer));
        String postfix = parser.eval();
        System.out.println(postfix);

    }
}



