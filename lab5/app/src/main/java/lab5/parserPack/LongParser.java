package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;

public class LongParser {
        public static long parse(String line) throws NumberFormatException, NullFieldException {
        if (line.isEmpty()) throw new NullFieldException();
        return Long.parseLong(line);
    }
}
