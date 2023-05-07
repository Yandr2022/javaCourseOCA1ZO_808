package lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;


public class LambdaDemo2 {
    static void testStudents(ArrayList<Student> students, Predicate<Student> checks) {

        for (Student student : students) {
            if (checks.test(student)) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Ivan", 'm', 22, 3, 8.3));
        students.add(new Student("Nicolay", 'm', 28, 2, 6.4));
        students.add(new Student("Elena", 'f', 19, 1, 8.9));
        students.add(new Student("Petr", 'm', 35, 4, 7));
        students.add(new Student("Maria", 'f', 23, 3, 9.1));

        StudentChecks[] checks = {(Student student) -> student.avgGrade > 8, (Student student) -> student.avgGrade <= 7
                , (Student student) -> student.age >= 21 && student.sex == 'f', st -> st.course > 1};

        for (StudentChecks sc : checks) {
            StudentSort.testStudents(students, sc);
            System.out.println("************************************");
        }
        //Predicate
        testStudents(students, student -> student.name.length() > 4);

        System.out.println("************************************");
        System.out.println(students);
        students.removeIf(student -> student.name.endsWith("a"));
        System.out.println(students);

    }
}

