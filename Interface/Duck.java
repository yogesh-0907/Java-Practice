interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
abstract class Animal{
    void eat(){
        System.out.println("Duck needs fishes to eat");
    }
    abstract void sound();
}
class Penguin extends Animal implements Swimmable {
    public void swim(){
        System.out.println("Penguin can Swim");
    }
    @Override
    public void sound(){
        System.out.println("Penguine makes sounds");
    }
}
public class Duck extends Animal implements Flyable,Swimmable{
    @Override
    public void fly(){
        System.out.println("Ducks can fly");
    }
    public void swim(){
        System.out.println("Duck can swim");
    }
    @Override
    public void sound(){
        System.out.println("Duck quacks");
    }
    public static void main(String args[]){
        Animal a = new Duck();
        a.eat();
        a.sound();
        Flyable f = new Duck();
        f.fly();
        Swimmable s = new Duck();
        s.swim();
        Duck d = new Duck();
        d.eat();
        d.sound();
        d.fly();
        d.swim();
        Animal p = new Penguin();
        p.sound();
        p.eat();
    }
}