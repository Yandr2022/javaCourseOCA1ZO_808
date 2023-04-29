package lesson26;

import java.util.ArrayList;

public class WrapperDemo {
    public static void main(String[] args) {
        //autoboxing
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);

        Long l = 50l;
        Integer i = 50;
//        Integer i = new Integer(50);
        Number n = 150;
//        Number n = new Integer(50);

        //unboxing
        int a = list.get(0);
        System.out.println(a);

        a = i;
//        a= i.intValue();
        System.out.println(a);

        a = (int) n;
//        a = n.intValue();
        System.out.println(a);

        //parse
        String s = "100";
        a = Integer.parseInt(s) * 2;
//      a = Integer.parseInt(" 100");NumberFormatException
        System.out.println(a);
        double d = Double.parseDouble("3.14") * 2;
//      double d = Double.parseDouble("3._14") * 2;NumberFormatException
        System.out.println(d);
        float f =Float.parseFloat("3.0f");
        System.out.println(f);

        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        b = Boolean.parseBoolean("123true");
        System.out.println(b);

        //valueOf()
        Integer integer = Integer.valueOf(s);
        double aDouble = Double.parseDouble(String.valueOf(3.0f));
        Byte aByte = Byte.valueOf((byte) 5);
        System.out.println(++i + "\n" + ++aDouble);
        System.out.println(Byte.valueOf((byte)5).equals(Integer.valueOf(5 )));





    }
}
