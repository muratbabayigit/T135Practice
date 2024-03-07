package day05;

import java.util.Scanner;

public class M06_whileLoop {
    public static void main(String[] args) {
        /*
        // kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		// kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create
		// ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Bölmek istediğiniz sayıyı giriniz: ");
        int bolunen=scan.nextInt();
        System.out.print("Kaça Bölmek istyorsunuz: ");
        int bolum= scan.nextInt();

        bolmeislemi(bolunen,bolum);

    }

    public static void bolmeislemi(int bolunen, int bolum) {
        int userint=bolunen;
        int sayac=0;
        while(bolunen>=bolum){
            bolunen=bolunen-bolum;
            sayac++;
        }
        System.out.println(userint+" sayısını "+bolum+" sayısına bölünce sonuc: "+sayac);


    }
}
