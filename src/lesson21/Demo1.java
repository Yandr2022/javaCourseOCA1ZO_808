package lesson21;

public class Demo1 {

    public Demo1() {
        System.out.println("Constructor");
    }
    public void Demo1() {
        System.out.println("Method");
    }
}
class Test{
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
    }
}