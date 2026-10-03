import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int KKM = 70;

        // Membaca jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        // Membuat array nilai
        int[] nilai = new int[N];

        // Mengisi array dengan nilai mahasiswa
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

        // Menampilkan nilai sebelum diurutkan
        System.out.println("\n===== LAPORAN NILAI KELAS =====");

        System.out.print("Nilai sebelum diurutkan: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        // Menghitung nilai tertinggi, terendah, rata-rata,
        // jumlah mahasiswa lulus dan tidak lulus
        int tertinggi = nilai[0];
        int terendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int total = 0;

        for (int i = 0; i < N; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }

            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        double rataRata = (double) total / N;

        // Bubble Sort ascending
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }

        // Menampilkan hasil
        System.out.println("\nNilai setelah diurutkan: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n\nRata-rata kelas     : " + rataRata);
        System.out.println("Nilai tertinggi     : " + tertinggi);
        System.out.println("Nilai terendah      : " + terendah);
        System.out.println("Jumlah mahasiswa lulus      : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
        System.out.println("KKM                 : " + KKM);
    }
}