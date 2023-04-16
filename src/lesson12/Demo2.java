package lesson12;

public class Demo2 {
    static int findMax(int num, int num1, int num2) {
        return num > num1 && num > num2 ? num : num1 > num && num1 > num2 ? num1 : num2;
    }

    static int getMax(int num, int num1, int num2) {
        if (num > num1 && num > num2)
            return num;
        else if (num1 > num && num1 > num2)
            return num1;
        else return num2;
    }

    public static void main(String[] args) {
        System.out.println(findMax(4, 8, 2));
        System.out.println(getMax(4, 7, 2));
    }
}
