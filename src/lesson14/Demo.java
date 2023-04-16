package lesson14;

public class Demo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i%60);
        }
        for (int i = 1; i<=10; ) {//always1
            System.out.println(i);
        }

        for (int i = 1;; i++) {//always true
            System.out.println(i);
        }

    }
}
