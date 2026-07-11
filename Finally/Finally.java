public class Finally {
    public static void main(String args[]){
        try{
            int a = 10;
            int b = 0;
            System.out.println("Division : "+ a/b );
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Finally Executed");
        }
        try{
            int c = 10;
            int d = 2;
            System.out.println("Division : "+ c/d );
            System.out.println("Division Successful");
        }
        catch(ArithmeticException e){
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Finally Executed");
        }
        System.out.println("Program Continues");
    }
}
