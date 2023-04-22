package lesson22.inheritance;

public class Teacher {

        private String name;
        private int age;
        private int exp;
        private String numberOfStudents;

        public void eat() {
            System.out.println("eat");
        }

        public void sleep() {
            System.out.println("sleep");
        }

        public void teach() {
            System.out.println("teach");
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(String numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", exp=" + exp +
                ", numberOfStudents='" + numberOfStudents + '\'' +
                '}';
    }
}
