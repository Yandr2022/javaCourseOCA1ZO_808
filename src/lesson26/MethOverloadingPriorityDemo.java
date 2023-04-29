package lesson26;

public class MethOverloadingPriorityDemo {

    static void foo(int i){
        System.out.println("foo(int i)");
    }
    static void foo(byte i) {
        System.out.println("foo(byte i)");
    }
    static void foo(long i) {
        System.out.println("foo(long i)");
    }


    static void foo1(Object ref) {
        System.out.println("foo1(Object ref)");
    }
    static void foo1(String ref) {
        System.out.println("foo1(String ref)");
    }


    static void foo2(int a, int b) {
        System.out.println("foo2(int a, int b)");
    }
    static void foo2(long a, long b) {
        System.out.println("foo2(long a, long b)");
    }

    static void foo2(Integer a, Integer b) {
        System.out.println("foo2(Integer a, Integer b)");
    }
    static void foo2(int ...a) {
        System.out.println("foo2(int ...a)");
    }


    static void foo3(long a) {
        System.out.println("foo3(long a)");
    }
    static void foo3(Long a) {
        System.out.println("foo3(Long a)");
    }
    static void foo3(Integer a) {
        System.out.println("foo3(Integer a)");
    }
    static void foo3(Object a) {
        System.out.println("foo3(Object a)");
    }


    public static void main(String[] args) {
        foo(5);//1: int, 2: long, 3: byte.

        foo1("hello");//1: string,2: object
        foo1(new StringBuilder("hello"));//object

        foo2(3,3);//1: (int a, int b), 2: (long a, long b), 3: (Integer a, Integer b), 4: (int ...a)

        foo3(50);//1: long, 2: Integer, 3: object, ><Long? because parameter int->long|Integer}==Object
        foo3(50l);//1: long, 2: Long, 3: object, ><Integer? because parameter long->Long}==Object
    }
}
