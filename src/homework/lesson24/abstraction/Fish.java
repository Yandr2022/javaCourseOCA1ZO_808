package homework.lesson24.abstraction;

public abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void sleep() {
        System.out.println("Fish sleeps");
    }

    public abstract void swim();
}