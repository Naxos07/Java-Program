public class CashPayment extends Payment {
    private double cashReceived;

    public CashPayment(double amount, double cashReceived) {
        super(amount);
        this.cashReceived = cashReceived;
    }

    public double calculateChange() {
        return cashReceived - amount;
    }

    @Override
    public void processPayment() {
        System.out.println("Pembayaran Tunai");
System.out.printf("Kembalian: %.0f\n", calculateChange());
    }
}
