package lesson18;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        int[][] ints;//null reference, length undefined
        String[] strings;
        double[][] doubles;
        ints = new int[3][];
        strings = new String[5];
        doubles = new double[4][2];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = (char) ('a' + i) + "";
        }
        System.out.println(Arrays.toString(strings));

        for (double[] d : doubles) {
            for (int i = 0; i < d.length; i++) {
                d[i] = i - 0.2;
            }
            System.out.print(Arrays.toString(d));
        }
        System.out.println();

        for (int i = 1; i <= ints.length; i++) {
            ints[i - 1] = new int[i];
            for (int j = 0; j < ints[i - 1].length; j++) {
                ints[i - 1][j] = j;
            }
            System.out.print(Arrays.toString(ints[i - 1]));
        }
    }
}
