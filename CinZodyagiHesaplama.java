import java.util.Scanner;

public class CinZodyagiHesaplama {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);
        int dogumYili;

        System.out.print("Doğum Yılınızı Giriniz: ");
        dogumYili = oku.nextInt();

        if (dogumYili % 12 == 0) {
            System.out.println("Çin Zodyağı Burcunuz: AT");
        }
        else if (dogumYili % 12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        }
        else if (dogumYili % 12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        }
        else if (dogumYili % 12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        }
        else if (dogumYili % 12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        }
        else if (dogumYili % 12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        }
        else if (dogumYili % 12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        }
        else if (dogumYili % 12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        }
        else if (dogumYili % 12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        }
        else if (dogumYili % 12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        }
        else if (dogumYili % 12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        }
        else if (dogumYili % 12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
        else System.out.println("Hatalı Giriş Yaptınız");
    }
}
