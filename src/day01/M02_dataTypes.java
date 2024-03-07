package day01;

public class M02_dataTypes {
    public static void main(String[] args) {
        /*
        byte: 8 bitlik veri içerir
        short:16 bit veri içerir
        int : 32 bit veri içerir
        long: 64 bit veri içerir
        float, double ondalıklı sayıları ifade eder

        byte<short<int<long<float<double
         */

        byte b1= Byte.MAX_VALUE;
        System.out.println(b1);
        short sh1=Short.MIN_VALUE;
        System.out.println("sh1 = " + sh1);

        /*
        char : ASCII karakterlere göre çalışabilir. ya da tek haneli ifadeler kullanılabilir
         */

        char ch1='F';
        System.out.println(ch1); // F
        char ch2=61;
        System.out.println(ch2);  // C

        /*
        boolean:  Mantıksal data tipidir. Sonucu true/false döndürür.
         */

        boolean kod=true;
        System.out.println("Kod Kontrol Sonucu: "+kod);

        /*
        nonPrimitive data tipleri çok fazladır
        enÇok Kullanacağımız String dediğimiz
        metinsel ifadelerdir.
         */

        int sayi=328;
        System.out.println(sayi);

        String isim="SerpiL";
        System.out.println(isim);
        System.out.println(isim.charAt(5));
        
        





    }
}
