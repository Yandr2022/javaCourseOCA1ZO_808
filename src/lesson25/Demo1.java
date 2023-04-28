package lesson25;

public class Demo1 {
    public static void main(String[] args) {
        Jumpable j = new Man();
        Car c = new Car();
        if (j instanceof Jumpable)
            System.out.println("j is jumpable");
        if (j instanceof Human)
            System.out.println("j is Human");
//        if (c instanceof Human) incompatible types
//            System.out.println("j is Human");
        if (c instanceof Jumpable)
            System.out.println("c is Jumpable");
    }

}
interface Jumpable{}
class Human implements Jumpable{}
class Man extends Human{}
class  Car{}