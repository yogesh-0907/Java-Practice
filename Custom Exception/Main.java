class InvalidMarksException extends Exception{
    InvalidMarksException(String message){
        super(message);
    }
}
public class Main{
    void checkMarks(int marks) throws InvalidMarksException{
        if( marks < 0 || marks > 100){
            throw new InvalidMarksException("Marks should be between 0 to 100");
        }
        else{
            System.out.println("Marks obtained : "+marks);
        }
    }
    public static void main(String args[]){
        Main m = new Main();
        try{
            m.checkMarks(150);
        }
        catch(InvalidMarksException e){
            System.out.println(e);
        }
        System.out.println("Validation Completed");
    }
}