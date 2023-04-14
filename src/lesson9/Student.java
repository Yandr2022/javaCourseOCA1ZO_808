package lesson9;

public class Student {
}

class StudentDemo {
    public static void main(String[] args) {
       Student student = new Student();
       Student student1 = new Student();
       student = null;
       student = new Student();
       student = student1;
    }
}