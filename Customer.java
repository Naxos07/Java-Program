public class Customer {
    String name;
    String customerID;

    public Customer(String name, String customerID) {
        this.name = name;
        this.customerID = customerID;
    }

    public void makePayment(Payment payment) {
        payment.processPayment();
    }
}