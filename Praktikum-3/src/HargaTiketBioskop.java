import java.util.Scanner;

public class HargaTiketBioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah Anda Mahasiswa? (true/false): ");
        boolean isMahasiswa = input.nextBoolean();

        int hargaTiket = 50000; //harga dasar

        if(isMahasiswa && umur < 25) {
            hargaTiket = 30000; //harga khusus
            System.out.println("Anda mendapat harga khusus!");
        } else if (umur < 12){
            hargaTiket = 25000;
            System.out.println("Harga tiket anak-anak");
        } else {
            System.out.println("Harga tiket regular. ");
        }

        System.out.println("Total harga tiket: Rp " + hargaTiket);
        input.close();
    }
}
