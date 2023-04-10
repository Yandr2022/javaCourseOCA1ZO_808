package homework;

public class Lesson3 {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = 11;
        double d1 = 1.3;
        double d2 = 5.5;
        long l = 20L;
        double result = i2 / d2 + d1 % i1 - l;
        System.out.println(result);

        int a = 5, b = 8;
        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);
    }
}
