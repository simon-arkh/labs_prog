package lab5.app.src.main.java.lab5.exceptionsPack;

public class IncorrectInputException extends Exception{
        @Override
    public String getMessage() {
        return "Incorrect input";
    }
}
