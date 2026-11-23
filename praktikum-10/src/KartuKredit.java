public class KartuKredit extends MetodePembayaran implements BisaCashback {
    public KartuKredit() {
        super("Kartu Kredit");
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return jumlah * 0.02;
    }

    @Override
    public double hitungCashback(double jumlah) {
        return jumlah * 0.01;
    }
}