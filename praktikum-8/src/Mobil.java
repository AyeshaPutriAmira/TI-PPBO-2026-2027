public class Mobil extends Kendaraan {
    int jumlahPintu;

    //Latihan 3
    public Mobil(String merek, int kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maksimum: " + kecepatanMaks + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}
