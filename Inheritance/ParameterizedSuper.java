class Parent {

    Parent(int x) {
        System.out.println("Parent Constructor: " + x);
    }
}

class Child extends Parent {

    Child() {

        super(100);

        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {

        new Child();
    }
}