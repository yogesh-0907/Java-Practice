abstract class Parent{
    abstract void abstractMethod();
    void normalMethod(){
        System.out.println("Normal Method implemented in parent class");
    }
}
public class Child extends Parent{
    void abstractMethod(){
        System.out.println("Abstract method implemented in Child class");
    }
    public static void main(String args[]){
        Child child = new Child();
        child.abstractMethod();
        child.normalMethod();
    }
}
