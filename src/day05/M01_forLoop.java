package day05;

public class M01_forLoop {
    /*
    - for Loop : Bir döngü işlemi olup döngünün ilerleme aralığı sabit ise kullanılır
    - while : Bir döngü üşlemi olup bu döngü türü döngü aralığının sabit olma zorunluluğu olmadığı durumda kullanılır.
    - for each Loop: Liste ile işlem yapılıyor
     */
    public static void main(String[] args) {
        /*
        TASK :
        100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
         */
        int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
                System.out.print(i+" ");
                toplam+=i;
            }
        }
        System.out.println("");
        System.out.println("İstenen Sayıların Toplamı: "+toplam);


    }
}
