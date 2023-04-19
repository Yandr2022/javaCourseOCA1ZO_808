package lesson16;

public class Car {
     String color;
    String engine;
    final static  int a = 5;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public Car getCar(String color) {
        return new Car(color,"V4");
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
class CarDemo{

    public static void main(String[] args) {
  Car c = new Car("red","V6");
        Car c1 = c.getCar("black");
        System.out.println(c);
        System.out.println(c1);
    }
}