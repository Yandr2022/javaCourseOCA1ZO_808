package homework.lesson4;

public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Jimmi", "Johnson"
                , 2, 5.9, 2.5, 7);
        Student student2 = new Student(2, "Liz", "Smith"
                , 3, 7.4, 8, 8.2);
        Student student3 = new Student(3, "Mike", "Wilson"
                , 1, 9, 8.7, 10);

        Student[] students = {student1, student2, student3};

        for (Student st : students) {
            System.out.printf("%s %s:\nmath = %.2f;\neconomics = %.2f;\nforeign language = %.2f;" +
                            "\nAverage grade: %.2f;\n\n", st.firstName, st.lastName
                    , st.mathAverageGrade, st.economicsAverageGrade, st.foreignLanguageAverageGrade
                    , getAvg(st.economicsAverageGrade, st.foreignLanguageAverageGrade, st.mathAverageGrade));
        }

    }

    public static double getAvg(double... nums) {
        double sum = 0;
        for (double num : nums
        ) {
            sum += num;
        }
        return sum / nums.length;
    }
}
