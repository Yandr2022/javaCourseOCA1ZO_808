package lesson29;

import java.time.LocalDate;
import java.time.Period;

public class DateTimePeriodDemo {
    static void showAttendantChange(LocalDate startPeriod, LocalDate endPeriod, String[] arr) {
        int count = 0;
        LocalDate data = startPeriod;
        while (data.isBefore(endPeriod)) {
            if (data == startPeriod.plusMonths(count + 1)
                    || data.isAfter(startPeriod.plusMonths(count + 1))) {
                System.out.println("Change attendant");
                count++;
            }
            System.out.println(data + ", attendant: " + arr[count]);
            data = data.plusWeeks(1);
        }
    }
    static void showAttendantChange(LocalDate startPeriod, LocalDate endPeriod, Period period, String[] arr) {
        int count = 0;
        Period temp = period;
        LocalDate data = startPeriod;
        while (data.isBefore(endPeriod)) {
            if (data == startPeriod.plus(temp) || data.isAfter(startPeriod.plus(temp))) {
                System.out.println("Change attendant");
                count++;
                temp = temp.plus(period);
            }
            System.out.println(data + ", attendant: " + arr[count]);
            data = data.plusDays(1);
        }
    }

    public static void main(String[] args) {
//        showAttendantChange(LocalDate.now(), LocalDate.now().plusMonths(4)
//                , new String[]{"John", "Bob", "Samantha", "Liz"});
        Period period = Period.ofWeeks(2);
        showAttendantChange(LocalDate.now(), LocalDate.now().plusMonths(2),period
                , new String[]{"John", "Bob", "Samantha", "Liz", "Sam", "Yuli", "William"});
    }
}
