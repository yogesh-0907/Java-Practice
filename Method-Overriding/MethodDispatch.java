class Parent {

    void show() {
        System.out.println("Parent Show");
    }
}

class Child extends Parent {

    @Override
    void show() {
        System.out.println("Child Show");
    }
}

class MethodDispatch {

    public static void main(String[] args) {

        Parent p = new Child();

        p.show();
    }
}