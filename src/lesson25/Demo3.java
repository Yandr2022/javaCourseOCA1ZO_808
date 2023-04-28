package lesson25;

public class Demo3 {
    public static void main(String[] args) {
        String[]arr = {"a","b","c"};
        Object[] arr1 = arr;//upcasting
        String[] arr2 =(String[]) arr1;//downcasting
//        arr2[0] = new StringBuilder("dfg");StringBuilder not IS-A String
        arr1[0] = new StringBuilder("dfg");//StringBuilder IS-A Object, ArrayStoreException run time
    }
}
