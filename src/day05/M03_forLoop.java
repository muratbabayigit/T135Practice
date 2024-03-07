package day05;

import java.util.Scanner;

public class M03_forLoop {
    /* TASK :
        Kullanıcıdan 10 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
  */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Lütfen "+i+". sayıyı giriniz: ");
            int sayi= scan.nextInt();
            if (sayi>5 && sayi<10){
                continue;
            }
            toplam+=sayi;

        }
        System.out.println(toplam);
    }

}
