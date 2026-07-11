import java.util.HashMap;
import java.util.Map;
public class StudentDataBase {
    public void storeInputs(){
        HashMap<Integer,String> students = new HashMap<>();
        students.put(101,"Yogesh");
        students.put(102,"Rahul");
        students.put(103,"Nani");
        students.put(104,"Kiran");
        printInputs(students);
    }   
    public void printInputs(HashMap<Integer,String> students){
        System.out.println("Displaying HashMap using keySet() : ");
        for(Integer key : students.keySet())
            System.out.println(key + " -> " + students.get(key));
        System.out.println("The name of the person with ID = 103 is : " + students.get(103));
        students.put(102,"Ramesh");
        students.remove(104);
        System.out.println("Displaying Hashmap after changes : ");
        for(Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println(student.getKey() + " -> " + student.getValue());
        }
    }
    public static void main(String args[]){
        StudentDataBase data = new StudentDataBase();
        data.storeInputs();
    } 
}
