public class TugasPersegi extends TugasBangunDatar {
    private double sisi;

    public TugasPersegi(String namaBangun, double sisi) {
        super(namaBangun);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}