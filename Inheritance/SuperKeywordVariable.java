class Parent {

    int x = 100;
}

class Child extends Parent {

    int x = 200;

    void display() {

        System.out.println(super.x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}