package homework.lesson25.abstraction.IF;

public interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
