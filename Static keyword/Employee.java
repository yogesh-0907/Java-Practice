public class Employee {
    public String name;
    static String companyName = "GOOGLE";
    public static void main(String args[]){
        Employee emp1 = new Employee();
        emp1.name = "Yogesh";
        Employee emp2 = new Employee();
        emp2.name = "Rahul";
        Employee emp3 = new Employee();
        emp3.name = "Arjun";
        System.out.println("Employee name is : "+emp1.name+"\nCompany name is  : "+Employee.companyName);
        System.out.println("Employee name is : "+emp2.name+"\nCompany name is  : "+Employee.companyName);
        System.out.println("Employee name is : "+emp3.name+"\nCompany name is  : "+Employee.companyName);
    }
}
