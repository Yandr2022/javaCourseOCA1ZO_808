package lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

import static lesson30.StudentSort.testStudents;

public class LambdaDemo1 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 'm', 22, 3, 8.3));
        students.add(new Student("Nicolay", 'm', 28, 2, 6.4));
        students.add(new Student("Elena", 'f', 19, 1, 8.9));
        students.add(new Student("Petr", 'm', 35, 4, 7));
        students.add(new Student("Maria", 'f', 23, 3, 9.1));
        StudentChecks[] checks = {new FindStudentOverGrade(),new FindStudentUnderGrade(), new FindStudentOverAge()
                ,new FindStudentUnderAge(), new FindStudentBySex(), new FindStudentByMixCondition()};
        for (StudentChecks sc:checks) {
            testStudents(students,sc);
            System.out.println("************************************");
        }

    }
}

interface StudentChecks {
    boolean testStudents(Student student);
}

class FindStudentOverGrade implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.avgGrade > 8.5;
    }
}
class FindStudentUnderGrade implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.avgGrade < 9;
    }
}
class FindStudentOverAge implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.age > 25;
    }
}
class FindStudentUnderAge implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.age < 27;
    }
}
class FindStudentBySex implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.sex == 'm';
    }
}
class FindStudentByMixCondition implements StudentChecks {

    @Override
    public boolean testStudents(Student student) {
        return student.sex == 'm' && student.avgGrade > 7.2 && student.age < 23;
    }
}

class StudentSort {
    static void testStudents(ArrayList<Student> students, StudentChecks checks) {
        for (Student student : students
        ) {
            if (checks.testStudents(student)) {
                System.out.println(student);
            }
        }
    }


}