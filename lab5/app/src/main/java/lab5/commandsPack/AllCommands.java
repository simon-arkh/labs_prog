package lab5.app.src.main.java.lab5.commandsPack;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Scanner;
import com.thoughtworks.xstream.XStream;

import lab5.app.src.main.java.lab5.elementsPack.Coordinates;
import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.elementsPack.DragonCharacter;
import lab5.app.src.main.java.lab5.elementsPack.DragonHead;
import lab5.app.src.main.java.lab5.elementsPack.DragonType;
import lab5.app.src.main.java.lab5.mainPack.DragonCollection;
import lab5.app.src.main.java.lab5.parserPack.CollectionParser;

public class AllCommands extends Command {
    public AllCommands() {
        xStream = new XStream();
        xStream.ignoreUnknownElements();
        declareClasses();
        this.collection = loadFromFile();
        this.reader = new Scanner(System.in);
    }


    private DragonCollection loadFromFile() {

        String fileContent = "";
        try {
            Scanner scanner = new Scanner(new FileReader(System.getenv("VAR")));
            while (scanner.hasNext()) {
                fileContent += scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            System.err.println("No file declared in environment");
            System.exit(-1);
        }
        return fileContent.isEmpty() ? new DragonCollection() :
                CollectionParser.parse((DragonCollection) xStream.fromXML(FileDataParser.parse(fileContent)));
    }

    private void declareClasses() {
        xStream.addPermission(AnyTypePermission.ANY);
        xStream.alias("dragonCollection", DragonCollection.class);
        xStream.alias("collection", PriorityQueue.class);
        xStream.alias("dragon", Dragon.class);
        xStream.alias("coordinates", Coordinates.class);
        xStream.alias("creationDate", LocalDate.class);
        xStream.alias("type", DragonType.class);
        xStream.alias("head", DragonHead.class);
        xStream.alias("name", String.class);
        xStream.alias("character", DragonCharacter.class);
        xStream.alias("x", Long.class);
        xStream.alias("y", Double.class);
        xStream.alias("age", Integer.class);
        xStream.alias("speaking", Boolean.class);
    }
}
