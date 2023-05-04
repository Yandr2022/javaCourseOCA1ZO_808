package lesson28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class NestedTry_CatchBlocksDemo {
    FileInputStream fis, fis1;

    public void foo() {
        try {
            fis = new FileInputStream("test.txt");
            try {
                fis1 = new FileInputStream("test1.txt");

            } catch (FileNotFoundException e) {
                System.out.println("file2 not found");
            } finally {
                System.out.println("Inner finally block");
                try {
                    fis.close();
                    fis1.close();
                } catch (IOException e) {
                    System.out.println("was caught " + e);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("file1 not found");

        } finally {
            System.out.println("Outer finally block");
            try {
                fis.close();
                fis1.close();
            } catch (IOException e) {
                System.out.println("was caught " + e);
            }

        }
    }

    public static void main(String[] args) {
        NestedTry_CatchBlocksDemo demo = new NestedTry_CatchBlocksDemo();
        demo.foo();
    }

}
