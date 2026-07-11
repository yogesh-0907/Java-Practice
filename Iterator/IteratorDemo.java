import java.util.ArrayList;
import java.util.Iterator;
public class IteratorDemo{
    public void storeInputs(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Grapes");
        printElements(fruits);
    }
    public void printElements(ArrayList<String> fruits)
    {
        System.out.println("Fruits array : "+fruits);
        System.out.println("Normal printing using for loop : ");
        for( int i = 0 ; i < fruits.size() ; i++ ){
            System.out.println(fruits.get(i));
        }
        System.out.println();
        System.out.println("Printing with Iterator : ");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            String fruit = it.next();
            System.out.println(fruit);
            if(fruit.equals("Banana"))
                it.remove();
        }
        System.out.println("Fruits array after deletion : "+fruits);
        int fruitCount = 0;
        Iterator<String> iterate = fruits.iterator();
        while(iterate.hasNext()){
            fruitCount++;
            iterate.next();
        }
        System.out.println("The number of fruits in array list is : "+fruitCount);
        boolean mangoFound = false;
        Iterator<String> ite = fruits.iterator();
        while(ite.hasNext()){

            String fruit = ite.next();
            if(fruit.equals("Mango")){
                mangoFound = true;
            }
        }
        if(mangoFound){
            System.out.println("Mango found");
        }
        else
            System.out.println("Mango not found");

    }
    public static void main(String args[]){
        IteratorDemo Iterate = new IteratorDemo();
        Iterate.storeInputs();
    }
}