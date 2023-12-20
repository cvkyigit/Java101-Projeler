import java.util.Scanner;
import java.util.TooManyListenersException;

public class UcakBiletFiyatiHesaplama {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);
        int kilometre, yas, yolculuktipi;
        double tutar, toplamTutar, indirimliTutar, inidirimliYas, indirimliGidDon;

        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        kilometre = oku.nextInt();

        System.out.print("Yaşınızı Giriniz: ");
        yas = oku.nextInt();

        System.out.print("Yolculuk Tipini Seçiniz\n(1-Tek Yön, 2-Gidis Dönüş): ");
        yolculuktipi = oku.nextInt();

        if (kilometre > 0 && yas >0 && (yolculuktipi == 1 || yolculuktipi == 2)) {
            tutar = kilometre * 0.1;

            if (yas < 12) {
                inidirimliYas = tutar * 0.5;
                indirimliTutar = tutar - inidirimliYas;
                indirimliGidDon = yolculuktipi == 2 ? indirimliTutar * 0.20 : 0;
                toplamTutar = (indirimliTutar - indirimliGidDon) * yolculuktipi;
                System.out.println("Toplam Tutarınız: "+toplamTutar);
            }
            else if (yas < 24) {
                inidirimliYas = tutar * 0.1;
                indirimliTutar = tutar - inidirimliYas;
                indirimliGidDon = yolculuktipi == 2 ? indirimliTutar * 0.2 : 0;
                toplamTutar = (indirimliTutar - indirimliGidDon) * yolculuktipi;
                System.out.println("Toplam Tutarınız: "+toplamTutar);
            }
            else if (yas > 65) {
                inidirimliYas = tutar * 0.3;
                indirimliTutar = tutar - inidirimliYas;
                indirimliGidDon = yolculuktipi == 2 ? indirimliTutar * 0.2 : 0;
                toplamTutar = (indirimliTutar - indirimliGidDon) * yolculuktipi;
                System.out.println("Toplam Tutarınız: "+toplamTutar);
            } else if (yas < 65) {
                indirimliGidDon = yolculuktipi == 2 ? tutar * 0.2: 0;
                toplamTutar = (tutar - indirimliGidDon) * yolculuktipi;
                System.out.println("Toplam Tutarınız: "+toplamTutar);
            }
            else {
                System.out.println("Hatalı Giriş Yaptınız:");
            }
        }
    }
}
