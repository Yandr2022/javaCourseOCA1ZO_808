package homework.lesson24;

import homework.lesson24.Swordtail;
import homework.lesson24.abstraction.Animal;
import homework.lesson24.abstraction.IF.Speakable;
import homework.lesson24.abstraction.Mammal;

public class Demo {
    public static void main(String[] args) {
        Swordtail  swordtail = new Swordtail("Bob");
        System.out.println(swordtail.name);
        swordtail.eat();
        swordtail.sleep();
        swordtail.swim();

        Speakable penguin = new Penguin("Po");
        penguin.speak();

        Animal lion = new Lion("Leva");
        System.out.println(lion.name);
        lion.eat();
        lion.sleep();

        Mammal lion1 = new Lion("Lonny");
        System.out.println(lion1.name);
        lion1.eat();
        lion1.sleep();
        lion1.run();
        lion1.speak();

    }
}
