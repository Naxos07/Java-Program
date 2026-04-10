public class DigitalPayment extends Payment {
    private String provider;

    public DigitalPayment(double amount, String provider) {
        super(amount);
        this.provider = provider;
    }

    @Override
    public void processPayment() {
        System.out.println("Pembayaran Digital via " + provider + " berhasil");
    }
}