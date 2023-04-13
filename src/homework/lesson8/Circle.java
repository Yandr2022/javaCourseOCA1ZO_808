package homework.lesson8;

public class Circle {
    private static final double PI = 3.14;
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return radius * radius * PI;
    }

    public double getLength() {
        return 2 * radius * PI;
    }

    static void showAreaAndLengthByRadius(double radius) {
        System.out.printf("radius: %.2f\narea: %.2f\nlength: %.2f \n", radius, (radius * radius * PI), (2 * radius * PI));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class Demo1 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6);
        System.out.println(circle);
        System.out.printf("area: %.2f\nlength: %.2f \n\n", circle.getArea(), circle.getLength());
        Circle.showAreaAndLengthByRadius(25.4);

    }
}
