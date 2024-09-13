package lab5.app.src.main.java.lab5.elementsPack;

import java.time.LocalDateTime;

public class Dragon implements Comparable<Dragon>{
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private int age; //Значение поля должно быть больше 0
    private Boolean speaking; //Поле может быть null
    private DragonType type; //Поле может быть null
    private DragonCharacter character; //Поле может быть null
    private DragonHead head; 

    public Dragon(int id, String name, Coordinates coordinates, int age, Boolean speaking, DragonType dragonType, DragonCharacter dragonCharacter, DragonHead dragonHead, LocalDateTime creationDate){
        this.id = id;
        this.age = age;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.character = dragonCharacter;
        this.speaking = speaking;
        this.type = dragonType;
        this.head = dragonHead;
        this.speaking = speaking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDateTime getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public Coordinates getCoordinates(){
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates){
        this.coordinates = coordinates;
    }

    public DragonHead getDragonHead(){
        return head;
    }

    public void setDragonHead(DragonHead dragonHead){
        this.head = dragonHead;
    }

    public DragonType getDragonType(){
        return type;
    }

    public void setDragonType(DragonType dragonType){
        this.type = dragonType;
    }

    public DragonCharacter getDragonCharacter(){
        return character;
    }

    public void setDragonCharacter(DragonCharacter dragonCharacter){
        this.character = dragonCharacter;
    }

    public Boolean getSpeaking(){
        return speaking;
    }

    public void setSpeaking(Boolean speaking){
        this.speaking = speaking;
    }

    public int getId(){
        return id;
    }


    @Override
    public int compareTo(Dragon dragon) {
        return dragon == null ? -1 : java.lang.Integer.compare(this.age, dragon.age);
    }



}
