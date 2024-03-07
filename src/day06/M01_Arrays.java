package day06;

import java.util.Arrays;
import java.util.Scanner;

public class M01_Arrays {
    public static void main(String[] args) {
     // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
	//kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
	//elemaninin arasinki farki gosteren java programi yaziniz

        Scanner scan=new Scanner(System.in);

        System.out.print("Lütfen Array oluşturmak için bir array uzunluğu giriniz: ");
        int sayi= scan.nextInt();
        int [] arr=new int[sayi]; //Kullanıcının girdiği değer uzunluğunda bir array oluşturuyoruz. arr.length değerini belirleiyoruz

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i+1+". elemanı giriniz: ");
            int sayi2= scan.nextInt();
            arr[i]=sayi2;

        }
        System.out.println("Sort Öncesi:"+Arrays.toString(arr));
        Arrays.sort(arr); //arr'nin elemanlarını küçükten büyüğe sıralayacak min=arr[0] max=arr[length-1]
        System.out.println("Sort Sonrası:"+Arrays.toString(arr));
        System.out.println("Max-Min Farkı: "+(arr[arr.length-1]-arr[0]));


    }
}
