import java.util.Scanner;

public class ArmstrongSayiBulma {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = oku.nextInt();

        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }

        System.out.println("Basamak sayılarının toplamı: " +toplam);
    }
}