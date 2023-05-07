package homework.lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

import static homework.lesson30.TestEmp.showEmpsByCondition;

public class Demo {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Oleg", 300, "HR"));
        employees.add(new Employee("Ivan", 400, "IT"));
        employees.add(new Employee("Maria", 200, "ACC"));
        employees.add(new Employee("Elena", 150, "CL"));
        employees.add(new Employee("Semen", 150, "CL"));
        employees.add(new Employee("Yulia", 500, "IT"));
        employees.add(new Employee("Irina", 180, "HR"));
        employees.add(new Employee("IT", 180, "IT"));
        employees.add(new Employee("Egor", 450, "ACC"));

        showEmpsByCondition(employees, employee -> employee.department.equals("IT") && employee.salary >= 200);
        System.out.println("************************************");
        showEmpsByCondition(employees, employee -> employee.name.startsWith("E") && employee.salary != 450);
        System.out.println("************************************");
        showEmpsByCondition(employees, employee -> employee.name.equals(employee.department));

    }
}

class Employee {

    String name;
    int salary;
    public String department;

    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

class TestEmp {

    static void showEmp(Employee employee) {
        System.out.println(employee);
    }

    static void showEmpsByCondition(ArrayList<Employee> employees, Predicate<Employee> condition) {
        for (Employee employee : employees) {
            if (condition.test(employee)) {
                System.out.println(employee);
            }
        }
    }
}