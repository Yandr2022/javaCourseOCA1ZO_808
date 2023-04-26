package lesson23;

public class Employee {
    private String name;
    private int age;
    private int exp;

    public Employee() {
    }

    public Employee(String name, int age, int exp) {
        this.name = name;
        this.age = age;
        this.exp = exp;
    }

    public void eat() {
        System.out.println("employee eats");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp;
    }
}
