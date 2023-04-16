package homework.lesson14;

public class Demo {
    public static void main(String[] args) {
        startСountTimePer6Hours();
    }

    static void startСountTimePer6Hours() {
        OUTER:
        for (int i = 0; i < 6; i++) {
            System.out.println(i + 1 + " Hour has started");
            INNER1:
            for (int j = 0; j <= 59; j++) {
                if (i > 1 && (j % 10 == 0 && j != 0)) break OUTER;
                System.out.println(j + 1 + " Minute has started");
                for (int k = 0; k <= 59; k++) {
                    if (k * i > j) continue INNER1;
                    System.out.printf("%d:%d:%d\n", i, j, k);
                }
                System.out.println(j + 1 + " Minute has ended");
            }
            System.out.println(i + 1 + " Hour has ended");
        }
    }
}


