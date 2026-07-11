import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> students = new ArrayList<>();
        students.add("Yogesh");
        students.add("Nani");
        students.add("Rahul");
        System.out.println("Present Array : "+students);
        System.out.println("students.get(1) : "+students.get(1));
        students.set(2,"Ramesh");
        students.remove(1);
        System.out.println("Length of the array : "+students.size());
        System.out.println("Is the array contians the name Yogesh ? : "+students.contains("Yogesh"));
        System.out.println("Elements in array : ");
        for( int i = 0 ; i < students.size() ; i++ ){
            System.out.println(students.get(i));
        }
        students.add(0,"Hai");
        System.out.println(students);
        
    }
}
