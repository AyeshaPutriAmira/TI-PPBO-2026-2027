public class MainPegawai {
    public static void main(String[] args) {
        Manager manager = new Manager(
                "Andi", "M001", 8000000, 2000000
        );

        Staff staff = new Staff(
                "Budi", "S001", 4000000, 500000
        );

        Direktur direktur = new Direktur(
                "Siti", "D001", 15000000, 5000000, 3000000
        );

        System.out.println("=== DATA MANAGER ===");
        manager.tampilkanData();
        System.out.println("Tunjangan Jabatan: "
                + manager.getTunjanganJabatan());

        System.out.println();

        System.out.println("=== DATA STAFF ===");
        staff.tampilkanData();
        System.out.println("Tunjangan Kinerja: "
                + staff.getTunjanganKinerja());

        System.out.println();

        System.out.println("=== DATA DIREKTUR ===");
        direktur.tampilkanData();
        System.out.println("Tunjangan Jabatan: "
                + direktur.getTunjanganJabatan());
        System.out.println("Tunjangan Saham: "
                + direktur.getTunjanganSaham());
    }
}
