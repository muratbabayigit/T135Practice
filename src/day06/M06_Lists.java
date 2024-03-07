package day06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M06_Lists {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve
    // ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {
        List<Double> nots=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        System.out.println("Not girmek için E tuşuna basınız!");
        char devam=scan.next().charAt(0);
        double ortalama=0;
        double toplam=0;
    while(devam=='E'){
        System.out.print("Notu giriniz: ");
        nots.add(scan.nextDouble());
        System.out.println("Yeni not girmek için E tuşuna basınız! Çokmak için Q tuşuna basınız");
    devam=scan.next().charAt(0);
    }
        System.out.println(nots);
        for (int i = 0; i < nots.size(); i++) {
            toplam+= nots.get(i);
        }
        ortalama=toplam/nots.size();
        System.out.println("Girilen notların ortalaması :"+ortalama);

    }

}
