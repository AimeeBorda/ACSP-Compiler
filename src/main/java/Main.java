import java.io.*;
import java.util.List;
import java.util.Optional;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {

    public static void main(final String[] args) throws IOException {
        Translation t = new Translation(args[0]);
        t.translate();
    }
}



