public class CashierSystem {
    String systemName;
    String version;

    public CashierSystem(String systemName, String version) {
        this.systemName = systemName;
        this.version = version;
    }

    public void generateReport() {
        System.out.println("Laporan dibuat");
    }
}