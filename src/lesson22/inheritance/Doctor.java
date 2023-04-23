package lesson22.inheritance;

public class Doctor extends Employee {

    private String specialization;

    public Doctor() {
    }

    public Doctor(String name, int age, int exp, String specialization) {
        super(name, age, exp);
        this.specialization = specialization;
    }

    public void treat() {
        System.out.println("treat");
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Doctor{" + super.toString() +
                ", specialization='" + specialization + '\'' +
                '}';
    }
}
