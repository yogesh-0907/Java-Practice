import java.util.Scanner;

class Shape {

    double area() {
        return 0;
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Circle Radius:");
        Shape circle = new Circle(sc.nextDouble());

        System.out.println("Enter Rectangle Length and Width:");
        Shape rectangle =
            new Rectangle(sc.nextDouble(), sc.nextDouble());

        System.out.println("Enter Triangle Base and Height:");
        Shape triangle =
            new Triangle(sc.nextDouble(), sc.nextDouble());

        Shape[] shapes = {
            circle,
            rectangle,
            triangle
        };

        for(Shape shape : shapes) {
            System.out.println("Area: " + shape.area());
        }
    }
}