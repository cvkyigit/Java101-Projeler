import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int matematik, fizik, kimya, turkce, tarih, muzik;
        System.out.println("Matematik Notu: ");
        matematik = oku.nextInt();

        System.out.println("Fizik Notu: ");
        fizik = oku.nextInt();

        System.out.println("Kimya Notu: ");
        kimya = oku.nextInt();

        System.out.println("Türkçe Notu: ");
        turkce = oku.nextInt();

        System.out.println("Tarih Notu: ");
        tarih = oku.nextInt();

        System.out.println("Müzik Notu: ");
        muzik = oku.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double ort = toplam / 6;

        String ortalama = ort>60 ? "Geçtiniz" : "Kaldınız";
        System.out.println(ortalama);
    }
}
