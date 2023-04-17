package lesson15;

import java.util.Random;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("How much money do you have?");
        int money;
        do {
            money = scanner.nextInt();
            System.out.print(money <= 0 ? "Its wrong number, try again\n" : "");
        } while (money < 1);
        int bet;
        while (money > 0) {
            System.out.println("Place your bet");
            do {
                bet = scanner.nextInt();
                System.out.println(bet <= 0 ? "Its wrong bet, try again"
                        : bet > money ? "You don't have enough money, try again" : bet == money
                        ? "Wow, are you ready to leave without your pants on? Go!" : "Let's play, good luck");
            } while (bet > money || bet <= 0);
            System.out.println("Enter number 0-20");
            int number = scanner.nextInt();
            int num = random.nextInt(21);
            boolean result = num == number;
            System.out.println("number on the roulette wheel: " + num + (result ? "You won, congrats!!" : "You lose"));
            money = result ? money + bet : money - bet;
        }
    }

//    public static void main(String[] args) {
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            System.out.print(random.nextInt(21)+" ");
//        }
//    }
}
