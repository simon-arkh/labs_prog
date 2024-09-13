package lab5.app.src.main.java.lab5.commandsPack;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import com.thoughtworks.xstream.XStream;


public class Save extends Clear{
    protected Save() {}

    public void save() {
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(System.getenv("VAR")));){
            byte[] history = xStream.toXML(collection).getBytes();
            printWriter.write(history, 0, history.length);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            return;
        }
        System.out.println("Collection successfully saved!");
    }
}