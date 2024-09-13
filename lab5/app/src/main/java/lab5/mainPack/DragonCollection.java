package lab5.app.src.main.java.lab5.mainPack;

import lab5.app.src.main.java.lab5.elementsPack.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class DragonCollection {

    public DragonCollection(){
        this.dateOfCreation = LocalDateTime.now();
    }

        public DragonCollection(LocalDateTime dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
    private final LocalDateTime dateOfCreation;
    private final PriorityQueue<Dragon> collection = new PriorityQueue<Dragon>();

    public void addElement(int age, String name, Coordinates coordinates, DragonType dragonType, DragonCharacter dragonCharacter, DragonHead dragonHead, Boolean speaking){
        int id;
        do{
            id = generateId();
        } while (!validateId(id));
        LocalDate creationDate = LocalDate.now();
        collection.add(new Dragon(id, name, coordinates, age, speaking, dragonType, dragonCharacter, dragonHead, dateOfCreation));

    }

    public void addElement(Dragon dragon){
        collection.add(dragon);
    }

    public int generateId(){
        int id;
        while(true){
            id = (int) (Math.random() * Integer.MAX_VALUE);
            if (validateId(id)) return id;
        }
    }

    private boolean validateId(int id){
        if (id <= 0) return false;
        for(Dragon dragon : collection){
            if(dragon.getId() == id) return false;
        }
        return true;
    }

    public int getNumberOfElements(){
        return collection.size();
    }

    public LocalDateTime getDateOfCreation(){
        return dateOfCreation;
    }

    public PriorityQueue<Dragon> getCollection() {
        return collection;
    }

    public void updateId(Dragon mainDragon){
        for(Dragon dragon : collection){
            if(dragon.getId() == mainDragon.getId()){
                collection.remove(dragon);
                collection.add(mainDragon);
            }
        }
    }

    public void removeElement(Dragon dragon) {
            collection.remove(dragon);
    }

    

}



