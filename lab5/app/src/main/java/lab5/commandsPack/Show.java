package lab5.app.src.main.java.lab5.commandsPack;



import lab5.app.src.main.java.lab5.elementsPack.Dragon;

public class Show extends Info{
    protected Show() {}

    public void show() {
        for (Dragon dragon : collection.getCollection()) {
            System.out.println(dragon);
        }
    }
}
