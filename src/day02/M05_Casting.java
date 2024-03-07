package day02;

import java.util.Scanner;

public class M05_Casting {
    public static void main(String[] args) {
        /*
        Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıya bölün ve
        sonucu tam sayı yazdırın.
         */

        Scanner murat=new Scanner(System.in);
        System.out.print("Lütfen ondalıklı bir sayı giriniz: ");
        double a= murat.nextDouble();
        System.out.print("Lütfen ondalıklı bir sayı daha giriniz: ");
        double b= murat.nextDouble();
        System.out.println(a/b);
        int c=(int)(a/b);
        System.out.println(c);
        
        double d=c;
        System.out.println("d = " + d);

    }
}
