import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[]args){
        Scanner oku=new Scanner(System.in);
        int matematik, fizik, kimya, turkce, muzik;
        double average;

        System.out.print("Matematik Notunu Giriniz: ");
        matematik= oku.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik=oku.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya=oku.nextInt();

        System.out.print("Türkçe Notunu Giriniz: ");
        turkce=oku.nextInt();

        System.out.print("Müzik Notunu Giriniz: ");
        muzik= oku.nextInt();

        average = (matematik+fizik+kimya+turkce+muzik)/5;

        if (average<=55) {
            System.out.println("Ortalamanız: " +average);
            System.out.println("Sınıfta Kaldınız");
        } else {
            System.out.println("Ortalamanız: " +average);
            System.out.println("Tebrikler Sınıfı Geçtiniz");
        }
    }
}
