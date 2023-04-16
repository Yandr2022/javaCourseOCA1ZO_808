package lesson12;

public class Demo1 {
    public static void main(String[] args) {
        String s = new String("abc");//create new object
        String s1 = new String("abc");
        System.out.println(s == s1);
        System.out.println(s.equals(s1));
        s = "abc";//one object in string pool
        s1 = "abc";
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

    }
}
