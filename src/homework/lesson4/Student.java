package homework.lesson4;

public class Student {
    int id;
    String firstName;
    String lastName;
    int yearOfStudy;
    double mathAverageGrade;
    double economicsAverageGrade;
    double foreignLanguageAverageGrade;

    public Student(int id, String firstName, String lastName, int yearOfStudy,
                   double mathAverageGrade, double economicsAverageGrade, double foreignLanguageAverageGrade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfStudy = yearOfStudy;
        this.mathAverageGrade = mathAverageGrade;
        this.economicsAverageGrade = economicsAverageGrade;
        this.foreignLanguageAverageGrade = foreignLanguageAverageGrade;
    }

    public Student() {
    }
}
