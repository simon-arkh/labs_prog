package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.mainPack.DragonCollection;

public class CollectionParser {
    public static DragonCollection parse(DragonCollection dragonCollection) {
        DragonCollection parsedDragonCollection = new DragonCollection(dragonCollection.getDateOfCreation());
        for (Dragon dragon : dragonCollection.getCollection()) {
            for (Dragon dragon1 : dragonCollection.getCollection()) {
                if (dragon.getId() == dragon1.getId() && !dragon.equals(dragon1)) {
                    dragonCollection.removeElement(dragon);
                }
            }
        }
        for (Dragon dragon : dragonCollection.getCollection()) {
            boolean toBeRemoved = false;
            if (dragon.getId() <= 0) {
                toBeRemoved = true;
            }
            if (dragon.getName() == null) {
                toBeRemoved = true;
            }
            if (dragon.getName() == "") {
                toBeRemoved = true;
            }
            if (dragon.getCoordinates() == null) {
                toBeRemoved = true;
            }
            else {
                if (dragon.getCoordinates().getX() > -402) {
                    toBeRemoved = true;
                }
                if (dragon.getCoordinates().getY() > -693) {
                    toBeRemoved = true;
                }
            }
            if (dragon.getCreationDate() == null) {
                toBeRemoved = true;
            }
            if (dragon.getAge() < 1) {
                toBeRemoved = true;
            }
            if (dragon.getSpeaking() == null){
                toBeRemoved = true;
            }
            if (dragon.getDragonType() == null){
                toBeRemoved = true;
            }
            if (dragon.getDragonCharacter() == null){
                toBeRemoved = true;
            }
            if (!toBeRemoved) {
                parsedDragonCollection.addElement(dragon);
            }
        }
        return parsedDragonCollection;
    }
}
