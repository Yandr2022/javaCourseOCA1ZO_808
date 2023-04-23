package lesson22.inheritance;

public class Teacher extends Employee{
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
