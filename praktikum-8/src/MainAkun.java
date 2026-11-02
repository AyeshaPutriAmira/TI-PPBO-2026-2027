public class MainAkun {
    public static void main(String[] args) {
        AkunPremium akun = new AkunPremium(
                "ayesha123", 500000, 1000000
        );

        akun.cekLimit();
    }
}
