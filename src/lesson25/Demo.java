package lesson25;

public class Demo {
    public static void main(String[] args) {
        Employee[] emps = {new Teacher(), new Doctor(), new Driver()};
        for (Employee emp : emps) {
            emp.work();
            if (emp instanceof Helpable)
                ((Helpable)emp).help();
        }
    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }

    abstract void work();
}

class Teacher extends Employee implements Helpable{

    @Override
    void work() {
        System.out.println("Teacher works");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee {

    @Override
    void work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee {

    @Override
    void work() {
        System.out.println("Doctor works");
    }
}
interface Helpable{
    void help();
}