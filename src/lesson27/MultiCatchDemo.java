package lesson27;

import java.io.*;

public class MultiCatchDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        try {
            FileInputStream stream = new FileInputStream(file);
        } catch (NullPointerException e) {//><
            e.printStackTrace();
        } catch (FileNotFoundException e) {//  \/
            e.printStackTrace();
        } catch (IOException e) {         //  \/
            e.printStackTrace();
        } catch (Exception e) {           //  \/
            e.printStackTrace();
        } catch (Throwable e) {           //  *
            e.printStackTrace();
        }
    }
}
