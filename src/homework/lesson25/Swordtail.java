package homework.lesson25;


import homework.lesson25.abstraction.Fish;

public class Swordtail extends Fish {
    public Swordtail(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Swordtail Fish eats");
    }

    @Override
    public void swim() {
        System.out.println("Swordtail Fish swims");
    }
}

