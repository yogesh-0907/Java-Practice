public class NonStaticInStatic{
    int age = 10;
    static void displayAge(){
        System.out.println("Age is : "+age);
    }
    public static void main(String args[]){
        displayAge();
    }
}