package Lesson2;

public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20;
        short s2 = 1200;

        int i1 = 500;
        int i2 = 0b1101010;// bin
        int i3 = 0156;//oct
        int i4 = 0x3c;//hex
        int i5 = 1_000_000;//with underscore

        long l1 = 10000;
        long l2 = 100000000000L;

        float f1 = 3.14F;
        float f2 = 54.1245655554848F;

        double d1 = 3.14;
        double d2 = 54.1245655554848;


        char c1 = 'a';
        char c2 = 'A';
        char c3 = '7';
        char c4 = ' ';
        char c5 = 300;//dec
        char c6 = '\u1234';//hex

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(i4 + "\n" + c5 + "\n" + c6);
    }
}
