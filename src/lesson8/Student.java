package lesson8;

public class Student {
    static int count;
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
        System.out.println("Student #"+ count + " was created");
    }

    public static void showCount(){
        System.out.println(count + " students in total created");
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}'+"\n total: "+ count;
    }
}
class Demo{
    public static void main(String[] args) {
        Student student = new Student("Ivan",4);
        Student student1 = new Student("Yuli",3);
        Student student2 = new Student("Semen",3);
        System.out.println(Student.count);
        System.out.println(student.count);
        Student.showCount();
        student.showCount();
        System.out.println(student);
    }
}
