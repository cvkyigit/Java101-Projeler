import java.util.Scanner;

public class DaireAlanCevreBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int r, a;
        double pi = 3.14;

        System.out.print("Yarıçapı Giriniz : ");
        r = oku.nextInt();
        System.out.print("Daire Diliminin Merkez Açı Ölçüsünü Giriniz : ");
        a = oku.nextInt();

        double alan = (pi * (r*r) * a) / 360;
        System.out.println("Alan : " + alan);
    }
}
