import java.util.Scanner;
public class TokoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nominal belanja: ");
        double jumlah = scanner.nextDouble();

        MetodePembayaran[] daftarMetode = {
                new Tunai(),
                new KartuKredit(),
                new EWallet(),
                new KartuKredit()
        };

        double totalBersihTerkecil = Double.MAX_VALUE;
        String metodeTerkecil = "";

        System.out.println("\n=== Rincian Pembayaran ===");

        for (MetodePembayaran mp : daftarMetode) {
             mp.prosesPembayaran(jumlah);
             double cashback = 0;

            if (mp instanceof BisaCashback) {
                BisaCashback bc = (BisaCashback) mp;
                cashback = bc.hitungCashback(jumlah);
                System.out.println("Cashback Didapat  : " + cashback);
            }

            double biayaAdmin = mp.hitungBiayaAdmin(jumlah);
            double totalBersih = jumlah + biayaAdmin - cashback;

            if (totalBersih < totalBersihTerkecil) {
                totalBersihTerkecil = totalBersih;
                metodeTerkecil = mp.namaMetode;
            }
            System.out.println("-----------------------------------");
        }
        System.out.println("\nMetode dengan total bersih paling kecil:");
        System.out.println(metodeTerkecil + " (Total Bersih: " + totalBersihTerkecil + ")");
        scanner.close();
    }
}