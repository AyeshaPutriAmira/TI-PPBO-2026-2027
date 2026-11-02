public class MainHewan {
    public static void main(String[] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Kitty";
        System.out.println("Kucing: " + kucing.nama);
        kucing.bersuara();

        System.out.println();

        Anjing anjing = new Anjing();
        anjing.nama = "Bruno";
        System.out.println("Anjing: " + anjing.nama);
        anjing.bersuara();
    }
}
