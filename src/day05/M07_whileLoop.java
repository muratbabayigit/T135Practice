package day05;

import java.util.Scanner;

public class M07_whileLoop {
    public static void main(String[] args) {
        /*
         * Kullanıcıdan alınan sayinin basamak degerlerinin toplamini while loop ile yapin birkod yazınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen en az 3 basamaklı bir sayı giriniz: ");
        int sayi= scan.nextInt();

        int toplam=0;
        while(sayi!=0){
            toplam+=sayi%10;
            sayi/=10;
        }
        System.out.println(toplam);

    }
}
