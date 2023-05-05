package lesson30;

import java.util.ArrayList;

public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ivan", 'm', 22, 3, 8.3));
        students.add(new Student("Nicolay", 'm', 28, 2, 6.4));
        students.add(new Student("Elena", 'f', 19, 1, 8.9));
        students.add(new Student("Petr", 'm', 35, 4, 7));
        students.add(new Student("Maria", 'f', 23, 3, 9.1));
        StudentInfo  info = new StudentInfo();
        info.printStudentsBySex(students,'m');
        System.out.println("********************************************************");
        info.printStudentsOverGrade(students,7);
        System.out.println("********************************************************");
        info.printStudentsUnderGrade(students,8.5);
        System.out.println("********************************************************");
        info.printStudentsOverAge(students,25);
        System.out.println("********************************************************");
        info.printStudentsUnderAge(students,25);
        System.out.println("********************************************************");
        info.printStudentsByMixCondition(students,8,25,'f');
    }
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

}

class StudentInfo {
    void printAllInfo(Student student) {
        System.out.println(student);
    }

    void printStudentsOverGrade(ArrayList<Student> students, double avgGrade) {
        for (Student st : students) {
            if (st.avgGrade >= avgGrade) {
                printAllInfo(st);
            }
        }
    }

    void printStudentsUnderGrade(ArrayList<Student> students, double avgGrade) {
        for (Student st : students) {
            if (st.avgGrade <= avgGrade) {
                printAllInfo(st);
            }
        }
    }

    void printStudentsOverAge(ArrayList<Student> students, int age) {
        for (Student st : students) {
            if (st.age >= age) {
                printAllInfo(st);
            }
        }
    }

    void printStudentsUnderAge(ArrayList<Student> students, int age) {
        for (Student st : students) {
            if (st.age <= age) {
                printAllInfo(st);
            }
        }
    }

    void printStudentsBySex(ArrayList<Student> students, char sex) {
        for (Student st : students) {
            if (st.sex == sex) {
                printAllInfo(st);
            }
        }
    }

    void printStudentsByMixCondition(ArrayList<Student> students, double avgGrade, int age, char sex) {
        for (Student st : students) {
            if (st.sex == sex && st.avgGrade >= avgGrade && st.age <= age) {
                printAllInfo(st);
            }
        }
    }
}