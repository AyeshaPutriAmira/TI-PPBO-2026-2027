public class EWallet extends MetodePembayaran implements BisaCashback {
    public EWallet() {
        super("E-Wallet");
    }

    @Override
    public double hitungBiayaAdmin(double jumlah) {
        return 1000;
    }

    @Override
    public double hitungCashback(double jumlah) {
        double cashback = jumlah * 0.05;
        if (cashback > 20000) {
            return 20000;
        }
        return cashback;
    }
}