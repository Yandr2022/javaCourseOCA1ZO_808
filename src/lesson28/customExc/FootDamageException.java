package lesson28.customExc;

public class FootDamageException extends Exception {
    public FootDamageException() {
    }

    public FootDamageException(String message) {
        super(message);
    }
}
