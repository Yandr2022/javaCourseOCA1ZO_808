package homework.lesson22;

public class Pet extends Animal {
    private final int tailsNum;
    private final int pawsNum;
    private String name;

    {
        this.tailsNum = 1;
        this.pawsNum = 4;
    }

    public Pet() {
        setEyesNum(2);
    }

    public Pet(String name) {
        super(2);
        this.name = name;
        System.out.println("I'm Pet");
    }

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }

    @Override
    public void setEyesNum(int eyesNum) {
        if (eyesNum <= 2)
            super.setEyesNum(eyesNum);
    }

    public int getTailsNum() {
        return tailsNum;
    }

    public int getPawsNum() {
        return pawsNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
