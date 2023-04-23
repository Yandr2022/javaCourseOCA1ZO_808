package homework.lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private int grade;

    public Student() {
    }

    public Student(StringBuilder name, int course, int grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() >= 3)
            this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 5 && course > 0)
            this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 11)
            this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }

    public void showInfo() {
        System.out.println(this);
    }
}

class Demo {
    public static void main(String[] args) {
        Student student = new Student(new StringBuilder("Yuli"), 4, 10);
        student.showInfo();
        showInfo(student);
    }

    public static void showInfo(Student student) {
        System.out.printf("Student { name: %s, course: %d, grade: %d }"
                , student.getName(), student.getCourse(), student.getGrade());
    }
}