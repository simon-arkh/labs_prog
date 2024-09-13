package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.elementsPack.DragonType;
import lab5.app.src.main.java.lab5.exceptionsPack.IncorrectInputException;
import lab5.app.src.main.java.lab5.parserPack.DragonTypeParser;

public class FilterByType extends Command{
    protected FilterByType(){}

    public void FilterByType(){

        DragonType dragonType;
        try{
            dragonType = DragonTypeParser.parse(reader.next());
            if (dragonType == null) throw new IncorrectInputException();
        } catch(IncorrectInputException e){
            System.err.println(e.getMessage());
        }

        for (Dragon dragon : collection.getCollection()){
            if(dragon.getDragonType() == dragonType) System.out.println(dragon);
        }
    }
}
