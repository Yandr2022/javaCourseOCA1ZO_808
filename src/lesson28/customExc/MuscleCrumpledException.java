package lesson28.customExc;

public class MuscleCrumpledException extends RuntimeException {
    public MuscleCrumpledException() {
    }

    public MuscleCrumpledException(String message) {
        super(message);
    }
}
