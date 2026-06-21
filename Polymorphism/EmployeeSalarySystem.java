class Employee {

    void calculateSalary() {
        System.out.println("Every employee receives salary");
    }
}

class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: 100000");
    }
}

class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary: 80000");
    }
}

class Intern extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Intern Salary: 15000");
    }
}

public class EmployeeSalarySystem {

    public static void main(String[] args) {

        Employee[] employees = {
            new Manager(),
            new Developer(),
            new Intern()
        };

        for(Employee employee : employees) {
            employee.calculateSalary();
        }
    }
}