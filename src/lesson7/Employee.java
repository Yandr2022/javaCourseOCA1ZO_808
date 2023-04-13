package lesson7;

public class Employee {
   private double salary;

    protected Employee(double salary) {
        this.salary = salary;
    }

     protected void showX2Salary(){
        System.out.println("Salary x2: "+ salary*2);
    }

    public static void main(String[] args) {
        Employee employee = new Employee(500);
        employee.showX2Salary();
    }
}
