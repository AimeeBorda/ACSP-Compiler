import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Collectors;

public class Translation {

    private String dir;
    public static void main(final String[] args) throws IOException {
        Translation t = new Translation(args[0]);
        t.translate();
    }

    private ACSPTranslator translator;
    private ACSPTypeChecker typeChecker;
    private final String input;
    private final String output;


    public static String getFileName(ACSPParser.IncludeFileContext ctx,String dir){
        return dir+ctx.ID().stream().map(c -> c.getText().trim()).collect(Collectors.joining("/")) +".acsp";
    }

    public Translation(String input) {
        this.input = input;
        this.output = input.replace(".acsp",".csp");
    }

    private ACSPParser getParser() throws IOException {

        CharStream input = CharStreams.fromFileName(this.input);
        File f = new File(this.input);
        dir = f.getAbsoluteFile().getParent() +"/";
        return new ACSPParser(new CommonTokenStream(new ACSPLexer(input)));
    }

    public void translate() throws IOException {
        typeCheckProcess();

        if(isWellTyped()){
            translateProcess();
            writeToFile();
            openFDR();
        }else {
            showErrorMessages();
        }
    }

    private  void translateProcess() throws IOException {
        translator = new ACSPTranslator(getParser(),dir);
    }

    private  void writeToFile() throws FileNotFoundException {
        System.out.println(translator.cspProcess);
        PrintWriter out = new PrintWriter(output);
        out.println(translator.cspProcess);
        out.flush();
    }

    private void openFDR() throws IOException {
        new ProcessBuilder("/bin/bash", "-c", "open " + output).start();
    }

    private  void typeCheckProcess() throws IOException {
        ACSPPreProcessor acspPreProcessor = new ACSPPreProcessor(getParser(),dir);
        typeChecker = new ACSPTypeChecker(getParser(),acspPreProcessor.envMap,dir);
    }

    private boolean isWellTyped(){
        return typeChecker.isWellTyped();
    }

    private  void showErrorMessages(){
        typeChecker.errors.stream().forEach(System.err::println);
    }
}
