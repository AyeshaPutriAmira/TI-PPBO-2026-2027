import java.util.Scanner;

public class BMISederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        // rumus bmi:
        double bmi = berat / (tinggi * tinggi) * 10000;

        System.out.printf("Nilai BMI anda: %.2f\n", bmi);

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
        input.close();
    }
}
