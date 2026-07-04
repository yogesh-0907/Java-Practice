public class Animal {
    public final void eat(){
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog eats food");
    }
}
