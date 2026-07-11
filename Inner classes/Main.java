class University{
    private String universityName = "RAGHU ENGINEERING COLLEGE";
    class Department{
        private String departmentName = "COMPUTER SCIENCE AND ENGINEERING";

        public void displayUniversityName(){
            System.out.println("University name : "+universityName);
        }
    }
    public void displayDepartmentName(){
        Department d = new Department();
        System.out.println("Department name : "+d.departmentName);
    }
}

public class Main {
    public static void main(String args[]){
        University uni = new University();
        University.Department dept = uni.new Department();
        dept.displayUniversityName();
        uni.displayDepartmentName();
    }
}
 