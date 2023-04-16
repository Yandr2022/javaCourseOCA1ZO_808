package lesson13;

public class Demo1 {
    public static void main(String[] args) {
        showWorkScheduleByDayOfWeek(0);
        showWorkScheduleByDayOfWeek(1);
        showWorkScheduleByDayOfWeek(2);
        showWorkScheduleByDayOfWeek(3);
        showWorkScheduleByDayOfWeek(4);
        showWorkScheduleByDayOfWeek(5);
        showWorkScheduleByDayOfWeek(6);
        showWorkScheduleByDayOfWeek(7);
        showWorkScheduleByDayOfWeek(8);
        System.out.println();
        showWorkScheduleByDayOfWeek("Monday");
        showWorkScheduleByDayOfWeek("Tuesday");
        showWorkScheduleByDayOfWeek("wednesday");
        showWorkScheduleByDayOfWeek("thurSday");
        showWorkScheduleByDayOfWeek("friday");
        showWorkScheduleByDayOfWeek("saturDAY");
        showWorkScheduleByDayOfWeek("sunday");
        showWorkScheduleByDayOfWeek("blablaDay");

    }

    static void showWorkScheduleByDayOfWeek(int day) {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("working from 9:00 to 18:00");
                break;
            case 6:
                System.out.println("working from 9:00 to 14:00");
                break;
            case 7:
                System.out.println("Day off");
                break;
            default:
                System.out.println("Wrong day");
        }
    }
    static void showWorkScheduleByDayOfWeek(String day) {

        switch (day.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println(day + ": working from 9:00 to 18:00");
                break;
            case "saturday":
                System.out.println(day + ": working from 9:00 to 14:00");
                break;
            case "sunday":
                System.out.println(day + ": day off");
                break;
            default:
                System.out.println(day + ": wrong day");
        }
    }
}
