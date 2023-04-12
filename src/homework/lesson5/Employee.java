package homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;

    Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    Employee() {
    }

    void increaseSalary(double amount) {
        salary += amount;
    }

    void x2Salary() {
        salary *=2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}


