package lesson25;

public class Demo5 {
    public static void main(String[] args) {
        byte b = 10;//narrowing without casting
        short s = -6;//narrowing without casting
        final int i = 100;
        s = i;//if not final, need casting
        char c = 5;//narrowing without casting
        int bToI = b;//widening
        long l1 = 1000l;
        int i1 = 1000;
        i1 = (int) l1;//narrowing with casting
        b = (byte) i1;
        System.out.println(b);
        System.out.println(i1);
        int i2 = (int)3.56;
        System.out.println(i2);
        int i3 = Integer.MAX_VALUE;
        System.out.println(++i3);

        long l = 10l,res = i2 + l;//numeric promotion
        int res1 = (int) (i2 + l);//
        float f = 3.14f, res2 = f + res1;;
        int res3 = (int) (f + res1);
        byte b1 = 2, b3 = (byte) (b1 + b1);
        int res4 = b1 + b1;
        b1 = b3++;

        byte b2 = 10;
        float f2 =7;
        double d2 = 2.0;
        double res5 = b2+f2-d2;//b2+->int_b2+f2->float_(b2+f2)-d2->double


    }
}
