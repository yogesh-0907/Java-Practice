import java.util.HashMap;
import java.util.Map;
public class ProductPriceList {
    public void takeInput(){
        HashMap<String,Integer> products = new HashMap<>();
        products.put("Pen",20);
        products.put("Book",150);
        products.put("Bag",700);
        products.put("bottle",120);
        printProductDetails(products);
    }
    public void printProductDetails(HashMap<String,Integer> products){
        for(Map.Entry<String,Integer> product : products.entrySet()){
            System.out.println(product.getKey() + " Price : " + product.getValue());
        }
    }
    public static void main(String args[]){
        ProductPriceList list = new ProductPriceList();
        list.takeInput();
    }
}
