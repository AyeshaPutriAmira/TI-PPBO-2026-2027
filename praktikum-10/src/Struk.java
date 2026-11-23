public class Struk implements Cetak {
    private int nomor;
    private double total;

    public Struk(int nomor, double total) {
        this.nomor = nomor;
        this.total = total;
    }

    @Override
    public void cetak() {
        System.out.println("Mencetak Struk No." + nomor + " Total: " + total);
    }
}