package day03;

import javax.swing.*;

public class M03_IfElseStatements {
    public static void main(String[] args) {
        // Kullanicidan  yasini ve kilosunu alaliniz
        // 18 yasindan kucuk ise kan bagisi yapamaz+
        // 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        // 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

       String name=JOptionPane.showInputDialog("Lütfen Adınızı Giriniz");
       System.out.println(name);
       String age=JOptionPane.showInputDialog("Lütfen yaşınızı giriniz:");
       int age2=Integer.parseInt(age);
       String kilo=JOptionPane.showInputDialog("LÜtfen kilonuzu giriniz:");
       double weight= Double.parseDouble(kilo);

       if (age2<18){
           System.out.println("Sn."+name+" Kan Bağışı yapmanıza izin verilmemektedir.");
       }else {
           if (weight<50){
               System.out.println("Sn."+name+" Kan Bağışı yapmanıza izin verilmemektedir.");
           }else {
               System.out.println("Sn."+name+" Kan Bağışı yapmanıza izin verilmek,tedir.");
           }
       }

    }
}
