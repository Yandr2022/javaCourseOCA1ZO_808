package homework.lesson8;

public class Calculator {
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    static void showDivideResult(int a, int b) {
        System.out.println(a + "/" + b + " = " + (a / b) + "\nremainder of division: " + (a % b));
    }
}
class Demo {
    public static void main(String[] args) {
        System.out.println(Calculator.multiply(1, 2, 3));
        Calculator.showDivideResult(85,3);
    }
}
