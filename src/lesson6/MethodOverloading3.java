package lesson6;

public class MethodOverloading3 {

    public int sum(int num, int num1, int num2) {
        return num + num1 + num2;
    }

    public int avg(int num, int num1, int num2) {
        return sum(num, num1, num2) / 3;
    }
}

class MethodOverloading3Demo {
    public static void main(String[] args) {

        MethodOverloading3 overloading = new MethodOverloading3();
        System.out.println(overloading.sum(2, 3, 4));
        System.out.println(overloading.avg(2, 3, 4));
    }
}
