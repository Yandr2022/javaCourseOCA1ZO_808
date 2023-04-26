package lesson23;

public class Demo1 {
    public static void main(String[] args) {
        Animal animal = new Mouse();
        foo(animal);
        foo(((Mouse) animal));
        animal.getName();
        animal.sleep();
        ((Mouse) animal).sleep();//static method hiding
        System.out.println(animal.age);
        System.out.println(((Mouse) animal).age);//variable hiding


    }

    static void foo(Animal animal) {
        System.out.println("A");
    }

    static void foo(Mouse mouse) {
        System.out.println("M");
    }

}

class Animal {
    double age = 100;

    public void getName() {
        System.out.println("animal");
    }

    public static void sleep() {
        System.out.println("animal sleep");
    }
}

class Mouse extends Animal {
    String age = "one hundred";

    @Override
    public void getName() {
        System.out.println("mouse");
    }

    public static void sleep() {
        System.out.println("mouse sleep");
    }
}