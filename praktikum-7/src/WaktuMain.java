public class WaktuMain {
    public static void main(String[] args) {
        Waktu waktu = new Waktu();

        waktu.setJam(14);
        waktu.setMenit(30);
        waktu.setDetik(45);

        System.out.println("Waktu: " + waktu.getJam() + ":"
                + waktu.getMenit() + ":" + waktu.getDetik());

        waktu.setJam(25);
        waktu.setMenit(70);
    }
}