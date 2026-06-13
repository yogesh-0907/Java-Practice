class StudentConstructor {

    int id;
    String name;

    StudentConstructor(int id, String name) {

        this.id = id;
        this.name = name;
    }

    void display() {

        System.out.println(id);
        System.out.println(name);
    }

    public static void main(String[] args) {

        StudentConstructor s =
            new StudentConstructor(101, "Yogesh");

        s.display();
    }
}