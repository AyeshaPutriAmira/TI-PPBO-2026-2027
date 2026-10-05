import java.util.Arrays;

public class Latihan5 {
    public static int hitungTotal(int[] data) {
        int total = 0;
        for (int nilai : data) {
            total += nilai;
        }
        return total;
    }

    public static int[] filterDiAtasRataRata(int[] data) {
        if (data.length == 0) return new int[0];

        double rataRata = (double) hitungTotal(data) / data.length;

        int count = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                count++;
            }
        }

        int[] hasil = new int[count];
        int index = 0;
        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index++] = nilai;
            }
        }

        return hasil;
    }

    public static void main(String[] args) {
        int[] data = {70, 85, 90, 60, 75, 95, 80};

        int total = hitungTotal(data);
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + (double) total / data.length);

        int[] diAtasRataRata = filterDiAtasRataRata(data);
        System.out.println("Nilai di atas rata-rata: " + Arrays.toString(diAtasRataRata));
    }
}