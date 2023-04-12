package lesson5;

public class Car {
    String color;
    String engine;
    int speed;

    int speedup(int accelerationVal) {
        return speed += accelerationVal;
    }

    int slowdown(int decelerationVal) {
        return speed -= decelerationVal;
    }

    void showInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", speed=" + speed +
                '}';
    }
}
class CarDemo{

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "Blue";
        car1.engine = "V6";
        car1.speed = 60;
        car1.showInfo();
        car1.slowdown(10);
        car1.showInfo();
        car1.speedup(20);
        car1.showInfo();

    }
}