package lesson6;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id, String surname, int age) {
        this(surname,age);
        this.id = id;
    }

    Employee(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this(id, surname, age);
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class EmpTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ivanov", 25);
        Employee employee2 = new Employee( "Ivanov", 25);
        Employee employee3 = new Employee( 2,"Ivanov", 25,2000,"IT");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        for (Employee emp:employees) {
            System.out.println(emp);
        }

    }
}
