package lesson9;

public class Car {
    String color = "black";
    String engine = "V6";
    static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor() {
        System.out.println("Car color: " + color);
    }

    public void changeColor(String color) {
        System.out.println("Car color was changed");
        int price = 0;
        this.color = color;
        price += 1000;
    }
}
