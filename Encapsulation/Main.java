class Employee {

    private int id;
    private String name;
    private double salary;

    public void setId(int id) {

        if (id > 0) {
            this.id = id;
        }
        else {
            System.out.println("Invalid ID");
        }
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {

        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        else {
            System.out.println("Invalid Name");
        }
    }

    public String getName() {
        return name;
    }

    public void setSalary(double salary) {

        if (salary >= 0) {
            this.salary = salary;
        }
        else {
            System.out.println("Salary cannot be negative");
        }
    }

    public double getSalary() {
        return salary;
    }
}

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setId(101);
        emp.setName("Yogesh");
        emp.setSalary(50000);

        System.out.println("ID : " + emp.getId());
        System.out.println("Name : " + emp.getName());
        System.out.println("Salary : " + emp.getSalary());

        emp.setSalary(-1000); // Invalid
    }
}