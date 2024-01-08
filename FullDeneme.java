import java.util.Scanner;

public class FullDeneme {
    public static void main(String[]args) {
        Scanner oku = new Scanner(System.in);

        String userName,password;
        int right = 3;
        int balance = 15000;
        int select;
        while (right > 0)
        {
            System.out.print("Kullanıcı Adınızı Giriniz: ");
            userName = oku.nextLine();
            System.out.print("Parolanızı Giriniz: ");
            password = oku.nextLine();

            if (userName.equals("Code") && password.equals("Camp23")) {
                System.out.println("Merhaba CodeCamp Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = oku.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
                            int price = oku.nextInt();
                            balance += price; // balance = balance + price
                            break;
                        case 2:
                            System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");
                            int decrease = oku.nextInt();
                            if (decrease > balance) {
                                System.out.println("Yetersiz Bakiye");
                            } else {
                                balance -= decrease; // balance = balance - decrease
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz:" +balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;
            }
            else {
                right--;
                System.out.println("Kullanıcı Adı veya Parolanız Hatalı. Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke Olmuştur. Banka ile İletişime Geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız: " +right);
                }
            }
        }
    }
}
