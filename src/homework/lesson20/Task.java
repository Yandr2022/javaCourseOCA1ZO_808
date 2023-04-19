package homework.lesson20;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    public static void main(String[] args) {
        ArrayList<String> list = foo("a", "n", "c", "d", "a", "n", "z");
        System.out.println(list);
    }

    public static ArrayList<String> foo(String... arr) {
        ArrayList<String> strings = new ArrayList<>();
        for (String ar : arr) {
            if (!strings.contains(ar))
                strings.add(ar);
        }
        Collections.sort(strings);
        return strings;
    }
}
