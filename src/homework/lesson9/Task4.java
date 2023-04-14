package homework.lesson9;

public class Task4 {
    int a = 1;
    static int b = 2;
    void  foo( int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(Task4.b);
    }
}
class Demo4{
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.foo(4);
    }
}
