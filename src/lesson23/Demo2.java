package lesson23;

public class Demo2 {
    public static void main(String[] args) {
        Animal_ animal = new Mouse_();
        animal.showInfoAN();
        ((Mouse_)animal).showInfoM();
        ((Mouse_)animal).showInfoAN();
    }
}

class Animal_{
    static String getName(){
        return "some animal";
    }

    void showInfoAN(){
        System.out.println(getName());
    }
}
class Mouse_ extends Animal_{
    static String getName(){
        return "some mouse";
    }
    void showInfoM(){
        System.out.println(getName());
    }

}