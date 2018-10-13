import java.util.ArrayList;
import java.util.List;

public class ACSPTypeChecker extends ACSPBaseVisitor<Boolean> {

    public List<String> getErrors() {
        return errors;
    }

    private List<String> errors = new ArrayList<String>();

    @Override
    public Boolean visitSkipCmd(ACSPParser.SkipCmdContext ctx) {
        return true;
    }
}
