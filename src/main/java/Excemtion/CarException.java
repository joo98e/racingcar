package Excemtion;

public class CarException extends RuntimeException {
    public CarException(String message) {
        super("[ERROR] " + message);
    }
}
