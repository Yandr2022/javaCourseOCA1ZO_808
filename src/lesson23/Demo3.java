package lesson23;

public class Demo3 {
    public static void main(String[] args) {
        A ac = new C();
        ac.foo(new B());//ref type A has only method foo(A a){...}, and B obj is A obj

    }
}
class A{
    void foo(A a){
        System.out.println("A");
    }
}
class B extends A{

    void foo(B b){//overloaded foo(A a){...}
        System.out.println("B");
    }
}
class C extends B{
    @Override
    void foo(B b){
        System.out.println("C");
    }
}