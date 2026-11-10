public class TugasBangunDatarDemo {
    public static void main(String[] args) {

        TugasBangunDatar[] daftarBangun = {
                new TugasLingkaran("Lingkaran 1", 7),
                new TugasPersegi("Persegi 1", 5),
                new TugasPersegiPanjang("Persegi Panjang 1", 8, 4),
                new TugasLingkaran("Lingkaran 2", 10),
                new TugasPersegiPanjang("Persegi Panjang 2", 6, 3)
        };

        double totalLuas = 0;
        TugasBangunDatar bangunTerbesar = daftarBangun[0];

        System.out.println("DAFTAR BANGUN DATAR");
        System.out.println("============================");

        for (TugasBangunDatar b : daftarBangun) {
            b.tampilkanInfo();

            double luas = b.hitungLuas();
            totalLuas += luas;

            if (luas > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = b;
            }
        }

        System.out.println("Total luas seluruh bangun: " + totalLuas);
        System.out.println("Bangun dengan luas terbesar: " + bangunTerbesar.namaBangun);
        System.out.println("Luas terbesar: " + bangunTerbesar.hitungLuas());
    }
}