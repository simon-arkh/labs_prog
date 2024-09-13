package lab5.app.src.main.java.lab5.exceptionsPack;

public class NumberOutOfBoundsException extends Exception{
    @Override
    public String getMessage() {
        return "Number does not fit the requirements";
    }
}