package TNSIFJAVA.src.org.tnsif.acc.c2tc.opps;

public class foodItems {
    private String itemName;
    private int price;
    private String category;

    void display(){
        System.out.println("itemName:"+itemName);
        System.out.println("price:"+price);
        System.out.println("category:"+category);
    }
    void getItemName(String itemName){
        this.itemName=itemName;
    }
    void getPrice(int price){
        this.price=price;
    }
    void getcategory(String category){
        this.category=category;
    }
    String setItemName(String itemName){
        return itemName;
    }
    int setPrice(int price){
        return price;
    }
    String setCategory(String category){
        return category;
    }
    public static void main(String[] args) {
        foodItems f1 = new foodItems();
        f1.setItemName("Burger");
        f1.setPrice(100);
        f1.setCategory("Fast Food");
        f1.display();
        f1.setItemName("Pizza");
        f1.setPrice(150);
        f1.setCategory("Fast Food");
        f1.display();
    }
   
}