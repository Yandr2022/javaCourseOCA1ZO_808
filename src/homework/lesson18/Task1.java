package homework.lesson18;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 5, -4, 2, 0, -25, 125};
        arrayInsertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayBubbleSort(int[] array) {

        for (int i = 0, length = array.length - 1; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] arrayInsertionSort(int[] array) {
        for (int i = 0, temp; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                temp = array[i];
                array[i] = min;
                array[index] = temp;
            }
        }
        return array;
    }
}
