package lesson18;

import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr, arr1;//2 arrays
        int arr2[], a;//array, int num
        int[] arr3, arr4[][];//1-dim array, 3-dim array
        int arr5[], arr6[][];//1-dim array, 2-dim array
        arr = new int[]{1, 8, 6, 3, -5, 0, 25};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,0));//only for sorted arrays
        System.out.println(Arrays.binarySearch(arr,28));//return negative number
    }
}
