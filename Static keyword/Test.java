public class Test {
    int age = 100;
    static int displayAge(){
        System.out.println(this.age);
    }
    public static void main(String args[]){
        displayAge();
    }
}
