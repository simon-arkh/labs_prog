package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.elementsPack.DragonCharacter;

public class DragonCharacterParser {
    
    public static DragonCharacter parse(String line){
        line = line.toLowerCase().replaceAll(" ", "");
        return line.equals("wise") ? DragonCharacter.WISE 
            : line.equals("evil") ? DragonCharacter.EVIL
            : line.equals("good") ? DragonCharacter.GOOD
            : line.equals("chaotic") ? DragonCharacter.CHAOTIC
            : line.equals("fickle") ? DragonCharacter.FICKLE
            : null;
    }

}