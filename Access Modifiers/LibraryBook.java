public class LibraryBook {
    private String title;
    private double price;
    
    public void setTitleAndPrice(String title,double price){
        if(title.equals("") && price<=0){
            System.out.println("Please enter Valid details.");
            return;
        }
        else{
            this.title = title;
            this.price = price;
        }
    }
    public void getDetails(){
        System.out.println("Book name was : "+title+"\nPrice was : "+price+"/-");
    }
    public static void main(String args[]){
        LibraryBook book = new LibraryBook();
        book.setTitleAndPrice("Untill love sets us a part", 299);
        book.getDetails();
    }
}
