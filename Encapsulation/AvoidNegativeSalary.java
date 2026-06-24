public class AvoidNegativeSalary {
    private double salary;
    public void setSal(double salary){
        if( salary > 0 )
            this.salary = salary;
    }
    public double getSal(){
        return salary;
    }
    public static void main(String args[]){
        AvoidNegativeSalary sal = new AvoidNegativeSalary();
        sal.setSal(50000);
        System.out.println("Salary is : "+sal.getSal());
    }
}
