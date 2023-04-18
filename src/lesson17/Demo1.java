package lesson17;

public class Demo1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("123");
        StringBuilder builder1 = builder.append("456");
        StringBuilder builder2 = new StringBuilder(builder1);
        builder1.append("7");
        System.out.println(builder);
        System.out.println(builder1);
        System.out.println(builder2);
        System.out.println(builder.equals(builder1));
        System.out.println(builder.equals(builder2));
        System.out.println(builder == builder1);
        System.out.println(builder == builder2);
        String s = new String(builder2);
        String s1 = builder2.toString();
        s1 = builder2 + "";
        System.out.println(s);
        System.out.println(s1);
    }
}
