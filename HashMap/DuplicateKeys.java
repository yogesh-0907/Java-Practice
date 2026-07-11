import java.util.HashMap;
import java.util.Map;
public class DuplicateKeys {
    public void duplicates(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(1,"C");
        map.put(2,"D");
        System.out.println("Size of the map : " + map.size());//Because there is only 2 unique keys so that the size of the map is 2.
        // 'A' gets disappered because it gets replaced with 'C' later
        System.out.println("Displaying map contents : ");
        for(Map.Entry<Integer,String> content : map.entrySet()){
            System.out.println(content.getKey() + " -> " + content.getValue());
        }
    }
    public static void main(String args[]){
        DuplicateKeys dup = new DuplicateKeys();
        dup.duplicates();        
    }
}
