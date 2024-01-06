import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int n, r, nrT=1, nT=1, rT=1;
        System.out.print("n Değerini Giriniz: ");
        n = oku.nextInt();
        System.out.print("r Değerini Giriniz: ");
        r = oku.nextInt();

        for (int a = 1; a <= n; a++) {
            nT = nT * a;
        }
        for (int b = 1; b <= r; b++) {
            rT = rT * b;
        }
        for (int c = 1; c <= (n - r); c++) {
            nrT = nrT * c;
        }
        System.out.println("C(" + n + "," + r + ")= " + (nT / (rT * nrT)));
    }
}
