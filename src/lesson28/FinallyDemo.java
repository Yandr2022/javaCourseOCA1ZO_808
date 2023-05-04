package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyDemo {
    static int foo(){
        File file = new File("test.txt");
        try {
            FileInputStream stream  = new FileInputStream(file);
            return 5;
        } catch (FileNotFoundException e) {
            System.out.println("was caught " + e);
            return 6;
        }finally {
            System.out.println("finally");
            return 7;//only this return is meth output
        }
//        return 3;unreachable statement
    }

    static int foo(int a) {
        File file = new File("test1.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("was caught " + e);
            System.out.println("catch block: a= " + a);
            return a;
        } finally {
            a += 10;
            System.out.println("finally block: a= " + a);
        }
        return a;
    }
    static StringBuilder foo(StringBuilder a) {
        File file = new File("test.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("was caught " + e);
            System.out.println("catch block: a= " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("finally block: a= " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(foo(new StringBuilder("hello")));
    }
}
