package lesson7._1;

import lesson7.Employee;

public class AnyClassToAnyPackage {
    public static void main(String[] args) {
        Worker employee = new Worker(500);
        employee.showX2Salary();
    }
}
class Worker extends Employee{

    protected Worker(double salary) {
        super(salary);
    }

    @Override
    protected void showX2Salary() {
        super.showX2Salary();
    }
}
