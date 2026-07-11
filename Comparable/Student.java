import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
    int rollNo;
    String name;
    Student(int rollNo,String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    @Override
    public String toString(){
        return rollNo + " " + name;
    }
    @Override
    public int compareTo(Student s){
        return this.name.compareTo(s.name);
    }
    public static ArrayList<Student> createStudents(){
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(103, "Yogesh"));
        list.add(new Student(102, "Nani"));
        list.add(new Student(101, "Nanna"));
        Collections.sort(list);
        return list;
    }
    public static void main(String args[]){
        ArrayList<Student> list = createStudents();
        for(Student student : list){
            System.out.println(student);
        }
    }
}