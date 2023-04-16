package lesson14;

public class Demo2 {
    public static void main(String[] args) {

        startMinuteTimer(30);

    }

    static void startСountTimePerDay() {
        for (int i = 0; i < 24; i++) {
            System.out.println(i + 1 + " Hour has started");
            for (int j = 0; j <= 59; j++) {
                System.out.println(j + 1 + " Minute has started");
                for (int k = 0; k <= 59; k++) {
                    System.out.printf("%d:%d:%d\n", i, j, k);
                }
                System.out.println(j + 1 + " Minute has ended");
            }
            System.out.println(i + 1 + " Hour has ended");
        }
    }

    static void startMinuteTimer(int minute) {
        int day = minute <= 1439 ? 0 : minute / 1440;
        minute = minute % 1440;
        int hour = minute <= 59 ? 0 : minute / 60;
        minute %= 60;

        OUTER:
        for (int dayCount = 0; ; dayCount++) {
            System.out.println(dayCount + 1 + " day has started");
            for (int i = 0; i < 24; i++) {
                System.out.println(i + 1 + " Hour has started");
                for (int j = 0; j <= 59; j++) {
                    if (j == minute && i == hour && dayCount == day) break OUTER;
                    System.out.println(j + 1 + " Minute has started");
                    for (int k = 0; k <= 59; k++) {
                        System.out.printf("%d:%d:%d\n", i, j, k);
                    }
                    System.out.println(j + 1 + " Minute has ended");
                }
                System.out.println(i + 1 + " Hour has ended");
            }

        }

    }

    static void startMinuteTimer2(int minute) {
        int day = 0;
        int hour = 0;
        if (minute > 59) {
            if (minute > 1439) {
                day = minute / 1440;
                minute = minute % 1440;
                hour = minute / 60;
                minute = minute % 60;
            } else {
                hour = minute / 60;
                minute %= 60;
            }
        }

        OUTER:
        for (int dayCount = 0; ; dayCount++) {
            System.out.println(dayCount + 1 + " day has started");
            for (int i = 0; i < 24; i++) {
                System.out.println(i + 1 + " Hour has started");
                for (int j = 0; j <= 59; j++) {
                    if (j == minute && i == hour && dayCount == day) break OUTER;
                    System.out.println(j + 1 + " Minute has started");
                    for (int k = 0; k <= 59; k++) {
                        System.out.printf("%d:%d:%d\n", i, j, k);
                    }
                    System.out.println(j + 1 + " Minute has ended");
                }
                System.out.println(i + 1 + " Hour has ended");
            }

        }

    }
}
