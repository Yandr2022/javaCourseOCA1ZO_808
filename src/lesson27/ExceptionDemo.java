package lesson27;

public class ExceptionDemo {
    public static void main(String[] args) {
        int arr[] = {0, 1, 2};
        try{
            System.out.println(arr[5]);
            System.out.println("done");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("was caught " + e);
        }finally {
            System.out.println("finally block");
        }
        System.out.println("continue work App");
    }
}
