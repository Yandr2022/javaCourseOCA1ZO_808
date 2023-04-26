package lesson23;

class Demo{
    public static void main(String[] args) {
        Employee teacher = new Teacher();
        teacher.eat();
    }
}

public class Teacher extends Employee {
    private int numberOfStudents;

    public Teacher(String name, int age, int exp, int numberOfStudents) {
        super(name, age, exp);
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher() {
    }

    public void teach() {
        System.out.println("teach");
    }

    @Override
    public void eat() {
        System.out.println("teacher eats");
    }


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", numberOfStudents='" + numberOfStudents + '\'' +
                '}';
    }
}
