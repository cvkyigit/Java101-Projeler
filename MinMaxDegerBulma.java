import java.util.Scanner;

public class MinMaxDegerBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        int enBuyukDeger = Integer.MIN_VALUE;
        int enKucukDeger = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı Giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi > enBuyukDeger) {
                enBuyukDeger = sayi;
            }

            if (sayi < enKucukDeger) {
                enKucukDeger = sayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukDeger);
        System.out.println("En küçük sayı: " + enKucukDeger);
    }
}