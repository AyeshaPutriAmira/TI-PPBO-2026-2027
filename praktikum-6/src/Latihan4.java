class BukuLatihan4 {
    String judul;
    String pengarang;
    int tahunTerbit;

    BukuLatihan4(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }
}
public class Latihan4 {
    public static void main(String[] args) {
        BukuLatihan4[] daftarBuku = {
                new BukuLatihan4("Mariposa", "Andrea Hirata", 2005),
                new BukuLatihan4("Septihan", "Tere Liye", 2014),
                new BukuLatihan4("Antares", "Tere Liye", 2016),
                new BukuLatihan4("Antariksa", "Tere Liye", 2015),
                new BukuLatihan4("Melodylan", "Leila S. Chudori", 2017)
        };

        System.out.println("Buku yang terbit setelah tahun 2015:");

        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println(daftarBuku[i].judul);
            }
        }
    }
}