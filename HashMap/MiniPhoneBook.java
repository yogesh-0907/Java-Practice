import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MiniPhoneBook {
    public void storingRecords(){
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> contacts = new HashMap<>();
        contacts.put("Yogesh","9876543210");
        contacts.put("Rahul","9123456789");
        contacts.put("Nani","9988776655");
        System.out.println("1. Search Contact\n2. Update Contact\n3. Delete Contact\n4. Print All Contacts");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch( choice ){
            case 1 : 
                searchContact( contacts , sc );
                return;
            case 2 :
                updateContact( contacts , sc );
                return;
            case 3 :
                removeContact( contacts , sc );
                return;
            case 4 :
                printDetails( contacts  );
                return;
            default :
                System.out.println("Invalid Input : ");  
                return;   
        }
    }
    public void searchContact( HashMap<String,String> contacts,Scanner sc ){
        
        System.out.println("Enter the contact name : ");
        sc.nextLine();
        String name = sc.nextLine();
        if(contacts.containsKey(name)){
            System.out.println("Contanct name : "+name+"\nContact Number : "+contacts.get(name));
        }
        else
            System.out.println("There is no contact with name : "+name);
    }
    public void updateContact( HashMap<String,String> contacts,Scanner sc ){
        System.out.println("Enter name and contact number to update : ");
        sc.nextLine();
        String name = sc.nextLine();
        String number = sc.nextLine();
        if(contacts.containsKey(name) && contacts.get(name).equals(number) ){
            System.out.println("The contact already exists no need to upadte.");
            return;
        }
        else{
            contacts.put(name,number);
            System.out.println("Updation Sucessful");
            System.out.println("Updated contacts : ");
            printDetails(contacts);
        }
    }
    public void removeContact( HashMap<String,String> contacts,Scanner sc ){
        System.out.println("Enter name of the contact to be deleted : ");
        sc.nextLine();
        String name = sc.nextLine();
        if(contacts.containsKey(name)){
            contacts.remove(name);
            System.out.println("Removed Sucessfully");
            System.out.println("Updated contacts : ");
            printDetails(contacts);
            return;
        }
        else{
            System.out.println("There is no such contact with name : "+ name );
        }
    }
    public void printDetails( HashMap<String,String> contacts){
        for(Map.Entry<String,String> contact : contacts.entrySet()){
            System.out.println("Contact name : "+contact.getKey()+"\nContact number : "+contact.getValue());
        }
    }
    public static void main(String args[]){
        MiniPhoneBook record = new MiniPhoneBook();
        record.storingRecords();
    }
}
