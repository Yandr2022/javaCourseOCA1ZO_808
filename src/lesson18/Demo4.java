package lesson18;

public class Demo4 {
    public static void main(String[] args) {
        showExtremes(new double[]{0.5, -1.2, 2, 0, 85, -3, -3});
        showExtremes(new double[]{5.8, 24, -32, 1000, 2.4, 48, -85});
    }

    public static void showExtremes(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: " + min + "\nmax: " + max);
    }
}
