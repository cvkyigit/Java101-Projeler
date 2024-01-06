import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bulmak İstediğiniz Faktöreiyeli Giriniz: ");
        int n = oku.nextInt();
        int total = 1;

        for (int i = 1; i <= n; i++) {
            total = total * i;
        }
        System.out.println(n + ". Farktöriyel: " +total);
    }
}
