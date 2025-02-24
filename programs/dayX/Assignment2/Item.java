package abhyas.dayX.Assignment2;

public class Item {
    private String name;
    private int quantity;
    private int price;
    int ID;
    public String toString () {
        return ("Item{ name: "+ name+ "\nquantity: "+ quantity+ "\nprice: "+ price+ "\nID: "+ID +" }");
    }
    public String getName() {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
