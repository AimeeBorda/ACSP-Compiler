import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Translation {

    private ACSPTranslator translator;
    private ACSPTypeChecker typeChecker;
    private final String input;

    public void translate() throws IOException {
        translate("temp.csp");
    }

    public Translation(String input) throws IOException {
        this.input = input;
    }

    private ACSPParser getParser() throws IOException {
        return new ACSPParser(new CommonTokenStream(new ACSPLexer(CharStreams.fromFileName(input))));
    }

    public void translate(String output) throws IOException {
        typeCheckProcess();

        if(isWellTyped()){
            translateProcess();
            writeToFile(output);
            openFDR(output);
        }else {
            showErrorMessages();
        }
    }

    private  void translateProcess() throws IOException {
        translator = new ACSPTranslator(getParser());
    }

    private  void writeToFile(String fileName) throws FileNotFoundException {
        System.out.println(translator.cspProcess);
        PrintWriter out = new PrintWriter(fileName);
        out.println(translator.cspProcess);
        out.flush();
    }

    private void openFDR(String file) throws IOException {
        new ProcessBuilder("/bin/bash", "-c", "open "+file).start();
    }

    private  void typeCheckProcess() throws IOException {
        typeChecker = new ACSPTypeChecker(getParser());
    }

    private boolean isWellTyped(){
        return typeChecker.isWellTyped();
    }

    private  void showErrorMessages(){
        typeChecker.errors.stream().forEach(System.err::println);
    }
}
