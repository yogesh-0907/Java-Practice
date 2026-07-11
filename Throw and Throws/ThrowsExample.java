public class ThrowsExample {
    void checkMarks(int marks) throws ArithmeticException{
        if( marks < 0 || marks > 100){
            throw new ArithmeticException("Marks should be between 0 to 100");
        }
        else{
            System.out.println("Marks Obtained : "+marks);
        }
    }
    public static void main(String args[]){
        ThrowsExample t = new ThrowsExample();
        try{
            t.checkMarks(150);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Validation Completed");
    }
}
