package lesson24;

public class DemoIF {
    public static void main(String[] args) {
        Helpable[] helpables = {new Driver(100, "Ivan", 35, 10, "Volvo")
                , new Teacher(200, "Yuli", 35, 20, 250)};
        for (Helpable helpable : helpables) {
            System.out.println(helpable);
            helpable.extinguishFire();
            helpable.provideFirstAid();
            if (helpable instanceof Swimmable) {
                ((Swimmable) helpable).swim();
            }
        }
    }
}

class Employee {

    public Employee() {
    }

    public Employee(double salary, String name, int age, int exp) {
        this.salary = salary;
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    double salary;
    String name;
    int age;
    int exp;

    void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }

    @Override
    public String toString() {
        return "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp;
    }
}

interface Helpable {
    int TIME_OF_PROVIDE = 60;

    void provideFirstAid();

    void extinguishFire();
}

interface Swimmable {
    void swim();
}


class Teacher extends Employee implements Helpable {
    int numberOfStudents;

    public Teacher(double salary, String name, int age, int exp, int numberOfStudents) {
        super(salary, name, age, exp);
        this.numberOfStudents = numberOfStudents;
    }

    public void teach() {
        System.out.println("teach");
    }

    @Override
    public void provideFirstAid() {
        System.out.println("provide First Aid to " + TIME_OF_PROVIDE + " sec");
    }

    @Override
    public void extinguishFire() {
        System.out.println("extinguish a Fire");
    }

    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", numberOfStudents=" + numberOfStudents +
                "} ";
    }
}

class Driver extends Employee implements Helpable, Swimmable {
    public Driver(double salary, String name, int age, int exp, String carName) {
        super(salary, name, age, exp);
        this.carName = carName;
    }

    String carName;

    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void provideFirstAid() {
        System.out.println("provide First Aid to " + TIME_OF_PROVIDE + " sec");
    }

    @Override
    public void extinguishFire() {
        System.out.println("extinguish a Fire");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public String toString() {
        return "Driver{"
                + super.toString() +
                ", carName='" + carName + '\'' +
                "} ";
    }
}

class Doctor extends Employee {
    public void treat() {
        System.out.println("treat");
    }
}

class Surgeon extends Doctor {
    String scalpel;

    void operate() {
        System.out.println("operate");

    }

}

class Dentist extends Doctor {
    String drillingMachine;

    void drill() {
        System.out.println("drill");
    }
}