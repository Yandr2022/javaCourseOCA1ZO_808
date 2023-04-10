package lesson3;

public class OperatorsDemo2 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 5;
        a += 3;
        System.out.println(a);
        a *= b;
        System.out.println(a);
        b++;
        System.out.println(b);
        a = b = c = 18;
        System.out.println(a + " " + " " + b + " " + " " + c);

        short s = 100;
        byte b1 = 100;
        long l = 100L;
        a = s;
        a = b1;
        a = (int) l;
        System.out.println(a);
        float f = a;
        double d = a;
        d = f;
        f = (float) d;
        System.out.println(f);

    }
}
