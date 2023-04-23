package homework.lesson22;

public class AnimalDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobby");
        Cat cat = new Cat("Lily");
        System.out.println(dog.getPawsNum());
        cat.sleep();
    }
}
