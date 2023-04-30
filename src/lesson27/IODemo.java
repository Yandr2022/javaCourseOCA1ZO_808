package lesson27;

import java.io.*;

public class IODemo {
    public static void main(String[] args) {
        File file = new File("test1.txt");
        FileInputStream stream = null;
        FileOutputStream outputStream = null;
        try {
            stream = new FileInputStream(file);
            outputStream = new FileOutputStream(file);
            outputStream.write(100);
            stream.read();
        } catch (FileNotFoundException e) {
            System.out.println("was caught " + e);
        } catch (IOException e) {
            System.out.println("was caught " + e);
        } finally {
            try {
                if (stream != null)
                    stream.close();
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                System.out.println("was caught " + e);
            }
        }
    }
}
