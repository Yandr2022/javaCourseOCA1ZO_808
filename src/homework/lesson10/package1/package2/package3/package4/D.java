package homework.lesson10.package1.package2.package3.package4;

import homework.lesson10.package1.A;
import homework.lesson10.package1.package2.package3.C;
import homework.lesson10.package1.package2.package3.package4.package5.E;

import static homework.lesson10.package1.package2.B.*;

public class D {
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        E e  = new E();
        System.out.println("class " + a.className + " by package " + a.packNum);
        System.out.println("class " + className + " by package " + packNum);
        System.out.println("class " + c.className + " by package " + c.packNum);
        System.out.println("class " + e.className + " by package " + e.packNum+ "\n");
        sayHello();

    }
}
