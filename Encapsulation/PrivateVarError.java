class TestClass {
    private String message = "Hello EveryOne";
}
public class PrivateVarError{
    public static void main(String args[]){
        TestClass obj = new TestClass();
        System.out.println(obj.message);
    }
}