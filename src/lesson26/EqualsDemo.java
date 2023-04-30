package lesson26;

public class EqualsDemo {
    public static void main(String[] args) {
        Car c1 = new Car("red", "V2");
        Car c2 = new Car("red", "V2");
        Car c3 = new Car("black", "V3");
        Car c4 = c2;
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        System.out.println(c1==c3);
        System.out.println(c1.equals(c3));

        System.out.println(c2 == c4);
        System.out.println(c4.equals(c2));

        Car[]cars = {c1, c2, c3,c4};
        for (Car car:cars) {
            System.out.println(car);
        }

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
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return color.equals(car.color) && engine.equals(car.engine);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}