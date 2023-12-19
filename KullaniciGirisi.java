import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        String kullaniciadi, sifre, username;
        int password, password2;

        System.out.print("Kullanıcı Adını Giriniz : ");
        kullaniciadi=oku.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        sifre=oku.nextLine();

        if (kullaniciadi.equals("Mert") && sifre.equals("1234")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
        }

        System.out.print("Kullanıcı Adı giriniz: ");
        username = oku.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = oku.nextInt();
        System.out.println("Şifrenizi Doğrulamak İçin Tekrar Giriniz: ");
        password2 = oku.nextInt();

        if (password == password2) {
            System.out.println("Yeni Şifreniz Oluşturuldu");
        } else {
            System.out.println("Şifreler Uyuşmuyor yeni şifre oluşturmak için 1'e uygulamadan çıkmak için 2'ye basın.");
        }
        int control=oku.nextInt();

        switch (control) {
            case 1:
                System.out.println("Yeni Şifre Oluştunuz");
                int newpassword=oku.nextInt();

                if (newpassword == password) {
                    System.out.println("Oluşturduğunuz Şifre Eski Şifreniz ile aynı Yeni Şifre Oluşturulamadı");
                } else {
                System.out.println("Şifreniz Oluşturuldu");
                break;
            }
            case 2:
                System.out.println("Çıkış Yapınız");
            default:
        }
    }
}
