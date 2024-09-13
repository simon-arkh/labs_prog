package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.elementsPack.DragonCharacter;
import lab5.app.src.main.java.lab5.elementsPack.DragonHead;
import lab5.app.src.main.java.lab5.elementsPack.DragonType;
import lab5.app.src.main.java.lab5.exceptionsPack.EmptyStringException;
import lab5.app.src.main.java.lab5.exceptionsPack.IncorrectInputException;
import lab5.app.src.main.java.lab5.exceptionsPack.NullFieldException;
import lab5.app.src.main.java.lab5.exceptionsPack.NumberOutOfBoundsException;
import lab5.app.src.main.java.lab5.parserPack.CoordinateXParser;
import lab5.app.src.main.java.lab5.parserPack.CoordinateYParser;
import lab5.app.src.main.java.lab5.parserPack.DragonAgeParser;
import lab5.app.src.main.java.lab5.parserPack.DragonCharacterParser;
import lab5.app.src.main.java.lab5.parserPack.DragonTypeParser;
import lab5.app.src.main.java.lab5.parserPack.IntParser;
import lab5.app.src.main.java.lab5.parserPack.StringParser;

public class RemoveGreater extends Command{
    
    protected RemoveGreater(){}

    public void removeGreater(){
        
        String name;
        long x;
        double y;
        int age;
        DragonCharacter dragonCharacter;
        DragonType dragonType;
        boolean speaking;
        int eyesCount;
        DragonHead dragonHead;
        reader.nextLine();
        while(true){
           try {System.out.println("Enter dragon name");
            name = StringParser.parse(reader.nextLine());
            break;
        } catch (EmptyStringException e){
            System.err.println(e.getMessage());
        } 
        }
        while(true){
            try{
                System.out.println("Enter x coordinate (max -402)");
                x = CoordinateXParser.parse(reader.nextLine());
            } catch (NullFieldException e){
                System.err.println(e.getMessage());
            } catch(NumberOutOfBoundsException e){
                System.err.println(e.getMessage());
            } catch(NumberFormatException e){
                System.err.println("Wrong number format !");
            }      
        }

        while (true){
            try{
                System.out.println("Enter y coordinate (max -693)");
                y = CoordinateYParser.parse(reader.nextLine());
            } catch (NullFieldException e){
                System.err.println(e.getMessage());
            } catch(NumberOutOfBoundsException e){
                System.err.println(e.getMessage());
            } catch(NumberFormatException e){
                System.err.println("Wrong number format !");
            } 
        }

        while (true){
            try {
                System.out.println("Enter dragon's age");
                age = DragonAgeParser.parse(reader.nextLine());
            } catch (NullFieldException e){
                System.err.println(e.getMessage());
            } catch (NumberOutOfBoundsException e){
                System.err.println("Dragon's age can not be less than 1");
            } catch (NumberFormatException e){
                System.err.println("Wrong number format !");
            }
        }

        while (true){
            try {
                System.out.println("Enter dragon character (e.g. evil, wise, good, chaotic, fickle.)");
                dragonCharacter = DragonCharacterParser.parse(reader.nextLine());
                if (dragonCharacter == null) throw new IncorrectInputException();
                break;
            } catch (NullFieldException e) {
                System.err.println(e.getMessage());
            } catch (IncorrectInputException e) {
                System.err.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter dragon type (e.g. water, fire, underground.)");
                dragonType = DragonTypeParser.parse(reader.nextLine());
                if (dragonType == null) throw new IncorrectInputException();
                break;
            } catch (NullFieldException e) {
                System.err.println(e.getMessage());
            } catch (IncorrectInputException e) {
                System.err.println(e.getMessage());
            }

        }

        while (true) {
            try {
                System.out.println("Does dragon speak (yes/no)?");
                String line = StringParser.parse(reader.nextLine());
                if (!line.equals("yes") && !line.equals("no")) throw new IncorrectInputException();
                speaking = line.equals("yes");
                break;
            } catch (Exception e) {
                System.err.println("Line should be either 'yes' or 'no'");
            }
        }

        while (true){
            try{
                System.out.println("How many eyes does dragon have ?");
                eyesCount = IntParser.parse(reader.nextLine());  
            } catch (NullFieldException e){
                System.err.println(e.getMessage());
            } catch (NumberFormatException e){
                System.err.println("Wrong number format !");
            }
        }
    
        dragonHead = new DragonHead(eyesCount);
        Dragon dragon = new Dragon(1, name, null, age, null, dragonType, dragonCharacter, dragonHead, null);
        for (Dragon dragon1 : collection.getCollection()){
            if (dragon.compareTo(dragon1) < 0) collection.removeElement(dragon1);
        }
        System.out.println("Dragons successfully deleted!");

    }
}
