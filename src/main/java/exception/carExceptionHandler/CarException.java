package exception.carExceptionHandler;

public class CarException extends RuntimeException {
    public CarException(String message) {
        super("[ERROR] " + message);
    }
}
