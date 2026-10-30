public class MainBuku {
    public static void main(String[] args) {
        Buku b = new Buku("Perahu Kertas", "Dee Lestari", 2009);
        b.tampilData();

        b.setJudul("Madre");
        b.setPengarang("Dee Lestari");

        System.out.println("Setelah diubah:");
        b.tampilData();

    }
}