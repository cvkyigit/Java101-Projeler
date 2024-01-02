import java.util.Scanner;

public class DortveBesinKatlariniBulanProgram {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int number;
        number = oku.nextInt();

        System.out.print(number +"Sayısından küçük dördün kuvvetleri");
        for (int i=1; i<=number; i*=4) {
            System.out.println(i+ " ");
        }
        System.out.print(number +"Sayısından küçük beşin kuvvetleri");
        for (int i=1; i<=number; i*=5) {
            System.out.println(i+ " ");
        }
    }
}
