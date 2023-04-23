package lesson22.inheritance;

public class Driver extends Employee {
    private String carName;

    public Driver() {
    }

    public Driver(String name, int age, int exp, String carName) {
        super(name, age, exp);
        this.carName = carName;
    }

    public void drive() {
        System.out.println("drive");
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Driver{" + super.toString() +
                " ,carName='" + carName + '\'' +
                "} ";
    }
}
