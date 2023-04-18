package homework;

public class lesson17 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("abc");
        StringBuilder builder1 = new StringBuilder("abc");
        StringBuilder builder2 = new StringBuilder("def");
        System.out.println(equals1(builder,builder1));
        System.out.println(equals1(builder,builder2));
        builder1.append(1);
        System.out.println(equals1(builder,builder1));

    }

    public static boolean equals(StringBuilder builder, StringBuilder builder1) {
        return builder.toString().equals(builder1.toString());
    }

    public static boolean equals1(StringBuilder builder, StringBuilder builder1) {
        if (builder.length() != builder1.length()) {
            return false;
        }
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) != builder1.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
