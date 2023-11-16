import java.util.Scanner;
public class KdvHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Double tutar, KdvOran, KdvDeger, toplam;

        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = oku.nextDouble();
        KdvOran = (tutar < 1000) ? 0.18 : 0.8 ;
        KdvDeger = tutar * KdvOran;
        toplam = tutar + KdvDeger;

        System.out.println("Tutar : " +tutar);
        System.out.println("KDV Oran : " +KdvOran);
        System.out.println("Kdv Değeri : " +KdvDeger);
        System.out.println("Toplam : " +toplam);
    }
}
