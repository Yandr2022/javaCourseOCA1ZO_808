package homework.lesson22;

public class Animal {
    private int eyesNum;

    public Animal() {
    }

    public Animal(int eyesNum) {
        this.eyesNum = eyesNum;
        System.out.println("I'm animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

    public int getEyesNum() {
        return eyesNum;
    }

    public void setEyesNum(int eyesNum) {
        this.eyesNum = eyesNum;
    }
}
