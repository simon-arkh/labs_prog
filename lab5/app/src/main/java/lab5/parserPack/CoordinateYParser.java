package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;
import lab5.app.src.main.java.lab5.exceptionsPack.NumberOutOfBoundsException;

public class CoordinateYParser {
        public static Double parse(String line) throws NumberFormatException, NullFieldException, NumberOutOfBoundsException {
        if (line.isEmpty()) throw new NullFieldException();
        Double y = Double.parseDouble(line);
        if (y > -693.0){
            throw new NumberOutOfBoundsException();
        }
        return y;
    }
}
