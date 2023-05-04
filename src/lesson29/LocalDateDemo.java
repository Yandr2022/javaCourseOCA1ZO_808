package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
        System.out.println(localDate);
        System.out.println(localDate.format(formatter));
        System.out.println(localDate.format(DateTimeFormatter.ISO_WEEK_DATE));
        System.out.println(localDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("*******************************");
        formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(localTime);
        System.out.println(localTime.format(formatter));
        System.out.println(localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println(localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println("*******************************");
        LocalDateTime dateTime = LocalDateTime.now();
        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTime);
        System.out.println(dateTime.format(formatter));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateTime));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("yy MM dd hh:mm")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d.M.yyyy hh:mm:ss")));
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d MMM yyyy - hh:mm")));
        System.out.println("*******************************");
        LocalDate date = LocalDate.parse("01 04 2023", DateTimeFormatter.ofPattern("dd MM yyyy"));
        System.out.println(date);
        date = LocalDate.parse("2023-05-22");
        System.out.println(date.plusMonths(1));

    }
}
