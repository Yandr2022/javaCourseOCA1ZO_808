package lesson17;

public class Demo {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();//default capacity = 16
        StringBuilder builder1 = new StringBuilder("Hello");//default capacity = 16 + hello.length
        StringBuilder builder2 = new StringBuilder(50);//capacity = 50
        StringBuilder builder3 = new StringBuilder(builder);//default capacity = 16, new equals object
        System.out.println(builder.capacity());
        System.out.println(builder1.capacity());
        System.out.println(builder2.capacity());
        System.out.println(builder3.capacity());

        System.out.println(builder.length());
        System.out.println(builder1.length());
        System.out.println(builder2.length());
        System.out.println(builder3.length());

        System.out.println(builder1.charAt(1));
        System.out.println(builder1.indexOf("l"));
        System.out.println(builder1.indexOf("l",3));
        System.out.println(builder1.substring(2));
        System.out.println(builder1.substring(2,4));
        System.out.println(builder1.subSequence(2,4));//return CharSequence
        builder1.append(1);
        builder1.append("1");
        builder1.append(new int[]{2,3,4});
        builder1.append(true);
        System.out.println(builder1);
        builder1.insert(5 ," my friend");
        System.out.println(builder1);
        builder1.delete(15,builder1.length());
        System.out.println(builder1);
    }
}
