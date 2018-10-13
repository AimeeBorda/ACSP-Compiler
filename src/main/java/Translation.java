import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

public class Translation {
    private ParseTree acspProcess;


    public Translation(String input) throws IOException {
        this.acspProcess = getParseTree(input);
    }

    public void translate(String output) throws IOException {
        Optional<List<String>> errorMessages = typeCheckProcess();

        if(errorMessages.isPresent()){
            showErrorMessages(errorMessages.get());
        }else {

            String cspProcess = translateProcess();
            startFDR(cspProcess, output);
        }
    }

    public void translate() throws IOException {
        translate(null);
    }

    private void startFDR(String cspProcess, String output) throws IOException {
        if(output == null){
            output = "temp.csp";
        }


        writeToFile(cspProcess,output);
        //openFDR(output);
    }

    private  ParseTree getParseTree(String input) throws IOException {
        ACSPLexer lexer = new ACSPLexer(CharStreams.fromFileName(input));
        ACSPParser parser = new ACSPParser(new CommonTokenStream(lexer));
        ACSPParser.SpecContext acspProcess = parser.spec();

        return acspProcess;
    }

    private  void showErrorMessages(List<String> errorMessages){
        errorMessages.stream().forEach(System.err::println);
    }

    private  String translateProcess(){
        ACSPTranslatorVisitor translator = new ACSPTranslatorVisitor();
        return translator.visit(acspProcess);

    }

    private void openFDR(String file) throws IOException {
        new ProcessBuilder("/bin/bash", "-c", "open "+file).start();
    }

    private  Optional<List<String>> typeCheckProcess(){
        ACSPTypeChecker typeChecker = new ACSPTypeChecker();
        ACSPTypeChecker.InOut env = typeChecker.visit(acspProcess);
        if(isWellTyped(env)){
            return Optional.empty();
        } else{
            return Optional.of(typeChecker.getErrors());
        }
    }

    private boolean isWellTyped(ACSPTypeChecker.InOut env){
        return env!=null && env.isEmpty();
    }


    private  void writeToFile(String output, String fileName) throws FileNotFoundException {
        System.out.println("output:" + output);
        PrintWriter out = new PrintWriter(fileName);
        out.println(output);
    }
}
