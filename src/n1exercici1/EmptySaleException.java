package n1exercici1;

public class EmptySaleException extends Exception {

    public EmptySaleException() {}

    public EmptySaleException(String errorMessage) {
        super(errorMessage);
    }
}
