public class StudentDetails {
    private int rollNo = 21;
    private String name = "Yogesh";
    private String branch = "CSE";
    void showDetails(){
        System.out.println("Roll NO     : "+rollNo+"\nName    : "+name+"\nBranch     : "+branch);
    }
    public static void main(String args[]){
        StudentDetails student = new StudentDetails();
        student.showDetails();
    }
}
