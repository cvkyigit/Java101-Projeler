import java.util.Scanner;
public class HipotenusBulma {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int a, b, c;

        System.out.print("1.Kenarı Gir : ");
        a = oku.nextInt();
        System.out.print("2.Kenarı Gir : ");
        b = oku.nextInt();

        c = (a*a) + (b*b);
        System.out.println("Hipotenüs : " +c);
    }
}
