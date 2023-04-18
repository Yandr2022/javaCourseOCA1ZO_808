package lesson19;

public class Demo2 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Math", "Philosophy"};
        for (String st : students) {
            for (String ex : exams) {
                System.out.println(st + ": " + ex);
            }
        }

        String[][] arrays ={students,exams};
        for (String ar[]:arrays) {
            for (String st:ar) {
                System.out.println(st);
            }
        }
    }
}
