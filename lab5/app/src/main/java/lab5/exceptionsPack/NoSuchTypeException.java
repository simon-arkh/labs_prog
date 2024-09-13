package lab5.app.src.main.java.lab5.exceptionsPack;

public class NoSuchTypeException extends Exception{

    @Override
    public String getMessage(){
        return "No such dragon type !";
    }

    
}
