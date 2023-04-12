package lesson6;

public class MethodOverloading {
    void show(int val){
        System.out.println(val + " int");
    }
    void show(int val, int val2){
        System.out.println(val + " " + val2 + " 2 int");
    }

    void show(double val){
        System.out.println(val +" d");
    }
    void show(boolean val){
        System.out.println(val+ " bool");
    }
    void show(String val){
        System.out.println(val + " str");
    }

    void show(String val, int num){
        System.out.println("string: "+ val +" int: "+ num );
    }
    void show( int num,String val){
        System.out.println("int: "+ num + " string: "+ val );
    }
}
class MethodOverloadingDemo {
    public static void main(String[] args) {
        MethodOverloading overloading = new MethodOverloading();
        overloading.show(25);
        overloading.show(25, 12);
        overloading.show("25");
        overloading.show(true);
        double var = 25;
        overloading.show(var);
        overloading.show("25",25);
        overloading.show(25,"25");
    }
}