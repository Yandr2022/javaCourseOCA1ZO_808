package lesson10;

//import lesson9.Car;
//import lesson9.Student;//class import
import lesson9.*;//package import
//import static lesson9.Student.num; static import one variable
import static lesson9.Student.*;// static import all elements of class
//import lesson8.*;package import error, because packages contain classes with the same name

public class A {
    public static void main(String[] args) {
        Car car  = new Car("blue","V6");
        Student student = new Student();
        showNum();
        String String = "fdc";
        System.out.println(String);
    }
}

class B {
    Student student = new Student();
    int a = num;
    homework.lesson4.Student student1 = new homework.lesson4.Student();
}
