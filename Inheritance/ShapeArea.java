class Shape {

    double area() {
        return 0;
    }
}

class Circle extends Shape {

    double radius = 5;

    double area() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        Circle c = new Circle();

        System.out.println(c.area());
    }
}