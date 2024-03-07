package day04;

import javax.swing.*;

public class M04_switchStatements {
    public static void main(String[] args) {
        /*
        Kullanicidan ay numarasini alip mevsimi yazdirin.
         */

        String ayNO= JOptionPane.showInputDialog("Lütfen Bulunduğunuz Ay Numarasını Giriniz: ");
        int ayNO2=Integer.parseInt(ayNO);

        switch (ayNO2){
            case 1: case 2: case 12:
                System.out.println("Şu an Kış Mevsimindesiniz");
                break;
            case 3: case 4: case 5:
                System.out.println("Şu an İlkBahar Mevsimizndesiniz");
                break;
            case 6: case 7: case 8:
                System.out.println("Şu an Yaz Mevsimindesiniz");
                break;
            case 9: case 10: case 11:
                System.out.println("Şu an Sonbahar Mevsimizndesiniz");
                break;

        }


    }
}
