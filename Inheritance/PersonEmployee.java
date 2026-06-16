class Person {

    String name = "Yogesh";
}

class Employee extends Person {

    int salary = 50000;

    void display() {

        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.display();
    }
}