package day07.OkulYonetimi;

import java.util.Scanner;

public class OgrIslemleri implements I_islemler{
    /*
    	============= İŞLEMLER =============
		 1-EKLEME
		 2-ARAMA
		 3-LİSTELEME
		 4-SİLME
		 5-ANA MENÜ
		 Q-ÇIKIŞ
     */
    Scanner scan=new Scanner(System.in);

    void ogrMenu(){
        System.out.println("    \t============= İŞLEMLER =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ");

        char secim=scan.next().toUpperCase().charAt(0);
            switch (secim){
                case '1':{ ekleme();break;}
                case '2':{ arama();break;}
                case '3':{ listele();break;}
                case '4':{ silme();break;}
                case '5':{ anaMenu();break;}
                case '6':{ cikis();break;}

            }
    }

    @Override
    public void ekleme() {

    }

    @Override
    public void arama() {

    }

    @Override
    public void listele() {

    }

    @Override
    public void silme() {

    }

    @Override
    public void anaMenu() {

    }

    @Override
    public void cikis() {

    }
}
