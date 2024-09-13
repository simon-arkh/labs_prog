package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.exceptionsPack.EmptyStringException;

public class StringParser {
    
    public static String parse(String line) throws EmptyStringException {
        line = line.trim();
        if (line.isEmpty()) throw new EmptyStringException();
        while (line.contains("  ")) line = line.replaceAll(" {2}", " ");
        return line;
    }

}
