package lab5.app.src.main.java.lab5.parserPack;

import lab5.app.src.main.java.lab5.elementsPack.DragonType;

public class DragonTypeParser {
        
    public static DragonType parse(String line){
        line = line.toLowerCase().replaceAll(" ", "");
        return line.equals("water") ? DragonType.WATER
                : line.equals("underground") ? DragonType.UNDERGROUND
                : line.equals("fire") ? DragonType.FIRE
                : null; 
    }
}

