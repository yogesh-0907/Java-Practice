class ExceptionHandling{
    public static void main(String args[]){
        try{
            int a = 10;
            int b = 0;
            System.out.println("Division (a/b) : "+ a/b );
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try{
            int arr[] = {10,20,30};
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("This statement will print after the exceptions gets handled that means program does't crash");
    }
}