package lesson8;

public class Demo1 {
    //    public final int a = 10;
    public final int a;

    public Demo1(int a) {
        this.a = a;
    }

    public Demo1() {
        a = 10;
    }

    public void func(final short s) {
        final byte b = 5;//local variable
//        s++;
        System.out.println(b + s);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
//        demo1.a*=2; final - only use, doesn't have default value, initialization required on declaration or in each of the constructors
        System.out.println(demo1.a);
    }
}
