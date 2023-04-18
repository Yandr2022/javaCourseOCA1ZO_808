package homework.lesson18;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        int[][] arr = {{1, 8, 2, 5, -4, 5, 0, -25, 125}, {1, -25, 2, 5, 4, 7 }};
        showTwoDimArray(arr);
        showTwoDimArray1(arr);
        showTwoDimArray2(arr);
    }

    public static void showTwoDimArray(int[][] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + (j < array[i].length - 1 ? ", " : ""));
            }
            System.out.print("}" + (i < array.length - 1 ? ", " : ""));
        }
        System.out.print(" }\n");
    }

    public static void showTwoDimArray1(int[][] array) {
        StringBuilder builder = new StringBuilder("{ ");
        for (int i = 0; i < array.length; i++) {
            builder.append("{");
            for (int j = 0; j < array[i].length; j++) {
                builder.append(array[i][j]).append(j < array[i].length - 1 ? ", " : "");
            }
            builder.append("}").append(i < array.length - 1 ? ", " : "");
        }
        builder.append(" }");
        System.out.println(builder);
    }

    public static void showTwoDimArray2(int[][] array) {
        System.out.print("[ ");
        for (int[] arr : array) {
            System.out.print(Arrays.toString(arr) + " ");
        }
        System.out.print("]\n");
    }
}
