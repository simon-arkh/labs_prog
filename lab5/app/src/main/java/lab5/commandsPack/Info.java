package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.elementsPack.Dragon;

public class Info extends Help {
    protected Info() {
        super();
    }

    public void info() {
        int n = 0;
        System.out.println("Collection type: " + Dragon.class.getSimpleName() +
                "\nDate of initialization: " + collection.getDateOfCreation() +
                "\nNumber of elements stored: " + collection.getNumberOfElements() +
                '\n');
    }
}