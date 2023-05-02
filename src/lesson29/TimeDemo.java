package lesson29;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeDemo {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        LocalDate date = LocalDate.of(2022, Month.FEBRUARY,22);
        LocalDate date2 = LocalDate.of(2022, 4,5);
        System.out.println(date);
        System.out.println( LocalTime.of(15,30));
        System.out.println( LocalTime.of(15,30,50,5023656));
        System.out.println(LocalDateTime.of(LocalDate.now(),LocalTime.now()));
        System.out.println(LocalDateTime.of(3202,1,29,15,30,10,2051));
        date = date.plusDays(2);
        System.out.println(date);
        date = date.minusDays(1);
        System.out.println(date);
        date = date.plusWeeks(3);
        System.out.println(date);
        date = date.minusWeeks(2);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.minusMonths(4);
        System.out.println(date);
        date = date.plusYears(1);
        System.out.println(date);
        date = date.minusYears(4);
        System.out.println(date);

        LocalTime time= LocalTime.now();
        System.out.println(time.plusHours(1));
        System.out.println(time);
        System.out.println(time.minusMinutes(25));
        System.out.println(time.plusSeconds(40));
        System.out.println(time.minusNanos(5024));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.plusYears(20).minusMonths(2).plusMinutes(120));

        System.out.println(date + " is after " + date2 + " = "+ date.isAfter(date2));
        System.out.println(date + " is before " + date2 + " = "+ date.isBefore(date2));
    }
}
