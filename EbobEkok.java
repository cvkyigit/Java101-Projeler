import java.util.Scanner;

public class EbobEkok {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        int sayi1, sayi2;
        System.out.print("1.Sayıyı Giriniz: ");
        sayi1 = oku.nextInt();
        System.out.print("2.Sayıyı Giriniz: ");
        sayi2 = oku.nextInt();

        int ebob = 1;
        int i = 1;

        while (i <= sayi1 && i <= sayi2 ) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.println("EBOB: " +ebob);
        System.out.println("EKOK: " +ekok);
    }
}
