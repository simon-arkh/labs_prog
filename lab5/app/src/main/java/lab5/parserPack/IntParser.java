package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;

public class IntParser {
        public static int parse(String line) throws NumberFormatException, NullFieldException {
        if (line.isEmpty()) throw new NullFieldException();
        line = line.replaceAll("_", "");
        return Integer.parseInt(line);
    }

}
