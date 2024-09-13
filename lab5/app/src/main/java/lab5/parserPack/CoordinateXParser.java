package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;
import lab5.app.src.main.java.lab5.exceptionsPack.NumberOutOfBoundsException;

public class CoordinateXParser {
        public static long parse(String line) throws NumberFormatException, NullFieldException, NumberOutOfBoundsException {
        if (line.isEmpty()) throw new NullFieldException();
        long x = Long.parseLong(line);
        if (x > -402){
            throw new NumberOutOfBoundsException();
        }
        return x;
    }
}
