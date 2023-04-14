package homework.lesson11;

import static homework.lesson11.CarUpdater.changeDoorAmount;
import static homework.lesson11.CarUpdater.swapColor;

public class Car {
    String color;
    String engine;
    int doorAmount;


    public Car(String color, String engine, int doorAmount) {
        this.color = color;
        this.engine = engine;
        this.doorAmount = doorAmount;
    }

    public void setDoorAmount(int doorAmount) {
        this.doorAmount = doorAmount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", doorAmount=" + doorAmount +
                '}';
    }
}

class CarUpdater {
    public static void changeDoorAmount(int amount, Car car) {
        car.setDoorAmount(amount);
    }

    public static void swapColor(Car car, Car car1) {
        String color = car.color;
        car.setColor(car1.color);
        car1.setColor(color);
    }

}

class Demo {
    public static void main(String[] args) {
        Car car = new Car("black", "V3", 3);
        Car car1 = new Car("white", "V3", 2);
        swapColor(car, car1);
        System.out.println(car);
        System.out.println(car1);
        System.out.println();
        changeDoorAmount(4, car1);
        System.out.println(car1);

    }
}