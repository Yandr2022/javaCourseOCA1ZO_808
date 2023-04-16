package lesson11;

public class Student {
    String name;
    int course;
    double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public static void swapFake(Student student, Student student1){
        Student st3 = student;
        student = student1;
        System.out.println(student);
        student1 = st3;
        System.out.println(student1);
    }

    public void changeName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}

class Demo2 {
    public static void main(String[] args) {
        Student student = new Student("Ivan", 3, 9.5);
        Student student1 = new Student("Petr", 1, 5.3);

        System.out.println(student);
        System.out.println(student1 + "\n");
        Student.swapFake(student, student1);//no swap because argument meth is copy, but not Object
        System.out.println("\n" + student);
        System.out.println(student1 + "\n");

        student.changeName("Vanya");
        System.out.println(student);
    }
}
