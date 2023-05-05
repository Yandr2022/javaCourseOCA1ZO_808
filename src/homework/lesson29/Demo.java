package homework.lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Demo {
    static DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !!hh:mm");
    static DateTimeFormatter format2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yyyy");

    static void showShiftWork(LocalDateTime start, LocalDateTime end, Period period, Duration duration) {
        while (start.isBefore(end)) {
            System.out.print("working from " + start.format(format1));
            start = start.plus(period);
            System.out.println(" to " + start.format(format1));
            System.out.print("rest from " + start.format(format2));
            start = start.plus(duration);
            System.out.println(" to " + start.format(format2));
        }
    }

    public static void main(String[] args) {
        showShiftWork(LocalDateTime.of(2023, Month.JANUARY, 10, 8, 45)
                , LocalDateTime.of(2023, Month.MARCH, 30, 18, 00), Period.ofDays(3), Duration.ofHours(42));
    }
}

