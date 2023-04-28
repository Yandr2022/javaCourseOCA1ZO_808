package homework.lesson24;

import homework.lesson24.abstraction.Bird;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Penguin don't flies");
    }

    @Override
    public void eat() {
        System.out.println("Penguin eats");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin sleeps");

    }

    @Override
    public void speak() {
        System.out.println("Penguin don't sings, like any birds");
    }
}
