public class TokoDemo {
    public static void main(String[] args) {

        Produk[] daftarProduk = {
                new Produk("P001", "Laptop", 8500000, 5),
                new Produk("P002", "Mouse", 150000, 10),
                new Produk("P003", "Keyboard", 250000, 8),
                new Produk("P004", "Monitor", 1800000, 3),
                new Produk("P005", "Printer", 2200000, 4)
        };

        System.out.println("=== DATA SELURUH PRODUK ===");
        for (int i = 0; i < daftarProduk.length; i++) {
            daftarProduk[i].tampilkanData();
        }

        System.out.println("\n=== SIMULASI PEMBELIAN 1 ===");
        System.out.println("Produk: " + daftarProduk[0].namaProduk);
        int jumlahBeli1 = 2;

        System.out.printf("Total harga: Rp%.0f%n",
                daftarProduk[0].hitungTotalHarga(jumlahBeli1));

        daftarProduk[0].kurangiStok(jumlahBeli1);

        System.out.println("\n=== SIMULASI PEMBELIAN 2 ===");
        System.out.println("Produk: " + daftarProduk[1].namaProduk);
        int jumlahBeli2 = 15;

        System.out.printf("Total harga: Rp%.0f%n",
                daftarProduk[1].hitungTotalHarga(jumlahBeli2));

        daftarProduk[1].kurangiStok(jumlahBeli2);

        System.out.println("\n=== PRODUK DENGAN HARGA TERMAHAL ===");

        Produk termahal = daftarProduk[0];

        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > termahal.harga) {
                termahal = daftarProduk[i];
            }
        }

        termahal.tampilkanData();
    }
}
