import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int num1, num2, select;

        System.out.print("İlk Sayıyı Girimiz : ");
        num1 = oku.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        num2 = oku.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapacağınız İşlemi Seçiniz : ");
        select = oku.nextInt();

        switch (select) {
            case 1:
                System.out.println("Sonuç: "+ (num1 + num2));
                break;
            case 2:
                System.out.println("Sonuç: "+ (num1 - num2));
                break;
            case 3:
                System.out.println("Sonuç: "+ (num1 * num2));
                break;
            case 4:
                System.out.println("Sonuç: "+ ((num2 !=0) ? (num1 / num2 ) : "Belirsiz" ));
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız!");
                break;
        }
    }
}
