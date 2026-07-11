class Student{
    int id;
    String name;
    Student(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString(){
        return id + " " + name;
    }
    public static void main(String args[]){
        Student s1 = new Student(101, "Yogesh");
        System.out.println(s1); // It prints my custom text because i overridden the method with my own text.
        Student s2 = new Student(102, "Nani");
        System.out.println("s1 == s2 : "+ (s1 == s2)); // false because object for same class but they are 2 different objects with 2 different references.
        System.out.println("s1.equals(s2) : "+ s1.equals(s2)); // false similar like (==) compares reference.
        System.out.println("s1.hashCode() : "+ s1.hashCode() );
        System.out.println("s2.hashCode() : "+ s2.hashCode() );
        System.out.println("s1.getClass() : "+ s1.getClass() );
    }
}