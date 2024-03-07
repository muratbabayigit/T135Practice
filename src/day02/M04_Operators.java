package day02;

import java.util.Scanner;

public class M04_Operators {
    public static void main(String[] args) {
         /*
        soru:
        Kullanıcıdan decimal bir sayı alıp bu sayının binary karşılığını yazdırın.
        Decimal : 10'luk taban (Günlük hayat 0,1,2,3,4,5,6,7,8,9)
        Binary  : 2'lik tabandaki karşılığıdır. (0,1)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayi= scan.nextInt();
      //  int kalan1=sayi%2;
      //  sayi/=2;
      //  int kalan2=sayi%2;
      //  sayi/=2;
      //  int kalan3=sayi%2;
      //  sayi/=2;
      //  int kalan4=sayi%2;
      //  sayi/=2;
      //  System.out.println("Girdiğiniz sayının binary karşılığı: "+sayi+kalan4+kalan3+kalan2+kalan1);

        String binarydeger=Integer.toBinaryString(sayi);
        System.out.println("Girdiğiniz sayının binary karşılığı: = " + binarydeger);









    }
}
