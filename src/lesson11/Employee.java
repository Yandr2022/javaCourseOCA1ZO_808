package lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double x2Num(double num) {
        return num *= 2;
    }

    public double x2Salary(double num) {
        return salary *= 2;
    }
}
class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 100.55);
        System.out.println(employee.x2Num(employee.salary) + " " + employee.salary);// by value
        System.out.println(employee.x2Salary(employee.salary) + " " + employee.salary);// by reference
    }
}