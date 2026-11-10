public class TugasPersegiPanjang extends TugasBangunDatar {
    private double panjang;
    private double lebar;

    public TugasPersegiPanjang(String namaBangun, double panjang, double lebar) {
        super(namaBangun);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}