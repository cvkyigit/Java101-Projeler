import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        boolean tek;
        int sayi, toplam=0;
        Scanner oku = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz: ");
            sayi = oku.nextInt();

            if (sayi % 2 == 0 && sayi % 4 == 0)
                toplam = toplam + sayi;
            tek = sayi % 2 == 1;
        }
        while (!tek);

        System.out.println("Toplam: " +toplam);
    }
}
