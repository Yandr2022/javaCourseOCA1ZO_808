package homework.lesson12;

import lesson11.Student;

public class StudentDemo {

    static void showIsEqualsStudent(Student student, Student student1) {
        if (student.getName().equals(student1.getName()) && student.getCourse() == student1.getCourse()
                && student.getGrade() == student1.getGrade())
            System.out.println("Students are equals");
        else
            System.out.println("Students are not equals");
    }

    static void showDifferencesStudent(Student student, Student student1) {
        if (student.getName().equals(student1.getName()))
            if (student.getCourse() == student1.getCourse())
                if (student.getGrade() == student1.getGrade())
                    System.out.println("Names, courses and grades of Students are equals");
                else
                    System.out.println("Names and courses of Students are equals, but grades are not");
            else if (student.getGrade() == student1.getGrade())
                System.out.println("Names and grades of Students are equals, but courses are not");
            else
                System.out.println("Names of Students are equals, but courses and grades are not");
        else if (student.getCourse() == student1.getCourse())
            if (student.getGrade() == student1.getGrade())
                System.out.println("Courses and grades of Students are equals, but names are not");
            else
                System.out.println("Courses of Students are equals, but names and grades are not");
        else if (student.getGrade() == student1.getGrade())
            System.out.println("Grades of Students are equals, but names and courses are not");
        else
            System.out.println("Names, courses and grades of Students are not equals");

    }

    static void showDiffStudents(Student student, Student student1){
        System.out.printf("Student names are %s,\ncourses are %s,\ngrades are %s\n"
                , student.getName().equals(student1.getName())?"equals":"not equals",
                student.getCourse() == student1.getCourse()?"equals":"not equals"
                ,student.getGrade() == student1.getGrade()?"equals":"not equals");
    }

    public static void main(String[] args) {
        Student student = new Student("Ivan", 2, 5.8);
        Student student1 = new Student("Ivan", 2, 5.8);
        showIsEqualsStudent(student,student1);
        Student student2 = new Student("John", 3, 5.8);
        showIsEqualsStudent(student,student2);
        System.out.println();
        showDifferencesStudent(student,student1);
        showDifferencesStudent(student,student2);
        System.out.println();
        showDiffStudents(student,student1);
        showDiffStudents(student,student2);
    }
}
