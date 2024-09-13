package lab5.app.src.main.java.lab5.commandsPack;

public class RemoveFirst extends Exit{
    
    protected RemoveFirst() {}


    public void removeHead() {
        if (!collection.getCollection().isEmpty()) {
            collection.removeElement(collection.getCollection().poll());
            System.out.println("Dragon successfully deleted!");
            return;
        }
        System.out.println("Collection is empty!");
    }
}
