class ConstructorChaining {

    ConstructorChaining() {

        this(10);

        System.out.println("Default Constructor");
    }

    ConstructorChaining(int x) {

        System.out.println("Parameterized Constructor");
    }

    public static void main(String[] args) {

        new ConstructorChaining();
    }
}