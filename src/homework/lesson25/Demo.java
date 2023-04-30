package homework.lesson25;

import homework.lesson25.abstraction.Animal;
import homework.lesson25.abstraction.Bird;
import homework.lesson25.abstraction.Fish;
import homework.lesson25.abstraction.IF.Speakable;
import homework.lesson25.abstraction.Mammal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Demo {
    public static void main(String[] args) {
 Animal[] animals ={new Lion("Leva"),new Penguin("Po"),new Swordtail("Swordi")};
        List<Speakable> speakables  = new ArrayList<>();
        for (Animal an:animals) { 
            System.out.println(an.name);
            an.sleep();
            an.eat();
            if (an instanceof Speakable){
                Speakable sp = (Speakable)an;
                speakables.add(sp);
                sp.speak();
            }
            if (an instanceof Mammal){
               ((Mammal) an).run();
            } else if (an instanceof Bird) {
                ((Bird)an).fly();
            } else if (an instanceof Fish) {
                ((Fish)an).swim();
            }
        }
        System.out.println(Arrays.toString(animals));
        System.out.println(speakables);
    }
}
