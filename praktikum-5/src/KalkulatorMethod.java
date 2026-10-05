import java.util.ArrayList;
import java.util.Scanner;

public class KalkulatorMethod {
    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }

    public static double pangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    public static double akarKuadrat(double angka) {
        if (angka < 0) {
            System.out.println("Error: Tidak bisa menghitung akar kuadrat dari bilangan negatif.");
            return 0;
        }
        return Math.sqrt(angka);
    }

    public static double riwayatKeMaksimum(ArrayList<Double> riwayatHasil) {
        if (riwayatHasil.isEmpty()) {
            return 0; // Mengembalikan 0 jika belum ada riwayat
        }

        double maksimum = riwayatHasil.get(0);
        for (double nilai : riwayatHasil) {
            if (nilai > maksimum) {
                maksimum = nilai;
            }
        }
        return maksimum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> riwayatHasil = new ArrayList<>();
        boolean berjalan = true;

        System.out.println("=====================================");
        System.out.println("   KALKULATOR METHOD SEDERHANA   ");
        System.out.println("=====================================");

        while (berjalan) {
            System.out.println("\n--- MENU OPERASI ---");
            System.out.println("1. Tambah (2 angka)");
            System.out.println("2. Tambah (3 angka)");
            System.out.println("3. Kurang");
            System.out.println("4. Kali");
            System.out.println("5. Bagi");
            System.out.println("6. Pangkat");
            System.out.println("7. Akar Kuadrat");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu (1-8): ");

            int pilihan = scanner.nextInt();
            double hasil = 0;
            boolean hitungBerhasil = true;

            switch (pilihan) {
                case 1: // Tambah 2 angka
                    System.out.print("Masukkan angka pertama: ");
                    double a1 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b1 = scanner.nextDouble();
                    hasil = tambah(a1, b1);
                    System.out.println("Hasil: " + a1 + " + " + b1 + " = " + hasil);
                    break;

                case 2: // Tambah 3 angka
                    System.out.print("Masukkan angka pertama: ");
                    double a2 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b2 = scanner.nextDouble();
                    System.out.print("Masukkan angka ketiga: ");
                    double c2 = scanner.nextDouble();
                    hasil = tambah(a2, b2, c2);
                    System.out.println("Hasil: " + a2 + " + " + b2 + " + " + c2 + " = " + hasil);
                    break;

                case 3: // Kurang
                    System.out.print("Masukkan angka pertama: ");
                    double a3 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b3 = scanner.nextDouble();
                    hasil = kurang(a3, b3);
                    System.out.println("Hasil: " + a3 + " - " + b3 + " = " + hasil);
                    break;

                case 4: // Kali
                    System.out.print("Masukkan angka pertama: ");
                    double a4 = scanner.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b4 = scanner.nextDouble();
                    hasil = kali(a4, b4);
                    System.out.println("Hasil: " + a4 + " * " + b4 + " = " + hasil);
                    break;

                case 5: // Bagi
                    System.out.print("Masukkan angka pembilang: ");
                    double a5 = scanner.nextDouble();
                    System.out.print("Masukkan angka penyebut: ");
                    double b5 = scanner.nextDouble();
                    hasil = bagi(a5, b5);
                    if (b5 != 0) {
                        System.out.println("Hasil: " + a5 + " / " + b5 + " = " + hasil);
                    } else {
                        hitungBerhasil = false;
                    }
                    break;

                case 6: // Pangkat
                    System.out.print("Masukkan basis (angka pokok): ");
                    double basis = scanner.nextDouble();
                    System.out.print("Masukkan eksponen (pangkat): ");
                    double eksponen = scanner.nextDouble();
                    hasil = pangkat(basis, eksponen);
                    System.out.println("Hasil: " + basis + " ^ " + eksponen + " = " + hasil);
                    break;

                case 7: // Akar Kuadrat
                    System.out.print("Masukkan angka: ");
                    double angka = scanner.nextDouble();
                    hasil = akarKuadrat(angka);
                    if (angka >= 0) {
                        System.out.println("Hasil: Akar dari " + angka + " = " + hasil);
                    } else {
                        hitungBerhasil = false;
                    }
                    break;

                case 8: // Keluar
                    berjalan = false;
                    System.out.println("\nTerima kasih telah menggunakan kalkulator ini.");

                    double maxHasil = riwayatKeMaksimum(riwayatHasil);
                    if (!riwayatHasil.isEmpty()) {
                        System.out.println("Nilai hasil perhitungan terbesar selama sesi ini: " + maxHasil);
                    } else {
                        System.out.println("Tidak ada riwayat perhitungan.");
                    }
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-8.");
                    hitungBerhasil = false;
            }

            if (pilihan >= 1 && pilihan <= 7 && hitungBerhasil) {
                riwayatHasil.add(hasil);
            }
        }

        scanner.close();
    }
}
