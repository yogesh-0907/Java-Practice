class Animal{
    void eat(){
        System.out.println("Animal eat food");
    }
}
public class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
    public static void main(String args[]){
        Animal ani = new Dog();
        ani.eat();
        //ani.bark(); compilation error
        if( ani instanceof Dog){
            Dog d = (Dog)ani;
            d.bark();
        }
        else{
            System.out.println("Animal ref is not an instance of Dog class");
        }
    }
}