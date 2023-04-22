package lesson22.inheritance;

public class Doctor {
    private String name;
    private int age;
    private int exp;
    private String specialization;

    public void eat() {
        System.out.println("doctor eat");
    }

    public void sleep() {
        System.out.println("doctor sleep");
    }

    public void treat() {
        System.out.println("doctor treat");
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

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
