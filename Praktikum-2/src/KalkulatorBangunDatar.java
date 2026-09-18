import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // Input panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        // Menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        // Menghitung keliling persegi panjang
        double kelilingPersegiPanjang = 2 * (panjang+lebar);

        // Menampilkan hasil persegi panjang
        System.out.println("\n===Persegi Panjang ===");
        System.out.println("Luas    :" + luasPersegiPanjang);
        System.out.println("Keliling :" + kelilingPersegiPanjang);

        // Menentukan apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        System.out.println("Luas > 100:" + luasBesar);

        //Input jari-jari lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        // Menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jarijari * jarijari;

        // Menghitung kelliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        // Menampilkan hasil lingkaran
        System.out.println("\n=== Lingkaran ===");
        System.out.println("Luas     :" + luasLingkaran);
        System.out.println("Keliling :" + kelilingLingkaran);

        input.close();

    }
}
