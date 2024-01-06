import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args){
        Scanner oku = new Scanner(System.in);

        System.out.print("a değerini giriniz: ");
        int a = oku.nextInt();

        System.out.print("b değerini giriniz: ");
        int b = oku.nextInt();

        int carpim = 1;
        for (int i = 1; i <= b; i++) {
            carpim *= a;
        }
        System.out.println("a^b=" +carpim);
    }
}
