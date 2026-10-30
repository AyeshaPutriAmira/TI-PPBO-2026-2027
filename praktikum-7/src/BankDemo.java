public class BankDemo {
    public static void main(String[] args) {

        RekeningBank rek1 = new RekeningBank(
                "001", "Budi", 100000, "Tabungan");

        RekeningBank rek2 = new RekeningBank(
                "002", "Andi", 200000, "Giro");

        System.out.println("=== TRANSAKSI REKENING BUDI ===");
        rek1.setor(50000);
        rek1.tarik(30000);

        System.out.println("\n=== TRANSAKSI REKENING ANDI ===");
        rek2.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n=== TRANSFER BERHASIL ===");
        rek1.transferKe(rek2, 40000);

        System.out.println("\n=== TRANSFER GAGAL ===");
        rek1.transferKe(rek2, 500000);

        System.out.println("\n=== TRANSFER TIDAK VALID ===");
        rek2.transferKe(rek1, -10000);

        System.out.println("\n=== MUTASI AKHIR REKENING BUDI ===");
        rek1.cetakMutasi();

        System.out.println("\n=== MUTASI AKHIR REKENING ANDI ===");
        rek2.cetakMutasi();
    }
}