import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        double elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;

        System.out.print("Kaç Kg Elma Aldınız : ");
        elma = oku.nextDouble();
        System.out.print("Kaç Kg Armut Aldınız : ");
        armut = oku.nextDouble();
        System.out.print("Kaç Kg Domates Aldınız : ");
        domates = oku.nextDouble();
        System.out.print("Kaç Kg Muz Aldınız : ");
        muz = oku.nextDouble();
        System.out.print("Kaç Kg Patlıcan Aldınız : ");
        patlican = oku.nextDouble();

        toplam = (elma*3.67 + armut*2.14 + domates*1.11 + muz*0.95 + patlican*5.00);
        System.out.println("Toplam Tutar : " +toplam);
    }
}
