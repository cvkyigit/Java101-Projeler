import java.util.Scanner;

public class HarmonikSayiBulanProgram {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = oku.nextInt();
        double sonuc = 0.0;

        for (int i = 1; i <= n; i++) {
            sonuc += (1 / i);
        }

        System.out.println("Harmonik Seri: " +sonuc);
    }
}
