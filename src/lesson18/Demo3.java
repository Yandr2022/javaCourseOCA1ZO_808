package lesson18;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = arr;
        System.out.println(arr ==arr1);
        System.out.println(arr ==arr2);
        System.out.println(arr.equals(arr1));
        System.out.println(arr.equals(arr2));
        arr[0] = 8;
        arr1[0] = 6;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
