package lesson18;

public class Demo5 {
    public static void main(String[] args) {
        char[]chars ={'w','o','r','l','d','!'};
        String s = new String(chars);
        System.out.println(s);
        StringBuilder builder = new StringBuilder("Hello ");
        builder.append(chars,0, chars.length-1);
        System.out.println(builder);
        builder.insert(5,chars,5,1);
        System.out.println(builder);
    }
}
