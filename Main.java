import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

      
        System.out.print("Masukkan nama customer: ");
        String namaCustomer = input.nextLine();
        Customer customer = new Customer(namaCustomer, "C001");

        Cashier cashier = new Cashier("Admin", "K001");

        Cart cart = new Cart();


        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nBarang ke-" + (i + 1));

            System.out.print("Nama barang: ");
            String namaBarang = input.nextLine();

            System.out.print("Harga: ");
            double harga = input.nextDouble();

            System.out.print("Stok: ");
            int stok = input.nextInt();
            input.nextLine(); 

            Item item = new Item(namaBarang, harga, stok);
            cart.addItem(item);

            cashier.scanItem(item);
        }

        Transaction transaction = new Transaction("T001", "2026-04-09");
        double total = transaction.calculateTotal(cart);

          System.out.printf("\nTotal belanja: %.0f\n", total);

        System.out.println("\nPilih metode pembayaran:");
        System.out.println("1. Tunai");
        System.out.println("2. Digital");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();

        Payment payment;

        if (pilihan == 1) {
            System.out.print("Masukkan uang: ");
            double uang = input.nextDouble();
            payment = new CashPayment(total, uang);
        } else {
            input.nextLine(); 
            System.out.print("Masukkan provider (OVO/Gopay/Dana/M-Banking): ");
            String provider = input.nextLine();
            payment = new DigitalPayment(total, provider);
        }

        customer.makePayment(payment);

     
        transaction.completeTransaction();
        cashier.printReceipt();
    }
}