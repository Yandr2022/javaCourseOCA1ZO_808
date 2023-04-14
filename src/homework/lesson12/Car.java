package homework.lesson12;

public class Car {
    int engine;
    int doorAmount;

    public Car(int engine, int doorAmount) {
        this.engine = engine;
        this.doorAmount = doorAmount;
    }
}

class CarDemo {
    public static void main(String[] args) {
        Car car = new Car(3, 5);
        Car car1 = new Car(4, 6);

        if (car.engine > car1.engine)
            if (car.doorAmount > car1.doorAmount)
                System.out.println("Engine volume and Door amount of car is greater than car1");
            else
                System.out.println("Engine volume of car is greater than car1, but Door amount is "
                        + (car.doorAmount == car1.doorAmount ? "equals" : "less"));
        else if (car.engine < car1.engine)
            if (car.doorAmount < car1.doorAmount)
                System.out.println("Engine volume and Door amount of car is less than car1");
            else
                System.out.println("Engine volume of car is less than car1, but Door amount is "
                        + (car.doorAmount == car1.doorAmount ? "equals" : "greater"));
        else if (car.doorAmount == car1.doorAmount)
            System.out.println("Engine volume and Door amount of car is equals car1");
        else
            System.out.println("Engine volume of car is equals than car1, but Door amount is "
                    + (car.doorAmount > car1.doorAmount ? "greater" : "less"));

        System.out.println("Engine volume of car is "
                + (car.engine > car1.engine ? "greater" : car.engine < car1.engine ? "less" : "equals")
                + " than car1, Door amount of car is "
                + (car.doorAmount > car1.doorAmount ? "greater" : car.doorAmount < car1.doorAmount ? "less" : "equals")
                +  " than car1" );
    }

}