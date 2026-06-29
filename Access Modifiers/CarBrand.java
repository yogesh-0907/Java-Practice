class Vehical{
    protected String brand;
}
class Car extends Vehical{
    public static void main(String args[]){
        Car car = new Car();
        car.brand = "Honda";
        System.out.println("Our car brand is : "+car.brand);
    }
}