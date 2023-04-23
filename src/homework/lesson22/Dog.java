package homework.lesson22;

public class Dog extends Pet {

    public Dog(String name) {
        super(name);
        System.out.println("I'm dog, my name is " + this.getName());
    }

    public void play(){
        System.out.println("Dog plays");
    }
}
