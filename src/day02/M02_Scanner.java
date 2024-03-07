package day02;

import java.util.Scanner;

public class M02_Scanner {
    public static void main(String[] args) {
        /*
       Öğrenciden Vize ve Final Notlarını 1.Vize Notu, 2. Vize Notu ve Final Notu olarak alan
       Yıl sonu Başarı puanını vize ortalamasının %40, Final Notunun %60 etkisi olacak şekilde hesaplayıp
       Tüm Notlarını ve Yıl Sonu Başarı Notunu yazdıran bir kod yazınız
        */

        Scanner scan=new Scanner(System.in);

        System.out.print("1.Vize Notu: ");
        double vize1=scan.nextDouble();
        System.out.print("2.vize Notu: ");
        double vize2=scan.nextDouble();
        System.out.print("Final Notu: ");
        double finalNotu= scan.nextDouble();
        //double yilSonuNotu=(((vize1+vize2)/2)*0.4+finalNotu*0.6);


        System.out.println("---------- Yıl Sonu Başarı Notu Tablosu ----------");
        System.out.println("\t1.Vize Notu: "+vize1+"\n\t2.Vize Notu:"+vize2+"\n\tFinal Notu: "+finalNotu);
        System.out.println("Yıl Sonu Başarı Notu: "+(((vize1+vize2)/2)*0.4+finalNotu*0.6));
       //System.out.println("Yıl Sonu Başarı Notu: "+yilSonuNotu);



    }
}
