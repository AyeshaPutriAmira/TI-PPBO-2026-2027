public class ProdukMain {
    public static void main(String[] args) {
        Produk produk = new Produk("P001", "Laptop", 7500000, 10);

        System.out.println("=== DATA PRODUK AWAL ===");
        produk.tampilkanData();

        System.out.println("\n=== TAMBAH STOK ===");
        produk.tambahStok(5);

        System.out.println("\n=== KURANGI STOK ===");
        produk.kurangiStok(3);

        System.out.println("\n=== UBAH HARGA ===");
        produk.setHarga(8000000);

        System.out.println("\n=== DATA PRODUK AKHIR ===");
        produk.tampilkanData();

        System.out.println("\n=== PENGUJIAN VALIDASI ===");
        produk.setHarga(-5000);
        produk.tambahStok(-2);
        produk.kurangiStok(20);
    }
}