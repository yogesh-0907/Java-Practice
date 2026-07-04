abstract class Employee{
    abstract void work();
}
class Manager extends Employee{
    void work(){
        System.out.println("Manager Do minimal work then employee");
    }
}
public class Developer extends Employee{
    void work(){
        System.out.println("Developer developes what ever the company required");
    }
    public static void main(String args[]){
        Manager manage = new Manager();
        manage.work();
        Developer dev = new Developer();
        dev.work();
    }
}