import java.util.Scanner;

abstract class Shape {
    abstract double area(Scanner sc);
}

class Circle extends Shape {
    static final double PI = 3.146;

    double area(Scanner sc) {
        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();
        return PI * r * r;
    }
}

class Rectangle extends Shape {
    double area(Scanner sc) {
        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        return length * breadth;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle circle = new Circle();
        System.out.println("Area of Circle: " + circle.area(sc));

        Rectangle rect = new Rectangle();
        System.out.println("Area of Rectangle: " + rect.area(sc));

        sc.close();
    }
}