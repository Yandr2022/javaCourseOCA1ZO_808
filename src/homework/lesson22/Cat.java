package homework.lesson22;

public class Cat extends Pet {

    public Cat(String name) {
        super(name);
        System.out.println("I'm cat, my name is " + this.getName());
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
