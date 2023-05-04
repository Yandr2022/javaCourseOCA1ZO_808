package lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        Duration duration = Duration.ofDays(1);
        System.out.println(localDateTime);
        System.out.println(localDateTime.plus(duration));
        duration = Duration.ofHours(2);
        System.out.println(localDateTime.plus(duration));
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.minus(Duration.ofDays(2)));
    }
}
