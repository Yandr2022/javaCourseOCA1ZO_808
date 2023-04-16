package lesson13;

public class Demo {
    public static void main(String[] args) {
        Student[] students = {new Student(1),new Student(2),new Student(3)
                ,new Student(4), new Student(5), new Student(6)};
        for (Student st:students) {
            showStudyResult(st);
        }
    }
    static void showStudyResult(Student s){
        switch (s.grade){
            case 2:
                System.out.println("Student is loser");break;
            case 3:
                System.out.println("Student is middle peasant");break;
            case 4:
                System.out.println("Student is good");break;
            case 5:
                System.out.println("Student is excellent");break;
            default:
                System.out.println("Its wrong grade");
        }

    }
}
class Student{
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }
}