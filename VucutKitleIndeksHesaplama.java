import java.util.Scanner;

public class VucutKitleIndeksHesaplama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        double boy, kilo, indeks;

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = oku.nextDouble();
        System.out.print("Lütfen kilonuzu (kg cinsinde) giriniz : ");
        kilo = oku.nextDouble();


        indeks = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksi : " + indeks);
    }
}
