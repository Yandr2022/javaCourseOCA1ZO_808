package homework.lesson13;

public class Month {

    public static void main(String[] args) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September"
                , "October", "November", "December", "Erroreber"};
        System.out.println("2023 year:");
        for (int i = 0, result = getDayOfMonth(i + 1); i < monthNames.length;
             i++, result = getDayOfMonth(i + 1)) {
            System.out.printf("%s: %s \n", monthNames[i], (result != -1) ? result + " days" : "wrong month");
        }
    }

    static int getDayOfMonth(int monthNum) {
        int result;
        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 2:
                result = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            default:
                result = -1;
        }
        return result;
    }
}
