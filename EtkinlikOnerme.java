import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args){
        Scanner oku=new Scanner(System.in);
        int heat;

        System.out.print("Sıcaklık Giriniz: ");
        heat= oku.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz.");
        } else if (heat >= 5 && heat <= 25){
            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz.");
                if (heat >= 10) {
                    System.out.println("Pikniğe Gidebilirsiniz.");
                } else {
                    System.out.println("Yüzmeye Gidebilirsiniz.");
                }
            }
        }
    }
}
