package lesson21;

public class Demo {
    public static void main(String[] args) {
        String s1,s2,s3;
        s1 = new String("abc");
        s2 = new String("def");
        s1 =s2;//abc fit for removal
        s3 = s1;//thirst reference to def
        s1 = null;//removed a link for one of the links to def

    }//all fits for removal
}
