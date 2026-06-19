class Parent {

    void display() {
        System.out.println("Parent Display");
    }
}

class Child extends Parent {

    @Override
    void display() {

        super.display();

        System.out.println("Child Display");
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}