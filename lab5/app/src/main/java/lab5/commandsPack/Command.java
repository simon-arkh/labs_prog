package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.mainPack.DragonCollection;
import lab5.app.lib.*;
import java.util.Scanner;

/**
 * Abstract class inherited by all the commands available
 */
public abstract class Command {
    protected Command() {}
    protected Scanner reader;
    protected DragonCollection collection;
    protected XStream xStream;
    protected boolean readingFromFile = false;
    protected int fileCallsCount = 0;

    /**
     * @return returns next line of scanner
     */
    public String getNextReaderLine() {
        return reader.nextLine();
    }
    public String getNextReaderWord() {
        return reader.next();
    }
    public void setReader(Scanner reader) {
        this.reader = reader;
    }
    public void setCollection(DragonCollection collection) {
        this.collection = collection;
    }

    public boolean isReadingFromFile() {
        return readingFromFile;
    }
    public void stopReadingFromFile() {
        readingFromFile = false;
    }
    public Scanner getReader() {
        return reader;
    }
}