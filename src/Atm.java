import java.util.Objects;
import java.util.Scanner;


public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int deneme = 0 ;
        String password= "x";

        System.out.println("Lütfen kullanıcı adınızı giriniz");
        String user_name = input.nextLine();
        System.out.println(user_name+" bey "+"hoşgeldiniz");
        boolean isPassword= true;
        int account=0;

        System.out.println("Lütfen şifrenizi giriniz");
        String new_password = input.nextLine();

        String answer;

        do {

            if (!password.equals(new_password)) {

                System.out.println("Şifreniz yanlış,lütfen tekrar deneyiniz");

                do {

                    if (deneme <= 1)

                    {
                        System.out.println("Lütfen şifrenizi tekrar giriniz");
                        new_password = input.next();

                        if (password==new_password){
                            isPassword = false;

                        }

                        else {isPassword = true;
                            deneme++;}


                    }

                    else
                    {
                        isPassword = false;
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                        System.exit(0);
                    }

                }

                while (isPassword);

            }

            else
            {
                System.out.println("Şifreniz doğru");
            }

            String x ="x";
            String y ="y";
            String z ="z";
            String t ="t";


            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");

            String secim = input.next();



            if (secim.equals(x)) {

                System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz");

                int tutar = input.nextInt();

                if (tutar < 0) {

                    System.out.println("Hatalı giriş yaptınız,lütfen tekrar deneyiniz");
                } else {

                    account += tutar;
                }

            } else if (secim.equals(y) ) {

                System.out.println("Lütfen çekmek istediğiniz tutarı giriniz");
                int cekim = input.nextInt();

                if (account <= 0) {

                    System.out.println("Yetersiz bakiye");
                } else {

                    account -= cekim;
                }

            } else if (secim.equals(z) )  {

                System.out.println("Hesabınızda :" + account + "Tl vardır.");}


            else if(secim.equals(t)){

                System.out.println("iyi günler dileriz");
                System.exit(0);

            }

            System.out.println("İşleme devam etmek ister misiniz");

            answer = input.next();

            if(answer.equals("hayır")){


            }


        }

        while (answer.equals("evet"));

        System.out.println("iyi günler dileriz");
        System.out.println("Hesabınızda:"+account+ " Tl bulunmaktadır.");


    }
}