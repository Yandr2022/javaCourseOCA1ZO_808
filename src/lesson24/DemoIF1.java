package lesson24;

public class DemoIF1 {
    public static void main(String[] args) {
        Jumpable jumpables[] = {new Human(), new Animal()};
        for (Jumpable jumpable : jumpables
        ) {
            jumpable.jump();
        }
    }
}

class Human implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Human jumps");
    }
}

class Animal implements Jumpable {
    @Override
    public void jump() {
        System.out.println("Animal jumps");
    }
}

interface Jumpable {
    void jump();
}

interface X {
    void abc();
}

interface Y extends X, Jumpable {
    void def();
}
abstract class D implements Y{}
