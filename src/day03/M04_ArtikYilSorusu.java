package day03;

import javax.swing.*;

public class M04_ArtikYilSorusu {
    public static void main(String[] args) {
        /*
    Soru ) Interview Question
    Kullanicidan artik yil olup olmadigini kontrol
    etmek icin yil girmesini isteyin.
    Kural 1: 4 ile bolunen yillar artik yildir
    Kural 2: 4 ile bolunup 100 ile bolunemeyen yillar artik yildir
    Kural 3: 4’un kati olmasina ragmen 100 ile bolunebilen yillardan sadece 400’un kati olan yillar artik yildir

     */

        String deger = JOptionPane.showInputDialog("Kontrol etmek istediğiniz Yılı giriniz:");
        int yil=Integer.parseInt(deger);

        if (yil%400==0 && yil%100==0 || yil%4==0 && yil%100!=0){
            System.out.println(yil+ " yılı bir artık yıldır. Şubat ayı 29 gün olacaktır");
        }else{
            System.out.println(yil+" yılı bir artık yıl değildir");
        }


    }
}
