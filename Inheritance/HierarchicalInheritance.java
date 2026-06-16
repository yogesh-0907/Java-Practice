class Shape {

    void draw() {
        System.out.println("Drawing Shape");
    }
}

class Circle extends Shape {

    void circle() {
        System.out.println("Circle Shape");
    }
}

class Rectangle extends Shape {

    void rectangle() {
        System.out.println("Rectangle Shape");
    }
}

class HierarchicalInheritance {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();
        c.circle();

        Rectangle r = new Rectangle();
        r.draw();
        r.rectangle();
    }
}