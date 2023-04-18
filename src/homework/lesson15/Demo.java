package homework.lesson15;

public class Demo {
    public static void main(String[] args) {
        startСountTimePer6Hours();
    }
    static void startСountTimePer6Hours() {
        int hour = 0;
        OUTER:
        while (hour < 6) {
            int minute = -1;
            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0 && minute != 0) break OUTER;
                int second = 0;
                INNER:
                while (second < 60) {
                    if (second * hour > minute) continue MIDDLE;
                    System.out.printf("%d:%d:%d\n", hour, minute, second);
                    second++;
                }
            } while (minute < 59);
            hour++;
        }
    }
}

