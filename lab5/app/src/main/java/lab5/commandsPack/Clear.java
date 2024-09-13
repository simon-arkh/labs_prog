package lab5.app.src.main.java.lab5.commandsPack;

import lab5.app.src.main.java.lab5.mainPack.DragonCollection;

public class Clear extends RemoveById {
    protected Clear() {}


    public void clear() {
        collection = new DragonCollection();
    }
}
