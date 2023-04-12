package homework.lesson4;

public class Student {
    int id;
    String firstName;
    String lastName;
    int yearOfStudy;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

    Student(int id, String firstName, String lastName, int yearOfStudy,
                   double mathAverageGrade, double economicsAverageGrade, double foreignLanguageAverageGrade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.mathAverageGrade = mathAverageGrade;
        this.economicsAverageGrade = economicsAverageGrade;
        this.foreignLanguageAverageGrade = foreignLanguageAverageGrade;
    }

    double getAvg() {
        return (mathAverageGrade + economicsAverageGrade + foreignLanguageAverageGrade) / 3;
    }

    void showGrades() {
        System.out.printf("Math: %.2f;\nEconomics: %.2f;\nForeignLanguage: %.2f;\nAverage: %.2f"
                , mathAverageGrade, economicsAverageGrade, foreignLanguageAverageGrade, getAvg());
    }

    Student() {
    }
}
