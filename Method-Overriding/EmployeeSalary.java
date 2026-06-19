class Employee {

    double salary() {
        return 30000;
    }
}

class Manager extends Employee {

    @Override
    double salary() {
        return 60000;
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        System.out.println(m.salary());
    }
}