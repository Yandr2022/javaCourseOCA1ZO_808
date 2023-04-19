package homework.lesson19;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        String []arr =foo(new String[]{"a", "b", "c"},new String[]{"d", "e", "f","g"});
        for (String s:args) {
            for (int i = 0; i < arr.length; i++) {
                if (s.equals(arr[i])){
                    arr[i] = null;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static String[] foo(String[]... arr) {
        int length = 0, count = 0;
        for (String[] ar : arr) {
            length += ar.length;
        }
        String[] array = new String[length];
        for (String[] ar : arr) {
            for (String str : ar) {
                array[count] = str;
                count++;
            }
        }
        return array;
    }
}
