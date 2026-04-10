public class Item {
    String itemName;
    double price;
    int stock;

    public Item(String itemName, double price, int stock) {
        this.itemName = itemName;
        this.price = price;
        this.stock = stock;
    }

    public void updateStock(int qty) {
        stock -= qty;
    }
}