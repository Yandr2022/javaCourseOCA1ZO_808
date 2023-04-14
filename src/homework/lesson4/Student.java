package homework.lesson4;

public class Student {
    int id;
    String firstName;
    String lastName;
    int yearOfStudy;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;
    public Student() {
    }
    Student(int id, String firstName, String lastName, int yearOfStudy) {
        this(id, firstName,lastName,yearOfStudy,0.0,0.0,0.0);
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfStudy=" + yearOfStudy +
                ", mathAverageGrade=" + mathAverageGrade +
                ", economicsAverageGrade=" + economicsAverageGrade +
                ", foreignLanguageAverageGrade=" + foreignLanguageAverageGrade +
                '}';
    }
}
