class ThrowExample{
    public static void main(String args[]){
        try{
            int age = -10;
            if( age < 0 ){
                throw new ArithmeticException("Age cannot be negative");
            }
            else{
                System.out.println("Age : "+age);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            int marks = 150;
            if( marks > 100 ){
                throw new ArithmeticException("Marks cannot exceed 100");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Validation Completed");
        }
    }
}