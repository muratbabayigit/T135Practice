package day07.OkulYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrtIslemleri implements I_islemler{

      /*
         ============= ÖĞRENCİ İŞLEMLERİ =============
		    1-EKLEME
		    2-ARAMA
		    3-LİSTELEME
		    4-SİLME
		    5-ANA MENÜ
		    Q-ÇIKIŞ

	    SEÇİMİNİZ:
     */
    Scanner scan=new Scanner(System.in);
    int scilNo=2024001;
    List<Ogretmen> ogretmenList=new ArrayList<>();
    void ogrtMenu() {
        System.out.println("    \t============= ÖĞRETMEN İŞLEMLERİ =============\n" +
                "\t\t 1-EKLEME\n" +
                "\t\t 2-ARAMA\n" +
                "\t\t 3-LİSTELEME\n" +
                "\t\t 4-SİLME\n" +
                "\t\t 5-ANA MENÜ\n" +
                "\t\t Q-ÇIKIŞ");

        char secim = scan.next().toUpperCase().charAt(0);
        switch (secim) {
            case '1': {ekleme();break;}
            case '2': {arama();break;}
            case '3': {listele();break;}
            case '4': {silme();break;}
            case '5': {anaMenu();break;}
            case 'Q': {cikis();break;}
        }
    }

    @Override
    public void ekleme() {
        System.out.println("============ YENİ ÖĞRETMEN EKLEME ===============");
        scan.nextLine();
        System.out.print("Adı: ");
        String firstName= scan.nextLine();
        System.out.print("Soyadı: ");
        String lastName= scan.nextLine();
        System.out.print("TCKN: ");
        String tckn= scan.nextLine();
        System.out.print("Branşı: ");
        String bolum= scan.nextLine();
        System.out.print("Yaşı: ");
        int age= scan.nextInt();
        Ogretmen ogretmen=new Ogretmen(firstName,lastName,tckn,age,bolum,scilNo++);
        ogretmenList.add(ogretmen);
        System.out.println(" ");
        System.out.println("Bilgiler başarıyla kaydedildi");
        listele();
        ogrtMenu();
    }

    @Override
    public void arama() {
        System.out.print("Aradığınız Kişinin Tc Kimlik Numarasını giriniz: ");
        scan.nextLine();
        String searchTckn= scan.nextLine();
        for (Ogretmen each:ogretmenList ) {
            if (each.getTCKN().equals(searchTckn)){
                System.out.println("Aradığınız kişi: "+each);
                ogrtMenu();
            }else{
                System.out.println("Aradığınız kişi kayıtlarda bulunamadı.");
                ogrtMenu();
            }
        }


    }

    @Override
    public void listele() {
        for (Ogretmen each:ogretmenList
             )
            System.out.println(each);
            ogrtMenu();


    }

    @Override
    public void silme() {
        System.out.print("Silinecek Kaydın TC Kimlik Numarasını Giriniz: ");
        scan.nextLine();
        String deleteTckn= scan.nextLine();
        boolean flag=true;

        for (int i = 0; i < ogretmenList.size(); i++) {
            if (ogretmenList.get(i).getTCKN().equals(deleteTckn)){
                System.out.println("Girdiğiniz "+deleteTckn+" numaralı kişi\n"
                                    +ogretmenList.get(i)+ "\nbilgileriyle birlikte silinecek.");
                System.out.print("Onaylıyor musunuz? (E/H): ");
                char onay= scan.nextLine().toUpperCase().charAt(0);
                if (onay=='E') {
                    ogretmenList.remove(i);
                    System.out.println(deleteTckn+" TC Kimlik numaralı kişi sistemimizden silindi.");
                }else{
                    silme();
                }
                flag=false;
                listele();
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
