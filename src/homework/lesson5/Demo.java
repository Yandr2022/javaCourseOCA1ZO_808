package homework.lesson5;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Test", 25, 500);
        System.out.println(employee);
        employee.increaseSalary(200);
        System.out.println(employee);
        employee.x2Salary();
        System.out.println(employee);
    }
}
