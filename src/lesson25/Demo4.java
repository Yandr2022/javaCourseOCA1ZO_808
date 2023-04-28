package lesson25;

public class Demo4 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(((A)c).a);
        ((A)c).foo();
    }
}
class A{
    int a =5;
    void foo(){
        System.out.println("A");
    }
}
class B extends A{
    int a =10;//hide

    @Override
    void foo() {
        System.out.println("B");
    }
}class C extends B{
    int a =15;

    @Override
    void foo() {
        System.out.println("C");
    }
}