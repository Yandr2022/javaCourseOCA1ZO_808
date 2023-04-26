package lesson24;


class A {
    String str = "hello";

    void foo() {
        System.out.println("!!!");
    }
}
class B extends A{
    String str = "bye";
    void foo(){
        System.out.println("???");
    }
}
public class C extends B{
    public static void main(String[] args) {
        C c = new C();
        c.foo();
        System.out.println(c.str);
    }
}