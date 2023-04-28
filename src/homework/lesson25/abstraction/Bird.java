package homework.lesson25.abstraction;


import homework.lesson25.abstraction.IF.Speakable;

public abstract class Bird extends Animal implements Speakable {

    public Bird(String name) {
        super(name);
        this.name = name;
    }

    public abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}
