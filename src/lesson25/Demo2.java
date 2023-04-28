package lesson25;

public class Demo2 {
    public static void main(String[] args) {
        Employee_[] employees = {new Doctor_("Surgeon"), new Driver_("Volvo")
                , new Teacher_(100)};
        for (Employee_ emp : employees) {
            System.out.println(emp);
            emp.eat();
            emp.sleep();
            if (emp instanceof Doctor_) {
                ((Doctor_) emp).treat();
            } else if (emp instanceof Driver_) {
                ((Driver_) emp).drive();
            } else if (emp instanceof Teacher_) {
                ((Teacher_) emp).teach();
            }
        }
        Driver_  driver = (Driver_) employees[2];//ClassCastException run time
    }
}

class Employee_ {
    public Employee_() {
    }

    public Employee_(double salary, String name, int age, int exp) {
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


class Teacher_ extends Employee_ {
    int numberOfStudents;

    public Teacher_(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher_(double salary, String name, int age, int exp, int numberOfStudents) {
        super(salary, name, age, exp);
        this.numberOfStudents = numberOfStudents;
    }

    public void teach() {
        System.out.println("teach");
    }


    @Override
    public String toString() {
        return "Teacher{" + super.toString() +
                ", numberOfStudents=" + numberOfStudents +
                "} ";
    }
}

class Driver_ extends Employee_ {
    public Driver_(String carName) {
        this.carName = carName;
    }

    public Driver_(double salary, String name, int age, int exp, String carName) {
        super(salary, name, age, exp);
        this.carName = carName;
    }

    String carName;

    public void drive() {
        System.out.println("drive");
    }


    @Override
    public String toString() {
        return "Driver{"
                + super.toString() +
                ", carName='" + carName +'\'' +
                "} ";
    }
}

class Doctor_ extends Employee_ {

    public Doctor_(String specialization) {
        this.specialization = specialization;
    }

    public Doctor_(double salary, String name, int age, int exp, String specialization) {
        super(salary, name, age, exp);
        this.specialization = specialization;
    }

    String specialization;
    public void treat() {
        System.out.println("treat");
    }

    @Override
    public String toString() {
        return "Doctor_{" + super.toString()+
                ", specialization='" + specialization +'\'' +
                "} " ;
    }
}

