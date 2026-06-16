class Teacher {

    void teach() {
        System.out.println("Teaching");
    }
}

class Student extends Teacher {

    void study() {
        System.out.println("Studying");
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.teach();
        s.study();
    }
}