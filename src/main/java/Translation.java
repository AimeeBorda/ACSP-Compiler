import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Translation {

    public static void main(final String[] args) throws IOException {
        Translation t = new Translation(args[0]);
        t.translate();
    }

    private ACSPTranslator translator;
    private ACSPTypeChecker typeChecker;
    private final String input;

    public void translate() throws IOException {
        translate("temp.csp");
    }

    public Translation(String input) {
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
        new ProcessBuilder("/bin/bash", "-c", "open " + file).start();
    }

    private  void typeCheckProcess() throws IOException {
        ACSPPreProcessor acspPreProcessor = new ACSPPreProcessor(getParser());
        typeChecker = new ACSPTypeChecker(getParser(),acspPreProcessor.envMap);
    }

    private boolean isWellTyped(){
        return typeChecker.isWellTyped();
    }

    private  void showErrorMessages(){
        typeChecker.errors.stream().forEach(System.err::println);
    }
}
