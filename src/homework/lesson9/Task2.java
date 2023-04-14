package homework.lesson9;

public class Task2 {
    int a = 1;
//    static int a = 2; variable a is already defined in class
    void  foo(int a){
        System.out.println(a);
        System.out.println(this.a);
    }
}
class Demo2{
    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.foo(3);
    }
}
