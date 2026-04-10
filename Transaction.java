public class Transaction {
    String transactionID;
    String date;
    double totalAmount;

    public Transaction(String transactionID, String date) {
        this.transactionID = transactionID;
        this.date = date;
    }

    public double calculateTotal(Cart cart) {
        totalAmount = cart.calculateTotal();
        return totalAmount;
    }

    public void completeTransaction() {
  System.out.printf("Total belanja: %.0f\n", totalAmount);
      
        System.out.println("Transaksi selesai");
    }
}