import java.util.Scanner;

public class GirilenSayiyaKadarOlanCiftSayilariBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int k, total = 0 , count = 0;

        System.out.println("Sayı Giriniz: ");
        k = oku.nextInt();

        for (int i = 0; i < k; i++) {
            if (i % 12 == 0) {
                total += i;
                count++;
            }
        }
        if (count == 0)
            count = 1;

        System.out.println("3 ve 4'e tam bölünen sayıların toplamı: " + (double) total/count);
    }
}
