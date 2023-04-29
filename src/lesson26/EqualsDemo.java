package lesson26;

import java.util.Objects;

public class EqualsDemo {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V2");
        Car c2 = new Car("red", "V2");
        Car c3 = new Car("black", "V2");
        Car c4 = c2;

        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2) + "\n");

        System.out.println(c3 == c2);
        System.out.println(c3.equals(c2) + "\n");

        System.out.println(c4 == c2);
        System.out.println(c4.equals(c2) + "\n");

        System.out.println(c1.equals(null));
        c1 = null;
        System.out.println(c1.equals(c2));

    }
}

class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Car) {
            Car car = (Car) o;
//            return Objects.equals(color, car.color) && Objects.equals(engine, car.engine);
            return color == car.color && engine == car.engine;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}