package lesson20;

import java.util.*;

public class Demo1 {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abc");
        StringBuilder builder1 = new StringBuilder("abc");
        StringBuilder builder2 = new StringBuilder("abc");
        ArrayList<StringBuilder> builders = new ArrayList<>();
        builders.add(builder);
        builders.add(builder1);
        builders.add(builder2);
        ArrayList<StringBuilder> builders1 = (ArrayList<StringBuilder>) builders.clone();
        System.out.println(builders1 == builders);
        System.out.println(builders1.get(0) == builders.get(0));
        builders.get(0).append("def");
        System.out.println(builders1);
        Object[] array = builders.toArray();
        System.out.println(Arrays.toString(array));
        StringBuilder[] array1 = builders.toArray(new StringBuilder[10]);
        System.out.println(Arrays.toString(array1));
        List<StringBuilder> builderList = Arrays.asList(array1);
        System.out.println(builderList);
        array1[0].append("!!!");
        System.out.println(builderList);
        array1[0] = new StringBuilder("&&&");
        System.out.println(builderList);

        List<String> stringList = new ArrayList<>();
        stringList.add("f");
        stringList.add("e");
        stringList.add("g");
        stringList.add("b");
        stringList.add("a");
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);

        List<String> copyStringList = stringList;
        System.out.println(copyStringList.equals(stringList));
        List<String> deepCopyStringList = new ArrayList<>();
        deepCopyStringList.add("f");
        deepCopyStringList.add("e");
        deepCopyStringList.add("g");
        deepCopyStringList.add("b");
        deepCopyStringList.add("a");
        Collections.sort(deepCopyStringList);
        System.out.println(stringList.equals(deepCopyStringList));

        Iterator<String> it = stringList.listIterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        System.out.println(stringList);
    }
}
