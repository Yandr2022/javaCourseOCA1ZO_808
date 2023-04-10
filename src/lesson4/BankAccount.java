package lesson4;

public class BankAccount {
    int id;
    String name;
    double balance;

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();
        myAccount.id = 1;
        myAccount.name = "Yulia";
        myAccount.balance = 1500.25;
        yourAccount.id = 2;
        yourAccount.name = "Ivan";
        yourAccount.balance = 8700;
        hisAccount.id = 3;
        hisAccount.name = "John";
        hisAccount.balance = 1850.78;
        System.out.println(myAccount + "\n" + yourAccount + "\n" + hisAccount);
    }

}
