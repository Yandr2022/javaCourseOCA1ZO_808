package lesson20;

import lesson16.Car;
import lesson11.Student;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//default capacity = 10,size = 0
        Car car = new Car("red", "V6");
        list.add(new StringBuilder("hello"));
        list.add(car );
        list.add(new Student("Ivan", 2, 8));
        System.out.println(list);
        ArrayList list2 = new ArrayList(list);
        System.out.println(list2);
        car.setColor("black");
        System.out.println(list);
        System.out.println(list2);

        ArrayList<String> arrayList = new ArrayList<>(30);//capacity = initial to argument,size = 0
        System.out.println(arrayList.size());
        arrayList.add("a");//size = 0+1
        System.out.println(arrayList.size());
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add(1, "!");
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        arrayList.set(1, "%");
        System.out.println(arrayList);
        arrayList.remove("%");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        List<String> list1 = new ArrayList<>();
        list1.add("d");
        list1.add("e");
        list1.add("f");
        list1.add("g");
        arrayList.addAll(list1);
        System.out.println(arrayList);
        arrayList.addAll(1, list1);
        System.out.println(arrayList);

        List<StringBuilder> builderList = new ArrayList<>();
        builderList.add(new StringBuilder("world"));
        List<StringBuilder> builderList1 = new ArrayList<>();
        builderList1.add(new StringBuilder("hello"));
        builderList1.addAll(builderList);
        System.out.println(builderList1);
        builderList.set(0, new StringBuilder("World"));
        System.out.println(builderList1);
        builderList1.addAll(builderList);
        System.out.println(builderList1);
        builderList.get(0).append("!");
        System.out.println(builderList1);

        builderList1.clear();
        System.out.println(builderList1);
        System.out.println(builderList);

        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("d"));
        System.out.println(arrayList.lastIndexOf("d"));
        System.out.println(arrayList.indexOf("z"));

        System.out.println(builderList.isEmpty());
        builderList.clear();
        System.out.println(builderList.isEmpty());

        System.out.println(arrayList.contains("c"));
        System.out.println(arrayList.contains("z"));




    }
}
