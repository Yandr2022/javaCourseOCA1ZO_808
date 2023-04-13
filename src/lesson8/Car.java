package lesson8;

public class Car {
    String color = "black";
    String engine = "V6";
}
class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human human = new Human();
//        human.c = new Car();
        human.c.color = "red";

    }
}
