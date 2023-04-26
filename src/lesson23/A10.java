package lesson23;

public class A10 {
    String str = "Hello";
    static double d = 3.14;

    int sum(int... nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    static void foo() {
        System.out.println("static method");
    }
}

class B10 extends A10{
    String str = super.str + ", friend";

    @Override
    int sum(int... nums) {
        int result = super.sum(nums);
        System.out.println(result);
        return result;
    }
}
class AB10Demo{
    public static void main(String[] args) {
A10 a10 = new B10();
        System.out.println(a10.str);
        System.out.println(((B10)a10).str);
        a10.sum(1,2,3);

    }
}