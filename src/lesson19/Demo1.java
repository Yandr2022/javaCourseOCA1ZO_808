package lesson19;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        abc(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8}, new int[]{9, 10});

    }

    static void abc(int... a) {
    }

    static void abc(int b, int... a) {
    }

    static void abc(int[]... a) {
        for (int[] n : a) {
            System.out.println(Arrays.toString(n));
        }
    }

    static void abc(String s, int... a) {

    }
//    void abc (int [] a){ compile time error
//    }
}
