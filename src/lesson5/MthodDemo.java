package lesson5;

public class MthodDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2, 3, 6, 92));
        System.out.println(Calculator.sumSt(new int[]{85, 24, 38, -56}));
        System.out.println(calculator.avg(1, 2, 3, 6, 92));
        System.out.println(Calculator.avgSt(new int[]{85, 24, 38, -56}));
    }
}

class Calculator {
    int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    static int sumSt(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    double avg(int... nums) {
        return (double) sum(nums) / nums.length;
    }

    static double avgSt(int... nums) {
        return (double) sumSt(nums) / nums.length;
    }
}