package day07.OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
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
    int number=1000;
    List<Ogrenci> ogrenciList=new ArrayList<>();

    void ogrMenu(){
        System.out.println("    \t============= ÖĞRENCİ İŞLEMLER =============\n" +
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
                case 'Q':{ cikis();break;}

            }
    }

    @Override
    public void ekleme() {
        System.out.println("------------- Yeni Öğrenci Ekleme -------------");
        scan.nextLine();
        System.out.print("Adı: ");
        String firstName= scan.nextLine();
        System.out.print("Soyadı: ");
        String lastName= scan.nextLine();
        System.out.print("TC Kimlik No: ");
        String tckNo= scan.next();
        System.out.print("Yaşı: ");
        int age= scan.nextInt();
        scan.nextLine();
        System.out.print("Sınıfı: ");
        String className= scan.nextLine();

        Ogrenci ogrenci=new Ogrenci(firstName,lastName,tckNo,age,number++,className);
        ogrenciList.add(ogrenci);
        System.out.println("...........");
        System.out.println("Kayıt İşlemi Başarıyla Tamamlandı");
        System.out.println(" ");
        System.out.println("Kayıt Listesi");
        listele();
        ogrMenu();
    }

    @Override
    public void arama() {
        scan.nextLine();
        System.out.print("Aradığınız Kişinin TC Kimlik Numarasını Giriniz: ");
        String searchTc= scan.nextLine();

        for (Ogrenci each:ogrenciList ) {
            if (each.getTCKN().equals(searchTc)){
                System.out.println("Aradığınız Kişi kayıtlarımızda aşağıdaki bilgilerle kayıtlıdır.\n"
                                    +each);
            }else{
                System.out.println("Aradığınız Kişi kayıtlarımızda mevcut değildir.\n");
            }

        }
        ogrMenu();
    }

    @Override
    public void listele() {
        for (Ogrenci each:ogrenciList ) {
            System.out.println(each);
        }
        ogrMenu();
    }

    @Override
    public void silme() {
        scan.nextLine();
        System.out.print("Silinecek kişinin TC Kimlik Numarasını giriniz: ");
        String tcNo= scan.nextLine();

        for (int i = 0; i < ogrenciList.size(); i++) {
            if (ogrenciList.get(i).getTCKN().equals(tcNo)){
                System.out.println("Girdiğiniz "+tcNo+" numaralı kişi\n"+
                        ogrenciList.get(i)+"\n bilgileri ile birlikte silinecek");
                System.out.println("Onaylıyor musunuz? (E/H");
                char secim=scan.next().toUpperCase().charAt(0);
                if (secim=='E'){
                    ogrenciList.remove(i);
                    listele();
                    ogrMenu();
                }else{
                    System.out.println("Silme İşlemi Reddedildi.");
                    silme();
                }
            }

        }
    }

    @Override
    public void anaMenu() {
        AnaMenu anaMenu=new AnaMenu();
        anaMenu.menu();

    }

    @Override
    public void cikis() {
    System.exit(0);
    }
}
