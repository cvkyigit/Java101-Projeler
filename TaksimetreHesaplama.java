import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int km;
        double kmbasina = 2.20, acilisucreti = 20.0, toplam;

        System.out.print("Mesafeyi KM Cinsinden Yazınız : ");
        km = oku.nextInt();

        toplam = (km * kmbasina);
        acilisucreti = + toplam;

        toplam = (toplam < 20) ? 20 : toplam;
        System.out.println("Toplam Tutar : " +toplam);
    }
}
