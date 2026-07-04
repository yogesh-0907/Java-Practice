abstract class Animal{
    abstract void sound();
}
public class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.sound();
        Animal ani = new Animal();
    }
}