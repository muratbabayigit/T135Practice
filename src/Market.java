import java.util.Scanner;

public class Market {
    static Scanner scan=new Scanner(System.in);
    static boolean ekUrun=false;
    static int urunKodu;
    static int urunMiktari;
    static String urunAdi;
    static double urunFiyati;
    static double toplam;
    static String sepet=" ";


    public static void main(String[] args) {
        girisEkrani();
    }

    private static void girisEkrani() {
        System.out.println("--------Wise T135 Market-------");
        System.out.println("==========Hoşgeldiniz==========");
        System.out.println("Lütfen Alışveriş yapacağınız Reyonu seçiniz.");
        System.out.println("             MENU               ");
        System.out.println("1-Manav\n2-Şarküteri\n3-Market\n4-Fiş Yazdır\n5-Çıkış");
        int secim=scan.nextInt();
        if (secim >=1 && secim <= 5){
            switch (secim){
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;

            }
            }else{
            System.out.println("Lütfen geçerli bir seçim yapınız");
            girisEkrani();

        }
    }

    private static void cikis() {
        scan.close();
        System.exit(0);
    }

    private static void fisYazdir() {
    }

    private static void market() {
    }

    private static void sarkuteri() {
    }

    private static void manav() {
        System.out.println("Manav Reyonuna Hoşgeldiniz");
        System.out.println("Hangi ürünü almak istiyorsunuz?");
        System.out.println("11-Patates 19.99₺\n12-Elma 34.99₺\n13-Muz 89.99₺\n14-Soğan 12.99₺\n15-Portakal 29.99₺");

        while (true){
            while(!ekUrun){
                urunKodu= scan.nextInt();
                if (urunKodu>=11 && urunKodu<=15){
                    System.out.println("Kaç kilogram alacaksınız: ");
                    urunMiktari=scan.nextInt();
                    switch (urunKodu){
                        case 11:
                            urunAdi="Patates";
                            urunFiyati=19.99;
                            System.out.println(urunMiktari+" kg"+urunAdi+"'in fiyatı: "+(urunFiyati*urunMiktari));
                            break;
                        case 12:
                            urunAdi="Elma";
                            urunFiyati=34.99;
                            System.out.println(urunMiktari+" kg"+urunAdi+"'in fiyatı: "+(urunFiyati*urunMiktari));
                            break;
                        case 13:
                            urunAdi="Muz";
                            urunFiyati=89.99;
                            System.out.println(urunMiktari+" kg"+urunAdi+"'in fiyatı: "+(urunFiyati*urunMiktari));
                            break;
                        case 14:
                            urunAdi="Soğan";
                            urunFiyati=12.99;
                            System.out.println(urunMiktari+" kg"+urunAdi+"'in fiyatı: "+(urunFiyati*urunMiktari));
                            break;
                        case 15:
                            urunAdi="Portakal";
                            urunFiyati=29.99;
                            System.out.println(urunMiktari+" kg"+urunAdi+"'in fiyatı: "+(urunFiyati*urunMiktari));
                            break;
                    }
                    urunFiyati*=urunMiktari;
                    toplam+=urunFiyati;
                    sepet=sepet+urunAdi+":"+urunFiyati;
                    System.out.println("Başka ürün almak ister misiniz?İsterseniz ürün kodunu giriniz. Başka reyona geçmek için 0 tuşuna basınız");


                }else if (urunKodu==0){
                    girisEkrani();
                }
            }
        }
    }
}
