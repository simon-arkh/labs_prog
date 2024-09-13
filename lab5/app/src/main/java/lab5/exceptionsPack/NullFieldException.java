package lab5.app.src.main.java.lab5.exceptionsPack;

public class NullFieldException extends Exception {
    @Override
    public String getMessage() {
        return "Field cannot be null";
    }
}
