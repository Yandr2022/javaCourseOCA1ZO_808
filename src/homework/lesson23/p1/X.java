package homework.lesson23.p1;



public class X {}
class Y extends X{}

class Demo{
    public static void main(String[] args) {
        Y y = new Y();
//        foo(y,y);

    }
    public static void foo(Y y,X x){
        System.out.println("foo(Y y,X x)");
    }
    public static void foo(X x,Y y){
        System.out.println("foo(X x,Y y)");
    }
}