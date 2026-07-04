abstract class Vehical{
    abstract void start();
}
class Car extends Vehical{
    void start(){
        System.out.println("Car is ready to start.");
    }
}
class Bike extends Vehical{
    void start(){
        System.out.println("Bike is ready to start.");
    }
}
public class Main_1{
    public static void main(String args[]){
        Car car = new Car();
        car.start();
        Bike bike = new Bike();
        bike.start();
    }
}