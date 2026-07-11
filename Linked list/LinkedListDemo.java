import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String args[]){
        LinkedList<String> cities = new LinkedList<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Chennai");
        System.out.println(cities);
        System.out.println(cities.get(0));
        cities.add(1,"Hyderabad");
        System.out.println(cities);
        cities.remove(2);
        System.out.println(cities);
        System.out.println("Size lo the linked list : "+cities.size());
        for( int i = 0 ; i < cities.size() ; i++ ){
            System.out.println(cities.get(i));
        }
    }
}
