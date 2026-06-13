class Employee {

    int empId;
    String empName;
    double salary;

    void display() {

        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.empId = 201;
        e.empName = "Rahul";
        e.salary = 50000;

        e.display();
    }
}