package lesson3;

public class OperatorsDemo3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println((a > b) + "\n" + (a < b) + "\n" +(a == b)
                + "\n" + (a >= b) + "\n" + (a <= b) + "\n" + (a != b) + "\n");

        boolean t = true;
        boolean f = false;

        System.out.println((t&&f&&t) + " " +(f&&f&&t) + " " + (t&&t&&t)+ " " + (f&&f&&f));
        System.out.println((t||f||t) + " " + (f||f||t) + " " + (t||t||t) + " " + (f||f||f));
        System.out.println((t&&f&&t) + " " +(f&&f&&t) + " " + (t&&t&&t)+ " " + (f&&f&&f));
        System.out.println((t^f^t) + " " + (f^f^t) + " " + (t^t^t) + " " + (f^f^f));
        boolean s =!(t==f);
        System.out.println(t + " " + !t+ " " + s);

        s= t==f && a++==3;
        System.out.println(s + " "+ a);
        s= t==t && a++==3;
        System.out.println(s + " "+ a);
        a=3;
        s= t==f & a++==3;
        System.out.println(s + " "+ a);



    }
}
