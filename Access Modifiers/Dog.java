class Animal{
    protected String name;
}
public class Dog extends Animal{
    public static void main(String args[]){
        Animal ani = new Animal();
        ani.name = "Dog";
        System.out.println("Name of the animal is : "+ani.name);
    }

}