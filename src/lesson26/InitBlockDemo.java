package lesson26;

public class InitBlockDemo {
static final String msg;

    static int count;
    final int test;

    static {
        msg = "Class loaded, objects amount: ";
        count = 0;
        System.out.println(msg + count);

    }

    public InitBlockDemo() {
        System.out.println("constructor object#" + count);
    }

    {
        count++;
        System.out.println("created object #" + count);
        test = 10;

    }

    public static void main(String[] args) {
        InitBlockDemo blockDemo = new InitBlockDemo();
        InitBlockDemo blockDemo1 = new InitBlockDemo();
        InitBlockDemo blockDemo2 = new InitBlockDemo();
        InitBlockDemo blockDemo3 = new InitBlockDemo();
    }
}
