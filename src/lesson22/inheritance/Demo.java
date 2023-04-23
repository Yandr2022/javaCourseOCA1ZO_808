package lesson22.inheritance;

public class Demo {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Ivan", 35, 15, "super doc");
        Driver driver = new Driver("Petr", 40, 20, "super driver");
        Teacher teacher = new Teacher("Nicolay", 38, 15, 100);
        Employee[] employees = {doctor, driver, teacher};
        for (Employee emp : employees) {
            System.out.println(emp);
            emp.eat();
            emp.sleep();
            if (emp instanceof Doctor) {
                ((Doctor) emp).treat();
            } else if (emp instanceof Driver) {
                ((Driver) emp).drive();
            } else if (emp instanceof Teacher) {
                ((Teacher) emp).teach();
            }
        }
    }
}
