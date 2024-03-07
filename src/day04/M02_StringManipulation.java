package day04;

import java.util.Scanner;

public class M02_StringManipulation {
    public static void main(String[] args) {
     String text="Java Candir";
        System.out.println("r harfinin index değeri: "+text.indexOf("r"));
        //System.out.println("S harfinin index değeri: "+text.indexOf("S"));
        //System.out.println("T harfinin index değeri: "+text.indexOf("T"));

        System.out.println("5. index'te yer alan harf: "+text.charAt(5));
        System.out.println(text.length());
        System.out.println(text.substring(5));
        System.out.println(text.substring(5,8).toLowerCase()+text.substring(8,10).toUpperCase());
        //ilk 5 karakteri gizleme
        System.out.println(text.replaceAll("\\w","*"));

          /*
        \\s : space
        \\S :space olmayan her şey
        \\s+ :yanyana olan birden fazla space
        \\d : digit
        \\D : digit olmayan her şey
        \\w :harf veya rakam
        \\W : harf veya rakam olmayan herşey
         */

        String ss="Bu gun hava sicakligi m@m.com adresime 23 derece olarak bildirildi.";
        System.out.println(ss.replaceAll("\\W","*"));
        System.out.println(ss.replaceAll("\\D","#"));
        System.out.println(ss.replaceAll("\\s","o"));

        String email="ali*gmail.com";
        email=email.replace("*","@");
        System.out.println("email = " + email);

        text="      Java    Candir            ";
        System.out.println(text);
        System.out.println("Trim işlemi");
        System.out.println(text.trim());

        String str1="Merhaba";
        String str2="Merhaba";

        boolean esitMi= str1.equals("Merhaba");
       System.out.println(esitMi);
        boolean esitMi2= str1.equals(str2);
       System.out.println(esitMi2);

       System.out.println(str1.equals("merhaba"));
       System.out.println(str1.equalsIgnoreCase("merHaba"));

       Scanner scan=new Scanner(System.in);
       System.out.print("İsminizi Giriniz: ");
       String name= scan.nextLine();

       //System.out.println(str1+" "+name);
       System.out.println(str1.concat(" "+name));
       System.out.println(name.concat("202401"));

       int int1=28;
       int int2=28;

       System.out.println(str1.equals(str2)); // equals methodu sadece string verilerin eşitliğini kontrol eder
       System.out.println(int1==int2); // sayısal verilerin eşitliğini kontrol etmek için == operatorü kullanılır
       System.out.println(str1==str2);













    }
}
