package homework.lesson16;

public class Demo {
    public static void main(String[] args) {
        String s = "ya@yahoo.ru; ga@gmail.com; ma@mail.ru; one@onemail.ru; some@someMail.ru;";
        showMailBoxes(s);
        showMailBoxes2(s);
    }
    static void showMailBoxes(String str) {
        String s;
        for (int i = 0; i < str.length(); i += s.length() + 1) {
            s = str.substring(i, str.indexOf(';', i));
            System.out.println(s.substring(s.indexOf('@') + 1, s.indexOf('.')));
        }
    }

    static void showMailBoxes2(String str) {
        int a = 0, b = 0, c = 0;
        while (c < str.length() - 1) {
            a = str.indexOf('@', c);
            b = str.indexOf('.', c);
            c = str.indexOf(';', c + 1);
            System.out.println(str.substring(a + 1, b));
        }
    }
}
