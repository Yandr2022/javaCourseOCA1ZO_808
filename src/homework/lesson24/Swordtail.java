package homework.lesson24;


import homework.lesson24.abstraction.Fish;

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

