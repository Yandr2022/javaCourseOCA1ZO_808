package lesson15;

public class Demo1 {
    public static void main(String[] args) {
        showTime();

    }

    static void showTime() {
        int hour = 0;
        OUTER:
        do {
            int minute = 0;
            INNER:
            while (minute < 60) {
                if (minute == 20) {
                    hour++;
                    continue OUTER;
                }
                System.out.println(hour + ":" + minute);
                minute++;
            }
            hour++;
        } while (hour < 24);
    }

    static void showTime2() {
        for (int hour = 0; hour < 24; hour++) {
            int minute = 0;
            while (minute < 60) {
                System.out.println(hour + ":" + minute);
                minute++;
            }
        }
    }

}
