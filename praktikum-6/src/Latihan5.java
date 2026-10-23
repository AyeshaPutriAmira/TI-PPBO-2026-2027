class PersegiLatihan5 {
    double sisi;

    PersegiLatihan5(double sisi) {
        this.sisi = sisi;
    }

    double hitungLuas() {
        return sisi * sisi;
    }
}

public class Latihan5 {
    public static void main(String[] args) {
        PersegiLatihan5[] daftarPersegi = {
                new PersegiLatihan5(4),
                new PersegiLatihan5(7),
                new PersegiLatihan5(3),
                new PersegiLatihan5(9),
                new PersegiLatihan5(5)
        };

        PersegiLatihan5 terbesar = daftarPersegi[0];

        for (int i = 1; i < daftarPersegi.length; i++) {
            if (daftarPersegi[i].hitungLuas()
                    > terbesar.hitungLuas()) {
                terbesar = daftarPersegi[i];
            }
        }

        System.out.println("Persegi dengan luas terbesar:");
        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas: " + terbesar.hitungLuas());
    }
}

