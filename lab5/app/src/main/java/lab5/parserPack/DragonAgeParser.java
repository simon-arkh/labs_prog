package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;
import lab5.app.src.main.java.lab5.exceptionsPack.NumberOutOfBoundsException;

public class DragonAgeParser {
            public static int parse(String line) throws NumberFormatException, NullFieldException, NumberOutOfBoundsException {
        if (line.isEmpty()) throw new NullFieldException();
        int a = Integer.parseInt(line);
        if (a <= 0) throw new NumberOutOfBoundsException();
        return Integer.parseInt(line);
    }

}
