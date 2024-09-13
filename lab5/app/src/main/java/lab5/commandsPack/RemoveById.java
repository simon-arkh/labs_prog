package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;
import lab5.app.src.main.java.lab5.parserPack.IntParser;

public class RemoveById extends UpdateById{
    protected RemoveById() {}

    /**
     * This method removes element with the same id if collection has any
     */
    public void removeById() {
        int id;
        try {
            id = IntParser.parse(reader.next());
        } catch (NullFieldException e) {
            System.err.println("Id cannot be null");
            return;
        } catch (NumberFormatException e) {
            System.err.println("Wrong number format");
            return;
        }
        for (Dragon dragon : collection.getCollection()) {
            if (id == dragon.getId()) {
                collection.removeElement(dragon);
                System.out.println("Movie successfully deleted!");
                return;
            }
        }
        System.out.println("No movies with such id");
    }
}
