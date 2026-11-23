public class CetakDemo {
    public static void main(String[] args) {
        Cetak[] daftar = {
                new Laporan("Laporan Bulanan"),
                new Struk(101, 75000),
                new Laporan("Laporan Praktikum"),
                new Struk(102, 125000)
        };

        for (Cetak c : daftar) {
            c.cetak();
        }
    }
}