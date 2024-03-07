package day07.OkulYonetimi;

import java.util.Scanner;

public class AnaMenu {
        /*
    ====================================
	 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
	====================================
	    1- ÖĞRENCİ İŞLEMLERİ
	    2- ÖĞRETMEN İŞLEMLERİ
	    Q- ÇIKIŞ

	SEÇİMİNİZ:

         */

    void menu(){
        Scanner scan=new Scanner(System.in);
        System.out.println("\t====================================\n" +
                "\t ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ\n" +
                "\t====================================\n" +
                "\t\t1- ÖĞRENCİ İŞLEMLERİ\n" +
                "\t\t2- ÖĞRETMEN İŞLEMLERİ\n" +
                "\t\tQ- ÇIKIŞ\n" +
                "\n" +
                "\tSEÇİMİNİZ:\n");

        char secim=scan.next().toUpperCase().charAt(0);
        switch (secim){
            case '1':{
               OgrIslemleri ogrIslemleri=new OgrIslemleri();
               ogrIslemleri.ogrMenu();
               break;
            }
            case '2':{
                OgrtIslemleri ogrtIslemleri=new OgrtIslemleri();
                ogrtIslemleri.ogrtMenu();
                break;
            }
            case 'Q':{
                System.exit(0);
                break;

            }
            default:{
                System.out.println("Hatalı Giriş Yaptınız");
                menu();
            }
        }
    }
}
