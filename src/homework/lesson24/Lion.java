package homework.lesson24;


import homework.lesson24.abstraction.Mammal;

class Lion extends Mammal {

    public Lion(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Lion eats");
    }

    @Override
    public void sleep() {
        System.out.println("Lion sleeps");

    }

    @Override
    public void run() {
        System.out.println("Lion runs very fast");

    }
}
