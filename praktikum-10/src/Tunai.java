public class Tunai extends MetodePembayaran {
    public Tunai() {
        super("Tunai");
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 0;
    }
}