package day07;

import java.util.Scanner;

public class varArgs {
     /*
    Kullanıcı tarafından girilen sayıları toplayan bir Java programı yazınız.
    Metodunuz varargs kullanarak herhangi bir sayıda argüman alabilmelidir.
     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Toplamak istediğiniz sayıları aralarında bir boşluk bırakarak giriniz :");
        String input= scan.nextLine();
        String [] numbersString=input.split(" ");

        int [] numbers=new int[numbersString.length];
        for (int i = 0; i < numbersString.length; i++) {
            numbers[i]=Integer.parseInt(numbersString[i]);

            int toplam=topla(numbers);
            System.out.println("Girdiğiniz sayıların toplamı: "+toplam);

        }
    }

    private static int topla(int... numbers) {
        int toplam=0;
        for (int each:numbers ) {

            toplam+=each;
        }return toplam;
    }
}
