package lab5.app.src.main.java.lab5.exceptionsPack;

public class EmptyStringException extends Exception{
    @Override
    public String getMessage() {
        return "String cannot be empty";
    }  
}
