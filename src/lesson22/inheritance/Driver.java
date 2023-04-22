package lesson22.inheritance;

public class Driver extends Employee{
    private String carName;

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
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
        return "Driver{" +
                "carName='" + carName + '\'' +
                "} " + super.toString();
    }
}
