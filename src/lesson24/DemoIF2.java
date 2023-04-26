package lesson24;

public class DemoIF2 {
    public static void main(String[] args) {
        If[] ifs = {new N(), new M()};
        for (If iff : ifs) {
            iff.fooDef();
        }
        If.foo();
    }
}

interface If {
    static void foo() {
        System.out.println("static method works");
    }

    default void fooDef() {
        System.out.println("default method works");
    }
}
interface Iff extends If{
 void fooDef();
}

class N implements If {

}

class M implements If {


    @Override
    public void fooDef() {
//        If.super.fooDef();
        System.out.println("Override default method works");
    }
}