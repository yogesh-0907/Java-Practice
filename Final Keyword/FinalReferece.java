class FinalReferece{
    int x = 10;
    void sayHi(){
        System.out.println("Hi");
    }
}
class Test2 extends FinalReferece{
    int x = 20;
    void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
       final FinalReferece obj = new FinalReferece();
       System.out.println(obj.x);
       obj.sayHi();
       obj = new Test2(); //error due to final object reference.
    }
}