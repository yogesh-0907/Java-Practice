public class GetterOnly {
    private int StudentID = 100;
    
    public int getID(){
        return StudentID;
    }

    public static void main(String args[]){
        GetterOnly ID = new GetterOnly();
        System.out.println("Your ID is : "+ ID.getID());
    }
}
