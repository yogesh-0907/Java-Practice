class ModifyObjData{
    int x = 10;
    void sayHi(){
        System.out.println("Hi");
    }
}
class Test2 extends ModifyObjData{
    int x = 20;
    void sayHello(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
       final ModifyObjData obj = new ModifyObjData();
       System.out.println("X value before modification : "+obj.x);
       obj.sayHi();
       obj.x = 200;
       System.out.println("X value after modification : "+obj.x);
    }
}