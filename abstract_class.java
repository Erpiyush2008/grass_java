abstract class Shape {

    // Abstract methods (no body)
    abstract double area();
    abstract double perimeter();
}
class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double perimeter() {
        return 2 * Math.PI * radius;
    }
}
class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double area() {
        return length * breadth;
    }

    double perimeter() {
        return 2 * (length + breadth);
    }
}

public class abstract_class {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        System.out.println("Circle Area: " + s1.area());
        System.out.println("Circle Perimeter: " + s1.perimeter());

        System.out.println("Rectangle Area: " + s2.area());
        System.out.println("Rectangle Perimeter: " + s2.perimeter());


    }
}

