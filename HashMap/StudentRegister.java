import java.util.HashMap;
import java.util.Map;
public class StudentRegister {
    public void attendance(){
        HashMap<String,String> Register = new HashMap<>();
        Register.put("Yogesh","Present");
        Register.put("Rahul","Absent");
        Register.put("Nani","Present");
        Register.put("Kiran","Present");
        printResults(Register);
    }
    public void printResults(HashMap<String,String> Register){
        System.out.println("Students List :- ");
        for(String name : Register.keySet()){
            System.out.println(name);
        }
        System.out.println("Presenties List : ");
        for(Map.Entry<String,String> details : Register.entrySet()){
            if(details.getValue().equals("Present")){
                System.out.println(details.getKey());
            }
        }
    }
    public static void main(String args[]){
        StudentRegister student = new StudentRegister();
        student.attendance();
    }
}
