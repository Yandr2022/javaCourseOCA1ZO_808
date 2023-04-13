package homework.lesson7;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee() {
    }


    Employee(int id, String surname, int age) {
        this(id, surname, age, 0.0, null);
    }

     Employee(String surname, int age) {
        this(0, surname, age, 0.0, null);

    }

    public Employee(int id, String surname, int age, double salary, String department) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
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
        Employee employee2 = new Employee("Ivanov", 25);
        Employee employee3 = new Employee(2, "Ivanov", 25, 2000, "IT");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        for (Employee emp : employees) {
            System.out.println(emp);
        }

    }
}
