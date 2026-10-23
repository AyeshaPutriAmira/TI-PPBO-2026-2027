class Produk3 {
    String namaProduk;
    double harga;

    Produk3(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    boolean isMahal(double batasHarga) {
        return harga > batasHarga;
    }

    public static void main(String[] args) {
        Produk3 p1 = new Produk3("Komputer", 20000000);
        Produk3 p2 = new Produk3("Keyboard", 150000);

        System.out.println("Produk: " + p1.namaProduk);
        System.out.printf("Harga: Rp%.0f%n", p1.harga);
        System.out.println("Mahal: " + p1.isMahal(5000000));

        System.out.println();

        System.out.println("Produk: " + p2.namaProduk);
        System.out.printf("Harga: Rp%.0f%n", p2.harga);
        System.out.println("Mahal: " + p2.isMahal(5000000));
    }
}
