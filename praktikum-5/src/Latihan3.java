public class Latihan3 {
    public static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit")) {
            return (celsius * 9 / 5) + 32;
        } else {
            System.out.println("Skala tujuan tidak dikenal. Mengembalikan nilai 0.");
            return 0;
        }
    }

    public static void main(String[] args) {
        double suhuC = 25;

        System.out.println(suhuC + " Celsius = " + konversiSuhu(suhuC) + " Fahrenheit");
        System.out.println(suhuC + " Celsius = " + konversiSuhu(suhuC, "Kelvin") + " Kelvin");
        System.out.println(suhuC + " Celsius = " + konversiSuhu(suhuC, "Fahrenheit") + " Fahrenheit");
    }
}
