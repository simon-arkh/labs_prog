package lab5.app.src.main.java.lab5.commandsPack;

import java.io.FileNotFoundException;

import lab5.app.src.main.java.lab5.exceptionsPack.EmptyStringException;
import lab5.app.src.main.java.lab5.parserPack.StringParser;

public class ExecuteScript extends Save  {
    protected ExecuteScript() {}

    public void executeScript() {
        try {
            String fileName = StringParser.parse(reader.next());
            if (readingFromFile) fileCallsCount++;
            if (fileCallsCount > 100) {
                System.err.println("Too many file calls");
                fileCallsCount = 0;
                return;
            }
            reader = new Scanner(new FileReader(fileName));
            readingFromFile = true;
        } catch (EmptyStringException e) {
            System.err.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.err.println("No such file");
        }
    }
}