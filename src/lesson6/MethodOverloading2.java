package lesson6;

public class MethodOverloading2 {

    public int sum(int num, int num1){
        return num + num1;
    }
    public String sum(String num, String num1){
        return num + num1;
    }
}
class MethodOverloading2Demo{
    public static void main(String[] args) {

        MethodOverloading2 overloading = new MethodOverloading2();
        System.out.println(overloading.sum(2,2));
        System.out.println(overloading.sum("2","2"));
    }
}
