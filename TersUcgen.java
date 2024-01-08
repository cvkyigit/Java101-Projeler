import java.util.Scanner;

public class TersUcgen {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int n = oku.nextInt();

        for (int i = n; i > 0; i--)
        {
            for (int k = (n - i); k >= 0; k--)
            {
                System.out.print(" ");
            }

            for (int j = (2 * i - 2); j >= 0; j--)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
