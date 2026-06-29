class Employee{
    public String companyName;
}
class Manager{
    public static void main(String args[]){
        Employee obj = new Employee();
        obj.companyName = "Software Solutions";
        System.out.println("Our company name is : "+obj.companyName);

    }
}