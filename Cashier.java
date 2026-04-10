public class Cashier {
    String name;
    String cashierID;

    public Cashier(String name, String cashierID) {
        this.name = name;
        this.cashierID = cashierID;
    }

    public void scanItem(Item item) {
        System.out.println("Scan: " + item.itemName);
    }

    public void printReceipt() {
        System.out.println("Struk dicetak");
    }
}