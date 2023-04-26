package lesson24;

public class DemoAbstr {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(8), new Rectangle(3, 5), new Circle(7)};
        for (Shape s : shapes) {
            System.out.printf("%s\nArea = %.2f, Perimeter = %.2f\n", s, s.getArea(), s.getPerimeter());
        }
    }
}

abstract class Shape {
    private int sidesNum;

    public Shape(int sidesNum) {
        this.sidesNum = sidesNum;
    }

    abstract double getArea();

    abstract double getPerimeter();

    void showInfo() {
        System.out.println("It is Shape");
    }

    public int getSidesNum() {
        return sidesNum;
    }

    public void setSidesNum(int sidesNum) {
        this.sidesNum = sidesNum;
    }

    @Override
    public String toString() {
        return "sidesNum=" + sidesNum ;
    }
}

class Square extends Shape {
    private int side;

    public Square() {
        super(4);
    }

    public Square(int side) {
        super(4);
        this.side = side;
    }


    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * getSidesNum();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" + super.toString()
                + ", side=" + side +
                "} ";
    }
}

class Rectangle extends Shape {
    private int side1;
    private int side2;

    public Rectangle() {
        super(4);;
    }

    public Rectangle(int side1, int side2) {
        super(4);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "Rectangle{" + super.toString() +
                ", side1=" + side1 +
                ", side2=" + side2 +
                "} ";
    }
}

class Circle extends Shape {
    private int radius;

    public Circle() {
        super(0);
    }

    public Circle(int radius) {
        super(0);
        this.radius = radius;

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" + super.toString()+
                ", radius=" + radius +
                "} " ;
    }
}
