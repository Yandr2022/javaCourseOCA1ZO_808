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

        Student student = new Student(4, "Test", "TEst", 4, 8.2, 6.8, 9);
        System.out.println(student.firstName + " " + student.lastName + ":");
        student.showGrades();
        System.out.println();
        System.out.println();

        for (Student st : students) {
            System.out.println(st.firstName + " " + st.lastName + ", average grade:" + new Demo().getStudentAvg(st));
        }
        System.out.println();
        System.out.println();

        Student student4 = new Student();
        Student student5 = new Student(2, "Liz", "Smith", 3);
        Student student6 = new Student(3, "Mike", "Wilson"
                , 1, 9, 8.7, 10);
        Student[] students2 = {student4, student5, student6};
        for (Student st : students2) {
            System.out.println(st);
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
     double getStudentAvg(Student student) {
        double sum = 0;
        double []grades = {student.economicsAverageGrade,student.mathAverageGrade,student.foreignLanguageAverageGrade};
        for (double grade : grades
        ) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
