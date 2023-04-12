package lesson5;

public class Human {

    String name;
    HumanCar car;
    BankAccount bankAccount;

    public Human() {
        name = "John Dow";
        bankAccount = new BankAccount();
        car = new HumanCar();
    }

    public Human(String name, HumanCar car, BankAccount bankAccount) {
        this.name = name;
        this.car = car;
        this.bankAccount = bankAccount;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", " + car +
                ", " + bankAccount +
                '}';
    }
}
class HumanCar{
    String color;
    String engine;

    public HumanCar() {
        color = "red";
        engine = "V6";
    }

    public HumanCar(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "HumanCar{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }
}
class BankAccount{
    private static int idCount = 0;
    int id ;

    double balance;

     BankAccount() {
        id = idCount++;
        balance = 1000;

    }

     BankAccount(int id,  double balance) {
        this.id = id;
        this.balance = balance;
    }

    void increaseBalance(double amount){
         balance+=amount;
    }

    void reduceBalance(double amount){
         balance-=amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}

class Demo {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        human.bankAccount.reduceBalance(152.2);
        System.out.println(human);
        HumanCar car = new HumanCar("blue","V8");
        BankAccount account = new BankAccount();
        Human human1 = new Human("Yuli",car,account);
        System.out.println(human1);
        human1.bankAccount.increaseBalance(200);
        System.out.println(human1);
    }
}