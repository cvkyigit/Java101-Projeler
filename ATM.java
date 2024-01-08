import java.util.Scanner;
// ATM Projesi

public class ATM {
    public static void main(String[] args)
    {
        String userName, password;
        Scanner oku = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0)
        {
            System.out.print("Kullanıcı Adınız : ");
            userName = oku.nextLine();
            System.out.print("Parolanız : ");
            password = oku.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = oku.nextInt();
                    switch (select) {
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktar: ");
                            int price = oku.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktar: ");
                            int decrease = oku.nextInt();
                            if (decrease > balance) {
                                System.out.println("Yetersiz bakiye!");
                            } else {
                                balance -= decrease;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            }
            else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }

    }
}