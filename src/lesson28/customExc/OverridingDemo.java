package lesson28.customExc;

import java.io.FileNotFoundException;
import java.io.IOException;

public class OverridingDemo {
    public static void main(String[] args) {

    }
}
class Animal{
    public Animal() throws FileNotFoundException {
    }

    void run() throws IOException {
        System.out.println("Animal runs");
    }

}
class Mouse extends Animal{

    public Mouse() throws  IOException {
        super();
    }

    @Override
    void run()throws FileNotFoundException {
        System.out.println("");
    }
}