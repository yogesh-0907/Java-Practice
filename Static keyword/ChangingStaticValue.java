public class ChangingStaticValue {
    public String name;
    static String college = "RAGHU ENGINEERING COLLEGE";
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Yogesh";
        ChangingStaticValue.college = "ANITS";
        Student s2 = new Student();
        s2.name = "Rahul";
        Student s3 = new Student();
        s3.name = "Arjun";
        System.out.println("Student name is : "+s1.name+" Studing in : "+Student.college);
        System.out.println("Student name is : "+s2.name+" Studing in : "+Student.college);
        System.out.println("Student name is : "+s3.name+" Studing in : "+Student.college);
    }
}
