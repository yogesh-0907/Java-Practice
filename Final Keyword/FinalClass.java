public final class FinalClass {
    public void sayHello(){
        System.out.println("Hello");
    }
}
class SecondClass extends FinalClass{ //error due to final class
    public void sayHi(){
        System.out.println("Hi");
    }
}
