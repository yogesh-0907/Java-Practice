class Student {

    int id;
    String name;

    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {

        return id + " " + name;
    }

    public static void main(String[] args) {

        Student s = new Student(101, "Yogesh");

        System.out.println(s);
    }
}