package homework.lesson24.abstraction;

import homework.lesson24.abstraction.IF.Speakable;

public abstract class Mammal extends Animal implements Speakable {

    public Mammal(String name) {
        super(name);
        this.name = name;;
    }

    public abstract void run();
}
