package lesson28.customExc;

public class Marathon {
    void start(int airTemperature, int speed) throws FootDamageException {
        if (speed > 12) {
            throw new FootDamageException("you ran too fast: " + speed + ", and sprained your ankle");
        }
        if (airTemperature > 32) {
            throw new MuscleCrumpledException("too hot: " + airTemperature + ", cramped a muscle");
        }
        System.out.println("You won!!");
    }

    public static void main(String[] args)  {
        Marathon marathon = new Marathon();
        try {
            marathon.start(30,13);
        }catch (FootDamageException|MuscleCrumpledException e) {
            System.err.println(e.getMessage());
        }finally {
            System.out.println("Thanks for participating");
        }

    }
}
