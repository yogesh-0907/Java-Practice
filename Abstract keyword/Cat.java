abstract class Animal{
    abstract void sound();
}
abstract class Mammal extends Animal{
    abstract void eat();
}
public class Cat extends Mammal{
    void eat(){
        System.out.println("Cat eats cat food");
    }
    void sound(){
        System.out.println("Cat do meows sound");
    }
    public static void main(String args[]){
        Animal cat = new Cat();
        cat.sound();
        Mammal mam = new Cat();
        mam.eat();
    }
}