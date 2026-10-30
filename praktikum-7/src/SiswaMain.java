public class SiswaMain {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();

        siswa.setNilai(90);

        System.out.println("Nilai Angka: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        siswa.setNilai(120);
    }
}