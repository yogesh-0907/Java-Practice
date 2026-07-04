public class BlankFinal {
    final int rollNo;
    BlankFinal(int rollNo){
        this.rollNo = rollNo;
    }
    public void displayRollNo(){
        System.out.println("Roll no is : "+rollNo);
    }
    public static void main(String args[]){
        BlankFinal blank = new BlankFinal(101);
        blank.displayRollNo();
    }
}
