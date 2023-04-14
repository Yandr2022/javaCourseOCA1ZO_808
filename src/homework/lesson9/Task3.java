package homework.lesson9;

public class Task3 {
    int a = 1;
    static int b = 2;
    void  foo(final int a){
        System.out.println(a);
        System.out.println(Task3.b);
    }
}
class Demo3{
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.foo(5);
    }
}
