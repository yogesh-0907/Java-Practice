class Parent {

    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {

    void show() {
        System.out.println("Child Method");
    }

    void display() {

        super.show();
        show();
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}