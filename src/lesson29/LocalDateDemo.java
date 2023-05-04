package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfWeek().plus(2));
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getYear());

        LocalTime localTime = LocalTime.of(15,30,10);
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(localTime.getNano());
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(localDate.format(formatter));
        formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(localTime);
        System.out.println(localTime.format(formatter));
        LocalDateTime dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTime);
        System.out.println(dateTime.format(formatter));
    }
}
