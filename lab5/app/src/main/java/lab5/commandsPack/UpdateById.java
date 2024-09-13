package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;
import lab5.app.src.main.java.lab5.elementsPack.DragonCharacter;
import lab5.app.src.main.java.lab5.elementsPack.DragonHead;
import lab5.app.src.main.java.lab5.elementsPack.DragonType;
import lab5.app.src.main.java.lab5.exceptionsPack.*;
import lab5.app.src.main.java.lab5.parserPack.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class UpdateById extends Add{
    
    protected UpdateById() {}

    public void update() throws NumberOutOfBoundsException {
        int id;
        while (true){
           try {
            id = IntParser.parse(reader.next());
            break;
            } catch (NullFieldException e){
                    System.err.println(e.getMessage());
            } catch (NumberFormatException e){
                System.err.println("Wrong number format");
            }
        }
        
        reader.nextLine();
        Dragon oldDragon = null;
        for (Dragon dragon : collection.getCollection()) {
            if (id == dragon.getId()) {
                oldDragon = dragon;
                break;
            }
        }
        if (oldDragon == null) {
            System.out.println("No movie with such id");
            return;
        }

        LocalDateTime creationDate = oldDragon.getCreationDate();
        String name;
        long x;
        double y;
        int age;
        DragonCharacter dragonCharacter;
        DragonType dragonType;
        boolean speaking;
        int eyesCount;
        DragonHead dragonHead;

        try {
            System.out.println("Enter dragon name");
            name = StringParser.parse(reader.nextLine());
        } catch (EmptyStringException ignored) {
            name = oldDragon.getName();
        }

         while (true) {
            try {
                System.out.println("Enter x coordinate (max -402)");
                x = CoordinateXParser.parse(reader.nextLine());
                break;
            } catch (NullFieldException ignored) {
                x = oldDragon.getCoordinates().getX();
                break;
            } catch (NumberFormatException e) {
                System.err.println("Wrong number format");
            }
        }

        
        while (true){
            try{
                System.out.println("Enter y coordinate (max -693)");
                y = CoordinateYParser.parse(reader.nextLine());
            } catch (NullFieldException e){
                y = oldDragon.getCoordinates().getY();
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
                age = oldDragon.getAge();
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
                if (dragonCharacter == null) dragonCharacter = oldDragon.getDragonCharacter();
                break;
            } catch (IncorrectInputException e) {
                System.err.println(e.getMessage());
            }
        }

        while (true) {
            try {
                System.out.println("Enter dragon type (e.g. water, fire, underground.)");
                dragonType = DragonTypeParser.parse(reader.nextLine());
                if (dragonType == null) dragonType = oldDragon.getDragonType();
                break;
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
    }
}
