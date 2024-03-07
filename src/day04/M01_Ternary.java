package day04;

import java.util.Scanner;

public class M01_Ternary {
    /*
        TASK :
       Kullanicidan bir sayi aliniz
       Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
       10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
       Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.
        */
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int a= scan.nextInt();
        System.out.println("-----Ternary Çözüm----");

        String result= (a>=0)?(a<10?"Rakam":"Pozitif Sayi"):"Negatif Sayi";
        System.out.println(result);
        //System.out.println((a>=0)?(a<10?"Rakam":"Pozitif Sayi"):"Negatif Sayi");


        System.out.println("**** IF Çözümü ****");
        if (a>=0){
            if (a<10){
                System.out.println("Rakam");
            }else{
                System.out.println("Pozitif Sayi");
            }
        }else{
            System.out.println("Negatif Sayi");
        }










    }

}
