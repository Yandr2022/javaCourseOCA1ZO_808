package lesson14;

public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i <= 20; i += 2) {
            if (i == 8) break;
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i <= 20; i += 2) {
            if (i == 8) continue;
            System.out.println(i);
        }
    }
}
