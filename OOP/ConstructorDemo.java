class ConstructorDemo {

    int x;

    ConstructorDemo() {
        x = 100;
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();

        System.out.println(obj.x);
    }
}