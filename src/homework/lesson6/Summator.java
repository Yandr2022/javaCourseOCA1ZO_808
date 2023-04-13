package homework.lesson6;

public class Summator {
    int sum() {
        return 0;
    }

    int sum(int num) {
        return num;
    }

    int sum(int num, int num1) {
        return num + num1;
    }

    int sum(int num, int num1, int num2) {
        return num + num1 + num2;
    }

    int sum(int num, int num1, int num2, int num3) {
        return num + num1 + num2 + num3;
    }
}

class Demo {
    public static void main(String[] args) {
        Summator summator = new Summator();
        System.out.println(summator.sum());
        System.out.println(summator.sum(1));
        System.out.println(summator.sum(1, 2));
        System.out.println(summator.sum(1, 2, 3));
        System.out.println(summator.sum(1, 2, 3, 4));
    }
}
