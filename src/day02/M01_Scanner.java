package day02;

import java.util.Scanner;

public class M01_Scanner {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);


      //  System.out.print("Adınız: ");
      //  String name=scan.nextLine(); //.next() olursa ilk boşluğa kadar alır - nextLine() dersek satırın tamamını alır.
      //  System.out.println(name);

          /*
        Kullanıcıdan adını, soyadı ve şifresini alıp sisteme kaydedip aşağıdaki gibi bir çıktı veren kodu yazınız
        ------ Sistem Kaydı Tamamlandı ------
        Bilgileriniz sistemlerimize;
            Adı: Murat
            Soyadı: Yiğit
            Şifre: 123698
        olarak kaydedilmiştir
         */
        System.out.print("Adınız: ");
        String name= scan.nextLine();
        System.out.print("Soyadınız: ");
        String surname= scan.nextLine();
        System.out.print("Şifreniz: ");
        int pass= scan.nextInt();
        System.out.println("------ Sistem Kaydı Tamamlandı ------");
        System.out.println("Bilgileriniz sistemlerimize;");
        System.out.println("\tAdı: "+name+"\n\tSoyadı: "+surname+"\n\tŞifre: "+pass);
        System.out.println("olarak kaydedilmiştir");
        //ÖDEV: Tek bir System.out.println kullanarak tüm datayı tek seferde yazdırın



    }
}
