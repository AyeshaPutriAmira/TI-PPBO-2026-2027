public abstract class MetodePembayaran {
    protected String namaMetode;

    public MetodePembayaran(String namaMetode) {
        this.namaMetode = namaMetode;
    }

    public abstract double hitungBiayaAdmin(double jumlah);

    public void prosesPembayaran(double jumlah) {
        double biayaAdmin = hitungBiayaAdmin(jumlah);
        double total = jumlah + biayaAdmin;

        System.out.println("Metode Pembayaran : " + namaMetode);
        System.out.println("Jumlah Belanja    : " + jumlah);
        System.out.println("Biaya Admin       : " + biayaAdmin);
        System.out.println("Total Dibayar     : " + total);
    }
}