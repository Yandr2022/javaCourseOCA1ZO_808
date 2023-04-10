package lesson3;

public class OperatorsDemo1 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        System.out.println("a = " + a + "; b = " + b);
        System.out.println(a + b);
        System.out.println(a * b);
        int c = a - b;
        System.out.println(c + "\n");

        a = 10;
        b = 3;
        System.out.println(a / b); //integer division
        System.out.println((double) a / b);//double division
        System.out.println(a % b);
        System.out.println((double) a % b + "\n");

        int x = 1, y = 2, z = 3;//for same data type
//        int x = 1;
//        int y = 2;
//        int z = 3;

        System.out.println(x + ++y);
        y=2;
        System.out.println(x + y++);
        System.out.println(x + y + "\n");
        y=2;
        System.out.println(x + --y);
        y=2;
        System.out.println(x + y--);
        System.out.println(x + y);


    }
}
