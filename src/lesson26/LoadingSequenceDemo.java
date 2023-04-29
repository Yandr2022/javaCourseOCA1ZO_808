package lesson26;

public class LoadingSequenceDemo {
    public static void main(String[] args) {
Lion lion = new Lion();
    }
}

class Animal {
    public Animal() {
        System.out.println("Animal constructor");
    }

    static {
        System.out.println("Animal static init block");
    }

    {
        System.out.println("Animal init block");
    }
}

class Mammal extends Animal {
    public Mammal() {
        System.out.println("Mammal constructor");
    }

    static {
        System.out.println("Mammal static init block");
    }

    {
        System.out.println("Mammal init block");
    }
}

class Lion extends Mammal {
    public Lion() {
        System.out.println("Lion constructor");
    }

    static {
        System.out.println("Lion static init block");
    }

    {
        System.out.println("Lion init block");
    }
}