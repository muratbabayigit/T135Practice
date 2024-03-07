package day03;

import java.util.Scanner;

public class M05_IfStatements {
    public static void main(String[] args) {
        /*
        2- Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
          “istediginiz birim sisteme kayitli degil” yazdirin.
      */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen mesafeyi km olarak giriniz: ");
        double km= scan.nextDouble();
        System.out.println("Çevirmek istediğiniz birimi metre ya da santimetre şeklinde giriniz");
        char birim=scan.next().charAt(0);
        if (birim=='m'|| birim=='M'){
            System.out.println("Girdiğiniz değerin karşılığı "+1000*km+" m'dir");
        } else if (birim=='s'|| birim=='S'|| birim=='c'|| birim=='C') {
            System.out.println("Girdiğiniz değerin karşılığı "+1000*100*km+" cm'dir");
        }else {
            System.out.println("Maalesef istediginiz birim sisteme kayitli degil");
        }

    }
}
