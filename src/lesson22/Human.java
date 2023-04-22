package lesson22;

public class Human {
    final String gender;
    private String name;
    private int age;
    private int weight;
    private boolean clever;

    public Human(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
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
        if (age > 0)
            this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0)
            this.weight = weight;
    }

    public void setClever(boolean clever) {
        this.clever = clever;
    }

    public boolean isClever() {
        return clever;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", clever=" + clever +
                '}';
    }
}


class HumanDemo {
    public static void main(String[] args) {
        Human human = new Human("male");
        human.setName("Ivan");
        human.setAge(35);
        human.setWeight(80);
        human.setClever(true);
        System.out.println(human);
    }
}