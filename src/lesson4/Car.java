package lesson4;

public class Car {
    String color = "red";
    String engine = "v6";

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        Car car3 = car2;
        System.out.println(car + "\n" + car2 + "\n" + car3 + "\n");
        car.color = "blue";
        car2.color = "black";
        System.out.println(car + "\n" + car2 + "\n" + car3);
        System.out.println("color: " + new Car().color);
    }

}
