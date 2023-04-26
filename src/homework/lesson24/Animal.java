package homework.lesson24;

abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }
    @Override
    void sleep() {
        System.out.println("Fish sleep");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " speaks");;
    }
}
abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
    }

    abstract void run();
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}

class Swordtail extends Fish{
    public Swordtail(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Swordtail Fish eats");
    }

    @Override
    void swim() {
        System.out.println("Swordtail Fish swims");
    }
}

class Penguin{}