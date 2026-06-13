class Car {

    String brand;
    int speed;

    void start() {
        System.out.println(brand + " is starting");
    }

    void showSpeed() {
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args) {

        Car c1 = new Car();

        c1.brand = "BMW";
        c1.speed = 180;

        c1.start();
        c1.showSpeed();
    }
}